package tugassebelumuas;

public class Main {

    public static void main(String[] args) {
        // Membuat objek karyawan1 dan mengatur nilai atributnya
        Karyawan karyawan1 = new Karyawan();
        karyawan1.karyawan("123", "Anton", "Laki-laki");
        
        // Memanggil method absenKerja dari objek karyawan1
        karyawan1.absenKerja();
        
        // Memanggil method hitungGaji dari objek karyawan1
        karyawan1.hitungGaji();
        
        // Menampilkan informasi karyawan1
        System.out.println("NIP \t\t: " + karyawan1.NIP);
        System.out.println("Nama \t\t: " + karyawan1.nama);
        System.out.println("Jenis Kelamin \t: " + karyawan1.jenisKelamin);
        System.out.println("Total Gaji \t: " + karyawan1.totalGaji);
        System.out.println();
        
        // Membuat objek karyawan2 dan mengatur nilai atributnya
        Karyawan karyawan2 = new Karyawan();
        karyawan2.karyawan("456", "Bunga", "Perempuan");
        
        // Memanggil method hitungGaji dengan parameter 20 dari objek karyawan2
        karyawan2.hitungGaji(20);
        
        // Menampilkan informasi karyawan2
        System.out.println("NIP \t\t: " + karyawan2.NIP);
        System.out.println("Nama \t\t: " + karyawan2.nama);
        System.out.println("Jenis Kelamin \t: " + karyawan2.jenisKelamin);
        System.out.println("Total Gaji \t: " + karyawan2.totalGaji);
        System.out.println();
        
        // Membuat objek dosen1 dan mengatur nilai atributnya
        Dosen dosen1 = new Dosen();
        dosen1.karyawan("789", "Cahyo", "Laki-laki");
        dosen1.golongan = "a";
        dosen1.jumlah_sks = 5;
        dosen1.jumlahHari = 15;
        
        // Memanggil method hitungGaji dari objek dosen1
        dosen1.hitungGaji();
        
        // Menampilkan informasi dosen1
        System.out.println("NIP \t\t: " + dosen1.NIP);
        System.out.println("Nama \t\t: " + dosen1.nama);
        System.out.println("Jenis Kelamin \t: " + dosen1.jenisKelamin);
        System.out.println("Total Gaji \t: " + dosen1.totalGaji);
        System.out.println();
        
        // Membuat objek dosen2 dan mengatur nilai atributnya
        Dosen dosen2 = new Dosen();
        dosen2.karyawan("987", "Dudung", "Laki-laki");
        dosen2.golongan = "c";
        dosen2.jumlah_sks = 7;
        dosen2.jumlahHari = 20;
        
        // Memanggil method hitungGaji dari objek dosen2
        dosen2.hitungGaji();
        
        // Menampilkan informasi dosen2
        System.out.println("NIP \t\t: " + dosen2.NIP);
        System.out.println("Nama \t\t: " + dosen2.nama);
        System.out.println("Jenis Kelamin \t: " + dosen2.jenisKelamin);
        System.out.println("Total Gaji \t: " + dosen2.totalGaji);
        System.out.println();
        
        // Membuat objek staff1 dan mengatur nilai atributnya
        Staff staff1 = new Staff();
        staff1.karyawan("654", "Endang", "Perempuan");
        
        // Memanggil method absenKerja sebanyak tiga kali dari objek staff1
        staff1.absenKerja();
        staff1.absenKerja();
        staff1.absenKerja();
        
        // Memanggil method hitungGaji dari objek staff1
        staff1.hitungGaji();
        
        // Menampilkan informasi staff1
        System.out.println("NIP \t\t: " + staff1.NIP);
        System.out.println("Nama \t\t: " + staff1.nama);
        System.out.println("Jenis Kelamin \t: " + staff1.jenisKelamin);
        System.out.println("Total Gaji \t: " + staff1.totalGaji);
        System.out.println();
        
        // Membuat objek staff2 dan mengatur nilai atributnya
        Staff staff2 = new Staff();
        staff2.karyawan("321", "Freya", "Perempuan");
        
        // Memanggil method hitungGaji dengan parameter 25 dari objek staff2
        staff2.hitungGaji(25);
        
        // Menampilkan informasi staff2
        System.out.println("NIP \t\t: " + staff2.NIP);
        System.out.println("Nama \t\t: " + staff2.nama);
        System.out.println("Jenis Kelamin \t: " + staff2.jenisKelamin);
        System.out.println("Total Gaji \t: " + staff2.totalGaji);
        System.out.println();
    }
}
