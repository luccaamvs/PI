package br.senac.javafxapp.telas;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author lucca.pbordin
 */
public class TelaTesteController implements Initializable {

    @FXML
    private TextField Texto01;
    @FXML
    private TextField Texto02;
    @FXML
    private TextField Texto03;
    @FXML
    private Button Botao01;
    @FXML
    private CheckBox CheckBox1;
    @FXML
    private CheckBox CheckBox2;
    @FXML
    private RadioButton RadioBotao1;
    @FXML
    private RadioButton RadioBotao2;
    @FXML
    private Label TextoInteracao;
    @FXML
    private Button BotaoInteracao;
    @FXML
    private ToggleGroup Grupo;
    @FXML
    private ComboBox ComboBox;
    @FXML
    private Label PPP;
    @FXML
    private DatePicker SuperData;
    @FXML
    private Button SuperBotao;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
            ComboBox.getItems().add("Opção Gui");
        ComboBox.getItems().add("Opção Eu");
        ComboBox.getItems().add("Opção Sla");
                         
    }    


    @FXML
    private void Acao(ActionEvent event) {
        Texto03.setText(Texto01.getText() + Texto02.getText());
    }

    @FXML
    private void Confere1(ActionEvent event) {
         
        
        
        CheckBox2.isSelected();
        
        if(CheckBox1.isSelected()){
            CheckBox2.setSelected(false);
                 
    }
        
        
        
    }

    @FXML
    private void Confere2(ActionEvent event) {
        CheckBox1.isSelected();
        
        if(CheckBox2.isSelected()){
            CheckBox1.setSelected(false);
                 
    }
        
    }
            
    @FXML
    private void AcaoDeInteracao(ActionEvent event) {
if(Grupo.getSelectedToggle()==RadioBotao1){
            TextoInteracao.setText("Alteração 01");
        }
if(Grupo.getSelectedToggle()==RadioBotao2){
            TextoInteracao.setText("Alteração 02");
        }
    }

    
    
    @FXML
    private void AcaoBox(ActionEvent event) {
        
        
        if(ComboBox.getSelectionModel().getSelectedItem().equals("Opção Sla")){
          PPP.setText("Show");  
        }
        if(ComboBox.getSelectionModel().getSelectedItem().equals("Opção Eu")){
          PPP.setText("Muito Show");  
        }
        if(ComboBox.getSelectionModel().getSelectedItem().equals("Opção Gui")){
          PPP.setText("Nada Show");  
        }
        
    }

    @FXML
    private void SuperAcao(ActionEvent event) {
        LocalDate numero =SuperData.getValue();
        Alert alert = new Alert (AlertType.INFORMATION);
        alert.setTitle("PRERIGO!");
        alert.setHeaderText("MUTCHO CUIDADO!");
        alert.setContentText(String.valueOf(SuperData));
        alert.showAndWait();
        
        
    }
    }
    
    
    

