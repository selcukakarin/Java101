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

public class PolyMorphism {

    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Hayvan hayvan1=new Kedi("Tekir");
        Hayvan hayvan2=new Kopek("Karabaş");
        Hayvan hayvan3=new At("Şahbatur");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());*/
        
        konustur(new Kedi("tekir"));
        konustur(new Kopek("karabaş"));
        konustur(new At("şahbatur"));
    }
    
}
