import java.util.Scanner;

public class Tugas2_Absen13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        do {
            System.out.println("Masukkan jenis kendaraan(1 mobil, 2 motor, 0 Keluar): ");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = input.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Input tidak valid!");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = input.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid!");
                continue;
            }

            if (durasi > 5) {
                total = 12500;
            } else {
                if (jenis == 1) {
                    total = durasi * 3000;
                } else if (jenis == 2) {
                    total = durasi * 2000;
                }
            }

            System.out.println("Biaya parkir: Rp " + total);

        } while (true);

        System.out.println("\nTerima kasih telah menggunakan layanan parkir!");
        input.close();
    }
}
