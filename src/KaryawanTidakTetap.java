public class KaryawanTidakTetap extends KaryawanTetap {
    private String noKk;
    private String posisiJabatan;
    private String lamaBekerja;

    public void melamar(){
        System.out.println("Mengajukan lamaran menjadi KaryawanTetap");
    }

    public void menampilkanDataPosisi(){
        System.out.println("Menampilkan Data Posisi Jabatan PegawaiTidakTetap");
    }

    public String getPosisiJabatan() {
        return posisiJabatan;
    }

    public void setPosisiJabatan(String posisiJabatan) {
        this.posisiJabatan = posisiJabatan;
    }

    public String getLamaBekerja() {
        return lamaBekerja;
    }

    public void setLamaBekerja(String lamaBekerja) {
        this.lamaBekerja = lamaBekerja;
    }

}
