package alvin;
import java.util.*;
public class Kuis_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
boolean ulang = true;
int bagasiper=0;
long harga = 0;
double diskon = 0;
String kelasterbang ="";

while(ulang ==true){
System.out.println("============================================================================");
System.out.print("Jenis Penerbangan (Nasional/Internasional) : ");
String jenis=s.next();
System.out.print("Kode Kelas Penerbangan (B/E) : ");
char kode=s.next().charAt(0);
System.out.print("Jumlah penumpang : ");
int penumpang=s.nextInt();
System.out.print("Jumlah total bagasi : ");
int bagasi = s.nextInt();
System.out.println("============================================================================");
if(jenis.equalsIgnoreCase("Nasional")){

	if(kode=='B'){
		kelasterbang="Bisnis";
		bagasiper=20;
		if(penumpang>21){
			 diskon = 0.3;
			 harga = 700000;
		}
		else if(penumpang>11){
			 diskon = 0.2;
			 harga = 895000;
		}
		else if(penumpang>1){
			 diskon = 0.1;
			 harga = 900000;
		}
	}
	else if(kode=='E'){
		kelasterbang="Ekonomi";
		bagasiper=10;
		if(penumpang>21){
			 diskon = 0.3;
			 harga = 500000;
		}
		else if(penumpang>11){
			 diskon = 0.2;
			 harga = 585000;
		}
		else if(penumpang>1){
			 diskon = 0.1;
			 harga = 600000;
		}
	}
}
else if(jenis.equalsIgnoreCase("Internasional")){
	if(kode=='B'){
		kelasterbang="Bisnis";
		bagasiper=30;
		if(penumpang>21){
			 diskon = 0.3;
			 harga = 2000000;
		}
		else if(penumpang>11){
			 diskon = 0.2;
			 harga = 2200000;
		}
		else if(penumpang>1){
			 diskon = 0.1;
			 harga = 2500000;
		}
	}
	else if(kode=='E'){
		kelasterbang="Ekonomi";
		bagasiper=20;
		if(penumpang>21){
			 diskon = 0.3;
			 harga = 1700000;
		}
		else if(penumpang>11){
			 diskon = 0.2;
			 harga = 1850000;
		}
		else if(penumpang>1){
			 diskon = 0.1;
			 harga = 2000000;
		}
	}
}
long beratlebih=bagasi-(penumpang*bagasiper);
long charge = beratlebih*50000;
long subtotal = harga*penumpang;
long potongan = (long) (subtotal*diskon);
long total = (subtotal-potongan+charge);
System.out.println("Kelas Penerbangan    = "+kelasterbang);
System.out.println("Bagasi per Penumpang = "+bagasiper+" kg");
System.out.println("Harga per Penumpang  = "+harga);
System.out.println("Diskon               = "+(diskon*100)+"%");
System.out.println("Subtotal             = "+subtotal);
System.out.println("Potongan             = "+potongan);
System.out.println("Kelebihan Bagasi     = "+beratlebih);
System.out.println("Cas Kelebihan Bagasi = "+charge);
System.out.println("Total Bayar          = "+total);
System.out.println("============================================================================");
System.out.print("Apakah anda ingin mengulang lagi(Y/T)? : ");
char tanya = s.next().charAt(0);
if (tanya == 'T'){
	ulang = false;
}
}
	}
}
