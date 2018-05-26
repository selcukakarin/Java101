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
public class Drayga extends Beyblade {
    private String kutsalCanavar;

    public Drayga(String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar adı : "+kutsalCanavar);
    }

    @Override
    public void kutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+"'ı ortaya çıkarıyor.");
        System.out.println(getBeybladeci()+"'ın gizli saldırısı : Kaplan pençesi");
    }
    
    
}
