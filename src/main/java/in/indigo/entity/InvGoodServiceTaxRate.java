package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Inv_GoodServiceTaxRate")
public class InvGoodServiceTaxRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Goodsservicestype")
    private String productDescription;

    @Column(name = "CGSTRate")
    private float cgstRate;

    @Column(name = "IGSTRate")
    private float igstRate;

    @Column(name = "SGSTUGSTRate")
    private float sgstugstRate;
}
