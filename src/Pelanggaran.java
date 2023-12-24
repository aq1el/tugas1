public class Pelanggaran {
    private String deskripsi;
    private Kategori kategori;
    private Sanksi sanksi;

    Pelanggaran(String deskripsi, Kategori kategori, Sanksi sanksi){
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.sanksi = sanksi;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public Kategori getKategori(){
        return this.kategori;
    }

    public void setKategori(Kategori kategori){
        this.kategori = kategori;
    }

    public Sanksi getSanksi(){
        return this.sanksi;
    }

    public void setSanski(Sanksi sanksi){
        this.sanksi = sanksi;
    }

    public String ToString(){
        return "Pelanggaran : " + this.deskripsi + " " + kategori.getJenis() + " " + sanksi.getKeterangan() + " " + sanksi.getPoin();
    }
}
