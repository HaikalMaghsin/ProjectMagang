package Magang;

public class TampilkanSemuaData {
    public static void TampilkanSemuaData() {
        System.out.println("\n=== DATA PENDAFTAR MAGANG ===");

        if (jumlahData == 0) {
            System.out.println("Belum ada data!");
            return;
        }

        System.out.println(
                "--------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-20s | %-10s | %-15s | %-9s | %-10s |\n",
                "No", "Nama", "NIM", "Prodi", "Semester", "Status");
        System.out.println(
                "--------------------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("| %-3d | %-20s | %-10s | %-15s | %-9d | %-10s |\n",
                    (i + 1), nama[i], nim[i], prodi[i], semester[i], status[i]);
        }

        System.out.println(
                "--------------------------------------------------------------------------------------------");
    }
}