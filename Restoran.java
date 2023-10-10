import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        boolean status = true;
        int harga, total = 0;
        
        do {
            
            System.out.println("Silahkan memesan menu yang anda inginkan: \n 1. Chicken steak: 15000 \n 2. Salad buah: 10000 \n 3. Kentang goreng: 10000 \n 4. Telur dadar: 10000 \n 5. Roti jamur: 13000 \n 6. Lalapan udang: 15000 \n 7. Burger: 10000 \n 8. Tahu renyah: 5000 \n 9. Spagethi: 15000 \n 10. Nasi goreng: 15000 \n 11. Pizza: 30000 \n 12. Ayam saus madu: 20000 \n 13. Es Mojito: 10000 \n 14. Es Teh: 5000 \n 15. Lemon tea: 10000 \n 16. Es Buah: 10000");
            System.out.println("Silahkan Mau Pesan Apa?");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                harga = 15000;
                total += harga;
                break;

                case 2:
                harga = 10000;
                total += harga;
                break;

                case 3:
                harga = 10000;
                total += harga;
                break;

                case 4:
                harga = 10000;
                total += harga;
                break;

                case 5:
                harga = 13000;
                total += harga;
                break;

                case 6:
                harga = 15000;
                total += harga;
                break;

                case 7:
                harga = 10000;
                total += harga;
                break;

                case 9:
                harga = 5000;
                total += harga;
                break;

                case 10:
                harga = 15000;
                total += harga;
                break;

                case 11:
                harga = 30000;
                total += harga;
                break;

                case 12:
                harga = 20000;
                total += harga;
                break;

                case 13:
                harga = 10000;
                total += harga;
                break;

                case 14: 
                harga =  5000;
                total += harga;
                break;

                case 15:
                harga = 10000;
                total += harga;
                break;

                case 16:
                harga = 10000;
                total += harga;
                break;

                default: 
                harga = 0;
                break;
            }
            System.out.println("");
            System.out.print("Apakah anda ingin membeli lagi? (ya/tidak)");
            String lagi = input.next();
            if (lagi.equalsIgnoreCase ("Tidak")) {
                status = false;

            } else {
                status =  true;
            }
        } while (status);
                
            
            System.out.println("Total: " + total );
            
            System.out.println("");
            System.out.print("Silahkan Melakukan Pembayaran: ");
            int bayar = input.nextInt ();
            int kembali = bayar-total;
            
            if (bayar == total) {
                System.out.println("Uang anda pas");
            } else if (bayar > total) {
                System.out.print("Jumlah Kembalian: " + kembali);
                
            } else {
                System.out.println("Maaf uang anda kurang");
                
            }

            System.out.println("Terimakasih");
            





    }
}
