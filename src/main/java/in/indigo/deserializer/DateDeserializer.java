package in.indigo.deserializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateDeserializer extends StdDeserializer<Date> {
    protected DateDeserializer(Class vc) {
        super(vc);
    }

    protected DateDeserializer() {
        this(null);
    }

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
//        String text= jsonParser.getText();
//        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("M/d/yyyy");
//
//        LocalDate localDate=LocalDate.parse(text, formatter);
//
//        return Date.valueOf(localDate);


        String text = jsonParser.getText();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("M/d/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d/M/yyyy");

        LocalDate localDate = null;

        try {
            localDate = LocalDate.parse(text, formatter1);
        } catch (DateTimeParseException e) {
            try {
                localDate = LocalDate.parse(text, formatter2);
            } catch (DateTimeParseException ex) {
                throw new IOException("Date format not valid: " + text);
            }
        }

        return Date.valueOf(localDate);

    }
}
