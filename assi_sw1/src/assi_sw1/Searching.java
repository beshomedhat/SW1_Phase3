
package assi_sw1;

public class Searching extends searcher
 {
  public static void getCategory (String filename,String searchStr) throws FileNotFoundException{

        String searchCat = "";
           System.out.print("Enter Category of item : ");
           System.out.println();
           System.out.print("For Wallet write 'Wallets ");
           System.out.println();
           System.out.print("For IDs write 'ID' ");
           System.out.println();
           System.out.print("For Phones write 'Phones' ");
           System.out.println();
           System.out.print("For Papers&Files write p and f ");
           System.out.println();
           Scanner scan = new Scanner(new File(searchCat));
            while(scan.hasNext()){
            String line0 = scan.nextLine().toLowerCase().toString();
            if(line0.contains(searchStr)){
            System.out.println(line0);}
        
    }
    
 }
     public static void getItemFeatures (String filename,String searchStr) throws FileNotFoundException{
            String searchCat = "";
            System.out.print("Enter Features of item : ");
            Scanner scan = new Scanner(new File(searchCat));
            while(scan.hasNext()){
            String line0 = scan.nextLine().toLowerCase().toString();
            if(line0.contains(searchStr)){
                System.out.println(line0);
            
   
}
