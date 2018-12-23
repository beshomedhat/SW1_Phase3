
package assi_sw1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Users 
{
    public  static List<User>userslist=new ArrayList<>();
    public  static Map<String, String>list=new HashMap<>();
    public  static String input,name,password,email,location;
    public  static int phone,numofuser=0;
    public  static Scanner scanner=new Scanner(System.in);
    
    
    public static class User
    {
    private String Name;
    private String Email;
    private String Password;
    private int Phone;
    private static int user_id ;
    private static int count ;
    private String Location;
    private String status ;




    //default constructor
    public User()
    {
         Name="";
         Email="";
         Password="";
         Phone=00000000000;
         Location="";
         status=null;
    }
    // constructor
    public User(String Name, String Password) 
    {
        this.Name = Name;
        this.Password = Password;
        this.user_id++;
        this.count++;
    }
    // constructor
    public User(String Name, String Password , String Email,  int Phone,  String Location) 
    {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
        this.user_id ++;
        this.Location = Location;
        this.count++;
        this.status=null;
    }

    //Setter AND Getter
    public String getName() {return Name;}

    public void setName(String Name) {this.Name = Name;}

    public String getEmail() {return Email;}

    public void setEmail(String Email) {this.Email = Email;}

    public String getPassword() {return Password;}

    public void setPassword(String Password) {this.Password = Password;}

    public int getPhone() {return Phone;}

    public void setPhone(int Phone) {this.Phone = Phone;}

    public int getUser_id() {return user_id;}

    public void setUser_id(int user_id) {this.user_id = user_id;}

    public  int getCount() {return count;}

    public  void setCount(int countt) {count = countt;}

    public String getLocation() {return Location;}

    public void setLocation(String Location) {this.Location = Location;}
       
    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}
     
    public void icr_count()
    {count++;}
    
    public void Select_Item()
    {
        
    }
    public void Connect()
    {
        
    }
    
    
    
    }//end of class User
    
    
   
    
    public static User Choose1() throws IOException
    {


        System.out.println("Enter \"login\", \"register\"");
        User user=new User();
       
        input = scanner.nextLine();

            
         if(input.equals("login")||input.equals("LOGIN")||input.equals("Login"))   
         {      // get login details
                System.out.println("Enter USER NAME ");
                name=scanner.nextLine();
                System.out.println("Enter USER PASSWORD ");
                password=scanner.nextLine();
                user=Login1(name,password);
                return user;
         }
            
         if(input.equals("register")||input.equals("Register")||input.equals("REGISTER"))   

         { 
          
                System.out.println("\tEnter USER NAME ");
                name=scanner.nextLine();
                System.out.println("\tEnter USER PASSWORD ");
                password=scanner.nextLine();
                System.out.println("\tEnter USER PHONE ");
                String phonee;
                phonee=scanner.nextLine(); 
                phone=Integer.parseInt(phonee);
                System.out.println("\tEnter USER EMAIL ");
                email=scanner.nextLine();
                System.out.println("\tEnter USER LOCATION ");
                location=scanner.nextLine();
                regesiter(name,password,email,phone,location);
                System.out.println("\n\t\t=======---- ACCOUNT IS ADDED ----=======\n");
                return user;

         }
         else
                System.out.println("!!!!!!!!!--------- INVALID INPUT -------!!!!!!!!!");
        return user;
            

    }
    
    
    public static User Login1(String n,String p)
    {
        User userslist1=new User();
        for (int i=0;i<userslist.size();i++) 
        {
             userslist1=userslist.get(i);
            if("reg".equals(userslist1.getStatus()))
            {  
               if(n.equals(userslist1.getName()))
               {
                   if(p.equals(userslist1.getPassword()))
                    {
                       System.out.println("\n\t\t----==== YOUR LOGIN SUCCEDD ====----");
                       return  userslist1;
                        
                    }
               }
            }
           
        }
        return null;
    }
    
    
    
    public static User regesiter(String n,String p,String E,int ph,String lo) 
    {
        User e=new User(n,p,E,ph,lo);
        e.setStatus("reg");
        list.put(n, p);
        userslist.add(e);  
        WRTIE_all_to_file(e);
        return e;
    }

    
    
 
    public static void print_all()
    {
        for (int i=0;i<userslist.size();i++) 
        {
            User userslist1=userslist.get(i);
           System.out.println("-_-_-_-_--_-_-_-_--_-_-_- USER :  "+i+"-_-_-_-_--_-_-_-_--_-_-_-");
           System.out.println("\t\tname :"+userslist1.getName()+
                  "\n\t\tpassword : "+userslist1.getPassword()+
                  "\n\t\tphone : "+userslist1.getPhone()+
                  "\n\t\tEmail : "+userslist1.getEmail()+
                  "\n\t\tlocation : "+userslist1.getLocation()+
                  "\n\t\tstatus : "+userslist1.getStatus()+"\n");
           System.out.println("-_-_-_-_--_-_-_-_--_-_-_-_--_-_-_-_--_-_-_-_--_-_-_-_--_-_-_-_-");
           
        }
    }
    
    public static void print_one_USER()
    {
        System.out.println("Enter USER NAME ");
        name=scanner.nextLine();
        System.out.println("Enter USER PASSWORD ");
        password=scanner.nextLine();
        User userslist1=Login1(name,password);
        if(userslist1!=null)
        {
              System.out.println("USER details is: "+"\nname :"+userslist1.getName()+
                  "\t / password : "+userslist1.getPassword()+
                  "\t / phone : "+userslist1.getPhone()+
                  "\t / Email : "+userslist1.getEmail()+
                  "\t / location : "+userslist1.getLocation()+
                  "\t / status : "+userslist1.getStatus()+"\n");
        }
        else
           System.out.println("-----_____-- NOT IN SYSTEM --_____-----"); 
      
    }

    public static void print_one_USER(String n,String p)
    {
        User userslist1=Login1(n,p);
        if(userslist1!=null)
        {
                  System.out.println("USER details is: "+"\nname :"+userslist1.getName()+
                  "\t / password : "+userslist1.getPassword()+
                  "\t / phone : "+userslist1.getPhone()+
                  "\t / Email : "+userslist1.getEmail()+
                  "\t / location : "+userslist1.getLocation()+
                  "\t / status : "+userslist1.getStatus()+"\n");
        }
        else
           System.out.println("-----_____-- NOT IN SYSTEM --_____-----"); 
    }
    
    public static void fill_USER(int n)
    {
        for(int i=1;i<=n;i++)
        {
            String x="USER"+i+"";
            User userslist1=new User(x,x,x,11111111,x);
            userslist1.setStatus("reg");
            userslist.add(userslist1);
            WRTIE_all_to_file(userslist1);

        }
    }
        
    public static void print()
    {
         
        System.out.println(userslist.get(4).getName()+"  _---_  "+userslist.get(4).getPassword());
    }
    
    
    public static void READ_users_from_FILE()
    { 
        
        String fileName = "Users.txt";  

        File file = new File(fileName);
        String line = null;
        try 
            {
              Scanner scanner = new Scanner(file);
              while (scanner.hasNextLine()) 
                  {
                      User p=new User();
                      line = scanner.nextLine();
                      String[] splitStr = line.split("\\s+");
                                              // \\s+  matches one or many whitespaces.
                                              //They're the so-called regular expression quantifiers
                                             
    
                         p.setName(splitStr[0]);
                         p.setPassword(splitStr[1]);
                         p.setPhone(Integer.parseInt(splitStr[2]));
                         p.setEmail(splitStr[3]);
                         p.setLocation(splitStr[4]);
                         p.setStatus("reg");
                         p.setUser_id(p.getCount());
                         p.icr_count();
                         userslist.add(p);
                     



                  }
            }
        catch(FileNotFoundException e){}
        
    }
    

    
    public static void WRTIE_all_to_file(User e)
    {
        String fileName = "Users.txt";  
        // write the content in file 
        try(FileWriter fileWriter = new FileWriter(fileName,true)) 
        {  
            String fileContent =e.getName()+
                    "  "+e.getPassword()
                    +"  "+e.getPhone()
                    +"  "+e.getEmail()
                    +"  "+e.getLocation()+" \n";
            fileWriter.write(fileContent);//the true will append the new data
        } 
       catch (IOException ee) 
       {
            // exception handling
            System.out.println("-------ERROR HAS OUCCURED---------");
            
        }
    }

    
    
    
    
    
    
}//END OF CLASS


  
