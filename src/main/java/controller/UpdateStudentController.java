package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UpdateStudentController {
    public TextField txtStudentId;
    public TextField txtNic;
    public TextField txtName;
    public Button btnUpdateStu;
    Stage stage = new Stage();

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/StudentManagement.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
}
