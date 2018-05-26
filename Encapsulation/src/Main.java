public class Main {
    public static void main(String[] args) {
        /*Abone abone=new Abone();
        abone.isim="Selçuk Akarın";
        abone.bakiye=200;
        abone.sehir="İstanbul";
        abone.dogalgazKullan(200);*/
        GelismisAbone abone=new GelismisAbone("Selçuk", 200, "İstanbul");
        abone.bakiyeOgren();
}
}
