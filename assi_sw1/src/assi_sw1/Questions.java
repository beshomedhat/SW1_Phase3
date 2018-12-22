
package assi_sw1;

import java.util.Vector;


public class Questions 
{
    
   private int NUM_of_qes;
   private boolean ans_checks;
   private Vector<String>quess;
   private Vector<String>anses; 

    public Questions(int NUM_of_qes) 
    {
        this.NUM_of_qes = NUM_of_qes;
        
    }

    public Questions() 
    {
        
        
    }

   
    public int getNUM_of_qes() {return NUM_of_qes;}

    public void setNUM_of_qes(int NUM_of_qes) {this.NUM_of_qes = NUM_of_qes;}

    public boolean isAns_checks() {return ans_checks;}

    public void setAns_checks(boolean ans_checks) {this.ans_checks = ans_checks;}

    public Vector<String> getQuess() {return quess;}

    public void setQuess(Vector<String> quess) {this.quess = quess;}

    public Vector<String> getAnses() {return anses;}

    public void setAnses(Vector<String> anses) {this.anses = anses;}
    
    
}
