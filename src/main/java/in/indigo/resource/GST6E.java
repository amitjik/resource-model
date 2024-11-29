package in.indigo.resource;

import lombok.*;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@CsvRecord(separator = "\\|", skipFirstLine = true, generateHeaderColumns = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class GST6E {

    @DataField(pos = 1, columnName = "State")
    private String state;
    @DataField(pos = 2, columnName = "Place of Embarkation")
    private String placeOfEmbarkation;
    @DataField(pos = 3, columnName = "State code")
    private String stateCode;
    @DataField(pos = 4, columnName = "6E GSTIN")
    private String e6gstin;
    @DataField(pos = 5, columnName = "6E RegisteredAddress")
    private String e6RegisteredAddress;
    private String placeOfSupply;

}