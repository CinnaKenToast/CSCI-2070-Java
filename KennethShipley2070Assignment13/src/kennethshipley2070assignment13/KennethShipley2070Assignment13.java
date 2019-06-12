//Kenneth Shipley
//CSCI 2070-08  
//April 16, 2018
//This program creates a JavaFX application that creates a list of books as a library
package kennethshipley2070assignment13;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author rockm
 */
public class KennethShipley2070Assignment13 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label title = new Label("Title:");
        Label author = new Label("Author:");
        Label publisher = new Label("Publisher");
        Label year = new Label("Year Published:");

        TextField titleText = new TextField();
        TextField authorText = new TextField();
        TextField publisherText = new TextField();
        TextField yearText = new TextField();

        Button add = new Button("Add Book");

        TextArea library = new TextArea();

        ArrayList<Book> bookList = new ArrayList<>();

        EventHandler<ActionEvent> handler = event -> {
            try {
                String bookTitle = titleText.getText();
                String bookAuthor = authorText.getText();
                String bookPublisher = publisherText.getText();
                int bookYear = Integer.parseInt(yearText.getText());

                Book book = new Book(bookTitle, bookAuthor, bookPublisher, bookYear);
                bookList.add(book);

                StringBuilder stuff = new StringBuilder("");

                for (int i = 0; i < bookList.size(); i++) {
                    stuff.append(bookList.get(i).getDescription() + "\n");
                }

                library.setText(stuff.toString());
                titleText.setText("");
                authorText.setText("");
                publisherText.setText("");
                yearText.setText("");
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error! Number is not understood!");
            }
        };

        add.setOnAction(handler);
        
        HBox titleBox = new HBox(20);
        titleBox.getChildren().addAll(title, titleText);
        titleBox.setAlignment(Pos.CENTER);
        
        HBox authorBox = new HBox(20);
        authorBox.getChildren().addAll(author, authorText);
        authorBox.setAlignment(Pos.CENTER);
        
        HBox publisherBox = new HBox(20);
        publisherBox.getChildren().addAll(publisher, publisherText);
        publisherBox.setAlignment(Pos.CENTER);
        
        HBox yearBox = new HBox(20);
        yearBox.getChildren().addAll(year, yearText);
        yearBox.setAlignment(Pos.CENTER);
        
        HBox buttonBox = new HBox(20);
        buttonBox.getChildren().addAll(add);
        buttonBox.setAlignment(Pos.CENTER);
        
        VBox finalBox = new VBox(20);
        finalBox.getChildren().addAll(titleBox, authorBox, publisherBox, yearBox, buttonBox, library);
        
         Scene scene = new Scene(finalBox, 400, 400);
        
        primaryStage.setTitle("Kenneth's Little Free Library");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
