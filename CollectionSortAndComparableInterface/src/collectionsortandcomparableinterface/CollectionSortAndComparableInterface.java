/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsortandcomparableinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Player implements Comparable<Player>{
    private String isim;
    
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {
        return "||||| ID: "+id+" isim: "+isim+"|||||";
    }

    @Override
    public int compareTo(Player player) {
        
        if(this.id<player.id){
            return -1;
        }
        else if(this.id >player.id){
            return 1;
        }else{
            return 0;
        }



    }
    
}

/**
 *
 * @author Selcuk
 */
public class CollectionSortAndComparableInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        List<String> listString=new ArrayList<String>();
        
        listString.add("Java");
        listString.add("C");
        listString.add("Pyhton");
        listString.add("C#");
        listString.add("Go");
        
        Collections.sort(listString);
        
        for(String s:listString){
            System.out.println(s);
        }
*/
        List<Player> listPlayer=new ArrayList<Player>();
        listPlayer.add(new Player("Selçuk", 2));
        listPlayer.add(new Player("Alican", 1));
        listPlayer.add(new Player("Mustafa", 5));
        listPlayer.add(new Player("Mert", 14));
        
        Player p1=new Player("Alican", 11);
        Player p2=new Player("Kamuran", 12);
        
        //System.out.println(p1.compareTo(p2));
        
        /*Collections.sort(listPlayer);
        
        for(Player p:listPlayer){
            System.out.println(p);
        }
        */
        Set<Player> treeSet=new TreeSet<Player>();
        
        treeSet.add(new Player("Selçuk", 2));
        treeSet.add(new Player("Alican", 1));
        treeSet.add(new Player("Mustafa", 5));
        treeSet.add(new Player("Mert", 14));
        
        for(Player p:treeSet){
            System.out.println(p);
        }
    }
    
}
