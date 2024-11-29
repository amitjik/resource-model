//package in.indigo.entity.deserializer;
//
//import com.fasterxml.jackson.core.JacksonException;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
//
//import java.io.IOException;
//import java.sql.Date;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//public class DateDeserializer extends StdDeserializer<Date> {
//    protected DateDeserializer(Class vc) {
//        super(vc);
//    }
//
//    protected DateDeserializer() {
//        this(null);
//    }
//
//    @Override
//    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
//        String text= jsonParser.getText();
//        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("d/MM/yyyy");
//
//        LocalDate localDate=LocalDate.parse(text, formatter);
//
//        return Date.valueOf(localDate);
//
//    }
//}
