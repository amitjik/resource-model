package in.indigo.repository;

import in.indigo.entity.MstGLTransactionDetails;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalDate;
import java.util.List;

@ApplicationScoped
public class MstGlTransactionRepository implements PanacheRepository<MstGLTransactionDetails> {

    public List<MstGLTransactionDetails> findByStatusAndDateRange(LocalDate startDate, LocalDate endDate) {

            return find("transactionDate between ?1 and ?2", startDate, endDate).list();

    }
}
