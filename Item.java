import java.util.List;

public class Item extends Product
{
    List<String> listItems;
    public Item(showList showItems){
        super(showItems);
    }

    @Override
    public void show() {
        showItems.listProducts();
    }
}
