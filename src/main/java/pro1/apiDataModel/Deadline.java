package pro1.apiDataModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Deadline {
    public String value;

    public Date getDate()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy"); //převede z textu na Date
        try {
            Date date = format.parse(this.value); //datum dd.mm.yyyy
            return date;
        } catch (ParseException e) {
            e.printStackTrace(); // když je špatný formát
            return null;
        }
    }
}
