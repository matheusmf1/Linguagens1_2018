/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Matheus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private TextField textField1;
    
    @FXML
    private TextField textField2;
    
    public double total;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    public void soma(ActionEvent event){  
        
       double n1 =  Double.parseDouble(textField1.getText());
       double n2 =  Double.parseDouble(textField2.getText());
       total = n1 + n2;
       label.setText(""+ total);
       System.out.println("Sum realized");
    }
   
    @FXML
    public void menos(ActionEvent event){  
        
       double n1 =  Double.parseDouble(textField1.getText());
       double n2 =  Double.parseDouble(textField2.getText());
       total = n1 - n2;
       label.setText(""+ total);
       System.out.println("Subtraction realized");
    }
    
    @FXML
    public void mult(ActionEvent event){  
        
       double n1 =  Double.parseDouble(textField1.getText());
       double n2 =  Double.parseDouble(textField2.getText());
       total = n1 * n2;
       label.setText(""+ total);
       System.out.println("Multiplication realized");
    }
    
    @FXML
    public void div(ActionEvent event){  
        
       double n1 =  Double.parseDouble(textField1.getText());
       double n2 =  Double.parseDouble(textField2.getText());
       if (n2 != 0)
        total = n1 / n2;
       else {
           label.setText("Seu burro, divisao por 0");
           System.out.println("Error Division 0");
       }
           
       label.setText(""+ total);
       System.out.println("Division realized");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
