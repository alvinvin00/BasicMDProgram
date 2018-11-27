package testpack;

import java.util.Scanner;

public class Lat_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan NPM : ");
		String NPM = s.nextLine();
		String tahunMasuk = "20" + NPM.substring(0, 2);
		String tahunLulus = "20" + NPM.substring(3, 5);
		String kodeProdi = NPM.substring(5, 7);
		String prodi = null;
		if (kodeProdi.equals("11"))
			prodi = "Manajemen Informasi";
		else if (kodeProdi.equals("12"))
			prodi = "Teknik Komputer";
		else if (kodeProdi.equals("13"))
			prodi = "Komputerisasi Akuntasi";
		else if (kodeProdi.equals("24"))
			prodi = "Sistem Informasi";
		else if (kodeProdi.equals("25"))
			prodi = "Teknik Informatika";

		String nomorUrut = NPM.substring(8, 10);
		System.out.println("=================================");
		System.out.println("NPM         : " + NPM);
		System.out.println("Angkatan    : " + tahunMasuk);
		System.out.println("Tahun Lulus : " + tahunLulus);
		System.out.println("Kode Prodi  : " + kodeProdi);
		System.out.println("Prodi       : " + prodi);
		System.out.println("Nomor Urut  : " + nomorUrut);
	}

}
