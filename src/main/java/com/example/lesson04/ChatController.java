package com.example.lesson04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {
    @FXML
    private TextField answerFiled;
    @FXML
    private TextArea tipArea;

    public void onClickCheckButton(ActionEvent actionEvent) {
        final String answer = answerFiled.getText();
        if (!answer.isEmpty() && answer != null)
            tipArea.appendText(answer + "\n");
        answerFiled.clear();
    }
}