
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author microman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik ve fizik problemleri programına hoşgeldiniz.");
        String islemler="İşlemler...\n"
                + "1. Daire Alanını Hesaplama\n"
                + "2. Üçgen çevresini hesaplama\n"
                + "3. 2 vektörün iç çarpımlarını hesaplama"
                + "q. Çıkış";
        while (true) {            
            System.out.println(islemler);
            System.out.println("İşlemi seçiniz : ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;
            }else if(islem.equals("1")){
                System.out.println("Dairenin yarıçapı : ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                Problem.MatematikProblemleri.daireAlan(yaricap);
                
            }else if(islem.equals("2")){
                System.out.print("Kenar 1 : ");
                int kenar1=scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int kenar2=scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                System.out.println("");
                Problem.MatematikProblemleri.ucgenCevresi(kenar1, kenar2, kenar3);
                
            }else if(islem.equals("3")){
                Vec vec1=new Vec("Vektör1");
                Vec vec2=new Vec("Vektör2");
                Problem.FizikProblemleri.icCarpim(vec1, vec2);
                
            }else{
                System.out.println("Geçersiz işlem");
            }
            
        }
    }
    
}
