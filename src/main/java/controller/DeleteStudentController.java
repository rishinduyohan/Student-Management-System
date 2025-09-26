package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class DeleteStudentController {
    public TextField txtStuId;
    public TextField txtNic;
    public TextField txtName;
    public TextField txtPrfMarks;
    public TextField txtDbmsMarks;
    public TextField txtGPA;
    public TextField txtLecMode;

    public void btnDeleteOnAction(ActionEvent actionEvent) {
        System.out.println(txtStuId.getText()+" Student deleted successfully! ");
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
}
