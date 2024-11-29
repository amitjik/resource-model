package in.indigo.repository;

import in.indigo.entity.InvSkyExtract;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InvSkyExtractRepository implements PanacheRepository<InvSkyExtract>{
    
}
