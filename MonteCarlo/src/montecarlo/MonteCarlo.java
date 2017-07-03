/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package montecarlo;

/**
 *
 * @author acer
 */
public class MonteCarlo {

    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double sin,sin_sq,cos,cos_sq,sum,sum_totals=0.0;
      int x;
     for(x=0;x<10000;x++){
     
sin = Math.sin(limitsfunction());
sin_sq= Math.pow(sin, 2.0);
 



cos = Math.cos(limitsfunction());
cos_sq= Math.pow(cos, 2.0);
     


sum=sin_sq+cos_sq;
sum_totals=sum_totals+sum;   
  }
     
     
     double monte_carlo=sum_totals/10000.0;
     System.out.println(monte_carlo*Math.PI);
     
     
     
    }
    
    private static double limitsfunction() {
        double a=0.0,b=Math.PI;
        double res=a+randomval()*(b-a);
       return res; 
    }
    
    private static double randomval() {
      
        double rollValue=Math.random();
        
  
        //System.out.println(rollValue);
       return rollValue; 
    }
    
     
    
    
    
}
