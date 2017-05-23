/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjh;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Mike
 */
public class LoginWindowController implements Initializable {

    @FXML
    private TextField userNameTB;
    @FXML
    private PasswordField passwordTB;
    @FXML
    private Button loginBtn;
    
    public boolean Authorized = false;

     LoginManager loginManager;
     public void initManager(LoginManager _loginManager) {
        loginManager = _loginManager;
    
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onLoginClicked(MouseEvent event){
        loginManager.authenticated(true);
      
    }
    
     @FXML
    private void onCancelClicked(MouseEvent event) {
       loginManager.authenticated(false);
         
    }
    
}
