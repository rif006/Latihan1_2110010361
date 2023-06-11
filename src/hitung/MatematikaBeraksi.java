
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika arif = new Matematika(6,1);
        
        System.out.println("Hasil Penjumlahan = " + arif.setPenjumlahan());
        System.out.println("Hasil Pengurangan = " + arif.setPengurangan());
        System.out.println("Hasil Perkalian = " + arif.setPerkalian());
        System.out.println("Hasil Pembagian = " + arif.setPembagian());
    }
}
