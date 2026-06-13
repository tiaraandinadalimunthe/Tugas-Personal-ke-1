public class Soal1 {

    public static void main(String[] args) {

        // Menyimpan objek mahasiswa ke dalam array
        Mahasiswa1[] daftar = new Mahasiswa1[5];

        daftar[0] = new Mahasiswa1("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa1("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa1("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa1("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa1("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("=== Data Mahasiswa ===");

        // Menampilkan seluruh data menggunakan loop
        for (Mahasiswa1 m : daftar) {
            m.tampilkanInfo();
        }
    }
}