package Praktikum4;
import java.util.Scanner;

public class TestMahasiswa {
	 public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 String nama;
		 int npm;
		 
		 System.out.println(" Masukan Nama :");
		 nama = input.next();
		 
		 System.out.println(" Masukan Npm :");
		 npm = input.nextInt();
		 
		 Mahasiswa murid = new Mahasiswa();
		 murid.setNama(nama);
		 murid.setNpm(npm);
		 
		 System.out.println("Nama Mahasiswa : "+ murid.nama
				 +"\nNpm Mahasiswa : "+murid.npm);
	 }

}
