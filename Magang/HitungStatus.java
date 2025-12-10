package Magang;
public class HitungStatus {
    static void hitungStatus(String[] status, int jumlahData) {
        int diterima = 0, menunggu = 0, ditolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (status[i].equalsIgnoreCase("Diterima"))
                diterima++;
            else if (status[i].equalsIgnoreCase("Menunggu"))
                menunggu++;
            else if (status[i].equalsIgnoreCase("Ditolak"))
                ditolak++;
        }

        System.out.println("\n=== Jumlah Pendaftar Berdasarkan Status ===");
        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak  : " + ditolak);
    }
}
