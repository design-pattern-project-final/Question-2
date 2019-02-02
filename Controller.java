package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.collections.FXCollections;
public class Controller {

    Button btn_new;
    ObservableList<String> items,added_list = FXCollections.observableArrayList();
    @FXML
    ListView<String> customer_view;

    @FXML
    private TableView table_view;
    @FXML
    private Button btn_buy;
    @FXML
    private TableColumn<ExecutiveProduct,String> txt_product;
    @FXML
    private TableColumn<ExecutiveProduct, Integer> txt_sells;
    @FXML
    private TableColumn<ExecutiveProduct,Double> txt_price;
    @FXML
    private TextField ent_product;

    @FXML
    private Button btn_add_product;

    @FXML
    private Text item;


    public void handleBuy(){
//        System.out.println(customer_view.getSelectionModel().getSelectedIndex());
        ExecutiveProduct executiveProduct = new ExecutiveProduct();
        txt_product.setCellValueFactory(new PropertyValueFactory<>("name"));
        txt_price.setCellValueFactory(new PropertyValueFactory<>("price"));
        txt_sells.setCellValueFactory(new PropertyValueFactory<>("quantity"));

//        String index = customer_view.getSelectionModel().getSelectedItem();
//        int i = 1;
//        table_view.getItems().addAll(index,i);

        //the most bullshit mistake i ever did
//        table_view.getColumns().addAll(txt_product,txt_price,txt_sells);
        table_view.setItems(getProduct());
        String product_Name = customer_view.getSelectionModel().getSelectedItem();
        executiveProduct.quantity++;
        executiveProduct.getQuantity();
        executiveProduct.setName(product_Name);
        executiveProduct.setQuantity(23);
        executiveProduct.setPrice(345.9);

       table_view.getItems().add(executiveProduct);

        System.out.println(executiveProduct.getName());
        System.out.println(executiveProduct.getQuantity());
    }

    public void handleAdd(){
        if (ent_product.getText().length() > 0){
            customer_view.getItems().addAll(ent_product.getText());
            customer_view.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            ent_product.setText("");
        }
    }

    public ObservableList<ExecutiveProduct> getProduct(){
        ObservableList<ExecutiveProduct> products = FXCollections.observableArrayList();
        products.add(new ExecutiveProduct("Laptop",423.5,34));
        products.add(new ExecutiveProduct("Smart Phones",250.5,110));
        products.add(new ExecutiveProduct("Tablet",300,27));
        products.add(new ExecutiveProduct("Smart Fridge",1520.56,12));

        return products;
    }

}
