
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selcuk
 */
public class Baglanti {
    
    private String kullaniciAdi="root";
    
    private String parola="";
    
    private String dbIsmi="demo";
    
    private String host="localhost";
    
    private int port=3306;
    
    private Connection con=null;
    
    private Statement statement=null;
    
    private PreparedStatement  preparedStatement=null;
    
    public void preparedCalisanlariGetir(int id){
       
        String sorgu="Select * from calisanlar where id>? and ad like ?";
        
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "E%");
            
            ResultSet rs=preparedStatement.executeQuery();
            
            while(rs.next()){
                
                String ad=rs.getString("ad");
                String soyad=rs.getString("soyad");
                String email=rs.getString("email");
                
                System.out.println("Ad : "+ad+"     Soyad : "+soyad+"     Email : "+email);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        /* 
        try {
            statement=con.createStatement();
            
            String sorgu="Select * from calisanlar where ad like 'M%'";
            
            ResultSet rs=statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                System.out.println("Ad : "+rs.getString("ad"));
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
    }
    
    public void calisanEkle(){
        
        try {
            statement=con.createStatement();
            String Sorgu;
            
            String ad="Ali";
            
            String soyad="Uğur";
            
            String email="aliugur@gmail.com";
            
            String sorgu="INSERT INTO calisanlar(ad, soyad, email) VALUES ("+"'"+ad+"',"+"'"+soyad+"',"+"'"+email+"')";
            
            statement.executeUpdate(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    public void CalisanSil(){
        
        try {
            statement=con.createStatement();
            
            String sorgu="Delete from calisanlar where id<3";
            
            int deger=statement.executeUpdate(sorgu);
            
            System.out.println(deger+" kadar veri etkilendi.");
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void calisanGuncelle(){
        
        try {
            statement=con.createStatement();
            
            String  sorgu="Update calisanlar Set email='AKARIN@gmail.com' where id>4";
            
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void calisanlariGetir(){
        
        String sorgu="Select * from calisanlar";
        
        try {
            statement=con.createStatement();
            
            ResultSet rs=statement.executeQuery(sorgu);
            
            while(rs.next()){
                
                int id=rs.getInt("id");
                String ad=rs.getString("ad");
                String soyad=rs.getString("soyad");
                String email=rs.getString("email");
                
                System.out.println("Id : "+id+"    Ad : "+ad+"    Soyad : "+soyad+"    Email : "+email+"");
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Baglanti(){
        
        String url="jdbc:mysql://"+host+":"+port+"/"+dbIsmi+"?useUnicode=true&characterEncoding=utf8";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı.");
        } 
        
        try {
            con=DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız.");
        }

    }
    public static void main(String[] args) {
            Baglanti baglanti = new Baglanti();
            
            baglanti.preparedCalisanlariGetir(5);
            
            /*
            System.out.println("Güncellendikten önce\n");
            
            System.out.println("*********************\n");
            
            baglanti.calisanlariGetir();
            
            baglanti.CalisanSil();
            */
            
            //baglanti.calisanGuncelle();
            
            /*baglanti.calisanEkle();
            
            System.out.println("\nEklendikten sonra\n");
            
            baglanti.calisanlariGetir();*/
            //System.out.println("Güncellendikten sonra\n");
            
            //baglanti.calisanlariGetir();
            
    }
    
}
