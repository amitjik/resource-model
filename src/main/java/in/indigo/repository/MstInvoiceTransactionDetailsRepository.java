package in.indigo.repository;

import in.indigo.entity.MstInvoiceTransactionDetails;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class MstInvoiceTransactionDetailsRepository implements PanacheRepository<MstInvoiceTransactionDetails> {

    public List<MstInvoiceTransactionDetails> listAllDetails() {
        return listAll();
    }

    @Transactional
    public List<MstInvoiceTransactionDetails> findByTransactionDate(Date transactionDate) {
        return list("transactionDate", transactionDate);
    }

    public List<MstInvoiceTransactionDetails> findByStatusAndDateRange(String status, LocalDate startDate, LocalDate endDate) {
        if ("All".equalsIgnoreCase(status)) {
            return find("transactionDate between ?1 and ?2", startDate, endDate).list();
        } else {
            return find("invoiceStatus = ?1 and transactionDate between ?2 and ?3", status, startDate, endDate).list();
        }
    }


}
