package Data;

/**
 *
 * @author affani
 */
public class Laptop {
    private String nama, brand, processor, os, storage;
    private int stok, core, ram;
    
    public Laptop(String nama, String brand, String processor, int core, String os, int ram, String storage, int stok){
        this.nama = nama; 
        this.brand = brand; 
        this.processor= processor; 
        this.core = core; 
        this.os = os; 
        this.ram = ram; 
        this.storage = storage; 
        this.stok = stok; 
        
    }
    
    
//    Overloading Constructor
    public Laptop(){
        this.nama = "Unknown"; 
        this.brand = "Unknown"; 
        this.processor= "Unknown"; 
        this.core = 0; 
        this.os = "Unknown"; 
        this.ram = 0; 
        this.storage = "Unknown"; 
        this.stok = 0; 
    }
    
    public String getNamaLp(){
        return nama;
    }
    
    public void setNamaLp(String text){
        nama = text;
    }
    
    public String getBrandLp(){
        return brand;
    }
    
    public void setBrandLp(String text){
        brand = text;
    }
    
    public String getProsesorLp(){
        return processor;
    }
    
    public void setProsesorLp(String text){
        processor = text;
    }
     
    public int getCoreLp(){
        return core;
    }
    
    public void setCoreLp(int angka){
        core = angka;
    }
    
    public String getOsLp(){
        return os;
    }
    
    public void setOsLp(String text){
        os = text;
    }
    
    public int getRamLp(){
        return ram;
    }
    
    public void setRamLp(int angka){
        ram = angka;
    }
    
    public String getStorageLp(){
        return storage;
    }
    
    public void setStorageLp(String text){
        storage = text;
    }
    
    public int getStokLp(){
        return stok;
    }
    
    public void setStokLp(int angka){
        stok = angka;
    }
    
    public void getLaptopData(){
        System.out.println("Nama \t\t\t: "+ nama);
        System.out.println("Brand \t\t\t: "+ brand);
        System.out.println("Prosesor \t\t: "+ processor);
        System.out.println("Jumlah Core \t\t: "+ core);
        System.out.println("Operating System \t: "+ os);
        System.out.println("Ukuran RAM(GB) \t\t: "+ ram);
        System.out.println("Jenis Storage \t\t: "+ storage);
        System.out.println("Stok \t\t\t: "+ stok);
    }
}
