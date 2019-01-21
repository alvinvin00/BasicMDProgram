package testpack;

import java.util.Scanner;

public class Pert_24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char jawab;
		int gp = 0, gl = 0;
		do {
			System.out.print("Masukkan banyak pegawai = ");
			int banyak = s.nextInt();
			String[][] karyawan = new String[banyak][5];

			int grandTotal = 0;
			for (int i = 0; i < banyak; i++) {
				System.out.print("Masukkan Kode Pegawai ke-" + (i + 1) + " = ");
				String kode = s.next();
				String[] pecah = kode.split("-");
				String bagian = pecah[0];
				String jabatan = pecah[1];
				int lembur = Integer.parseInt(pecah[2]);
				if (bagian.equals("AC")) {
					karyawan[i][0] = "Accounting";
					if (jabatan.equalsIgnoreCase("A")) {
						gp = 5000000;
						gl = 50000;
						karyawan[i][1] = "Kepala";
					} else if (jabatan.equalsIgnoreCase("B")) {
						gp = 3500000;
						gl = 30000;
						karyawan[i][1] = "Staff";
					}
				} else if (bagian.equalsIgnoreCase("MK")) {
					karyawan[i][0] = "Marketing";
					if (jabatan.equalsIgnoreCase("A")) {
						gp = 8000000;
						gl = 90000;
						karyawan[i][1] = "Kepala";
					} else if (jabatan.equalsIgnoreCase("B")) {
						gp = 6000000;
						gl = 70000;
						karyawan[i][1] = "Staff";
					}

				}
				gl = gl * lembur;
				int total = gp + gl;
				karyawan[i][2] = String.valueOf(gp);
				karyawan[i][3] = String.valueOf(gl);
				karyawan[i][4] = String.valueOf(total);
			}

			System.out
					.println("==========================================================");
			System.out
					.println("Perincian (Bagian - Jabatan - Gaji Pokok - Gaji Lembur - Total)");
			System.out
					.println("==========================================================");
			for (int i = 0; i < banyak; i++) {
				System.out.println(karyawan[i][0] + " " + karyawan[i][1] + " "
						+ karyawan[i][2] + " " + karyawan[i][3] + " "
						+ karyawan[i][4]);
				int gaji = Integer.parseInt(karyawan[i][4]);
				grandTotal = grandTotal + gaji;
			}
			System.out
					.println("==========================================================");
			System.out.println(" Total Seluruh = " + grandTotal);
			System.out.print("Apakah Anda Ingin mengulang program(Y/T) ? = ");
			jawab = s.next().charAt(0);
		} while (jawab == 'Y');
	}
}
