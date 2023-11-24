package Praktikum4;
import java.util.Scanner;

public class TugasPraktikum {

		private int angka1;
		private int angka2;

		private int perulangan;

		public int getAngka1() {
			return angka1;
		}

		public int getPerulangan() {
			return perulangan;
		}

		public void setPerulangan(int perulangan) {
			this.perulangan = perulangan;
		}

		public void setAngka1(int angka1) {
			this.angka1 = angka1;
		}

		public int getAngka2() {
			return angka2;
		}

		public void setAngka2(int angka2) {
			this.angka2 = angka2;
		}

		public int pertambahan(int angka1, int angka2) {
			int hasil = angka1 + angka2;
			return hasil;
		}

		public int pengurangan(int angka1, int angka2) {
			int hasil = angka1 - angka2;
			return hasil;
		}

		public int perkalian(int angka1, int angka2) {
			int hasil = angka1 * angka2;
			return hasil;
		}

		public int pembagian(int angka1, int angka2) {
			int hasil = angka1 / angka2;
			return hasil;
		}

		public int operasi() {
			int hasil = 0;
			int opsi, perulangan;
			Scanner input = new Scanner(System.in);
			System.out.println("Masukan Perulangan : ");
			perulangan = this.getPerulangan();

			for (int i = 1; i <= perulangan; i++) {
				System.out.print("List Perhitungan : "
						+ "\n 1 = pertambahan"
						+ "\n 2 = pengurangan"
						+ "\n 3 = perkalian "
						+ "\n 4 = pembagian "
						+ "\n Masukkan Operasi : ");
				opsi = input.nextInt();

				if (opsi == 1) {
					hasil = this.pertambahan(this.getAngka1(), this.getAngka2());

				} else if (opsi == 2) {
					hasil = this.pengurangan(this.getAngka1(), this.getAngka2());

				} else if (opsi == 3) {
					hasil = this.perkalian(this.getAngka1(), this.getAngka2());

				} else if (opsi == 4) {
					hasil = this.pembagian(this.getAngka1(), this.getAngka2());

				} else {
					System.out.println("Pilihan Harus Sesuai List");

				}
				System.out.println("hasil Perulangan ke " + i + ":" + hasil + "\n");
			}

	        return hasil;
	    }

		public static void main(String[] args) {
			int angka1, angka2, hasil,perulangan;

			TugasPraktikum test = new TugasPraktikum();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Nama	: Fahreza Aldi Wildan");
			System.out.println("Kelas 	: Reguler A ");
			System.out.println("Prodi 	: Teknik Informatika");
			System.out.println("====================================================");
			

			System.out.print("Masukan jumlah perulangan : ");
			test.setPerulangan(input.nextInt());
			perulangan = test.getPerulangan();


			System.out.print("masukan Angka 1 : ");
			test.setAngka1(input.nextInt());

			System.out.print("masukan Angka 2 : ");
			test.setAngka2(input.nextInt());


			angka1 = test.getAngka1();
			angka2 = test.getAngka2();
			hasil = test.operasi();
			System.out.println("hasil Operasi : " + hasil);
		}
	}

