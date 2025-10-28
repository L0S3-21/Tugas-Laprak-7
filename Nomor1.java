public class Nomor1 { // untuk membuat class
    public static void main(String[] args) { // untuk memulai program
        int hargaPerLiter = 6500, liter = 1; // untuk mendeklarasikan tipe dan menginisialisasi nilai variabel

        System.out.println("Jumlah liter\t" + "Harga (Rp)"); // \t untuk memberikan perintah tab
        System.out.println("==============================");
        
        while (liter <= 20){ // untuk membuat kondisi looping sampai batas looping tercapai 
            int hargaTotal = liter * hargaPerLiter; // untuk membuat nilai variabel dari perintah penjumlahan
            System.out.println(liter + "\t\t" + hargaTotal);
            liter++; // untuk membuat nilai variabel liter ditambah 1 
        } 
        System.out.println("==============================");
    }
}


