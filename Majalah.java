public class Majalah extends Rak{
    private String JenisTerbit;
    private int noEdisi;

    public Majalah(int noRak, String Nama, String Penerbit, String TanggalTerbit, String JenisTerbit, 
    int noEdisi) {
        super(noRak, Nama, Penerbit, TanggalTerbit);
        this.JenisTerbit = JenisTerbit;
        this.noEdisi = noEdisi;
    }

    public String getJenisTerbit() {
        return JenisTerbit;
    }

    public int getnoEdisi() {
        return noEdisi;
    }

    public void display() {
        System.out.println(getnoRak()+". Nama\t\t  : "+getNama());
        System.out.println("   No. Edisi      : "+getnoEdisi());
        System.out.println("   Penerbit       : "+getPenerbit());
        System.out.println("   Tanggal Terbit : "+getTanggalTerbit());
        System.out.println("   Jenis Terbit   : "+getJenisTerbit());
        System.out.println("-------------------------------------------------------");
    }
}
