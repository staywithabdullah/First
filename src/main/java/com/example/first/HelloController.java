package com.example.first;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome here!");
        System.out.println("Welcome");
        System.out.println("Welcome");
    }
}