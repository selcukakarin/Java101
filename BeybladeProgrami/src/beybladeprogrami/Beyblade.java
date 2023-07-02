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
public class Beyblade {
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }

    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }
    public void saldir(){
        System.out.println(beybladeci+" "+saldiriGucu+" saldırı gücü ile ve "+donusHizi+" dönüş hızı ile saldırıyor.");
    }
    public void kutsalCanavariOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor.");
    }
    public void bilgileriGoster(){
        System.out.println("Beybladeci :"+beybladeci);
        System.out.println("Saldırı gücü :"+saldiriGucu);
        System.out.println("Dönüş hızı :"+donusHizi);
    }
    
}
