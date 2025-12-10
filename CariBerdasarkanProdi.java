import java.util.Scanner;

public class CariBerdasarkanProdi {
    static Scanner sc = new Scanner(System.in);
    static String[][] dataMagang = new String[100][6];
    static int jumlahData = 0;

    static void cariBerdasarkanProdi() {
        System.out.println("\n--- Cari Pendaftar Berdasarkan Prodi ---");
        System.out.print("Masukkan Program Studi: ");
        String keyword = sc.nextLine();

        boolean ditemukan = false;

        System.out.println("\nHasil Pencarian:");
        System.out.printf("%-4s %-20s %-15s %-20s %-20s %-10s %-10s\n",
                "No", "Nama", "NIM", "Prodi", "Perusahaan", "Sem", "Status");
        System.out.println(
                "---------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahData; i++) {
            if (dataMagang[i][2].equalsIgnoreCase(keyword)) {
                System.out.printf("%-4d %-20s %-15s %-20s %-20s %-10s %-10s\n",
                        (i + 1), dataMagang[i][0], dataMagang[i][1], dataMagang[i][2],
                        dataMagang[i][3], dataMagang[i][4], dataMagang[i][5]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dengan program studi '" + keyword + "' tidak ditemukan.");
        }
    }
}