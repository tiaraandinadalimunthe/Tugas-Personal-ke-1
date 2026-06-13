import java.util.Scanner;

class Mahasiswa2 {
    String nama;
    String nim;
    String jurusan;
    private double ipk;

    // Constructor
    Mahasiswa2(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    // Setter
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Update IPK
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // Cek Kelulusan
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // Tampilkan Info
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f%n", ipk);
        System.out.println("Status: " + cekKelulusan());
    }
}

public class Soal2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mahasiswa2[] daftar = {
            new Mahasiswa2("Andi Pratama", "2440001", "Teknik Informatika", 3.75),
            new Mahasiswa2("Budi Santoso", "2440002", "Sistem Informasi", 3.40),
            new Mahasiswa2("Citra Lestari", "2440003", "Teknik Informatika", 3.90),
            new Mahasiswa2("Joni Suhartono", "2440004", "Teknik Industri", 3.00),
            new Mahasiswa2("Bulan Suci", "2440005", "Akuntansi", 3.20)
        };

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();

        boolean ditemukan = false;

        for (Mahasiswa2 m : daftar) {

            if (m.getNim().equals(nimCari)) {

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                m.updateIpk(ipkBaru);

                System.out.println("\nData berhasil diperbarui!");
                m.tampilkanInfo();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan!");
        }

        input.close();
    }
}