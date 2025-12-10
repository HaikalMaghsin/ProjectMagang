package Magang;
public class Menu {
    public static void displayMenu() {
        System.out.println("Welcome to the Menu");
        System.out.println("===================");
        while (true) {
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasasrkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = Dashboard.sc.nextInt();
            Dashboard.sc.nextLine();
            switch (pilihan) {
                case 1:
                    TambahMahasiswa.AddMahasiswa();
                    break;
                case 2:
                    break;
                case 3:
                    CariBerdasarkanProdi.cariBerdasarkanProdi();
                    break;
                case 4:
                    Statistik.HitungStatus();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    Dashboard.sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}