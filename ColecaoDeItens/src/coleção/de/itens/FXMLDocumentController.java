/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleção.de.itens;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
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
    
    private LinkedList<Item> listaDeItens;
    private ArrayList<Usuario> listaDeUsuarios;
    
    
    @FXML
    private TextField txtNome;
    
    @FXML
    private TextField txtEmail;
    
    @FXML
    private TextField txtTelefone;
    
    
    @FXML
    private TextField txtNomeItem;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {    
        System.out.println("Cadastro de usuario requerido!");
        addUser();
        label.setText("Usuario adicionado!");
        
        
    }
    
    @FXML
    public void addUser(){
        try{
        Usuario usuario = new Usuario(txtNome.getText(),txtEmail.getText(),txtTelefone.getText());      
        listaDeUsuarios.add(usuario);
        System.out.println(txtNome);
        System.out.println("Usuario adicionado a lista");
        }
        catch(NullPointerException e){
        System.out.println("Não entrou com um usuario");
        label.setText("Entre com um usuario antes");
        }
    }
    
    
    @FXML
    private void showUsers(ActionEvent event){
        for(Usuario usuario : listaDeUsuarios){
            System.out.println("" + usuario);
            label.setText("" + usuario);
        }
            
    }
    
    @FXML
    private void addItem(){
        Item item = new Item(txtNomeItem.getText());
        listaDeItens.add(item);
        System.out.println("Item adicionado na lista");
    }
    
    @FXML
    private void showItems(ActionEvent event){
        for(Item item : listaDeItens){
            System.out.println("" + item);
            label.setText("\n" + item);
        }
            
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaDeItens = new LinkedList<>();
        listaDeUsuarios = new ArrayList<>();
    }    
    
}
