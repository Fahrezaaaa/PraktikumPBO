package TugasPBO;

//Kelompok:	-Dava Pratama(221106042987)
//			-Fahreza Aldi Wildan(2211O6042853)
//Kelas:	 Reguler A
//Program 42.Tabungan

import java.util.Scanner;

public class Tabungan {
	private int saldo;
	
	public void tabungan(int saldo) {
		this.saldo = saldo;
	}
	public void ambilUang(int jumlah) {
		if(jumlah <= saldo) {
			saldo -= jumlah;
			System.out.println("Penarikan Berhasil.Sisa saldo : " + saldo);
		}else {
			System.out.println("Saldo tidak cukup.");
		}
	}
	public static void main(String[]args) {
		 Tabungan rekening = new Tabungan();
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Masukan Saldo Awal :");
		 int saldotabungan =  input.nextInt();
		 rekening.tabungan(saldotabungan);
		 
		 System.out.print("Jumlah Uang yang diambil :");
		 int jumlahAmbil = input.nextInt();
		 rekening.ambilUang(jumlahAmbil); 
		 
	}
	

}
