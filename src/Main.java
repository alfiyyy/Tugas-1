import java.util.Scanner;
import bidangdatar.PersegiPanjang;
import bidangdatar.Lingkaran;
import bangunruang.Balok;
import bangunruang.Tabung;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        while(loop){
            System.out.print("\033[H\033[2J");
            System.out.println("===========");
            System.out.println("Menu Utama");
            System.out.println("===========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih: ");

            
            int pil = scanner.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Input Panjang\t: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Input Lebar\t: ");
                    int lebar = scanner.nextInt();
                    System.out.print("Input Tinggi\t: ");
                    int tinggi = scanner.nextInt();
                    
                //persegi panjang
                    PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas Persegi Panjang\t\t= "+ pp.luas(panjang,lebar));
                    System.out.println("Keliling Persegi Panjang\t= "+ pp.keliling(panjang,lebar));

                //balok
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    //Volume
                    System.out.println("Volume Balok\t\t\t= "+balok.volume());
                    //LuasPermukaan
                    System.out.println("Luas Permukaan Balok\t\t= "+balok.luasPermukaan());

                    System.out.print("Ulangi? (Ya:1 || Tidak: 0) ");
                    int ulang = scanner.nextInt();

                    if (ulang != 1) 
                        loop = false;
                    break;
            
                case 2:
                    System.out.print("Input Tinggi\t: ");
                    tinggi = scanner.nextInt();
                    System.out.print("Input Jari-jari\t: ");
                     int radius = scanner.nextInt();
                    
                //lingkaran
                Lingkaran lingkaran = new Lingkaran(radius);

                    System.out.println("Luas Lingkaran\t\t= "+ lingkaran.luas());
                    System.out.println("Keliling Lingkaran\t= "+ lingkaran.keliling());

                //Tabung
                Tabung tabung = new Tabung(radius, tinggi);
                    //Volume
                    System.out.println("Volume Tabung\t\t= "+tabung.volume(radius));
                    //LuasPermukaan
                    System.out.println("Luas Permukaan Balok\t= "+tabung.luasPermukaan(radius));

                    System.out.print("Ulangi? (Ya:1 || Tidak: 0) ");
                     ulang = scanner.nextInt();

                    if (ulang != 1) 
                        loop = false;

                    break;

                case 0:
                loop = false;
                break;
                
                default:
                System.out.println("Input anda salah...");
                Thread.sleep(700);
                break;
            }
            
        }
        
        System.out.println("\nExited...");
        scanner.close();
    }
}
