package lk.IJSE.hostel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.awt.event.MouseEvent;
import java.io.IOException;

public class dashbordController {
    @FXML
    private AnchorPane root;

    @FXML
    private Button roomsBtn;

    @FXML
    private Button studentbtn;

    @FXML
    private Button reservationsBtn;

    @FXML
    private Button settingsBtn;

    @FXML
    private Label time;

    @FXML
    private AnchorPane keyMoney;

    @FXML
    private AnchorPane rooms;

    @FXML
    private AnchorPane student;

    @FXML
    void reservationsBtnOnAction(ActionEvent event) {
        try {
            root.getChildren().clear();
            root.getChildren().add(FXMLLoader.load(getClass().getResource("/view/reservation.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void roomsBtnOnAction(ActionEvent event) {
        try {
            root.getChildren().clear();
            root.getChildren().add(FXMLLoader.load(getClass().getResource("/view/roomForm.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void settingsBtnOnAction(ActionEvent event) {


    }

    @FXML
    void studentbtnOnAction(ActionEvent event) {
        try {
            root.getChildren().clear();
            root.getChildren().add(FXMLLoader.load(getClass().getResource("/view/studentForm.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void timeOnAction(MouseEvent event) {

    }

    public void timeOnAction(javafx.scene.input.MouseEvent mouseEvent) {

    }
}
