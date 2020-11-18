package Tugas;
public class Singa extends Binatang implements IKarnivora {
    protected String suara;
    protected String warnaBulu;
    
    public Singa (String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan = Daging");
    }
    @Override
    public void displayBinatang(){
        super.displayBinatang();
    }
    
    public void displayData(){
        System.out.println("--Binatang Karnivora--");
        super.displayBinatang();
        System.out.println("Suara :"+this.suara);
        System.out.println("Warna Bulu :"+this.warnaBulu);
        System.out.println();
    }
}
