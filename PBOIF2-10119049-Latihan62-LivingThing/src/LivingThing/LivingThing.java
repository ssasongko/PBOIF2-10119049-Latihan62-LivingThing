package LivingThing;

/**
 * Deskripsi Class :
 * sebuah abstract class dengan memiliki 2 method concrete dan 1 method abstract
 */

public abstract class LivingThing {
    
//    public void walk(String nama){
//        System.out.printf("%s sedang Berjalan\n",nama);
//    }
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.printf("%s Bernapas\n",nama);
    }
    
    public void eat(String nama){
        System.out.printf("%s Makan\n",nama);
    }
}
