import java.util.Scanner;
import javax.swing.*;


public class mainFile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int option = 0;
        int i = 0;
        do{
            System.out.println("Apotek");
            System.out.println("===========");
            System.out.println("1. Transaksi");
            System.out.println("2. Ubah Stok");
            System.out.println("3. Cek Data Obat");
            System.out.println("4. Exit");
            System.out.println("Pilih Opsi : "); option = scan.nextInt();

            switch (option) {
                case 1:
                // Function Transaksi    
                    break;
                case 2:
                // Function Ubah Stok
                    break;
                case 3:
                // Function Cek data obat
                    break;
            }
        }while(i != 4);
        scan.close();
    }
}