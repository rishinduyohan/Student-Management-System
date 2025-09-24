package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public TextField txtUsername;
    public PasswordField txtPassword;
    Stage stage = new Stage();

    public void btnLoginOnAction(ActionEvent actionEvent) {
        System.out.println("Username : "+txtUsername.getText()+"\nPassword : "+txtPassword.getText());
        txtUsername.setText("");
        txtPassword.setText("");
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/StudentManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
}
