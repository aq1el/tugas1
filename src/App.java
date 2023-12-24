public class App {
    public static void main(String[] args) throws Exception {
        Kategori kategori1 = new Kategori("Kategori 1");
        Kategori kategori2 = new Kategori("Kategori 2");

        Sanksi sanksi1 = new Sanksi("Sanksi 1", 1);
        Sanksi sanksi2 = new Sanksi("Sanksi 2", 2);

        Pelanggaran pelanggaran1 = new Pelanggaran("Deskripsi 1", kategori1, sanksi1);
        Pelanggaran pelanggaran2 = new Pelanggaran("Deskripsi 2", kategori2, sanksi2);

        System.out.println(kategori1.getJenis());
        System.out.println(kategori1.ToString());
        System.out.println(kategori2.getJenis());
        System.out.println(kategori2.ToString());
        System.out.println();

        System.out.println(sanksi1.getKeterangan());
        System.out.println(sanksi1.getPoin());
        System.out.println(sanksi1.ToString());
        System.out.println(sanksi2.getKeterangan());
        System.out.println(sanksi2.getPoin());
        System.out.println(sanksi2.ToString());
        System.out.println();

        System.out.println(pelanggaran1.getDeskripsi());
        System.out.println(pelanggaran1.getKategori());
        System.out.println(pelanggaran1.getSanksi());
        System.out.println(pelanggaran1.ToString());
        System.out.println(pelanggaran2.getDeskripsi());
        System.out.println(pelanggaran2.getKategori());
        System.out.println(pelanggaran2.getSanksi());
        System.out.println(pelanggaran2.ToString());
        System.out.println();
    }
}
