/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author vadimzubchenko
 */

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private PasswordField password_field;

    @FXML
    private TextField login_field;

    @FXML
    private Button signinButton;

    @FXML
    private Button regButton;

    void Controller(ActionEvent event) {
        
    }

    void initialize() {
        signinButton.onActionProperty();
        System.out.println("You have pressed Enter button");
    }

}

