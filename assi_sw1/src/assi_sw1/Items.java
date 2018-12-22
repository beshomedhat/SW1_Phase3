
package assi_sw1;


public class Items
{
    public static class Item
    {
        public String color;
        public String status;
        public String Finding_Location;
        public String caregory;
        private String Item_ID;
        private int counts;

        public Item(String color, String status, String Finding_Location, String caregory, String Item_ID)
        {
            this.color = color;
            this.status = status;
            this.Finding_Location = Finding_Location;
            this.caregory = caregory;
            this.Item_ID = Item_ID;
            counts++;
        }

        Item() 
        {
            
        }
        

        
        
        
        public String getColor() {return color;}

        public void setColor(String color) {this.color = color;}

        public String getStatus() {return status;}

        public void setStatus(String status) {this.status = status;}

        public String getFinding_Location() {return Finding_Location;}

        public void setFinding_Location(String Finding_Location) {this.Finding_Location = Finding_Location;}

        public String getCaregory() {return caregory;}

        public void setCaregory(String caregory) {this.caregory = caregory;}

        public String getItem_ID() {return Item_ID;}

        public void setItem_ID(String Item_ID) {this.Item_ID = Item_ID;}
         
        
    }
    
    
    
    
    
}
