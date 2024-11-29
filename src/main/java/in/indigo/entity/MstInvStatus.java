package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import in.indigo.deserializer.DateDeserializer;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name ="MstInvStatus")
public class MstInvStatus extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TransactionDate")
    @JsonDeserialize(using = DateDeserializer.class)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d/MM/yyyy")
    private Date transactionDate;

    @Column(name = "ImportFileName")
    private String importFileName;

    @Column(name = "Records")
    private float records;

    @Column(name = "PNR")
    private int pnr;

    @Column(name = "NonTaxableFareComponent")
    private double nonTaxableFareComponent;

    @Column(name = "TaxableComponent")
    private double taxableComponent;

    @Column(name = "CGSTAmount")
    private double cgstAmount;

    @Column(name = "IGSTAmount")
    private double igstAmount;

    @Column(name = "SGSTAmount")
    private double sgstAmount;

    @Column(name = "UGSTAmount")
    private double ugstAmount;

    @Column(name = "IsFileProcessed")
    private int isFileProcessed;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name ="CreatedDate")
    private java.util.Date createdDate;

    @Column(name = "Cess Amount")
    private double cessAmount;


}
