package in.indigo.resource;


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
@CsvRecord(separator = "\\|", skipFirstLine = true, generateHeaderColumns = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GSTRates {
    @DataField(pos = 1, columnName = "Product Description")
    private String productDescription;
    @DataField(pos = 2, columnName = "IGST Rate")
    private double igstRate;  
    @DataField(pos = 3, columnName = "CGST Rate")
    private double cgstRate;  
}
