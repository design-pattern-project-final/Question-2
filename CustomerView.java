import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerView implements showList
{
    private List<String> listItems;

    public CustomerView(List<String> listItems){
        this.listItems = listItems;
    }

    @Override
    public void listProducts() {
        for(String i: listItems){
            System.out.println(i);
        }
    }

    public void sortItems(){
       Collections.sort(listItems);
       //print the result
       for(String item: listItems){
           System.out.println(item);
       }
    }
}
