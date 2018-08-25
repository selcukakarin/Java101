/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selcuk
 */
public class ProducerConsumer {
    
    Random random=new Random();
    BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
    
    public void produce(){
        
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            try {
                Integer value=random.nextInt(100);
            
                System.out.println("Producer üretiyor :"+ value);
                
                queue.put(value);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    public void consumer(){
        
        while (true) {            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try {
                Integer value=queue.take();
                System.out.println("Consumer tüketiyor : "+value);
                
                System.out.println("Queue size : "+queue.size());
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
    }
    
    
    
}
