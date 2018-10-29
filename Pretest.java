package testpack;
import java.util.*;
public class Pretest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);

System.out.println("=================================================");
System.out.print("Masukkan Nama Pegawai               : ");
String nama = s.next();
System.out.print("Masukkan Nama Kantor (Pusat/Cabang) : ");
String pc = s.next();
System.out.print("Masukkan kode jabatan (S/W/K)       : ");
char jab = s.next().charAt(0);
System.out.print("Masukkan Umur anda (tahun)          : ");
int umur = s.nextInt();
System.out.print("Masukkan lama kerja (tahun)         : ");
int lama = s.nextInt();
System.out.println("=================================================");

String lokasi = null, jabatan = "";
double gp = 0,tj = 0,bonus = 0;



if (pc.equalsIgnoreCase("Pusat")){
	lokasi = "Pusat";
	if(jab == 'S' || jab == 's'){
		jabatan = "Staff";
		if(umur > 31){
			gp = 4000000;
			tj = 900000;
		}
		else if(umur >= 26 || umur < 30){
			gp = 3000000;
			tj = 800000;
		}
		else if(umur >= 21 || umur < 26){
			gp = 2000000;
			tj = 500000;
		}
		else if(umur >= 18 || umur < 21){
			gp = 1500000;
			tj = 250000;
		}
	}
	else if(jab == 'W' || jab == 'w'){
		jabatan = "Wakil";
		if(umur > 31){
			gp = 5000000;
			tj = 1200000;
		}
		else if(umur >= 26 || umur < 30){
			gp = 4000000;
			tj = 1000000;
		}
		else if(umur >= 21 || umur < 26){
			gp = 3000000;
			tj = 700000;
		}
		else if(umur >= 18 || umur < 21){
			gp = 2500000;
			tj = 450000;
		}
	}
	else if(jab == 'K' || jab == 'k'){
		jabatan = "Ketua";
		if(umur > 31){
			gp = 8000000;
			tj = 2000000;
		}
		else if(umur >= 26 || umur < 30){
			gp = 6000000;
			tj = 1500000;
		}
		else if(umur >= 21 || umur < 26){
			gp = 4000000;
			tj = 1000000;
		}
		else if(umur >= 18 || umur < 21){
			gp = 3500000;
			tj = 500000;
		}
	}
else if (pc.equalsIgnoreCase("Cabang")){
	lokasi = "Cabang";
		if(jab == 'S' || jab == 's'){
			jabatan = "Staff";
				if(umur > 31){
					gp = 1500000;
					tj = 400000;
				}
				else if(umur >= 26 || umur < 30){
					gp = 1400000;
					tj = 300000;
				}
				else if(umur >= 21 || umur < 26){
					gp = 1200000;
					tj = 250000;
				}
				else if(umur >= 18 || umur < 21){
					gp = 1000000;
					tj = 200000;
				}
			}
			else if(jab == 'W' || jab == 'w'){
				jabatan = "Wakil";
				if(umur > 31){
					gp = 4500000;
					tj = 600000;
				}
				else if(umur >= 26 || umur < 30){
					gp = 3500000;
					tj = 500000;
				}
				else if(umur >= 21 || umur < 26){
					gp = 2500000;
					tj = 400000;
				}
				else if(umur >= 18 || umur < 21){
					gp = 2000000;
					tj = 300000;
				}
			}
			else if(jab == 'K' || jab == 'k'){
				jabatan = "Ketua";
				if(umur > 31){
					gp = 5500000;
					tj = 700000;
				}
				else if(umur >= 26 || umur < 30){
					gp = 4500000;
					tj = 600000;
				}
				else if(umur >= 21 || umur < 26){
					gp = 3500000;
					tj = 500000;
				}
				else if(umur >= 18 || umur < 21){
					gp = 3000000;
					tj = 400000;
				}
			}
		}
}
if (lama>=5)
	bonus = lama*tj;
long total = (long)(gp+tj+bonus);
long pajak = 15*total/100; 
long gaji = (total-pajak);
System.out.println("=================================================");
System.out.println("Lokasi Kantor   = "+lokasi);
System.out.println("Jabatan Pegawai = "+jabatan);
System.out.println("Gaji Pokok      = "+gp);
System.out.println("Tunjangan       = "+tj);
System.out.println("Bonus           = "+bonus);
System.out.println("Total Gaji      = "+total);
System.out.println("Pajak           = "+pajak);
System.out.println("=================================================");
System.out.println("Gaji yang diterima oleh "+nama+" sebesar = "+gaji);
System.out.println("=================================================");

	}
}
