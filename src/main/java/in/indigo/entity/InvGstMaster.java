package in.indigo.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Inv_GSTMaster")
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InvGstMaster {

    @Id
    @Column(name = "SNo")
    //private double id; //on indigo cloud
    private int id; //on hetzer cloud

    @Column(name = "State")
    private String state;

    @Column(name = "AirportCode")
    private String airportCode;

    @Column(name = "StateCode")
    private String stateCode;

    @Column(name = "GSTINofIndiGO")
    private String e6gstin;

    @Column(name = "Address")
    private String e6RegisteredAddress;

    @Column(name = "PlaceOfSupply")
    private String placeOfSupply;

}
