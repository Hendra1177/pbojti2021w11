package Tugas;
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    protected String suara;
    protected String warnaBulu;
    
    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan : Daging dan Tumbuhan");
    }
    
    @Override
    public void displayBinatang(){
        super.displayBinatang();
    }
    
    public void displayData(){
        System.out.println("--Binatang Omnivora--");
        super.displayBinatang();
        System.out.println("Suara :"+this.suara);
        System.out.println("Warna Bulu :"+this.warnaBulu);
        System.out.println();
    }
}
