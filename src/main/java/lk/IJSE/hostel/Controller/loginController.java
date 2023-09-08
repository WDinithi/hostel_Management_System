package lk.IJSE.hostel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class loginController {

    @FXML
    private AnchorPane root;

    @FXML
    private PasswordField password;

    @FXML
    private RadioButton passwordShowId;

    @FXML
    private Button loginId;

    @FXML
    private TextField userNameId;

    @FXML
    void loginIdOnAction(ActionEvent event) {
        String username = userNameId.getText();
        String password1 = password.getText();
        if (username.equalsIgnoreCase("dinithi") & password1.equalsIgnoreCase("1234")) {
            try {
                root.getChildren().clear();
                root.getChildren().add(FXMLLoader.load(getClass().getResource("/view/Dashbord.fxml")));

            } catch (IOException e) {
                e.printStackTrace();
                new Alert(Alert.AlertType.WARNING, "UserService Not Verified!!!").show();

            }
        }
        new Alert(Alert.AlertType.INFORMATION, "Login Successful").show();

    }


    @FXML
    void passwordOnAction(ActionEvent event) {

    }

    @FXML
    void passwordShowIdOnAction(ActionEvent event) {

    }

    @FXML
    void userNameIdOnAction(ActionEvent event) {

    }

}
