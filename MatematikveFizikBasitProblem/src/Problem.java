/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author microman
 */
public class Problem {
    
    public static class MatematikProblemleri{
    public static void daireAlan(int yaricap){
        System.out.println("Dairenin alanı: "+(Math.PI*yaricap*yaricap));
    }
    public static void ucgenCevresi(int kenar1,int kenar2,int kenar3){
        System.out.println("Üçgenin çevresi "+(kenar1+kenar2+kenar3));
    }
}
    public static class FizikProblemleri{
        
        public static void icCarpim(Vec vec1,Vec vec2){
            int icCarpim=vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" iç çarpımları = "+icCarpim);
        }
        
    }
    
}
