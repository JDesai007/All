/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_with_thread;

/**
 *
 * @author Jaydip
 */
public class TestBrowser {
    public static void main(String[] args) throws InterruptedException
    {
      Runnable task = ()->
        {
            Browser.getInstance().displaymsg();
        };
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);
        Thread t3=new Thread(task);
        
        t1.start();
        t2.start();
        t3.start();
       
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());
          
        t1.join();
        t2.join();
        t3.join();
        
        
    }
}
