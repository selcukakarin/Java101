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
public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String kutsalCanavar, String gizliYetenek, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar adı : "+kutsalCanavar);
        System.out.println("Gizli yetenek : "+gizliYetenek);
    }

    @Override
    public void kutsalCanavariOrtayaCikar() {
        System.out.println(getBeybladeci()+" "+kutsalCanavar+"'ı ortaya çıkarıyor.");
        System.out.println(getBeybladeci()+"'ın gizli saldırısı : Hayalet Kasırgası");
    }
    
}
