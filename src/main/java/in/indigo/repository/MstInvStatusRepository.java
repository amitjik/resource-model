package in.indigo.repository;


import in.indigo.entity.MstInvStatus;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.sql.Date;
import java.util.List;


@ApplicationScoped
public class MstInvStatusRepository implements PanacheRepository<MstInvStatus> {

    public List<MstInvStatus> findByStatusAndDateRange(Date date) {

        List<MstInvStatus> mstInvStatuses= find("transactionDate ",date).list();

        return mstInvStatuses;

    }

}
