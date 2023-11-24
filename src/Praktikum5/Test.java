package Praktikum5;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		String nama,warna;
		int berat;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan nama Kucingmu :");
		nama = input.next();
		
		System.out.print("Masukan Warna :");
		warna = input.next();
		
		System.out.print("Masukan Berat :");
		berat= input.nextInt();
		
		Cat kucingsaya = new Cat();
		kucingsaya.identitas(nama,warna,berat);
		System.out.println(kucingsaya.ambilNama()+" Si Kucing,"
				+" Warnanya "+kucingsaya.ambilWarna()
				+" beratnya "+kucingsaya.ambilBerat()+"Kg.");
		kucingsaya.eat();
	}

}
