package lk.IJSE.hostel.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class reservationController {
    @FXML
    private Button tblBackBtn;

    @FXML
    private AnchorPane root;
    @FXML
    private TableColumn<?, ?> tbl_id;

    @FXML
    private TableColumn<?, ?> tbl_date;

    @FXML
    private TableColumn<?, ?> tbl_name;

    @FXML
    private TableColumn<?, ?> tblRoom_type_id;

    @FXML
    private TableColumn<?, ?> tbl_states;

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
