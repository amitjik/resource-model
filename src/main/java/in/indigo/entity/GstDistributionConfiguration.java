package in.indigo.entity;

import java.time.LocalDateTime;
import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GstDistributionConfiguration")
public class GstDistributionConfiguration extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GstDistributionConfigurationAutoId")
    private Long id;

    @Column(name = "Place of Embarkation")
    private String placeOfEmbarkation;

    @Column(name = "CGST")
    private Double cgst;

    @Column(name = "SGST")
    private Double sgst;

    @Column(name = "UGST")
    private Double ugst;

    @Column(name = "EffectiveFrom")
    private Date effectiveFrom;

    @Column(name = "EffectiveTo")
    private Date effectiveTo;

    @Column(name = "CreatedDate")
    private Date createdDate;

    @Column(name = "CreatedBy")
    private String createdBy;
}