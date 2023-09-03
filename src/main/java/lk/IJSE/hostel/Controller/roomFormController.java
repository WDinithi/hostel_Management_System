package lk.IJSE.hostel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class roomFormController {

    @FXML
    private Button tblBackBtn;

    @FXML
    private AnchorPane root;
    @FXML
    private TableColumn<?, ?> tblRoomTypeId;

    @FXML
    private TableColumn<?, ?> tbl_Room_Type;

    @FXML
    private TableColumn<?, ?> tbl_Key_Money;

    @FXML
    private TableColumn<?, ?> tbl_qty;

    @FXML
    private TextField searchId;

    @FXML
    private Button tblAddBtn;

    @FXML
    private Button tblUpdateBtn;

    @FXML
    private Button tblDeleteBtn;

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
