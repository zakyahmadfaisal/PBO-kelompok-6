public abstract class Rak {
    protected int noRak;
    protected String Nama;
    protected String Penerbit;
    protected String TanggalTerbit;
    /* 
    private Buku buku;
    private Koran koran;
    private Majalah majalah;
    */
    public Rak() {
        System.out.println("Kosong");
    }

    public Rak(int noRak, String Nama, String Penerbit, String TanggalTerbit) {
        this.noRak = noRak;
        this.Nama = Nama;
        this.Penerbit = Penerbit;
        this.TanggalTerbit = TanggalTerbit;
    }
    public int getnoRak() {
        return noRak;
    }
    public String getNama() {
        return Nama;
    }
    public String getPenerbit() {
        return Penerbit;
    }
    public String getTanggalTerbit() {
        return TanggalTerbit;
    }
    public abstract void display();
}