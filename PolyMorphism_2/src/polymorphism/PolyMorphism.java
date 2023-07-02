/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author microman
 */
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor.";
    }
}
class Kedi extends Hayvan{

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" miyavlıyor"; 
    }
}
class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" havlıyor.";
    }    
}
class At extends Hayvan{

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" kişniyor.";
    }
    
}
class Kus extends Hayvan{

    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim()+" ötüyor.";
    }
    
}

public class PolyMorphism {

    public static void konustur(Object object){
        if(object instanceof Kopek){
            Kopek kopek=(Kopek)object;
            System.out.println(kopek.konus());
        }else if(object instanceof Kedi){
            Kedi kedi=(Kedi)object;
            System.out.println(kedi.konus());
        }else if(object instanceof At){
            At at=(At)object;
            System.out.println(at.konus());
        }else if(object instanceof Hayvan){
            Hayvan hayvan=(Hayvan)object;
            System.out.println(hayvan.konus());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // instanceof
        Kopek kopek=new Kopek("Karabaş");
        Kedi kedi=new Kedi("Tekir");
        At at=new At("Şahbatur");
        Hayvan hayvan=new Hayvan("Limon");
        Kus kus=new Kus("Zeytin");
        
        konustur(kopek);
        konustur(kedi);
        konustur(at);
        konustur(hayvan);
        konustur(kus);
        
        /*if(kopek instanceof Kopek){
            System.out.println("Bu nesne köpek sınıfındandır.");
        }
        if(kopek instanceof Hayvan){
            System.out.println("Bu nesne hayvan sınıfındandır.");
        }*/
    }
    
}
