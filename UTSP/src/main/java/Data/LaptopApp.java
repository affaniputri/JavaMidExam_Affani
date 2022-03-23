package Data;
import java.util.Scanner;
/**
 *
 * @author affani
 */
public class LaptopApp {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);  
        String nama, brand, processor, os, storage;
        int stok,core, ram;
        
        System.out.print("Nama \t\t\t: "); nama = inputUser.nextLine();
        System.out.print("Brand \t\t\t: "); brand = inputUser.nextLine();
        System.out.print("Prosesor \t\t: "); brand = inputUser.nextLine();
        System.out.print("Jumlah Core \t\t: "); core = inputUser.nextInt();inputUser.nextLine();
        System.out.print("Operating System \t: "); os = inputUser.nextLine();
        System.out.print("Ukuran RAM(GB) \t\t: "); ram = inputUser.nextInt();inputUser.nextLine();
        System.out.print("Jenis Storage \t\t: "); storage = inputUser.nextLine();
        System.out.print("Stok \t\t\t: "); stok = inputUser.nextInt();
        inputUser.close();
        
        System.out.println("----------------------------------");
        
        Laptop laptopUser = new Laptop(nama,brand,processor,core,os,ram,storage,stok);
        laptopUser.getLaptopData();
    }
}
