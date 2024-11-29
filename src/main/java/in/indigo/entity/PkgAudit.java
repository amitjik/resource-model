package in.indigo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name ="PkgAudit")
public class PkgAudit extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PkgId")
    private int id;


    @Column(name = "NumberofRecords")
    private int records;

    @Column(name = "FileName")
    private String importFileName;

    @Column(name = "Description")
    private String description;

}
