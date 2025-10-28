import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor5 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner

        int jumlah = 1, berat = 0, kecil = 0, sedang = 0, besar = 0; // untuk mendeklarasikan tipe variabel dan menginisialisasi nilai variabel

        while (jumlah <= 10) { // untuk membuat kondisi looping sampai batas looping tercapai 
            System.out.print("Masukkan Berat Mangga ke " + jumlah + " = ");  // untuk mencetak tulisan beserta nilai variabel
            berat = input.nextInt(); // untuk memasukkan input user kedalam variabel bertipe int
            System.out.println();

            if (berat < 200) { // membuat kondisi yang harus dipenuhi 
                kecil++; // jika kondisi terpenuhi maka nilai variabel ditambah 1
            }
            if (berat >= 200 && berat < 600) {
                sedang++;
            }
            if (berat >= 600) {
                besar++;
            }
            jumlah++; // untuk membuat nilai variabel bertambah 1
        }

        System.out.println("Dari 10 Mangga yang Ditimbang Menghasilkan = "); // untuk mencetak tulisan dan nilai variabel
        System.out.println("Kecil\t= " + kecil + " Buah");
        System.out.println("Sedang\t= " + sedang + " Buah");
        System.out.println("Besar\t= " + besar + " Buah");

        input.close(); // untuk menutup objek scanner
    }
}
