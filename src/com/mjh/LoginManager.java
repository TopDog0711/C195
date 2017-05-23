/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mjh;

import java.io.IOException;
import java.util.logging.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

/**
 *
 * @author Mike
 */
public class LoginManager {
    private final Scene scene;
    private final Stage stage;

  public LoginManager(Scene scene, Stage stage) {
    this.scene = scene;
    this.stage = stage;
  }
  
  
   public void logout() {
    showLoginScreen();
  }
   
   public void authenticated(boolean moveOn) {
    
       if(moveOn)
       {
            showMainView();
       }
       else{
           stage.close();
       }
  }
   
   
    public void showLoginScreen()  {
    try {
      FXMLLoader loader = new FXMLLoader( getClass().getResource("loginWindow.fxml"));
      scene.setRoot((Parent) loader.load());
     
      LoginWindowController controller = loader.<LoginWindowController>getController();
      controller.initManager(this);
      
     
    } catch (IOException ex) {
      Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
    
    private void showMainView() {
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("mainWindow.fxml")
      );
      scene.setRoot((Parent) loader.load());
       
      MainWindowController controller = loader.<MainWindowController>getController();
      
      controller.setStage(stage);
      
     
     
     
    } catch (IOException ex) {
      Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

}
