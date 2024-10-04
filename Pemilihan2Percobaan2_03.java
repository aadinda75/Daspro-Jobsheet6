
import java.util.Scanner; 
public class Pemilihan2Percobaan2_03 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        int pilihan_menu, harga;
        String member;
        Double diskon, total_harga;

        System.out.println("---------------------------------------");
        System.out.println("============= MENU KAFE JTI ===========");
        System.out.println("1. Rice Bowl");
        System.out.println("2. ice Tea");
        System.out.println("3. paket bundling (Rice Bowl + Ice Tea)");
        System.out.println("---------------------------------------");

        System.out.println("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input03.nextInt(); 
    
        input03.nextLine();  // Membersihkan buffer input
        // Input apakah pengguna memiliki member
        System.out.print("Apakah Punya Member (y/n) ? = ");
        member = input03.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) { 
            diskon = 0.10;  // Diskon 10% untuk member
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1){
                harga= 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (pilihan_menu == 2){
                harga= 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (pilihan_menu == 3){
                harga= 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar" ); 
                input03.close();
                return;
            }
            total_harga = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_harga);

            
            
        //jika pembeli tidak memiliki member
        if (member.equalsIgnoreCase("n")) { 
             if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Rice Bowl = Rp " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = Rp " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = Rp " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar.");
                input03.close();
                return; // Menghentikan eksekusi program
            }
            System.out.println("Total bayar = " + harga);
        } else {
          


        }
        System.out.println("---------------------------------------------");

      }
      
      input03.close();
        
    }
}

