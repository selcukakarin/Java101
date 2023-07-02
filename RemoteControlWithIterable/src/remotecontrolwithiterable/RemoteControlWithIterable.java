/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotecontrolwithiterable;

import java.util.Scanner;

/**
 *
 * @author Selcuk
 */
public class RemoteControlWithIterable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Kumda programına hoşgeldiniz");
        Scanner scanner=new Scanner(System.in);
        
        String islemler="İşlemler...\n"
                        +"1. Kanalları göster\n"
                        +"2. Kanal ekle\n"
                        +"3. Kanal sil\n"
                        +"4. Kanal sayısını öğren\n"
                        +"Çıkış için q'ya basın....";
                        
        System.out.println(islemler);
        Kumanda kumanda=new Kumanda();
        while(true){
            System.out.println("İşlemi giriniz : ");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }else if(islem.equals("1")){
                kanallarıGoster(kumanda);
            }else if(islem.equals("2")){
                System.out.println("Eklenecek kanal :");
                String kanalIsmi=scanner.nextLine();
                kumanda.kanalEkle(kanalIsmi);
            }else if(islem.equals("3")){
                System.out.println("Silinecek kanal :");
                String kanalIsmi=scanner.nextLine();
                kumanda.kanalSil(kanalIsmi);
            }else if(islem.equals("4")){
                System.out.println("Kanal sayısı : "+ kumanda.kanalSayisi());
            }else{
                System.out.println("Geçersiz işlem");
            }
        }
    }
    public static void kanallarıGoster(Kumanda kumanda){
        
        if(kumanda.kanalSayisi()==0){
            System.out.println("Şu anda hiçbir kanal bulunmuyor");
        }else{
            for(String kanal:kumanda){
                System.out.println("Kanal: "+kanal);
            }
        }
        
    }
}
