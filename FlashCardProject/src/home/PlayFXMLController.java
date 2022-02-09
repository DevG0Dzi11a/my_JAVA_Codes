/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sabbir
 */
public class PlayFXMLController implements Initializable {

    FileChooser fileChooser = new FileChooser();
    ArrayList<String> string = new ArrayList<String>();
    private int count = 1;
    @FXML
    private Button showAns;
    @FXML
    private Button openFile;
    @FXML
    private TextField printbox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fileChooser.setInitialDirectory(new File("F://JavaProgramming//FlashCardProject//src//cards"));

    }

    @FXML
    private void showAction(ActionEvent event) {
        if (count != string.size()) {
            if (count % 2 == 0 || count == 0) {
                showAns.setText("Show Answer");
                printbox.setText(string.get(count));
                count++;

            } else {
                showAns.setText("Next Card");
                printbox.setText(string.get(count));
                count++;
            }
        }
        else
        {
            showAns.setDisable(true);
            printbox.setDisable(true);
        }
    }

    @FXML
    private void openAction(ActionEvent event) {
        try {
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            File myObj = fileChooser.showOpenDialog(primaryStage);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                string.add(data);
            }
            printbox.setText(string.get(0));
            showAns.setDisable(false);
            printbox.setDisable(false);
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
