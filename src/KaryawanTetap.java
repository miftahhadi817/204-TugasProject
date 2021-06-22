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
