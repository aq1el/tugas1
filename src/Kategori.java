public class Kategori {
    private String jenis;
    
    Kategori(String jenis){
        this.jenis = jenis;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public String ToString(){
        return "Kategori : " + this.jenis;
    }
}
