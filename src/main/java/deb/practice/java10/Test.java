package deb.practice.java10;

import org.apache.commons.lang3.time.DateUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

    public static void main(String[] args) throws DatatypeConfigurationException, ParseException {
        Date checkInDate = getDate("2022-03-01 11:15:00").toGregorianCalendar().getTime();
        System.out.println(DateUtils.addDays(checkInDate, -1));
    }

    private static XMLGregorianCalendar getDate(String dat) throws ParseException, DatatypeConfigurationException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = format.parse(dat);

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
    }
}
