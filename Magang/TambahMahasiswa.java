package Magang;
import java.util.Scanner;
public class TambahMahasiswa {
    Scanner sc = new Scanner(System.in);
    public void AddMahasiswa() {
        int i = Mahasiswa.id;
        System.out.println("Tambah Data Mahasiswa Magang");
        System.out.println("============================");
        System.out.print("Masukkan nama mahasiswa: ");
        Mahasiswa.nama[i] = sc.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        Mahasiswa.nim[i] = sc.nextLine();
        System.out.print("Masukkan program studi mahasiswa: ");
        Mahasiswa.prodi[i] = sc.nextLine();
        
        int sem;
        do {
            System.out.print("Masukkan semester mahasiswa: ");
            sem = sc.nextInt(); 
            if (sem != 7 && sem != 6){
                System.out.println("Semester harus 6 atau 7. Silakan coba lagi.");
            } else {
                Mahasiswa.semester[i] = sem;
            }
        } while (sem != 7 && sem != 6);
        sc.nextLine();
        String sts;
        do {
            System.out.print("Masukkan status mahasiswa (Diterima/Menunggu/Ditolak): ");
            sts = sc.nextLine();
            if (!sts.equals("Diterima") && !sts.equals("Menunggu") && !sts.equals("Ditolak")) {
                System.out.println("Status harus salah satu dari: Diterima, Menunggu, Ditolak. Silakan coba lagi.");
            } else {
                Mahasiswa.status[i] = sts;
            }
        } while (!sts.equals("Diterima") && !sts.equals("Menunggu") && !sts.equals("Ditolak"));
        Mahasiswa.id++;
        System.out.println("Data mahasiswa berhasil ditambahkan! Total Pendaftar: " + Mahasiswa.id);
    }
}
