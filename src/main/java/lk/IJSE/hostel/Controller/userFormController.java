package lk.IJSE.hostel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class userFormController {

    @FXML
    private Button tblBackBtn;

    @FXML
    private AnchorPane root;
    @FXML
    private PasswordField passwordId;

    @FXML
    private TextField userNameId;

    @FXML
    private TextField userNameId1;

    @FXML
    private TextField userRoleId;

    @FXML
    private PasswordField passwordIduser;

    @FXML
    private Button changeBtn;

    @FXML
    private Button updateBtn;

    @FXML
    private Button DeleteBtn;

    @FXML
    void tblBackBtnOnAction(ActionEvent event) {
        try {
            root.getChildren().clear();
            root.getChildren().add(FXMLLoader.load(getClass().getResource("/view/dashbord.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @FXML
    void DeleteBtnOnAction(ActionEvent event) {

    }

    @FXML
    void UserpasswordIdOnAction(ActionEvent event) {

    }

    @FXML
    void changeBtnOnAction(ActionEvent event) {

    }

    @FXML
    void passwordIdOnAction(ActionEvent event) {

    }

    @FXML
    void updateBtnOnAction(ActionEvent event) {

    }

    @FXML
    void userNameId(ActionEvent event) {

    }

    @FXML
    void userNameIdOnAction(ActionEvent event) {

    }

    @FXML
    void userRoleIdOnAction(ActionEvent event) {

    }

}
