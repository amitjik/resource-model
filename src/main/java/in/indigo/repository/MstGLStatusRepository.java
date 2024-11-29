package in.indigo.repository;

import in.indigo.entity.MstGLStatus;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.sql.Date;
import java.util.List;

@ApplicationScoped
public class MstGLStatusRepository implements PanacheRepository<MstGLStatus> {

    public List<MstGLStatus> findByStatusAndDateRange(Date date) {

        List<MstGLStatus> mstGLStatuses= find("transactionDate ",date).list();

        return mstGLStatuses;

    }
}
