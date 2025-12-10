package Magang;

public class CariBerdasarkanProdi {

    public static void cariBerdasarkanProdi() {
        System.out.println("\n--- Cari Pendaftar Berdasarkan Prodi ---");
        System.out.print("Masukkan Program Studi: ");
        String keyword = Dashboard.sc.nextLine();

        boolean ditemukan = false;

        System.out.println("\nHasil Pencarian:");
        System.out.printf("%-4s | %-25s | %-15s | %-25s | %-20s | %-10s | %-10s\n",
                "No", "Nama", "NIM", "Prodi", "Tempat Magang", "Semester", "Status");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < Mahasiswa.id; i++) {
            if (Mahasiswa.prodi[i].equalsIgnoreCase(keyword)) {
                System.out.printf("%-4d | %-25s | %-15s | %-25s | %-20s | %-10d | %-10s\n",
                        (i + 1), Mahasiswa.nama[i], Mahasiswa.nim[i], Mahasiswa.prodi[i],
                        Mahasiswa.tempatMagang[i], Mahasiswa.semester[i], Mahasiswa.status[i]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan program studi '" + keyword + "' tidak ditemukan.");
        }
    }
}