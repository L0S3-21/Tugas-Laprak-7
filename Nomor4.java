import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor4 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner

        int celcius = 0, jumlah = 1; // untuk mendeklarasikan tipe variabel dan menginisialisasi nilai variabel

        while (jumlah <= 10) { // untuk membuat kondisi looping sampai batas looping tercapai 
            System.out.print("Masukkan suhu Celcius ke "+jumlah+" = "); // untuk mencetak tulisan beserta nilai variabel
            celcius = input.nextInt(); // untuk memasukkan input user kedalam variabel bertipe int
            int reahmuhr = (int)(celcius * 0.8); // untuk membuat perintah hitung yang menentukan nilai sebuah variabel
            // (int) untuk merubah nilai hasil hitung bernilai desimal ke tipe integer
            int fahrenheit = (int)(celcius * 1.8 + 32);
            System.out.println("Hasil Konversi ke Reahmuhr = "+reahmuhr); // untuk mencetak tulisan dengan nilai variabel
            System.out.println("Hasil Konversi ke Fahrenheit = "+fahrenheit);
            System.out.println();
            jumlah++; // untuk membuat nilai variabel bertambah 1
        }
        input.close(); // untuk menutup objek scanner
    }
}
