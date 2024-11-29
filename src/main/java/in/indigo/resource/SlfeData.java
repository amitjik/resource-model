package in.indigo.resource;

import java.util.List;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// @ToString
@CsvRecord(separator = "\\|", skipFirstLine = true, generateHeaderColumns = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SlfeData {
    private Integer id;
    @DataField(pos = 1, columnName = "Original Booking Date",method = "in.indigo.util.BindyUtil.isValidDateFormat")
    private String originalBookingDate;

    @DataField(pos = 2, columnName = "Transaction Date",method = "in.indigo.util.BindyUtil.isValidDateFormat")
    private String transactionDate;

    @DataField(pos = 3, columnName = "Flight Date",method = "in.indigo.util.BindyUtil.isValidDateFormat")
    private String flightDate;

    @DataField(pos = 4, columnName = "Flight Number", paddingChar = '0', trim = true)
    private double flightNumber;

    @DataField(pos = 5, columnName = "Description of Goods/Services")
    private String descriptionOfGoodsServices;

    @DataField(pos = 6, columnName = "SAC")
    private double sac;

    @DataField(pos = 7, columnName = "PNR")
    private String pnr;

    @DataField(pos = 8, columnName = "Itinerary Origin")
    private String itineraryOrigin;

    @DataField(pos = 9, columnName = "Sector")
    private String sector;

    @DataField(pos = 10, columnName = "Place of Embarkation")
    private String placeOfEmbarkation;

    @DataField(pos = 11, columnName = "Customer GSTIN")
    private String customerGSTIN;

    @DataField(pos = 12, columnName = "Customer Name", method = "in.indigo.util.BindyUtil.isCommaPresent")
    private String customerName;

    @DataField(pos = 13, columnName = "Passenger Email")
    private String passengerEmail;

    @DataField(pos = 14, columnName = "GST Holder Name")
    private String gstHolderName;

    @DataField(pos = 15, columnName = "GST Email Address")
    private String gstEmailAddress;

    @DataField(pos = 16, columnName = "Customer GST Registration State")
    private String customerGSTRegistrationState;

    @DataField(pos = 17, columnName = "6E GSTIN")
    private String e6gstin;

    @DataField(pos = 18, columnName = "6E Registered Address", method = "in.indigo.util.BindyUtil.isCommaPresent")
    private String e6RegisteredAddress;

    @DataField(pos = 19, columnName = "Base Fare")
    private double baseFare;

    @DataField(pos = 20, columnName = "Taxable Fare Component")
    private double taxableFareComponent;

    @DataField(pos = 21, columnName = "Non-Taxable Fare Component")
    private double nonTaxableFareComponent;

    @DataField(pos = 22, columnName = "SSR Fee Code")
    private String ssrFeeCode;

    @DataField(pos = 23, columnName = "SSR Component")
    private double ssrComponent;

    @DataField(pos = 24, columnName = "Taxable Component")
    private double taxableComponent;

    @DataField(pos = 25, columnName = "CGST Amount")
    private double cgstAmount;

    @DataField(pos = 26, columnName = "IGST Amount")
    private double igstAmount;

    @DataField(pos = 27, columnName = "SGST Amount")
    private double sgstAmount;

    @DataField(pos = 28, columnName = "UGST Amount")
    private double ugstAmount;

    @DataField(pos = 29, columnName = "GST Amount")
    private double gstAmount;

    @DataField(pos = 30, columnName = "Cess Amount")
    private double cessAmount;

    @DataField(pos = 31, columnName = "Local Currency")
    private String localCurrency;

    @DataField(pos = 32, columnName = "Local Base Fare")
    private double localBaseFare;

    @DataField(pos = 33, columnName = "Local Taxable Fare Component")
    private double localTaxableFareComponent;

    @DataField(pos = 34, columnName = "Local Non-Taxable Fare Component")
    private double localNonTaxableFareComponent;

    @DataField(pos = 35, columnName = "Local SSR Component")
    private double localSSRComponent;

    @DataField(pos = 36, columnName = "Local Taxable Component")
    private double localTaxableComponent;

    @DataField(pos = 37, columnName = "Local CGST Amount")
    private double localCGSTAmount;

    @DataField(pos = 38, columnName = "Local IGST Amount")
    private double localIGSTAmount;

    @DataField(pos = 39, columnName = "Local SGST Amount")
    private double localSGSTAmount;

    @DataField(pos = 40, columnName = "Local UGST Amount")
    private double localUGSTAmount;

    @DataField(pos = 41, columnName = "Local GST Amount")
    private double localGSTAmount;

    @DataField(pos = 42, columnName = "Local Cess Amount")
    private double localCessAmount;

    @DataField(pos = 43, columnName = "Airport Charges")
    private double airportCharges;

    @DataField(pos = 44, columnName = "Local Airport Charges")
    private double localAirportCharges;

    @DataField(pos = 45, columnName = "Origin Country")
    private String originCountry;

    @JsonProperty("isExempted")
    @DataField(pos = 46, columnName = "Is Exempted")
    private int isExempted;

    @DataField(pos = 47, columnName = "IsCredited")
    private Integer isCredited;

    @DataField(pos = 48, columnName = "IsProcessed")
    private String isProcessed;

    @DataField(pos = 49, columnName = "ReasonID")
    private String reasonIds;

    @DataField(pos = 50, columnName = "IsError")
    private String isError;

    @DataField(pos = 51, columnName = "IsCorrect")
    private String isCorrect;

    @DataField(pos = 52, columnName = "ErrorIds")
    private String errorIds;

    @DataField(pos = 53, columnName = "ErrorDescription")
    private String errorDescription;

    // private Integer isCredited;
    // private String isProcessed;
    @DataField(pos = 54, columnName = "TranType")
    private String tranType;

    @DataField(pos = 55, columnName = "AutoCorrectionId")
    private String autoCorrectionIds;

    @DataField(pos = 56, columnName = "IsAutoCorrected")
    private String isAutoCorrected;
}


