
package assi_sw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import assi_sw1.Items.Item;



public class Searching {
     public  static List<Item>Itemslist=new ArrayList<>();
     
 public static void READ_items_from_FILE()
    { 
        
        String fileName = "Item.txt";  

        File file = new File(fileName);
        String line = null;
        try 
            {
              Scanner scanner = new Scanner(file);
              while (scanner.hasNextLine()) 
                  {
                      Item p = new Item();
                      line = scanner.nextLine();
                      String[] splitStr = line.split("\\s+");
                                              // \\s+  matches one or many whitespaces.
                                              //They're the so-called regular expression quantifiers
                                             
    
                         p.setCaregory(splitStr[0]);
                         p.setColor(splitStr[1]);
                         p.setFinding_Location(splitStr[2]);
                         p.setStatus(splitStr[3]);
                         p.setItem_ID(splitStr[4]);

                         Itemslist.add(p);
                     



                  }
            }
        catch(FileNotFoundException e){}
        
    }
        

public static void getCategory()
{
           System.out.print("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
           System.out.print("\n\t\t-------------- Enter Category of item : --------------");
           System.out.print("\n\t\t-------------- For Wallet write 'Wallets -------------");
           System.out.print("\n\t\t-------------- For IDs write 'ID'  -------------------");
           System.out.print("\n\t\t-------------- For Phones write 'Phones'  ------------");
           System.out.print("\n\t\t-------------- For Papers&Files write p and f  -------");
           String category;
        Scanner scanner = new Scanner(System.in);
        category=scanner.nextLine();
       
        for (int i=0;i<Itemslist.size();i++) 
        {
             
            if(category==Itemslist.get(i).getCaregory())
            {  
                Item e =Itemslist.get(i);    
                String item1 = e.getCaregory()+
                    "  "+e.getColor()
                    +"  "+e.getFinding_Location()
                    +"  "+e.getStatus()
                    +"  "+e.getItem_ID()+" \n";
                System.out.println(item1);
                
            }
           
        }
        
}

public static void getItemFeatures()
{
        System.out.print("\n\t\t----------- Enter Features of item : -----------");
        System.out.print("\n\t\t----------- Enter color of item : -----------");
        String color;
        Scanner scanner = new Scanner(System.in);
        color=scanner.nextLine();
        System.out.print("\n\t\t----------- Enter Status of item : -----------");
        String Status;
        Scanner scanner1 = new Scanner(System.in);
        Status=scanner1.nextLine();       
        for (int i=0;i<Itemslist.size();i++) 
        {
             
            if(Status==Itemslist.get(i).getStatus() || color==Itemslist.get(i).getColor())
            {  
                Item e =Itemslist.get(i);    
                String item1 = e.getCaregory()+
                    "  "+e.getColor()
                    +"  "+e.getFinding_Location()
                    +"  "+e.getStatus()
                    +"  "+e.getItem_ID()+" \n";
                System.out.println(item1);
                
            }
           
        }
        
}

}
