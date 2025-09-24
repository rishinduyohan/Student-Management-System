package controller;

import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AddStudentController {

    public TextField txtBatchNo;
    public TextField txtNic;
    public TextField txtName;
    public RadioButton radioOnline;
    public RadioButton radioPhysical;
    public Group radioGroup;

    public void btnAddOnAction(ActionEvent actionEvent) {
        System.out.println(txtBatchNo.getText()+" "+txtNic.getText()+" "+txtName.getText()+" "+radioGroup.toString());
        clearText();
    }

    public void btnCancelOnAction(ActionEvent actionEvent) {
    }
    private void clearText(){
        txtBatchNo.setText("");
        txtNic.setText("");
        txtName.setText("");
    }
}
