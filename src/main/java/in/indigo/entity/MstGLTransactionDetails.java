package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import in.indigo.deserializer.DateDeserializer;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name ="MstGLTransactionDetails")
public class MstGLTransactionDetails extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "TransactionDate")
    @JsonDeserialize(using = DateDeserializer.class)
    private Date transactionDate;

//    @Column(name = "ImportFileName")
//    private String importFileName;

    @Column(name = "Records")
    private float records;

    @Column(name = "PNRCount")
    private int pnrCount;

    @Column(name = "CGSTAmount")
    private float cgstAmount;

    @Column(name = "SGSTAmount")
    private float sgstAmount;

    @Column(name = "IGSTAmount")
    private float igstAmount;

    @Column(name = "UGSTAmount")
    private float ugstAmount;

    @Column(name = "GstAmount")
    private float gstAmount;

    @Column(name = "NonTaxableFareComponent")
    private float nonTaxableFareComponent;

    @Column(name = "TaxableComponent")
    private float taxableComponent;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "ModifiedBy")
    private String modifiedBy;

    @Column(name ="ModifiedDate")
    private java.util.Date modifiedDate;

    @Column(name ="CreatedDate")
    private java.util.Date createdDate;


}
