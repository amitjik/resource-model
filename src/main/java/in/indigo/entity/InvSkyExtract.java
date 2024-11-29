package in.indigo.entity;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
@Table(name = "Inv_SkyExtract")

@CsvRecord(separator = "\\|", skipFirstLine = true, generateHeaderColumns = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvSkyExtract extends PanacheEntityBase {

 
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "Original Booking Date", length = 255)
    @DataField(pos = 1, columnName = "Original Booking Date", method = "in.indigo.utilities.BindyUtil.isValidDateFormat")
    private String originalBookingDate;

    @Column(name = "Transaction Date")
    @DataField(pos = 2, columnName = "Transaction Date", method = "in.indigo.utilities.BindyUtil.isValidDateFormat")
    private String transactionDate;

    @Column(name = "Reference Date")
    public String referenceDate;

    @Column(name = "Flight Date")
    @DataField(pos = 3, columnName = "Flight Date", method = "in.indigo.utilities.BindyUtil.isValidDateFormat")
    private String flightDate;

    @Column(name = "Flight Number")
    @DataField(pos = 4, columnName = "Flight Number")
    private String flightNumber;

    @Column(name = "Description of Goods/Services", length = 255)
    @DataField(pos = 5, columnName = "Description of Goods/Services")
    private String descriptionOfGoodsServices;

    @Column(name = "SAC")
    @DataField(pos = 6, columnName = "SAC",defaultValue="0")
    private double sac;

    @Column(name = "PNR", length = 255)
    @DataField(pos = 7, columnName = "PNR")
    private String pnr;

    @Column(name = "Full Itinerary Route", length = 255)
    @DataField(pos = 8, columnName = "Itinerary Origin")
    private String itineraryOrigin;

    @Column(name = "Sector", length = 255)
    @DataField(pos = 9, columnName = "Sector")
    private String sector;

    @Column(name = "Place of Embarkation", length = 255)
    @DataField(pos = 10, columnName = "Place of Embarkation" ,defaultValue="null")
    private String placeOfEmbarkation;

    @Column(name = "Customer GSTIN", length = 255)
    @DataField(pos = 11, columnName = "Customer GSTIN")
    private String customerGSTIN;

    @Column(name = "Customer Name", length = 255)
    @DataField(pos = 12, columnName = "Customer Name", method = "in.indigo.utilities.BindyUtil.isCommaPresent")
    private String customerName;

    @Column(name = "Email Address", length = 255)
    @DataField(pos = 13, columnName = "Primary Email Address")
    private String passengerEmail;

    @Column(name = "GST Holder Name", length = 255)
    @DataField(pos = 14, columnName = "GST Holder Name")
    private String gstHolderName;

    @Column(name = "GST Email Address", length = 255)
    @DataField(pos = 15, columnName = "GST Email Address")
    private String gstEmailAddress;

    @Column(name = "Customer GST Registration State", length = 255)
    @DataField(pos = 16, columnName = "Customer GST Registration State")
    private String customerGSTRegistrationState;

    @Column(name = "6E GSTIN", length = 255)
    @DataField(pos = 17, columnName = "6E GSTIN")
    private String e6gstin;

    @Column(name = "6E RegisteredAddress", length = 255)
    @DataField(pos = 18, columnName = "6E Registered Address", method = "in.indigo.utilities.BindyUtil.isCommaPresent")
    private String e6RegisteredAddress;

    @Column(name = "Base Fare")
    @DataField(pos = 19, columnName = "Base Fare",defaultValue="0")
    private double baseFare;

    @Column(name = "Taxable Fare Component")
    @DataField(pos = 20, columnName = "Taxable Fare Component",defaultValue="0")
    private double taxableFareComponent;

    @Column(name = "Non-Taxable Fare Component")
    @DataField(pos = 21, columnName = "Non-Taxable Fare Component",defaultValue="0")
    private double nonTaxableFareComponent;

    @Column(name = "SSR Fee Code", length = 255)
    @DataField(pos = 22, columnName = "SSR Fee Code")
    private String ssrFeeCode;

    @Column(name = "SSR Component")
    @DataField(pos = 23, columnName = "SSR Component",defaultValue="0")
    private double ssrComponent;

    @Column(name = "Taxable Component")
    @DataField(pos = 24, columnName = "Taxable Component",defaultValue="0")
    private double taxableComponent;

    @Column(name = "CGST Amount")
    @DataField(pos = 25, columnName = "CGST Amount",defaultValue="0")
    private double cgstAmount;

    @Column(name = "IGST Amount")
    @DataField(pos = 26, columnName = "IGST Amount",defaultValue="0")
    private double igstAmount;

    @Column(name = "SGST Amount")
    @DataField(pos = 27, columnName = "SGST Amount",defaultValue="0")
    private double sgstAmount;

    @Column(name = "UGST Amount")
    @DataField(pos = 28, columnName = "UGST Amount",defaultValue="0")
    private double ugstAmount;

    @Column(name = "GST Amount")
    @DataField(pos = 29, columnName = "GST Amount",defaultValue="0")
    private double gstAmount;

    @Column(name = "Cess Amount")
    @DataField(pos = 30, columnName = "Cess Amount",defaultValue="0")
    private double cessAmount;

    @Column(name = "Local Currency", length = 255)
    @DataField(pos = 31, columnName = "Local Currency")
    private String localCurrency;

    @Column(name = "Local Base Fare")
    @DataField(pos = 32, columnName = "Local Base Fare",defaultValue="0")
    private double localBaseFare;

    @Column(name = "Local Taxable Fare Component")
    @DataField(pos = 33, columnName = "Local Taxable Fare Component",defaultValue="0")
    private double localTaxableFareComponent;

    @Column(name = "Local Non-Taxable Fare Component")
    @DataField(pos = 34, columnName = "Local Non-Taxable Fare Component",defaultValue="0")
    private double localNonTaxableFareComponent;

    @Column(name = "Local SSR Component")
    @DataField(pos = 35, columnName = "Local SSR Component",defaultValue="0")
    private double localSSRComponent;

    @Column(name = "Local Taxable Component")
    @DataField(pos = 36, columnName = "Local Taxable Component",defaultValue="0")
    private double localTaxableComponent;

    @Column(name = "Local CGST Amount")
    @DataField(pos = 37, columnName = "Local CGST Amount",defaultValue="0")
    private double localCGSTAmount;

    @Column(name = "Local IGST Amount")
    @DataField(pos = 38, columnName = "Local IGST Amount",defaultValue="0")
    private double localIGSTAmount;

    @Column(name = "Local SGST Amount")
    @DataField(pos = 39, columnName = "Local SGST Amount",defaultValue="0")
    private double localSGSTAmount;

    @Column(name = "Local UGST Amount")
    @DataField(pos = 40, columnName = "Local UGST Amount",defaultValue="0")
    private double localUGSTAmount;

    @Column(name = "Local GST Amount")
    @DataField(pos = 41, columnName = "Local GST Amount",defaultValue="0")
    private double localGSTAmount;

    @Column(name = "Local Cess Amount")
    @DataField(pos = 42, columnName = "Local Cess Amount",defaultValue="0")
    private double localCessAmount;

    @Column(name = "AirportCharges")
    @DataField(pos = 43, columnName = "Airport Charges",defaultValue="0")
    private double airportCharges;

    @Column(name = "LocalAirportCharges")
    @DataField(pos = 44, columnName = "Local Airport Charges",defaultValue="0")
    private double localAirportCharges;

    @Column(name = "OriginCountry", length = 255)
    @DataField(pos = 45, columnName = "Origin Country")
    private String originCountry;

    @JsonProperty("isExempted")
    @Column(name = "IsExempted")
    @DataField(pos = 46, columnName = "Is Exempted")
    private boolean isExempted;

    @Transient
    @DataField(pos = 47, columnName = "Cabin", required = false)
    private String cabin;


    @Transient
    //@Column(name = "ReasonID")
    // @DataField(pos = 49, columnName = "ReasonID")
    private String reasonIds;// change to string

    @Column(name = "NumberType", length = 3)
    public String numberType;

    @Column(name = "Status", length = 50)
    public String status;

    @Column(name = "CreatedBy", length = 50)
    public String createdBy = "System";

    @Column(name = "CreatedDate")
    public LocalDateTime createdDate = LocalDateTime.now();

    @Column(name = "FileName", length = 100)
    public String fileName;

    @Column(name = "Path", length = 500)
    public String path;

    @Transient
    public Integer index;

    @Transient
    public String stateCode;

    @Transient
    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/d/yyyy")
    private String fileDate;

    @Transient
    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM/d/yyyy")
    private String displayDate;

    @Transient
    private String dep;

    @Transient
    private String arr;

    @Transient
    private String passengerName;

    @Transient
    private String emailAddress;

    // @Transient
    // @DataField(pos = 47, columnName = "IsCredited")
    // private Integer isCredited;

    // @Transient
    // @DataField(pos = 48, columnName = "IsProcessed")
    // private String isProcessed;

    // @Transient
    // @DataField(pos = 50, columnName = "IsError")
    // private String isError;

    // @Transient
    // @DataField(pos = 51, columnName = "IsCorrect")
    // private String isCorrect;

    // @Transient
    // @DataField(pos = 52, columnName = "ErrorIds")
    // private String errorIds;

    // @Transient
    // @DataField(pos = 53, columnName = "ErrorDescription")
    // private String errorDescription;

    // // private Integer isCredited;
    // // private String isProcessed;
    // @Transient
    // @DataField(pos = 54, columnName = "TranType")
    // private String tranType;

    @Transient
    // @DataField(pos = 55, columnName = "AutoCorrectionId")
    private String autoCorrectionIds;

    @Transient
    // @DataField(pos = 56, columnName = "IsAutoCorrected")
    private String isAutoCorrected;

}
