/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.javafxapp.aplicacao;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author lucca.pbordin
 */
public class Aplicacao extends Application {
    
    public void start(Stage stage) throws Exception {
        
        Parent telaCadastro = FXMLLoader.load(
                getClass().getResource(
               "/br/senac/javafxapp/telas/TelaTeste.fxml" ));
    
               Scene scene = new Scene(telaCadastro);
               
               stage.setScene(scene);
               stage.show();
    }       
        
}
