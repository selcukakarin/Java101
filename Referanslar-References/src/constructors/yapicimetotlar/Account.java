/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors.yapicimetotlar;

/**
 *
 * @author microman
 */
public class Account {
    private String isim;
    private int bakiye;
    private String email;
    private String hesapNo;
    private String musteriNo;
    
    public Account(){
        //System.out.println("Bu bir default contructor'dır.");
        /*this.hesapNo="Bilgi yok";
        this.bakiye=0;
        this.email="Bilgi yok";
        this.hesapNo="Bilgi yok";
        this.musteriNo="Bilgi yok";*/
        
        this("Bilgi yok",0,"Bilgi yok","Bilgi yok","Bilgi yok");
        
    }
    public Account(String isim,String email,String musteriNo){
        /*this.isim=isim;
        this.email=email;
        this.musteriNo=musteriNo;
        this.bakiye=0;
        this.hesapNo="Bilgi Yok";*/
        this("Bilgi yok",0,isim,email,musteriNo);
    }
    
    public Account(String isim,int bakiye,String email,String hesapNo,String musteriNo){
        this.isim=isim;
        this.bakiye=bakiye;
        this.email=email;
        this.hesapNo=hesapNo;
        this.musteriNo=musteriNo;
    }
    public void bilgileriGoster(){
        System.out.println("Hesap no : "+this.hesapNo);
        System.out.println("bakiye : "+this.bakiye);
        System.out.println("isim : "+this.isim);
        System.out.println("email : "+this.email);
        System.out.println("musteriNo no : "+this.musteriNo);
    }
    
    public void paraYatir(int miktar){
        if(!(miktar<0)){
            this.bakiye+=miktar;
        }else{
            System.out.println("Yatıracağınız para miktarı negatif değer olamaz.");
        }
    }
    public void paraCek(int miktar){
        if(miktar>1500){
            System.out.println("Günlük para çekme limiti 1500tl'dir.");
        }
        if(miktar>bakiye){
            System.out.println("Çekilecek tutar bakiyeden büyük olamaz. Bakiye :"+bakiye);
        }
        else
        {
            bakiye-=miktar;
            System.out.println("Yeni bakiye : "+bakiye);
        }
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

    /**
     * @return the bakiye
     */
    public int getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the musteriNo
     */
    public String getMusteriNo() {
        return musteriNo;
    }

    /**
     * @param musteriNo the musteriNo to set
     */
    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }
}
