package Praktikum3;
import java.util.Scanner;

public class Latihan {
public static void main(String args[]) {
//	inisialisasi
	Scanner input = new Scanner(System.in);
	int angka1, angka2, hasil, perulangan, perhitungan;
//	input perulangan
	System.out.println("Masukan perulangan :");
	perulangan = input.nextInt();
//	Perulangan For
	for(int i=1;i<= perulangan; i++) {
//		input user
		System.out.println("Masukan Angka 1 :");
		angka1 = input.nextInt();
		System.out.print("List Perhitungan:"
				+ "\n 1 : pertambahan"
				+ "\n 2 : pengurangan"
				+ "\n 3 : perkalian"
				+ "\n 4 : pembagian"
				+ "\n Masukan angka perhitungan :");
		perhitungan = input.nextInt();
		System.out.println("Masukan Angka 2 :");
		angka2 = input.nextInt();
//		kondisi if
		if (perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.println("Hasilnya adalah :"+hasil);
		} else if(perhitungan ==2){
			hasil = angka1 - angka2;
			System.out.println("Hasilnya adalah :"+hasil);
		} else if(perhitungan ==3){
			hasil = angka1 * angka2;
			System.out.println("Hasilnya adalah :"+hasil);
		} else if(perhitungan ==4){
			hasil = angka1 / angka2;
			System.out.println("Hasilnya adalah :"+hasil);
		}else {
			System.out.println("Angka perhitungan salah");
		}
		
		}
	
		}
}
