import java.util.List;

public class ExecutiveView implements showList
{
    private List<String> listItems;
    private int numberOfSells;

    public ExecutiveView(List<String> listItems){
        this.listItems = listItems;
    }

    @Override
    public void listProducts() {
        for (String i: listItems){
            System.out.println(i);
        }
    }

    public int showItemsSold(String soldItems){
        if (listItems.contains(soldItems));
        return numberOfSells++;
    }
}
