package in.indigo.resource;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Data {

    private String transactionDate;
    private String importFileName;
    private long records;
    private long pnr;
    private double nonTaxableFareComponent;
    private double taxableComponent;
    private double cgstAmount;
    private double igstAmount;
    private double sgstAmount;
    private double ugstAmount;
    private String isFileProcessed;
    private String createdBy;
    private double cessAmount;
}