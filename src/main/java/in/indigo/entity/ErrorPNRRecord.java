package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import java.time.LocalDateTime;




@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ErrorPNRRecords")
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorPNRRecord {

    @Id
    @Column(name = "ID")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "Original Booking Date", length = 255)
    private String originalBookingDate;

    @Column(name = "Transaction Date")
    private String transactionDate;

//    @Column(name = "Reference Date")
//    public String referenceDate;

    @Column(name = "Flight Date")
    private String flightDate;

    @Column(name = "Flight Number")
    private String flightNumber;

    @Column(name = "Description of Goods/Services", length = 255)
    private String descriptionOfGoodsServices;

    @Column(name = "SAC")
    private double sac;

    @Column(name = "PNR", length = 255)
    private String pnr;

    @Column(name = "Full Itinerary Route", length = 255)
    private String itineraryOrigin;

    @Column(name = "Sector", length = 255)
    private String sector;

    @Column(name = "Place of Embarkation", length = 255)
    private String placeOfEmbarkation;

    @Column(name = "Customer GSTIN", length = 255)
    private String customerGSTIN;

    @Column(name = "Customer Name", length = 255)
    private String customerName;

    @Column(name = "Email Address", length = 255)
    private String passengerEmail;

    @Column(name = "GST Holder Name", length = 255)
    private String gstHolderName;

    @Column(name = "GST Email Address", length = 255)
    private String gstEmailAddress;

    @Column(name = "Customer GST Registration State", length = 255)
    private String customerGSTRegistrationState;

    @Column(name = "6E GSTIN", length = 255)
    private String e6gstin;

    @Column(name = "6E RegisteredAddress", length = 255)
    private String e6RegisteredAddress;

    @Column(name = "Base Fare")
    private double baseFare;

    @Column(name = "Taxable Fare Component")
    private double taxableFareComponent;

    @Column(name = "Non-Taxable Fare Component")
    private double nonTaxableFareComponent;

    @Column(name = "SSR Fee Code", length = 255)
    private String ssrFeeCode;

    @Column(name = "SSR Component")
    private double ssrComponent;

    @Column(name = "Taxable Component")
    private double taxableComponent;

    @Column(name = "CGST Amount")
    private double cgstAmount;

    @Column(name = "IGST Amount")
    private double igstAmount;

    @Column(name = "SGST Amount")
    private double sgstAmount;

    @Column(name = "UGST Amount")
    private double ugstAmount;

//    @Column(name = "GST Amount")
//    private double gstAmount;


    @Transient
//    @Column(name = "Cess Amount")
    private double cessAmount;

    @Column(name = "Local Currency", length = 255)
    private String localCurrency;

    @Column(name = "Local Base Fare")
    private double localBaseFare;

    @Column(name = "Local Taxable Fare Component")
    private double localTaxableFareComponent;

    @Column(name = "Local Non-Taxable Fare Component")
    private double localNonTaxableFareComponent;

    @Column(name = "Local SSR Component")
    private double localSSRComponent;

    @Column(name = "Local Taxable Component")
    private double localTaxableComponent;

    @Column(name = "Local CGST Amount")
    private double localCGSTAmount;

    @Column(name = "Local IGST Amount")
    private double localIGSTAmount;

    @Column(name = "Local SGST Amount")
    private double localSGSTAmount;

    @Column(name = "Local UGST Amount")
    private double localUGSTAmount;

//    @Column(name = "Local GST Amount")
//    private double localGSTAmount;

    @Transient
//    @Column(name = "Local Cess Amount")
    private double localCessAmount;

    @Column(name = "AirportCharges")
    private double airportCharges;

    @Column(name = "LocalAirportCharges")
    private double localAirportCharges;

    @Column(name = "OriginCountry", length = 255)
    private String originCountry;

    @JsonProperty("isExempted")
    @Column(name = "IsExempted")
    private boolean isExempted;

//    @Column(name = "ReasonID")
//    private String reasonIds;// change to string

    @Column(name = "NumberType", length = 3)
    public String numberType;

//    @Column(name = "Status", length = 50)
//    public String status;

    @Column(name = "CreatedBy", length = 50)
    public String createdBy = "System";

    @Column(name = "CreatedDate")
    public LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "FileName", length = 100)
    public String fileName;

    @Column(name = "Path", length = 500)
    public String path;

    @Column(name = "NeedtoProcess")
    public int needToProcess;

//    @Transient
//    public Integer index;
//
//    @Transient
//    public String stateCode;
//
//    @Transient
//    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/d/yyyy")
//    private String fileDate;

//    @Transient
//    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/d/yyyy")
//    private String displayDate;

//    @Transient
//    private String dep;
//
//    @Transient
//    private String arr;
//
//    @Transient
//    private String passengerName;
//
//    @Transient
//    private String emailAddress;
//
//    @Transient
//    private String autoCorrectionIds;
//
//    @Transient
//    private String isAutoCorrected;
}
