package TugasPBO;
import java.lang.Math;

//Kelompok:	-Dava Pratama(221106042987)
//			-Fahreza Aldi Wildan(2211O6042853)
//Kelas:	Reguler A
//Program 50.Energi Kinetik

public class EnergiKinetik {
    private int massa;
    private int kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int squareNumber(int num1, int num2) {
        return num1 * num2;
    }

    public double energiKinetik(int massa, int kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
        return 0.5 * massa * squareNumber(kecepatan, kecepatan);
    }

    public double usaha(int massa, int kecepatanAkhir) {
        double energiKinetikAwal = 0.5 * massa * squareNumber(0, 0); 
        double energiKinetikAkhir = 0.5 * massa * squareNumber(kecepatanAkhir, kecepatanAkhir);
        return energiKinetikAkhir - energiKinetikAwal;
    }

    public static void main(String[] args) {
        EnergiKinetik kinetik = new EnergiKinetik();
        kinetik.setMassa(145);
        kinetik.setKecepatan(25);

        System.out.println(" Berapa Energi Kinetiknya : " + kinetik.energiKinetik(kinetik.getMassa(), kinetik.getKecepatan()) + " Joule");
        System.out.println(" Usaha yang dilakukan : " + kinetik.usaha(kinetik.getMassa(), kinetik.getKecepatan()) + " Joule");
    }
}