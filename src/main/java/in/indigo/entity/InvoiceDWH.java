package in.indigo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Invoice_DWH")
@ToString
public class InvoiceDWH implements Serializable {

    @Id
    @Column(name = "Id")
    private Integer id;

    @DataField(pos = 1, columnName = "Transaction Date", method = "in.indigo.util.BindyUtil.isValidDateFormat")
    @Column(name = "TransactionDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/d/yyyy")
    private java.util.Date transactionDate;

    @DataField(pos = 2, columnName = "File Date", method = "in.indigo.util.BindyUtil.isValidDateFormat")
    @Column(name = "FileDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/d/yyyy")
    private java.util.Date fileDate;

    @DataField(pos = 3, columnName = "Display Date", method = "in.indigo.util.BindyUtil.isValidDateFormat")
    @Column(name = "DisplayDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/d/yyyy")
    private Date displayDate;

    @DataField(pos = 4, columnName = "Flight Number", paddingChar = '0', trim = true)
    @Column(name = "FlightNumber")

    private double flightNumber;

    @DataField(pos = 5, columnName = "GoodsServicesType", paddingChar = '0', trim = true)
    @Column(name = "GoodsServicesType")
    //@JsonProperty(value = "descriptionOfGoodsServices")
    private String goodsServicesType;

    @DataField(pos = 6, columnName = "SAC")
    @Column(name = "SAC")
    private double sac;

    @DataField(pos = 7, columnName = "InvoiceNumber")
    @Column(name = "InvoiceNumber")
    private String invoiceNumber;

    @DataField(pos = 8, columnName = "SequenceNo")
    @Column(name = "SequenceNo")
    private int sequenceNo;

    @DataField(pos = 9, columnName = "PNR")
    @Column(name = "PNR")
    private String pnr;

    @DataField(pos = 10, columnName = "Dep")
    @Column(name = "Dep")
    private String dep;

    @DataField(pos = 11, columnName = "Arr")
    @Column(name = "Arr")
    private String arr;

    @DataField(pos = 12, columnName = "Place of Embarkation")
    @Column(name = "PlaceOfEmbarkation")
    private String placeOfEmbarkation;

    @DataField(pos = 13, columnName = "StateCode")
    @Column(name = "StateCode")
    private String stateCode;

    @DataField(pos = 14, columnName = "Customer GSTIN")
    @Column(name = "CustomerGSTIN")
    private String customerGSTIN;

    @DataField(pos = 15, columnName = "Customer Name", method = "in.indigo.util.BindyUtil.isCommaPresent")
    @Column(name = "CustomerName")
    private String customerName;

    @DataField(pos = 16, columnName = "EmailAddress")
    @Column(name = "EmailAddress")
    private String emailAddress;

    @DataField(pos = 17, columnName = "Customer GST Registration State")
    @Column(name = "CustomerGSTRegistrationState")
    private String customerGSTRegistrationState;

    @DataField(pos = 18, columnName = "PassengerName")
    @Column(name = "PassengerName")
    private String passengerName;

    @DataField(pos = 19, columnName = "Passenger Email")
    @Column(name = "PassengerEmail")
    private String passengerEmail;

    @DataField(pos = 20, columnName = "6E GSTIN")
    @Column(name = "6EGSTIN")
    private String e6gstin;

    @DataField(pos = 21, columnName = "6E Registered Address", method = "in.indigo.util.BindyUtil.isCommaPresent")
    @Column(name = "6ERegisteredAddress")
    private String e6RegisteredAddress;

    @DataField(pos = 22, columnName = "Non-Taxable Fare Component")
    @Column(name = "NonTaxableFareComponent")
    private double nonTaxableFareComponent;

    @DataField(pos = 23, columnName = "Taxable Component")
    @Column(name = "TaxableComponent")
    private double taxableComponent;

    @DataField(pos = 24, columnName = "CGST Amount")
    @Column(name = "CGSTAmount")
    private double cgstAmount;

    @DataField(pos = 25, columnName = "IGST Amount")
    @Column(name = "IGSTAmount")
    private double igstAmount;

    @DataField(pos = 27, columnName = "SGST Amount")
    @Column(name = "SGSTAmount")
    private double sgstAmount;

    @DataField(pos = 28, columnName = "UGST Amount")
    @Column(name = "UGSTAmount")
    private double ugstAmount;

    @DataField(pos = 29, columnName = "CGSTRate")
    @Column(name = "CGSTRate")
    private double cgstRate;

    @DataField(pos = 30, columnName = "IGSTRate")
    @Column(name = "IGSTRate")
    private double igstRate;

    @DataField(pos = 31, columnName = "SGSTUGSTRate")
    @Column(name = "SGSTUGSTRate")
    private double sgstugstRate;

    @DataField(pos = 32, columnName = "IsProcessed")
    @Column(name = "IsProcessed")
    private String isProcessed;

    @DataField(pos = 33, columnName = "InvOrder")
    @Column(name = "InvOrder")
    private short invOrder;

    @DataField(pos = 34, columnName = "IsCredit")
    @Column(name = "IsCredit")
    private short isCredit;

    @DataField(pos = 35, columnName = "ServiceNo")
    @Column(name = "ServiceNo")
    private short serviceNo;

    @DataField(pos = 36, columnName = "SGSTUGSTRate")
    @Column(name = "Mailsend")
    private int mailSend;

    @DataField(pos = 37, columnName = "Airport Charges")
    @Column(name = "AirportCharges")
    private double airportCharges;

    @DataField(pos = 38, columnName = "Origin Country")
    @Column(name = "OriginCountry")
    private String originCountry;

    @DataField(pos = 39, columnName = "Is Exempted")
    @Column(name = "IsExempted")
    private boolean isExempted;

    @DataField(pos = 40, columnName = "Cess Amount")
    @Column(name = "Cess Amount")
    private double cessAmount;

    @DataField(pos = 41, columnName = "Local Cess Amount")
    @Column(name = "Local Cess Amount")
    private double localCessAmount;

    @DataField(pos = 42, columnName = "AutoCorrectionId")
    @Column(name = "AutoCorrectionId")
    private String autoCorrectionIds;

    @DataField(pos = 43, columnName = "IsAutoCorrected")
    @Column(name = "IsAutoCorrected")
    private String isAutoCorrected;

    @Column(name = "ReasonIDs")
    private String reasonIds;

    @Column(name = "IsError")
    private int isError;

    @Column(name = "IsCorrect")
    private int IsCorrect;

    @Column(name = "errorIds")
    private String errorIds;

    @Column(name = "ErrorDescription")
    private String errorDescription;

    @Column(name = "spExemptedFlight")
    private int spExemptedFlight;

    @Column(name = "spInternational")
    private int spInternational;

    @Column(name = "spSez")
    private int spSez;

    @Transient
    private String itineraryOrigin;

    @Transient
    private String currentSeries;

    @Transient
    private String series;

    @Transient
    private String runningSeries;

    @Transient
    private int maxSeries;

    @Transient
    private int rowNumber;

    @Transient
    private char startSeries;

    @Transient
    private char endSeries;

    @Transient
    private int groupID;


}
