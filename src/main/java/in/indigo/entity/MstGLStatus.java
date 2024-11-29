package in.indigo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import in.indigo.deserializer.DateDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name ="MstGLStatus")
public class MstGLStatus extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TransactionDate")
    @JsonDeserialize(using = DateDeserializer.class)
    private Date transactionDate;

    @Column(name = "ImportFileName")
    private String importFileName;

    @Column(name = "Records")
    private float records;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name ="CreatedDate")
    private java.util.Date createdDate;

    @Column(name = "CGSTAmount")
    private float cgstAmount;

    @Column(name = "SGSTAmount")
    private float sgstAmount;

    @Column(name = "IGSTAmount")
    private float igstAmount;

    @Column(name = "UGSTAmount")
    private float ugstAmount;

    @Column(name = "Cess Amount")
    private float cessAmount;

    @Column(name = "GstAmount")
    private float gstAmount;
}
