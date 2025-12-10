package Magang;

public class Statistik {
    public static void HitungStatus() {
        int diterima = 0, menunggu = 0, ditolak = 0, i;
        for (i = 0; i < Mahasiswa.id; i++) {
            if (Mahasiswa.status[i].equals("Diterima")) {
                diterima++;
            } else if (Mahasiswa.status[i].equals("Menunggu")) {
                menunggu++;
            } else if (Mahasiswa.status[i].equals("Ditolak")) {
                ditolak++;
            }
        }
        System.out.println("Jumlah Pendaftar Berdasarkan Status:");
        System.out.println("Total Diterima: " + diterima);
        System.out.println("Total Menunggu: " + menunggu);
        System.out.println("Total Ditolak: " + ditolak);
        
    }
}