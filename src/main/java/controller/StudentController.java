package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentController {
    Stage stage = new Stage();
    public void btnAddStuOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(""))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnUpdateStuOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(""))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnDeleteStuOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(""))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    public void btnViewStuOnAction(ActionEvent actionEvent) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource(""))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }
}
