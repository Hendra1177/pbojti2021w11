package Percobaan1;
import Percobaan1.IBerprestasi;
import Percobaan1.ICumlaude;
import Percobaan1.Mahasiswa;
import Percobaan1.PascaSarjana;
import Percobaan1.Rektor;
import Percobaan1.Sarjana;
//public class interfaceMain {
    //public static void main(String[] args) {
       // Rektor pakrektor = new Rektor();
        
        //Mahasiswa mhsBiasa = new Mahasiswa("Hendra");
        //Sarjana sarjanaCumlaude = new Sarjana("Sekar");
        //PascaSarjana masterCumlaude = new PascaSarjana("Leo");
        
        //pakrektor.beriSertifikatCumlaude(mhsBiasa);
        //pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakrektor.beriSertifikatCumlaude(masterCumlaude);
        
    //}
//}
public class MultipleInterfaceMul{
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");
        
        pakrektor.beriSertifikatMawapres(sarjanaCum);
        pakrektor.beriSertifikatMawapres(masterCum);
    }
}
