
package assi_sw1;

import assi_sw1.Items.Item;

import static assi_sw1.Users.Choose1;
import static assi_sw1.Users.READ_users_from_FILE;
import assi_sw1.Users.User;
import java.io.IOException;
import java.util.Scanner;




public class Assi_sw1 
{


    public static void main(String[] args) throws IOException 
    {
        
        START();
        
        
    }
    
    @SuppressWarnings("null")
 public static void START() throws IOException
 {
     Scanner scanner=new Scanner(System.in);
     boolean sat=true ,sat2=true;
     User userr=new User();
     Uploader up=new Uploader();
     Item item=new Item();
     searcher searcher=new searcher();
     READ_users_from_FILE();
     do
     {
        
       
       System.out.println("-_-_-_-_--_-_-_-_--_-_-_-_-  WELCOME TO LA2ENY -_-_-_-_--_-_-_-_--_-_-_-_-");
       userr=Choose1();
       if(userr!=null )
       {
           
           
          do
          {
           System.out.println("\n\n-----NOW YOU ARE REGESTERED-----");
           System.out.println("-----ENTER YOUR CHOICE-----");
           System.out.println("-----FOR UPLOAD ITEM ENTER 1-----");
           System.out.println("-----FOR SEARCH ITEM ENTER 2-----");
           System.out.println("-----FOR LOGOUT ENTER 3-----");
           System.out.println("-----FOR EXIT ENTER 4-----");
           int x=scanner.nextInt();
           if(x==1)
           {
               up.Enter_Featers(item);
               up.categorize(item);
               up.SetLocation(item);
               up.WRTIE_in_file(item);
           }
           if(x==2)
           {
               searcher.search();
           }
           if(x==3)
           {
             sat2=false;
             break;
           }
           if(x==4)
           {
             sat2=false;
             sat=false;
             break;
           }
           
          }while(sat2!=false);
           
       }
       else
       {
           System.out.println("-----ERROR HAS OUCCURED-----");           
       }
         
         
         
         
     }while(sat!=false);
     
     
     
 }
 
 
}
