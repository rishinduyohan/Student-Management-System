package controller;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AddStudentController {

    public TextField txtBatchNo;
    public TextField txtNic;
    public TextField txtName;
    public Group CheckLecture;

    public void btnAddOnAction(ActionEvent actionEvent) {
        System.out.println(txtBatchNo.getText()+" "+txtNic.getText()+" "+txtName.getText());
        clearText();
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
        System.exit(0);
    }
    private void clearText(){
        txtBatchNo.setText("");
        txtNic.setText("");
        txtName.setText("");
    }
}
