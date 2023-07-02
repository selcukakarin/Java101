/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerconsumerproblem;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Selcuk
 */
public class ProducerConsumerProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProducerConsumer pc=new ProducerConsumer();
        
        Thread producer=new Thread(new Runnable() {
            @Override
            public void run() {
                pc.produce();
            }
        });
        
        Thread consumer=new Thread(new Runnable() {
            @Override
            public void run() {
                pc.consumer();
            }
        });
        
        producer.start();
        consumer.start();
        
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ProducerConsumerProblem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
