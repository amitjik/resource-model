package in.indigo.repository;

import java.util.List;


import in.indigo.entity.GstDistributionConfiguration;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class GstDistributionConfigurationRepository implements PanacheRepository<GstDistributionConfiguration> {
    // Custom methods can be added here if needed
    @Transactional
    public List<GstDistributionConfiguration> findByPlaceOfEmbarkation(String placeOfEmbarkation) {
        return find("placeOfEmbarkation", placeOfEmbarkation).list();
    }

      @Transactional
    public List<GstDistributionConfiguration> findByDistinctPlaceOfEmbarkation() {
        return getEntityManager().createQuery(
                "SELECT g FROM GstDistributionConfiguration g WHERE g.placeOfEmbarkation IN " +
                "(SELECT DISTINCT g2.placeOfEmbarkation FROM GstDistributionConfiguration g2)", 
                GstDistributionConfiguration.class)
                .getResultList();
    }
}
