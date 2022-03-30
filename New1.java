/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usothreads;

/**
 *
 * @author mague
 */
public class New1 extends Thread{
    
    public New1(String meg){
    super(meg);  
    setPriority(MAX_PRIORITY);
   }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
               System.out.println("Hilo 2");
        }
 
    }
}
