/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author microman
 */
public class Anakart {
    private String model;
    private String uretici;
    private int yuvaSayisi;
    private String isletimSistemi;

    public Anakart(String model, String uretici, int yuvaSayisi, String isletimSistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi = yuvaSayisi;
        this.isletimSistemi = isletimSistemi;
    }
    
    public void isletimSistemiYukler(String isletimSistemi){
        this.isletimSistemi=isletimSistemi;
        System.out.println("İşletim sistemi yüklendi. İşletim sistemi : "+isletimSistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }
    
    
    
    
}
