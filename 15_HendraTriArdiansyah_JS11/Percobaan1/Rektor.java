package Percobaan1;
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikasi cumlaude");
        System.out.println("Selamat!! silahkan pekernalkan diri anda.");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
       // mahasiswa.kuliahDiKampus();
        
        System.out.println("---------------------------------------------");
    }
    public void beriSertifikatMawapres(IBerprestasi mahasiswa){
        System.out.println("saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.menjuaraiPublikasiIlmiah();
        
        System.out.println("---------------------------------------------");
    }
}
