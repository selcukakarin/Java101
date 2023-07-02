/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdisicikisprogrami;

/**
 *
 * @author microman
 */
public class YurtdisiCikisProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
         System.out.println("Sabiha Gökçen Havalimanına hoşgeldiniz...");
         String  sartlar="Yurtdışı Çıkış Kuralları...\n"
                 + "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                 + "15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                 + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
         String mesaj="Yurtdışı şartlarından hepsini sağlamanız gerekiyor";
         
         while (true) {            
             System.out.println("**********************************************");
             System.out.println(sartlar);
             System.out.println("**********************************************");
             
             
             Yolcu yolcu=new Yolcu();
             System.out.println("Harç bedeli kontrol ediliyor.");
             Thread.sleep(3000);
             if(yolcu.yurtdisiHarciKontrol()==false){
                 System.out.println(mesaj);
                 continue;
             }
             System.out.println("Siyasi yasak kontrol ediliyor.");
             Thread.sleep(3000);
             if(yolcu.siyasiYasakKontrol()==false){
                 System.out.println(mesaj);
                 continue;
             }
             System.out.println("Vize durumu kontrol ediliyor.");
             Thread.sleep(3000);
             if(yolcu.vizeDurumuKontrol()==false){
                 System.out.println(mesaj);
                 continue;
             }
             System.out.println("İşlemleriniz tamam! Yurtdışına çıkabilirsiniz...");
             break;
             
             
             
        }
         
    }
    
}
