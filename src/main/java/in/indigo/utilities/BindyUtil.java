package in.indigo.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;

public class BindyUtil {

    public static String isValidDateFormat(String date) {

        if (date == null || date.isEmpty()) {
            return date;
        }
//        List<String> validFormat = Arrays.asList("M/dd/yyyy", "M/d/yyyy", "MM/d/yyyy", "MM/dd/yyyy");

        List<String> validFormat = Arrays.asList("M/d/yyyy", "d/M/yyyy");

        Boolean isValid = false;
        for (String string : validFormat) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(string);
            try {
                LocalDate parsedDate = LocalDate.parse(date, formatter);
                String reformattedDate = parsedDate.format(formatter);

//                isValid = date.equals(reformattedDate);
                isValid=true;
//                System.out.print("Formatted DAte: " +reformattedDate+ " Original Date: "+date);
            } catch (DateTimeParseException e) {

                isValid = false;
            }
            if (isValid)
                break;

        }
        if (!isValid)
            throw new RuntimeException("not a valid date formate");
        else
            return date;
    }

    public static String isCommaPresent(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        if (!input.contains(",")) {
            throw new RuntimeException("Field must have a comma");
        }
        return input;
    }

}
