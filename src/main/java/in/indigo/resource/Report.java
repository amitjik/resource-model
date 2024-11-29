package in.indigo.resource;

import java.util.List;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Report {
    private String fileType;
    private List<Data> data;
    private List<GlData> glData;

}
