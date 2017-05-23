/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
Server name:  52.206.157.109 
Database name:  U04FFh
Username:  U04FFh
Password:  53688223001
*/

package com.mjh;

import java.io.IOException;
import javafx.application.Application;

import javafx.scene.Scene;

import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.StageStyle;


/**
 *
 * @author Mike
 */
public class C195 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginWindow.fxml"));

        Scene scene = new Scene(root);
       
        LoginManager loginManager = new LoginManager(scene,primaryStage);
        
        loginManager.showLoginScreen();
        
        primaryStage.setTitle("C195 Appointments");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
     
        launch(args);
    }
    
}
