package in.indigo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "ErrorInvoiceDetails")
public class ErrorInvoiceDetails {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name="Pnr")
    private String pnr;

    @Column(name = "Invoicenumber")
    private String invoiceNumber;

    @Column(name= "GoodsServicesType")
    private String goodsServicesType;

    @Column(name = "ErrorID")
    private int errorId;

    @Column(name = "Local Currency")
    private String localCurrency;

    @Column(name = "TransactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/d/yyyy")
    private Date transactionDate;

    @Column(name = "IsCorrect")
    private int isCorrect;

    @Column(name = "reasonIds")
    private String reasonIds;

    @Column(name = "errorDescription")
    private String errorDescription;

    @Column(name="tranType")
    private String tranType;
}
