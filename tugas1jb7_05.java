import java.util.Scanner;

public class tugas1jb7_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalTiket = 0;
        double totalPendapatan = 0;
        char lanjut;

        do {
            int jumlahTiket;

            // input jumlah tiket dengan validasi
            while (true) {
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif. Coba lagi.\n");
                } else {
                    break;
                }
            }

            // hitung diskon
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            // hitung total harga
            double totalHarga = jumlahTiket * HARGA_TIKET;
            double hargaAkhir = totalHarga - (totalHarga * diskon);

            // tampilkan hasil transaksi
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga setelah diskon: Rp " + hargaAkhir);
            System.out.println();

            // akumulasi
            totalTiket += jumlahTiket;
            totalPendapatan += hargaAkhir;

            // tanya apakah mau input lagi
            System.out.print("Apakah ada pembelian lain? (y/n): ");
            lanjut = sc.next().charAt(0);
            System.out.println();

        } while (lanjut == 'y' || lanjut == 'Y');

        // tampilkan hasil akhir
        System.out.println("=== LAPORAN PENJUALAN HARIAN ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + totalPendapatan);

        sc.close();
    }
}
