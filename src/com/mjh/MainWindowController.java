/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjh;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mike
 */
public class MainWindowController implements Initializable {
   
     /**
     * Initializes the controller class.
     */
    
    private Stage stage;
    
    
    public void setStage(Stage stage)
    {
        this.stage = stage;
        this.stage.setWidth(800);
        this.stage.setHeight(600);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
          
          
   
    }    
    
}
