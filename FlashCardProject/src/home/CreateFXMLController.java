/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sabbir
 */
public class CreateFXMLController implements Initializable {

    FileChooser fileChooser = new FileChooser();
    ArrayList<String> string = new ArrayList<String>();
    @FXML
    private TextField quesField;
    @FXML
    private TextField ansField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fileChooser.setInitialDirectory(new File("F://JavaProgramming//FlashCardProject//src//cards"));
        fileChooser.setInitialFileName("Card1.txt");
        // TODO
    }

    @FXML
    private void nextAction(ActionEvent event) {
    

    }

    @FXML
    private void saveAction(ActionEvent event) {
        File file = fileChooser.showSaveDialog(new Stage());
        if (file != null) {
            try {
                PrintWriter printWriter = new PrintWriter(file);
                for (int i = 0; i < string.size(); i += 2) {
                    printWriter.write(string.get(i) + "\n" + string.get(i + 1) + "\n");
                }
                printWriter.close();
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }

        }
    }

    @FXML
    private void homeAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainFXML.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setTitle("FlashCard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


