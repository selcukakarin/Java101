package beybladeprogrami;

import java.util.Scanner;

public class BeybladeProgrami {

    
    public static void main(String[] args) {
        System.out.println("Beyblade programına hoşgeldiniz.");
        System.out.println("Çıkış için q'ya basın");
        Scanner scan=new Scanner(System.in);
        while (true) {            
            System.out.println("Hangi beyblade'i üretmek istiyorsunuz?");
            String islem=scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor ...");
                break;
            }else{
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeUret(islem);
                if(beyblade==null){
                    System.out.println("Lütfen geçerli bir beyblade ismi girin...");
                }else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavariOrtayaCikar();
                }
            }
        }
    }
    
}
