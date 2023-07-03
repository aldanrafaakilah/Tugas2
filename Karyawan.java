//JAKSA SETIA ALAM (227064516051)
//ALDAN RAFA AKILAH (227064516043)
package tugassebelumuas;

// Membuat superclass Karyawan
public class Karyawan {
    // Membuat variabel NIP dengan tipe data String
    String NIP;
    // Membuat variabel nama dengan tipe data String
    String nama;
    // Membuat variabel jenisKelamin dengan tipe data String
    String jenisKelamin;
    // Membuat variabel jumlahHari dengan tipe data integer
    int jumlahHari;
    // Membuat variabel totalGaji dengan tipe data integer
    int totalGaji;

    // Membuat method konstruktor karyawan dengan parameter: String NIP, String nama, String jenisKelamin
    void karyawan(String NIP, String nama, String jenisKelamin) {
        // Mengatur properti 'NIP' dari objek saat ini dengan nilai dari parameter 'NIP'.
        this.NIP = NIP;
        // Mengatur properti 'nama' dari objek saat ini dengan nilai dari parameter 'nama'.
        this.nama = nama;
        // Mengatur properti 'jenisKelamin' dari objek saat ini dengan nilai dari parameter 'jenisKelamin'.
        this.jenisKelamin = jenisKelamin;
    }

    // Membuat method absenKerja
    void absenKerja() {
        // Menambahkan satu ke variabel jumlahHari setiap kali fungsi dipanggil
        jumlahHari++;
    }

    // Membuat method hitungGaji
    void hitungGaji() {
        // Menghitung total gaji berdasarkan jumlahHari dikali 50000
        totalGaji = jumlahHari * 50000;
    }

    // Membuat method hitungGaji menggunakan overloading
    void hitungGaji(int jumlah_hari) {
        // Menghitung total gaji berdasarkan jumlah_hari dikali 50000
        totalGaji = jumlah_hari * 50000;
    }
}

    // Membuat subclass Dosen
    class Dosen extends Karyawan {
        // Membuat variabel golongan dengan tipe data String
        String golongan;
        // Membuat variabel jumlah_sks dengan tipe data integer
        int jumlah_sks;
        // Membuat variabel upah_per_sks dengan tipe data integer
        int upah_per_sks;

        @Override
        // Membuat method hitungGaji dengan menggunakan metode Override
        void hitungGaji() {
            // Membuat sintaks percabangan variabel golongan
            switch (golongan) {
                // Membuat percabangan a
                case "a":
                    // Mengatur upah_per_sks menjadi 200000 jika golongan adalah "a"
                    upah_per_sks = 200000;
                    break;
                // Membuat percabangan b
                case "b":
                    // Mengatur upah_per_sks menjadi 150000 jika golongan adalah "b"
                    upah_per_sks = 150000;
                    break;
                // Membuat percabangan c
                case "c":
                    // Mengatur upah_per_sks menjadi 100000 jika golongan adalah "c"
                    upah_per_sks = 100000;
                    break;
            }
            // Menghitung total gaji berdasarkan upah_per_sks, jumlah_sks, dan jumlahHari
            totalGaji = upah_per_sks * jumlah_sks * jumlahHari;
        }
    }

    // Membuat subclass Staff
    class Staff extends Karyawan {

    }

