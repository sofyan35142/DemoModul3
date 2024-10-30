package org.example;


import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ManajemenNilaiSebelum digunakan untuk mengelola data nilai siswa,
 * termasuk informasi nama, kelas, dan daftar nilai, serta menghitung rata-rata nilai.
 */
public class ManajemenNilai {
    /**
     * Nama siswa.
     */
    private String nm;

    /**
     * Kelas siswa.
     */
    private String kelas;

    /**
     * Daftar nilai siswa.
     */
    private List<Double> nilai;

    /**
     * Konstruktor untuk membuat objek ManajemenNilaiSebelum dengan nama, kelas, dan nilai.
     *
     * @param nama  nama siswa
     * @param kelas kelas siswa
     * @param nilai daftar nilai siswa
     */
    public ManajemenNilai(String nama, String kelas, List<Double> nilai) {
        this.nm = nama;
        this.kelas = kelas;
        this.nilai = nilai;
    }

    /**
     * Menampilkan informasi siswa, termasuk nama, kelas, dan daftar nilai.
     */
    public void cetakInformasiSiswa() {
        System.out.println("Nama: " + nm);
        System.out.println("Kelas: " + kelas);
        System.out.println("Nilai: " + nilai);
    }

    /**
     * Menghitung rata-rata nilai siswa berdasarkan daftar nilai yang ada.
     *
     * @return rata-rata nilai siswa
     */
    public double hitungRataRata() {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.size();
    }
}

/**
 * Kelas utama untuk menjalankan program ManajemenNilaiSebelum.
 */
class MainApp {
    /**
     * Metode utama yang mengeksekusi program.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        List<Double> nilaiSiswa = new ArrayList<>();
        nilaiSiswa.add(85.0);
        nilaiSiswa.add(90.0);
        nilaiSiswa.add(78.0);

        ManajemenNilai manajemenNilai = new ManajemenNilai("Ahmad", "10A", nilaiSiswa);

        manajemenNilai.cetakInformasiSiswa();

        double rataRata = manajemenNilai.hitungRataRata();
        System.out.println("Rata-rata Nilai: " + rataRata);
    }
}

