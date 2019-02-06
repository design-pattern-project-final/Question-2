import java.util.ArrayList;
import java.util.List;

public class runner
{
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("laptops");
        items.add("Mobiles");
        items.add("Shoes");
        Product customerView = new Item(new CustomerView(items));
        Product executiveView = new Item(new ExecutiveView(items));

        customerView.show();
        executiveView.show();
/*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int number = input.nextInt();

        if (number ==1){
            CustomerView view = new CustomerView(items);
            view.sortItems();
        } else if (number == 2) {
            System.out.print("Enter the Item: ");
            Console in = System.console();
            String itemToBeEntered = input.next();
            System.out.println(itemToBeEntered);
            if (items.contains(itemToBeEntered)){
                ExecutiveView executiveView1 = new ExecutiveView(items);

            } else {
                items.add(itemToBeEntered);
            }
        } else {
            System.exit(-1);
        }*/
    }
}
