package Application;
import java.util.Scanner;
import Data.*;

/**
 *
 * @author affani
 */
public class Application {
    public static void main(String[] args) {
        String nama, brand, processor, os, storage;
        int stok, core, ram;

        Scanner inputUser = new Scanner(System.in);
        
        Axioo mybook11 = new Axioo();
        mybook11.AxiooSlogan();
        System.out.print("Nama \t\t\t: "); nama = inputUser.nextLine();
        System.out.print("Brand \t\t\t: "); brand = inputUser.nextLine();
        System.out.print("Prosesor \t\t: "); brand = inputUser.nextLine();
        System.out.print("Jumlah Core \t\t: "); core = inputUser.nextInt();inputUser.nextLine();
        System.out.print("Operating System \t: "); os = inputUser.nextLine();
        System.out.print("Ukuran RAM(GB) \t\t: "); ram = inputUser.nextInt();inputUser.nextLine();
        System.out.print("Jenis Storage \t\t: "); storage = inputUser.nextLine();
        System.out.print("Stok \t\t\t: "); stok = inputUser.nextInt();
        System.out.println("");
        mybook11.setNamaLp(nama);
        mybook11.setProsesorLp(processor);
        mybook11.setCoreLp(core);
        mybook11.setOsLp(os);
        mybook11.setRamLp(ram);
        mybook11.setStorageLp(storage);
        mybook11.setStokLp(stok);
        mybook11.getLaptopData();
        System.out.println("Di Toko, Posisi " + mybook11.getNamaLp() + " adalah " + mybook11.getPosisiTokoLaptop());
        System.out.println("-------------------------------------");
                
        Dell vostro3400 = new Dell();
        vostro3400.DellSlogan();
        System.out.print("Nama \t\t\t: "); nama = inputUser.nextLine();
        System.out.print("Brand \t\t\t: "); brand = inputUser.nextLine();
        System.out.print("Prosesor \t\t: "); brand = inputUser.nextLine();
        System.out.print("Jumlah Core \t\t: "); core = inputUser.nextInt();inputUser.nextLine();
        System.out.print("Operating System \t: "); os = inputUser.nextLine();
        System.out.print("Ukuran RAM(GB) \t\t: "); ram = inputUser.nextInt();inputUser.nextLine();
        System.out.print("Jenis Storage \t\t: "); storage = inputUser.nextLine();
        System.out.print("Stok \t\t\t: "); stok = inputUser.nextInt();
        System.out.println("");
        vostro3400.setNamaLp(nama);
        vostro3400.setProsesorLp(processor);
        vostro3400.setCoreLp(core);
        vostro3400.setOsLp(os);
        vostro3400.setRamLp(ram);
        vostro3400.setStorageLp(storage);
        vostro3400.setStokLp(stok);
        vostro3400.getLaptopData();
        System.out.println("Di Toko, Posisi" + vostro3400.getNamaLp() + " adalah " + vostro3400.getPosisiTokoLaptop());
        System.out.println("-------------------------------------");       
        
    }
}
