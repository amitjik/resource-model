package in.indigo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name ="MstInvoiceTransactionDetails")
public class MstInvoiceTransactionDetails extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "TransactionDate")
    @JsonDeserialize(using = DateDeserializer.class)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d/MM/yyyy")
    private Date transactionDate;


    @Column(name = "Records")
    private float records;

    @Column(name = "PNRCount")
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

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "ModifiedBy")
    private String modifiedBy;

    @Column(name ="ModifiedDate")
    private java.util.Date modifiedDate;

    @Column(name ="CreatedDate")
    private java.util.Date createdDate;

    @Column(name = "Cess Amount")
    private double cessAmount;

    @Column(name = "InvoiceStatus")
    private String invoiceStatus;

    @Column(name = "IsApproved")
    private int isApproved;

    @Column(name = "IsInvCreation")
    private int isInvCreation;

    @Column(name = "IsMailSent")
    private int isMailSent;

    @Column(name = "IsCorrection")
    private int isCorrection;

    @Column(name = "IsError")
    private int isError;

}
