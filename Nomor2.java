import java.util.Scanner; // untuk memanggil objek scanner

public class Nomor2 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        int data = 0, nilai = 0, angka = 1;  // untuk mendeklarasikan tipe variabel dan menginisialisasi nilai variabel
        double rataRata = 0;
        Scanner input = new Scanner(System.in); // untuk membuat variabel dari objek scanner

        System.out.print("Masukkan jumlah data = ");
        data = input.nextInt(); // untuk memasukkan input user kedalam variabel

        while (angka <= data ) { // untuk membuat kondisi looping sampai batas looping tercapai 
            System.out.print("Nilai mahasiswa ke - "+angka+ " = ");
            int nilaiBaru = input.nextInt();
            nilai += nilaiBaru; // untuk membuat nilai variabel 
            angka++; // untuk membuat nilai variabel ditambah 1 
        }
        rataRata = nilai / data; // untuk membuat nilai variabel dari hasil perhitungan
        System.out.println("Nilai rata-rata mahasiswa = "+rataRata);
        input.close(); // untuk menutup objek scanner
    }
}
