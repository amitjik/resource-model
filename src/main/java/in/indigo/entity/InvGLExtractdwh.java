package in.indigo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;
import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Inv_GLExtractdwh")
@CsvRecord(separator = "\\|", skipFirstLine = true, generateHeaderColumns = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvGLExtractdwh extends PanacheEntityBase {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @DataField(pos = 1, columnName = "CreationDate")
    @Column(name="creationdate")
    private String creationDate;

    @DataField(pos = 2, columnName = "LedgerKey")
    @Column(name="Ledgerkey")
    private String Ledgerkey;

    @DataField(pos = 3, columnName = "ReferenceCode")
    @Column(name="referenceCode")
    private String referenceCode;

    @DataField(pos = 4, columnName = "HostAmount")
    @Column(name = "HostAmount")
    private String hostAmount;

//    @DataField(pos = 5, columnName = "FileName")
    @Column(name = "FIlename")
    private String fileName;

    @Transient
    public Integer index;


}
