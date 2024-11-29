package in.indigo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;






@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Inv_SezGstin")
public class InvSezGstin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "Gstin", nullable = false, length = 255)
    private String gstin;

    @Column(name = "CreatedTime")
    //@Temporal(TemporalType.TIMESTAMP)
    private java.util.Date createdTime;

    @Column(name = "CreatedBy", length = 100)
    private String createdBy;

    @Column(name = "FromDate")
    //@Temporal(TemporalType.DATE)
    private Date fromDate;

    @Column(name = "ToDate")
    //@Temporal(TemporalType.DATE)
    private Date toDate;
}
