import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Menyimpan data mahasiswa ke array
        Mahasiswa2[] daftar = new Mahasiswa2[5];

        daftar[0] = new Mahasiswa2("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa2("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa2("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa2("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa2("Bulan Suci", "2440005", "Akuntansi", 3.20);

        // Input NIM mahasiswa
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String nimCari = input.nextLine();

        boolean ditemukan = false;

        // Mencari mahasiswa berdasarkan NIM
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