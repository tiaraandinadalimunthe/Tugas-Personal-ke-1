class Mahasiswa1 {
    String nama;
    String nim;
    String jurusan;
    double ipk;

    // Constructor
    Mahasiswa1(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method menampilkan informasi
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f%n%n", ipk);
    }
}

public class Soal1 {
    public static void main(String[] args) {

        Mahasiswa1 mhs1 = new Mahasiswa1("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        Mahasiswa1 mhs2 = new Mahasiswa1("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        Mahasiswa1 mhs3 = new Mahasiswa1("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        Mahasiswa1 mhs4 = new Mahasiswa1("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        Mahasiswa1 mhs5 = new Mahasiswa1("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("=== Data Mahasiswa ===");

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();
        mhs4.tampilkanInfo();
        mhs5.tampilkanInfo();
    }
}