package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name ="MstGoodsServiceType")
public class MstGoodsServiceType{

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "GoodsServiceType")
    private String goodsServicesType;

    @Column(name = "Code" , columnDefinition = "NCHAR")
    private String  code;

    @Column(name = "SAC")
    private Integer sac;




}
