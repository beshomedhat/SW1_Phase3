
package assi_sw1;

import assi_sw1.Items.Item;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Uploader extends Users
{
   User UPLOADER=new User();
   Item item=new Item();
   Questions question=new Questions();
   
    public static void WRTIE_in_file(Item e)
    {
     
        String fileName = "C:\\Users\\Poula\\Desktop\\myprojects\\java\\assi_sw1\\Users.txt";  
        // write the content in file 
        try(FileWriter fileWriter = new FileWriter(fileName,true)) 
        {  
            String fileContent = e.getCaregory()+
                    "  "+e.getColor()
                    +"  "+e.getFinding_Location()
                    +"  "+e.getStatus()
                    +"  "+e.getItem_ID()+" \n";
            fileWriter.write(fileContent);//the true will append the new data
        } 
       catch (IOException ee) 
       {
            // exception handling
            System.out.println("-------ERROR HAS OUCCURED---------");
            
        }
    }

   void UploadPhoto()
   {
       
   }
   void categorize(Item c)
   {
        c = new Item();
        System.out.print("Enter Category of item : ");
        System.out.print("For Wallet write Wallets ");
        System.out.println();
          System.out.print("For IDs write ID ");
        System.out.println();
          System.out.print("For Phones write Phones ");
        System.out.println();
          System.out.print("For Papers&Files write p and f ");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        c.caregory=scanner.nextLine();
        
   }
   void SetLocation(Item c)
   {
        c = new Item();
        System.out.print("Enter Location of item where you found it : ");
        System.out.println(); 
        Scanner scanner = new Scanner(System.in);
        c.Finding_Location=scanner.nextLine();
   }
   void Enter_Featers(Item c)
   {
       
       c = new Item();
        System.out.print("Enter Features of item : ");
        System.out.println();
        System.out.print("The color : ");
        Scanner scanner = new Scanner(System.in);
        c.color=scanner.nextLine();
        System.out.println();
        System.out.print("the Status ");
        Scanner scanner1 = new Scanner(System.in);
        c.status=scanner1.nextLine();
        System.out.println();
        System.out.print(" Thank you for your assistance :) ");
        System.out.println();
   }
   void Update_Category()
   {
       
   }
   void Update_Locatoin()
   {
       
   }
   void Update_Feathers()
   {
       
   }
   void Delete_Location()
   {
       
   }
   void Delete_Feathers()
   {
       
   }
   void Delete_Category()
   {
       
   }
   void Delete_Photo()
   {
       
   }
   void Update_Photo()
   {
       
   }
    
}
