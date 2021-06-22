import java.sql.Date;

public class KaryawanTetap {
    private int id;
    private String noKk;
    private String namaLengkap;
    private String jenisKelamin;
    private Date tanggalLahir;
    private String riwayatPendidikan;
    private String jabatanSekarang;
    private Date tanggalKontrak;


    public KaryawanTetap() {
    }

    public KaryawanTetap(int id, String noKk, String namaLengkap, String jenisKelamin, Date tanggalLahir, String riwayatPendidikan, String jabatanSekarang, Date tanggalKontrak) {
        this.id = id;
        this.noKk = noKk;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
        this.tanggalLahir = tanggalLahir;
        this.riwayatPendidikan = riwayatPendidikan;
        this.jabatanSekarang = jabatanSekarang;
        this.tanggalKontrak = tanggalKontrak;
    }

    public KaryawanTetap(String noKk, String namaLengkap, String jenisKelamin) {
        this.noKk = noKk;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
    }



    public void bekerja(){
        System.out.println("Karyawan Bekerja");
    }

    public void menampilkanData(){
        System.out.println("Menampilkan Data KaryawanTetap");
    }

    public void melakukanPeninjauan() {
        System.out.println("meninjau proyek yang sedang dibangun");
    }

    public void mengajukanPerpanjanganKontrak() {
        System.out.println("memperpamjang kontra semua karyawanTetap");
    }
}
