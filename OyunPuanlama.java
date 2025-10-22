/*
 * kutay yüzbaşıoğlu
 * 
 */
public class OyunPuanlama {
    public static void main(String[] args){
    int puan  = 0;
    System.out.println("başlangıç oyun skoru " + puan);//başlangış puanı verdim ve onu yazdırdım
    puan += 10;
    System.out.println( "güncellenmiş oyun skoru" + puan);//burda başlagış puanına 10 puan ekledim ve printledim
    puan -=5;
    System.out.println( "güncellenmiş oyun skoru" + puan);//burda 5 çıkardım ve öyle printledim
    puan /= 5;
    System.out.println( "güncellenmiş oyun skoru" + puan);//burda 5 e böldüm ve öyle printledim
    puan *= 5;
    System.out.println( "güncellenmiş oyun skoru" + puan);//burdada 5 le çarpıp printledim
    puan %= 2;
    System.out.println( "güncellenmiş oyun skoru" + puan);//burda yüzde 2 sini aldım ve printledim

    puan++;
    System.out.println( "güncellenmiş oyun skoru" + puan);//burda kısa yolla artı bir verdim ve printledim
    puan++;
    System.out.println( "güncellenmiş oyun skoru" + puan);
    puan++;
    System.out.println( "güncellenmiş oyun skoru" + puan);
    puan--;
    System.out.println( "güncellenmiş oyun skoru" + puan);//burda kısa yolla eksi bir verdim ve printledim
    
    }
}
