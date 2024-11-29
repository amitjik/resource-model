package in.indigo.repository;

import in.indigo.entity.InvoiceProcessLog;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.sql.Date;
import java.util.List;

@ApplicationScoped
public class InvoiceProcessLogRepository implements PanacheRepository<InvoiceProcessLog> {


    @Transactional
    public List<InvoiceProcessLog> getInvoiceStatusByDate(Date date, String status){

       return list("transactionDate= ?1 and processStatus= ?2",date,status);

    }
}
