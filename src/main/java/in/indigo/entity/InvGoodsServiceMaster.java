package in.indigo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Inv_GoodServiceMaster")
public class InvGoodsServiceMaster {

    @Id
    @Column(name = "SNo")
    private int sno;

    @Column(name = "GoodServiceType")
    private String goodsServiceType;

}
