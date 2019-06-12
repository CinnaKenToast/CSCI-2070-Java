//Kenneth Shipley
//CSCI 2070-08
//April 04, 2018
//This program runs a JavaFX application that will convert a distance from different units
package kennethshipley2070assignment12;

import java.io.FileInputStream;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment12 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label distance = new Label("Distance in meters: ");
        Label conversion = new Label("Result: ");

        TextField inputTextField = new TextField();
        TextField resultTextField = new TextField();
        resultTextField.setEditable(false);

        Button convert = new Button("Convert");

        ImageView view = new ImageView();

        String filename = "images/tape.png";
        view.setImage(new Image(new FileInputStream(filename)));

        RadioButton[] rButtons = new RadioButton[3];

        ToggleGroup group = new ToggleGroup();

        EventHandler<ActionEvent> handler = event -> {
            String content = inputTextField.getText();
            double value = 0;

            if (rButtons[0].isSelected()) {
                try {
                    value = Double.parseDouble(content);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error! Number is not understood!");
                }
                value = 39.37 * value;
            }

            if (rButtons[1].isSelected()) {
                try {
                    value = Double.parseDouble(content);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error! Number is not understood!");
                }
                value = 3.28 * value;
            }

            if (rButtons[2].isSelected()) {
                try {
                    value = Double.parseDouble(content);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error! Number is not Understood");
                }
                value = 1.09 * value;

            }
            
            resultTextField.setText(String.valueOf(value));
            

        };

        for (int i = 0; i < rButtons.length; i++) {
            if (i == 0) {
                rButtons[i] = new RadioButton("inches");
            } else if (i == 1) {
                rButtons[i] = new RadioButton("feet");
            } else {
                rButtons[i] = new RadioButton("yards");
            }
            rButtons[i].setToggleGroup(group);
            rButtons[i].setOnAction(handler);
        }

        convert.setOnAction(handler);

        VBox radio = new VBox(20);
        radio.getChildren().addAll(rButtons);
        radio.setAlignment(Pos.CENTER_LEFT);

        HBox input = new HBox(20);
        input.getChildren().addAll(distance, inputTextField);
        input.setAlignment(Pos.CENTER);

        HBox results = new HBox(20);
        results.getChildren().addAll(conversion, resultTextField);
        results.setAlignment(Pos.CENTER);

        VBox fields = new VBox(20);
        fields.getChildren().addAll(input, results, convert);
        fields.setAlignment(Pos.CENTER);

        HBox overall = new HBox(20);
        overall.getChildren().addAll(view, radio, fields);
        overall.setAlignment(Pos.CENTER);

        Scene scene = new Scene(overall, 700, 250);
        
        primaryStage.setTitle("Kenneth's Distance Converter");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
