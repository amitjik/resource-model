package in.indigo.repository;


import in.indigo.entity.MstExcemptFlight;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MstExcemptFlightRepository implements PanacheRepository<MstExcemptFlight> {
}
