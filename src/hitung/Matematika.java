
package hitung;

public class Matematika {
   //Membuat Variabel   
    private double bil1,bil2;
    
   //Membuat Construktor
    public Matematika(double bil1,double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //Membuat Method setPenjumlahan
    double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    //Membuat Method setPengurangan
    double setPengurangan(){
        return bil1 - bil2;
    }
    
    //Membuat Method setPerkalian
    double setPerkalian(){
        return bil1 * bil2;
    }
    
    //Membuat Method setPembagian
    double setPembagian(){
        return bil1 / bil2;
    }
}
