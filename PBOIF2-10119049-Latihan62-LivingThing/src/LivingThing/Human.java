package LivingThing;

/**
 * Deskripsi Class
 * Merupakan subclass dari living thing
 * dan siap diinstansiasikan di tester
 */


public class Human extends LivingThing {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void walk(String nama){
        System.out.printf("%s sedang Berjalan\n",nama);
    }    
}
