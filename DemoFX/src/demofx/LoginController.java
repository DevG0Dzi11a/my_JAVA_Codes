/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demofx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sabbir
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userText;
    @FXML
    private PasswordField passText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void loginAction(ActionEvent event) throws IOException {
        String user = "kamal";
        String pass = "12345";
        String u = userText.getText();
        String p = passText.getText();

        if (user.equals(u) && pass.equals(p)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Homepage.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Homepage");
            stage.show();
        }
        else {
            System.out.println("Running");
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("WARNING!");
            alert.setContentText("Wrong Username or Password");
            alert.showAndWait();
        }
    }

}
