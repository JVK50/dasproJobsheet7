import java.util.Scanner;

public class Tugas1_Absen13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga = 50000;
        int pembelian, totalTiket = 0;
        double totalPendapatan = 0, diskon = 0;

        do {
            System.out.println("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            pembelian = sc.nextInt();

            if (pembelian == 0) {
                break;
            }

            if (pembelian < 0) {
                continue;
            }

            if (pembelian > 4) {
                diskon = 0.1;
            } else if (pembelian > 10) {
                diskon = 0.15;
            }

            double totalHarga = pembelian * harga;
            double hargaSetelahDiskon = totalHarga - (totalHarga * diskon);
            totalPendapatan += totalHarga;
            totalTiket += pembelian;

            System.out.println("Jumlah tiket: " + pembelian);
            System.out.println("Total harga: Rp " + totalHarga);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);
            System.out.println("----------------------------------------");

        } while (true);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);
        
        sc.close();
    }
}