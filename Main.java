import java.util.*;
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static char pinjam;
    static int pilih;
    static String nama;
    
    public static void displayMenu() {
        System.out.println("Daftar Rak");
        System.out.println("1.Buku \n2.Majalah\n3.Koran\n4.Keluar");
        System.out.print("Pilih rak yang ingin ditampilkan : ");
        pilih = scanner.nextInt();
        switch (pilih) {
            case 1: {
                 Buku buku1 = new Buku(1,"Hewan Mamalia","Airlangga","18/11/2005","Dr.Edward",2020);
                 buku1.display(); 
                 break;
            }
            case 2: {
                Majalah m1 = new Majalah(1, "Bobo", "Gramedia", "2002", "Bulanan", 20);
                m1.display();
                break;
            }
            case 3: {
                Koran k1 = new Koran(1, "Berita Bola Hari Ini", "Kompas", "2021", "Harian");
                k1.display();
                break;
            }
            case 4: {
                //System.out.println("Nama Peminjam : "+nama);
                //daftarpinjaman();
                System.out.println("Terima Kasih Atas Kunjungannya!");
                System.exit(0);
            }
        }
        System.out.print("Apakah Anda ingin meminjam? [Y/N]");
        pinjam = scanner.next().charAt(0);
        switch (pinjam) {
            case 'Y':
                System.out.println("Buku telah dipinjam\n");
                displayMenu();
                break;
            case 'N':
                displayMenu();
        }
    }

    public static void displayName() {
        System.out.print("Masukkan Nama Peminjam: ");
        nama = scanner.next();
    }

    public static void main(String[] args) {             
        displayName();
        displayMenu();
    }
}
//aaaaa
