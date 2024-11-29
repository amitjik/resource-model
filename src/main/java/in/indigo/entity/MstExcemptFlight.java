package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "MstExcemptFlight")
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class MstExcemptFlight {


    @Column(name = "ID")
    @Id
    private int id;

    @Column(name = "Dep")
    private String dep;
}
