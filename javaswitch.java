package pkgswitch;
import java.util.Scanner; 

/**
 *
 * @author daylinhenry
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner keyboard = new Scanner(System.in); 
    
    int days =0; 
    String monthName = null;
    
    System.out.println("How many days?"); 
    days= keyboard.nextInt();   
    
    switch(days){
        
        case 30: 
            monthName = "April, June, September, November";
        break;
        
        case 31:
            monthName = "January, March, May, July, August, October, December"; 
       
        break; 
        
        case 29:
            monthName = "February"; 
       
        break; 
        
        default: monthName = "no months have exactly " + days + " days";
        break;
    
    }
         System.out.println(" Month names : " + monthName);

    
      }
    
}
