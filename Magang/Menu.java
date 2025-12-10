package Magang;
import java.util.Scanner;
public class Menu {
    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Menu");
        System.out.println("===================");
        while (true) {
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasasrkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: 
                    TambahMahasiswa tambah = new TambahMahasiswa();
                    tambah.AddMahasiswa();
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
            sc.close();
        } 
    } 
}