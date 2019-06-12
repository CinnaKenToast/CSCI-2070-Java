/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaimageviewer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author rockm
 */
public class JavaImageViewer extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView view = new ImageView();

        String[] imageNames = {"Norbert", "Maru", "Khan"};

        RadioButton[] buttons = new RadioButton[imageNames.length];

        ToggleGroup group = new ToggleGroup();

        EventHandler<ActionEvent> handler = event -> {
            for (RadioButton button : buttons) {
                if (button.isSelected()) {
                    try {
                        String content = button.getText().toLowerCase();
                        String filename = "images/" + content + ".png";
                        view.setImage(new Image(new FileInputStream(filename)));
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(JavaImageViewer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new RadioButton(imageNames[i]);
            buttons[i].setToggleGroup(group);
            buttons[i].setOnAction(handler);
        }
        
        VBox vPane = new VBox(20);
        vPane.getChildren().addAll(buttons);
        
        HBox hPane = new HBox(20);
        hPane.getChildren().addAll(vPane,view);
        
        Scene scene = new Scene(hPane, 450, 250);
        
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
