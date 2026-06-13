class Mahasiswa3 {
    String nama;
    String nim;
    String jurusan;
    private double ipk;

    // Constructor
    Mahasiswa3(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Cek Kelulusan
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // Hitung Predikat
    public String hitungPredikat() {
        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }

    // Tampilkan Info
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f%n", ipk);
        System.out.println("Status: " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat());
        System.out.println();
    }
}

public class Soal3 {
    public static void main(String[] args) {

        Mahasiswa3[] daftar = {
            new Mahasiswa3("Andi Pratama", "2440001", "Teknik Informatika", 3.75),
            new Mahasiswa3("Budi Santoso", "2440002", "Sistem Informasi", 3.40),
            new Mahasiswa3("Citra Lestari", "2440003", "Teknik Informatika", 3.90),
            new Mahasiswa3("Joni Suhartono", "2440004", "Teknik Industri", 3.00),
            new Mahasiswa3("Bulan Suci", "2440005", "Akuntansi", 3.20)
        };

        System.out.println("=== Data Mahasiswa ===");

        for (Mahasiswa3 m : daftar) {
            m.tampilkanInfo();
        }
    }
}