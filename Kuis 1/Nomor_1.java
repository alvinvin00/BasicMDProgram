package alvin;
import java.util.*;
public class Kuis_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
boolean ulang = false;
do{
System.out.print("Masukkan tahun awal : ");
int awal = s.nextInt();
System.out.print("Masukkan tahun akhir : ");
int akhir = s.nextInt();
System.out.println("Yang termasuk tahun kabisat dari tahun"+awal+"-"+akhir);

while(awal<=akhir){
	if (awal%400 == 0 || (awal%100!=0&&awal%4==0)){
	System.out.print(awal+" ");
	}
	awal++;
	}
System.out.println("");
System.out.print("Apakah anda ingin mengulang lagi<Y/T>?");
char pilih = s.next().charAt(0);
if(pilih =='T'||pilih=='t'){
	ulang=false;
}
else ulang=true;
	}while(ulang==true);

	}
}
