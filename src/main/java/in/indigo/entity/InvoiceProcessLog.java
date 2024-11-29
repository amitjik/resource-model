package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import in.indigo.deserializer.DateDeserializer;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name ="InvoiceProcessLog")
public class InvoiceProcessLog extends PanacheEntityBase {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TransactionDate")
    @JsonDeserialize(using = DateDeserializer.class)
    private Date transactionDate;

    @Column(name="ProcessStatus")
    private String processStatus;

    @Column(name="StartDate")
    private java.util.Date startDate;

    @Column(name="EndDate")
    private java.util.Date endDate;

    @Column(name= "CreatedBY")
    private String createdBy;
}
