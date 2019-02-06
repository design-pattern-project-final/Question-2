public abstract class Product
{
    protected showList showItems;

    protected Product(showList showItems){
        this.showItems = showItems;
    }

    public abstract void show();
}
