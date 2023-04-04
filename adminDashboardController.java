package GlovoLivraison;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;



public class adminDashboardController implements Initializable{
    @FXML
    private AnchorPane main_form;

    @FXML
    private Button addProducts_addBtn;

    @FXML
    private TextField addProducts_brandName;

    @FXML
    private Button addProducts_btn;

    @FXML
    private Button addProducts_clearBtn;

    @FXML
    private TableColumn<?, ?> addProducts_col_brandName;

    @FXML
    private TableColumn<?, ?> addProducts_col_price;

    @FXML
    private TableColumn<?, ?> addProducts_col_productName;

    @FXML
    private TableColumn<?, ?> addProducts_col_produitID;

    @FXML
    private TableColumn<?, ?> addProducts_col_status;

    @FXML
    private Button addProducts_deleteBtn;

    @FXML
    private AnchorPane addProducts_form;

    @FXML
    private TextField addProducts_price;

    @FXML
    private TextField addProducts_productID;

    @FXML
    private TextField addProducts_productName;

    @FXML
    private TextField addProducts_search;

    @FXML
    private ComboBox<?> addProducts_status;

    @FXML
    private TableView<?> addProducts_tableView;

    @FXML
    private Button addProducts_updateBtn;

    @FXML
    private Button close;

    @FXML
    private Label dashboard_IncomeToday;

    @FXML
    private Label dashboard_activeEmployees;

    @FXML
    private Button dashboard_btn;

    @FXML
    private AreaChart<?, ?> dashboard_chart;

    @FXML
    private AnchorPane dashboard_form;

    @FXML
    private Label dashboard_totalIncome;

    @FXML
    private Button employees_btn;

    @FXML
    private Button employees_clearBtn;

    @FXML
    private TableColumn<?, ?> employees_col_date;

    @FXML
    private TableColumn<?, ?> employees_col_employeeID;

    @FXML
    private TableColumn<?, ?> employees_col_firstName;

    @FXML
    private TableColumn<?, ?> employees_col_gender;

    @FXML
    private TableColumn<?, ?> employees_col_lastName;

    @FXML
    private TableColumn<?, ?> employees_col_password;

    @FXML
    private Button employees_deleteBtn;

    @FXML
    private TextField employees_employeeID;

    @FXML
    private TextField employees_firstName;

    @FXML
    private AnchorPane employees_form;

    @FXML
    private ComboBox<?> employees_gender;

    @FXML
    private TextField employees_lastName;

    @FXML
    private TextField employees_password;

    @FXML
    private Button employees_saveBtn;

    @FXML
    private TableView<?> employees_tableView;

    @FXML
    private Button employees_updateBtn;

    @FXML
    private Button logout;

    @FXML
    private Button minimize;

    @FXML
    public Label username;
    public void close(){
        System.exit(0);
    }
    public void minimize(){
        Stage stage =(Stage)main_form.getScene().getWindow();

    }
    @Override
    public void initialize(URL Location, ResourceBundle resources){

    }

}

