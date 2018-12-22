
package assi_sw1;


public class Account 
{
    private String UserName;
    private String Password;
    private String Email;
    private String UserId;

    public Account(String UserName, String Password, String Email, String UserId) 
    {
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.UserId = UserId;
    }

    public Account() 
    {
        
    }

    
    
    
    
    public String getUserName() {return UserName;}

    public void setUserName(String UserName) {this.UserName = UserName;}

    public String getPassword() {return Password;}

    public void setPassword(String Password) {this.Password = Password;}

    public String getEmail() {return Email;}

    public void setEmail(String Email) {this.Email = Email;}

    public String getUserId() {return UserId;}

    public void setUserId(String UserId) {this.UserId = UserId;}
    
    
}
