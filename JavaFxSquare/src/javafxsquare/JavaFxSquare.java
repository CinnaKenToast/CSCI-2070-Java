/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsquare;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author rockm
 */
public class JavaFxSquare extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label input = new Label("Input :");
        Label result = new Label("Results: ");
        
        TextField inputTextField = new TextField();
        TextField resultTextFeild = new TextField();
        resultTextFeild.setEditable(false);
        
        Button calculate = new Button("Calculate");
        
        EventHandler<ActionEvent> handler = event ->{
            String content = inputTextField.getText();
            int value = 0;
            try{
                value = Integer.parseInt(content);
            }
            catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "That is not a valid number");
            }
            int square = value * value;
            
            resultTextFeild.setText(String.valueOf(square));
        };
        
        calculate.setOnAction(handler);
        
        HBox top = new HBox();
        top.getChildren().addAll(input, inputTextField);
        
        HBox bottom = new HBox();
        bottom.getChildren().addAll(result, resultTextFeild);
        
        VBox vPane = new VBox(20);
        vPane.getChildren().addAll(top, calculate, bottom);
        
        Scene scene = new Scene(vPane,300,300);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
