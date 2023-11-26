public class Main {
    public static void main(String[] args) {
      
        System.out.println("\nKENDARAAN : ");

        Mobil mobil = new Mobil("M1",120,5,4);
        System.out.println("\nInformasi Mobil " + mobil);
        System.out.println("\nWaktu Tempuh dengan Mobil : " + mobil.hitungWaktuTempuh(300) + " Jam");
        
        
        Bus bus = new Bus("B1",80,40,30);
        System.out.println("\nInformasi Bus : " + bus);
        System.out.println("\nWaktu Tempuh dengan Bus : " + bus.hitungWaktuTempuh(300) + " Jam");
       
    }
}
