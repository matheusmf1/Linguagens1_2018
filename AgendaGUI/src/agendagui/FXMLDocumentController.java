/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendagui;

import java.net.URL;
import java.util.ArrayList;
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
    private TextField txtNome;
    
    @FXML
    private TextField txtEmail;
    
    @FXML
    private TextField txtTelefone;
    private ArrayList<Contato> listaDeContatos;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Contato c1 = new Contato(txtNome.getText());
        c1.setEmail(txtEmail.getText());
        c1.setTelefone(txtTelefone.getText());  
        listaDeContatos.add(c1);
        System.out.println("Contato: " + c1);
        
        
    }

    @FXML
    private void ExibirLista(ActionEvent event){
        for(Contato contato : listaDeContatos){
            System.out.println("" + contato);
        }
            
    }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaDeContatos = new ArrayList<>();
    }    
    
}
