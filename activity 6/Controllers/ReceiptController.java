package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class ReceiptController implements Initializable{

    @FXML
    Label Name1, Name2, Name3;

    @FXML
    Label Price1, Price2, Price3;

    @FXML 
    Label Qty1, Qty2, Qty3;

    @FXML 
    Label Date1, Date2, Date3;

    @FXML
    Label totalLabel;

    @Override
    public  void initialize(URL arg0, ResourceBundle arg1){

        if (HomeController.blamp.getProductStatus() == true) {
            Name1.setText(HomeController.blamp.getProductName());
            Price1.setText(String.valueOf(HomeController.blamp.getProductPrice()));
            Qty1.setText(String.valueOf(HomeController.blamp.getProductQuantity()));
            Date1.setText("6 / 7 / 23");
        } else {
            Name1.setVisible(false);
            Price1.setVisible(false);
            Qty1.setVisible(false);
            Date1.setVisible(false);
        }

        if (HomeController.clamp.getProductStatus() == true) {
            Name2.setText(HomeController.clamp.getProductName());
            Price2.setText(String.valueOf(HomeController.clamp.getProductPrice()));
            Qty2.setText(String.valueOf(HomeController.clamp.getProductQuantity()));
            Date2.setText("6 / 7 / 23");
        } else {
            Name2.setVisible(false);
            Price2.setVisible(false);
            Qty2.setVisible(false);
            Date2.setVisible(false);
        }

        if (HomeController.wlamp.getProductStatus() == true) {
            name3.setText(HomeController.wlamp.getProductName());
            price3.setText(String.valueOf(HomeController.wlamp.getProductPrice()));
            qty3.setText(String.valueOf(HomeController.wlamp.getProductQuantity()));
            date3.setText("6 / 1 / 23");
        } else {
            name3.setVisible(false);
            price3.setVisible(false);
            qty3.setVisible(false);
            date3.setVisible(false);
        }

        totalLabel.setText(CheckoutController.totalSagad);
    
    }

}