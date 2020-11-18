package Tugas;
public class Keledai extends Binatang implements IHerbivora {
    protected String suara;
    protected String warnaBulu;
    
    public Keledai (String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.jmlKaki = jmlKaki;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan : Tumbuhan Hijau");
    }
    
     @Override
     public void displayBinatang(){
         super.displayBinatang();
     }
     
     public void displayData(){
         System.out.println("--Binatang Herbivora--");
         super.displayBinatang();
         System.out.println("Suara :"+this.suara);
         System.out.println("Warna Bulu :"+this.warnaBulu);
         System.out.println();
     }
}
