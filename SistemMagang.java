import java.util.Scanner;

public class SistemMagang {
    static Scanner sc = new Scanner(System.in);
    static String[][] dataMagang = new String[100][6]; 
    static int jumlahData = 0;

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine(); 
            switch (menu) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariBerdasarkanProdi();
                    break;
                case 4:
                    hitungStatus();
                    break;
                case 5:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (menu != 5);
    }

}