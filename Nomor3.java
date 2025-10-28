import java.util.Scanner;// untuk memanggil objek scanner

public class Nomor3 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        int celcius = 0, reahmuhr = 0, fahrenheit = 32, maks = 0, selisih = 0; 
        // untuk mendeklarasikan tipe variabel dan menginisialisasi nilai variabel
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner

        System.out.print("Masukkan nilai suhu minimum = "); // untuk mencetak tulisan
        celcius = input.nextInt(); // untuk memasukkan input user kedalam variabel bertipe int
        System.out.print("Masukkan nilai suhu maksimum = ");
        maks = input.nextInt();
        System.out.print("Masukkan selisih kenaikan suhu = ");
        selisih = input.nextInt();
        System.out.println();

        System.out.println("Celcius"+"\t\t"+"Reahmuhr"+"\t"+"Fahrenheit");
        System.out.println("==========================================");
        System.out.println(celcius+"\t\t"+reahmuhr+"\t\t"+fahrenheit);
       

        while (celcius < maks) { // untuk membuat kondisi looping sampai batas looping tercapai 
            celcius = celcius + selisih; // untuk membuat nilai variabel dengan perintah penjumlahan 
            reahmuhr =(int)(celcius * 0.8); // (int) untuk mengubah tipe variabel menjadi int
            fahrenheit =(int) (celcius * 1.8 + 32);
            System.out.println(celcius+"\t\t"+reahmuhr+"\t\t"+fahrenheit); // \t untuk memberikan perintah tab
        }
        input.close(); // untuk menutup objek scanner
    }
}
