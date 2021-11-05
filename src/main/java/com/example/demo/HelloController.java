package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {
    private int i;
    @FXML
    private Label welcomeText;

    @FXML
    private Button HelloButton;

    @FXML
    private TextField TestField;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void onTestButtonclick() { welcomeText.setText("Hetta riggar yay!");}

    @FXML
    private void onType() { welcomeText.setText(i + " Trýst á knappin!!!");
    i++;
    }

    @FXML
    private void onMouseClick() { welcomeText.setText(i + "");
        HelloButton.setText(i + "   hallo");
    i--;
    }

    @FXML
    private void onSubmitClick() {
        welcomeText.setText(TestField.getText());

    }
}