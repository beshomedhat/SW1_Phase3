
package assi_sw1;

import java.io.FileNotFoundException;

/**
 *
 * @author bashar
 */
public class searcher extends Searching{
    
      public void search() throws FileNotFoundException{
                READ_items_from_FILE();
                getCategory();
                getItemFeatures();
            }

    public void answerQuestion(){
          
    }
}


