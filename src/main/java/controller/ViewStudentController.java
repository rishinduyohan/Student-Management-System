package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ViewStudentController {
    public TextField txtStuId;
    public TextField txtNic;
    public TextField txtName;
    public TextField txtPrfMarks;
    public TextField txtDbmsMarks;
    public TextField txtGPA;
    public TextField txtLecMode;

    ViewStudentController(){
        System.out.println("Student ID : "+txtStuId.getText()+"\nNIC : "+txtNic.getText()+"\nName : "+txtName.getText()+"\nPRF : "+txtPrfMarks.getText()+"\nDBMS : "+txtDbmsMarks.getText()+"\nGPA : "+txtGPA.getText()+"\nLec Mode : "+txtLecMode.getText());
    }
    public void btnCancelOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
}
