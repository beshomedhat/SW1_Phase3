
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
     
        String fileName = "Item.txt";  
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
        System.out.println("-_-_-_-_--_-_-_-_--_-_-_-_-_-_-_-_--_-_-_-_--_-_-_-_-");
        System.out.println("\t\t----- Enter Category of item : -----");
        System.out.println("\t\t----- For Wallet write Wallets -----\n");
        System.out.println("\t\t----- For IDs write ID -----\n");
        System.out.println("\t\t----- For Phones write Phones -----\n");
        System.out.println("\t\t----- For Papers&Files write p and f -----\n");
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        c.caregory=scanner.nextLine();
        
   }
   void SetLocation(Item c)
   {
        
        System.out.print("\n\t\t----- Enter Location of item where you found it : -----");
        System.out.println(); 
        Scanner scanner = new Scanner(System.in);
        c.Finding_Location=scanner.nextLine();
   }
   void Enter_Featers(Item c)
   {
       
      
        System.out.print("\n\t\t----- Enter Features of item : -----");
        System.out.println();
        System.out.print("\n\t\t----- The color : -----");
        Scanner scanner = new Scanner(System.in);
        c.color=scanner.nextLine();
        System.out.println();
        System.out.print("\n\t\t----- the Status -----");
        Scanner scanner1 = new Scanner(System.in);
        c.status=scanner1.nextLine();
        System.out.println();
        System.out.print("--------------- ( Thank you for your assistance : ) -----------------");
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
