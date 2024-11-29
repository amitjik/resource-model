package in.indigo.resource;

import java.util.List;

import in.indigo.resource.GST6E;
import in.indigo.resource.GSTRates;
import in.indigo.resource.SlfeData;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DMNRequest {
    private List<SlfeData> SlfeDatas;
    private List<GST6E> gstin6es;
    private List<GSTRates> gstRates;
}
