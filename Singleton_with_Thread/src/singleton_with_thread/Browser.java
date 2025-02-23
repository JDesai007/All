/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_with_thread;

/**
 *
 * @author Jaydip
 */
public class Browser {
     private static Browser browser;
    
    private Browser() throws Exception
    {
        if (browser==null)
        {
            throw new Exception("Objecct already exist");
        }
            
        
    }
    
     @SuppressWarnings("empty-statement")
    public static Browser getInstance() throws Exception
    {
        if (browser==null)
        {
            synchronized(Browser.class){}
            if(browser==null)
            {
                browser= new Browser();
            }
        }
        return browser;
    }
   
    public void displaymsg()
    {
        System.out.println("Singleton pattern");
    } 
}
