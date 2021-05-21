/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapping;

/**
 *
 * @author DELL
 */
import java.util.*;
public class HashMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Map<String,Integer> ob = new HashMap <String,Integer>();
         enter(ob);
        
         
        
        
        
    }
    public static void enter(Map<String,Integer> ob)
    {
        String m,n;
        int c=0;
        Scanner l = new Scanner (System.in);
        System.out.println("Enter a string ");
        
        String [] u = new String [100];
        m=l.nextLine();
        u=m.split(" ");
        for (int i = 0; i <u.length; i++) {
            
            n=u[i].toLowerCase();
            //System.out.println(n);
            if(ob.containsKey(n))
            {
               c=ob.get(n);
               ob.put(n, c+1);
            }
            else
            {
                ob.put(n, 1);
            }
        }
        Iterator ob1 = ob.keySet().iterator();
         while(ob1.hasNext())
         {
             String i= (String)ob1.next();
             System.out.println("key is : " + i + " value is  : "+ ob.get(i));
         }
      //  System.out.println(ob);
        
    
}
}

