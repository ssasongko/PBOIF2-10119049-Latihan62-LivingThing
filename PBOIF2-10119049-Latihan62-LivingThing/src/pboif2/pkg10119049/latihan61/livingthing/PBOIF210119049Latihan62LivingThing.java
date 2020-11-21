package pboif2.pkg10119049.latihan61.livingthing;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : 
 * Program untuk memanggil makhluk bernyawa.
 */

//Import Class
import LivingThing.Human;

public class PBOIF210119049Latihan62LivingThing {
    public static void main(String[] args) {
        
        // Human
        Human human = new Human();
        human.setNama("Nur Sasongko");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
