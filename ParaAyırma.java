/*
 * kutay yüzbaşıoğlu
 * para miktarını ayırma 
 * 
 */
public class ParaAyırma {
    public static void main(String[] args){
    double para = 127.85;
    double toplamkurus = para * 100;
    int lira = (int) toplamkurus / 100;
    int kurus = (int) toplamkurus % 100;//para ekledim ve ayırdım kuruş ve tl leri

    System.out.println("girilen miktar: " + para + "TL");
    System.out.println("--------------------------------");
    System.out.println("lira kısmı: " + lira + " TL");
    System.out.println("kuruş kısmı: " + kurus + " Kuruş");//burdada onları güzel gözükcek bir şekilde yazdırdım
    }

}
