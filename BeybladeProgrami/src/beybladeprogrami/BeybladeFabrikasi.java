/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beybladeprogrami;

/**
 *
 * @author microman
 */
public class BeybladeFabrikasi {
    public Beyblade beybladeUret(String beybladeTuru){
        if(beybladeTuru.equals("Dragon")){
            return new Dragon("Mavi Ejderha", "Kutsal canavarla konuşma", "Takao", 800, 400);
        }else if(beybladeTuru.equals("Dranza")){
            return new Dranza("Kırmızı Anka Kuşu", "Kai", 600, 300);
        }else if(beybladeTuru.equals("Drayga")){
            return new Dranza("Beyaz Kaplan", "Rei", 800, 200);
        }else if(beybladeTuru.equals("Draciel")){
            return new Dranza("Kara Kaplumbağa", "Max", 600, 100);
        }else{
            return null;
        }
    }
}
