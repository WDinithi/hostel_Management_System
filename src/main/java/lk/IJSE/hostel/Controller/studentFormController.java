package lk.IJSE.hostel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class studentFormController {

    @FXML
    private Button tblBackBtn;

    @FXML
    private AnchorPane root;

    @FXML
    private TableColumn<?, ?> tbl_id;

    @FXML
    private TableColumn<?, ?> tbl_name;

    @FXML
    private TableColumn<?, ?> tbl_address;

    @FXML
    private TableColumn<?, ?> tbl_Contact_No;

    @FXML
    private TableColumn<?, ?> tbl_DOB;

    @FXML
    private TableColumn<?, ?> tbl_Gender;

    @FXML
    private TextField searchId;

    @FXML
    private Button tblAddBtn;

    @FXML
    private Button tblUpdateBtn;

    @FXML
    private Button tblDeleteBtn;

    @FXML
    private TextField searchId1;

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
    void tblAddBtnOnAction(ActionEvent event) {

    }

    @FXML
    void tblDeleteBtnOnAction(ActionEvent event) {

    }

    @FXML
    void tblUpdateBtnOnAction(ActionEvent event) {

    }

}
