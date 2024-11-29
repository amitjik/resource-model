package in.indigo.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class GlData {

    private String transactionDate;
    private String importFileName;
    private String referenceCode;
    private String hostAmount;
    private long records;
    private String createdBy;
    private double cgstAmount;
    private double igstAmount;
    private double sgstAmount;
    private double ugstAmount;
    private double cessAmount;
    private double gstAmount;
    private int pnrCount;


}
