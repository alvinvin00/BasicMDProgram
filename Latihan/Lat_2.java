package testpack;

import java.util.*;

public class Lat_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		boolean ulang = true;
		String AP;
		do {
			System.out.print("Masukkan Jam <hh:mm:ss> : ");
			String input = s.nextLine();
			String jam = input.substring(0, 2);
			int jamAngka = Integer.parseInt(jam);
			if (jamAngka > 12) {
				jamAngka -= 12;
				AP = "PM";
			} else
				AP = "AM";

			if (jamAngka == 12 || jamAngka == 24) {
				jamAngka = 12;
			}
			System.out.println("Jam : " + jamAngka +" "+ AP);
			String menit = input.substring(3, 5);
			System.out.println("Menit : " + menit + " menit");
			String detik = input.substring(6, 8);
			System.out.println("Detik : " + detik + " detik");
			System.out.print("Apakah anda ingin mengulang program <Y/T> ? = ");
			if (s.nextLine().toUpperCase().equals("T"))
				ulang = false;
		} while (ulang == true);
	}
}
