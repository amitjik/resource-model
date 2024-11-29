package in.indigo.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InvSeries {

    private Integer id;
    private String series;
    private String stateCode;
    private int currentValue;
    private int maxValue;
    private boolean active;
    private int financialYear;
    private String invoiceType;
}
