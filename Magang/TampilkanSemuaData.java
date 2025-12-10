package Magang;

public class TampilkanSemuaData {
    public static void tampilkanSemuaData() {
        System.out.println("\n=== DATA PENDAFTAR MAGANG ===");

        if (Mahasiswa.id == 0) {
            System.out.println("Belum ada data pendaftar magang.");
            return;
        }

        System.out.printf("%-4s | %-25s | %-15s | %-25s | %-20s | %-10s | %-10s\n",
                "No", "Nama", "NIM", "Prodi", "Tempat Magang", "Semester", "Status");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < Mahasiswa.id; i++) {
            System.out.printf("%-4d | %-25s | %-15s | %-25s | %-20s | %-10d | %-10s\n",
                    (i + 1), Mahasiswa.nama[i], Mahasiswa.nim[i], Mahasiswa.prodi[i],
                    Mahasiswa.tempatMagang[i], Mahasiswa.semester[i], Mahasiswa.status[i]);
        }

        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");
    }
}