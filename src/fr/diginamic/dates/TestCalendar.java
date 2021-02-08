package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();

		cal.set(2016, 4, 19, 23, 59, 30);
		Date date1 = cal.getTime();

		SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/YYYY");

		System.out.println(formatage.format(date1));

		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();

		SimpleDateFormat formatage2 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");

		System.out.println(formatage2.format(date2));

		SimpleDateFormat formatageFR = new SimpleDateFormat("YYYY/MMMM/dd EEEE HH:mm:ss", Locale.FRANCE);
		SimpleDateFormat formatageRU = new SimpleDateFormat("YYYY/MMMM/dd EEEE HH:mm:ss", new Locale("ru", "RU"));
		SimpleDateFormat formatageGR = new SimpleDateFormat("YYYY/MMMM/dd EEEE HH:mm:ss", Locale.GERMAN);
		SimpleDateFormat formatageCH = new SimpleDateFormat("YYYY/MMMM/dd EEEE HH:mm:ss", Locale.CHINESE);

		System.out.println(formatageFR.format(date2));
		System.out.println(formatageRU.format(date2));
		System.out.println(formatageGR.format(date2));
		System.out.println(formatageCH.format(date2));

	}

}
