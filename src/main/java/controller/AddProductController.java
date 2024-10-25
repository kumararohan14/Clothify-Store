package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class AddProductController {

    @FXML
    private TableColumn<?, ?> colBarcode;

    @FXML
    private TableColumn<?, ?> colCode;

    @FXML
    private TableColumn<?, ?> colCostPrice;

    @FXML
    private TableColumn<?, ?> colDes;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colRetailPrice;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private JFXComboBox<?> comBrand;

    @FXML
    private JFXComboBox<?> comCategory;

    @FXML
    private JFXComboBox<?> comColour;

    @FXML
    private JFXComboBox<?> comSize;

    @FXML
    private JFXComboBox<?> comSupplier;

    @FXML
    private JFXComboBox<?> comStatus;

    @FXML
    private TextField txtBarcode;

    @FXML
    private TextField txtCostPrice;

    @FXML
    private JFXTextArea txtDes;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtQty;

    @FXML
    private TextField txtRetailPrice;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnBrandFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnCategoryFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnColourFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnPosFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnProductFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnSearchFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnSizetFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnSupplierFormOnAction(MouseEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

}
