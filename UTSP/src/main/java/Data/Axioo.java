package Data;

/**
 *
 * @author affani
 */
public class Axioo extends Laptop{
    public Axioo(String nama, String processor, int core, String os, int ram, String storage, int stok){ 
            super(nama,"Axioo",processor,core,os,ram,storage,stok);        
    }
    
    public Axioo(){
        super();
        super.setBrandLp("Axioo");
    }
    
    public void AxiooSlogan(){
        System.out.println("");
        System.out.println("Axioo");
        System.out.println("Your Lifetime Parter");
        System.out.println("--------------------");
        
    }
    
    @Override
    public void getLaptopData(){
        AxiooSlogan();
        super.getLaptopData();
        System.out.println("");
    }
    
    @Override
    public void setRamLp(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Ukuran RAM harus lebih besar dari nol!");
            System.out.println("Ukuran RAM dikembalikan ke default");
            System.out.println("");
            super.setRamLp(4);
            } else {
            super.setRamLp(angka);
        }
    }
    
    @Override
    public void setCoreLp(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Core harus lebih besar dari nol!");
            System.out.println("Jumlah Core dikembalikan ke default");
            System.out.println("");
            super.setCoreLp(2);
            } else {
            super.setCoreLp(angka);
        }
    }
    
    @Override
    public void setStokLp(int angka){
        if(angka < 0){
            System.out.println("");
            System.out.println("Jumlah Stok Laptop harus lebih besar dari nol!");
            System.out.println("Jumlah Stok dikembalikan ke default");
            System.out.println("");
            super.setStokLp(0);
            } else {
            super.setStokLp(angka);
        }
    }
    
//    Posisi Pada Etalase Toko
    public String getPosisiTokoLaptop(){
        String storage = super.getStorageLp().toLowerCase().replaceAll("\\s+","");
        switch(storage) {
            case "ssdm.2" -> {
                return "Best";
            }
            case "ssdsata" -> {
                return "Good";
            }
            case "hdd" -> {
                return "Middle";
            }
            default -> {
                    return "Unknown";
            }
        }
    }
}
