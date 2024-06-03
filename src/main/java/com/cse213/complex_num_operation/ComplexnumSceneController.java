package com.cse213.complex_num_operation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplexnumSceneController {

    @FXML
    private TextField imgOf1stComplexNum;

    @FXML
    private TextField imgOf2ndComplexNum;

    @FXML
    private TextField realOf1stComplexNum;

    @FXML
    private TextField realOf2ndComplexNum;

    @FXML
    private Label resultlabel;
     ComplexNum c1, c2, c3;

    @FXML
    void addComplexNumButtonOnAction(ActionEvent event) {
        c1 = new ComplexNum(
                Integer.parseInt(realOf1stComplexNum.getText()),
                Integer.parseInt(imgOf1stComplexNum.getText())
        );

        c2 = new ComplexNum(
                Integer.parseInt(realOf2ndComplexNum.getText()),
                Integer.parseInt(realOf2ndComplexNum.getText())
        );
        c3 = c1.add(c2);
        resultlabel.setText(c3.toString());
    }

    @FXML
    void addSubtractNumButtonOnAction(ActionEvent event) {

    }

}

