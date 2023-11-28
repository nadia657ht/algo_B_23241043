public class App {
    public static void main(String[] args) throws Exception {
        // Program Biodata Mahasiswa
        //deklarasi variable
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

        //mengisi variable
        nama = "Sylvana";
        nim = "23241075";
        tgl_lahir = "27 April 2005";
        alamat = "Jalan Ubur-Ubur Raya No.3 Ampenan";
        berat_badan = 44f;
        tinggi_badan = 147f;

        //cetak Biodata
        System.out.println("-----------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Tanggal Lahir: " + tgl_lahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Berat Badan: " + berat_badan);
        System.out.println("Tinggi Badan: " + tinggi_badan);
        System.out.println("------------------------------------");
    }
}
