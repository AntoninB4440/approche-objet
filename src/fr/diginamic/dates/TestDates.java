package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date1 = new Date(121, 1, 8);
		SimpleDateFormat formatage = new SimpleDateFormat("dd/MM/YYYY");

		System.out.println(formatage.format(date1));

		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formatage2 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		System.out.println(formatage2.format(date2));

		Date date3 = new Date();
		System.out.println(formatage2.format(date3));

	}

}
