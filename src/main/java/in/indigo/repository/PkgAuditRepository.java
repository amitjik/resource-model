package in.indigo.repository;

//import in.indigo.mock.model.PkgAudit;
import in.indigo.entity.PkgAudit;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class PkgAuditRepository implements PanacheRepository<PkgAudit>{

}
