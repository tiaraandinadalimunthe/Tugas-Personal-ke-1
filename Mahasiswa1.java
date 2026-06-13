public class Mahasiswa1 {

    // Atribut private
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa1(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // Method menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf("IPK: %.2f%n%n", ipk);
    }
}
