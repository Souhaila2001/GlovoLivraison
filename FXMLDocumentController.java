package GlovoLivraison;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable{

    @FXML
    private AnchorPane admin_form;

    @FXML
    private Hyperlink admin_hyperLink;

    @FXML
    private Button admin_loginBtn;

    @FXML
    private PasswordField admin_password;

    @FXML
    private TextField admin_username;

    @FXML
    private AnchorPane employee_form;

    @FXML
    private Hyperlink employee_hyperLink;

    @FXML
    private TextField employee_id;

    @FXML
    private Button employee_loginBtn;

    @FXML
    private PasswordField employee_password;

    @FXML
    private AnchorPane main_form;

    //DATABASE TOOLS
    private Connection connect ;
    private ResultSet result;
    private PreparedStatement prepare ;

    public void adminLogin(){
        String adminData ="SELECT * FORM admin WHERE username =? and password";
        connect =database.connectDb();
        try{

            Alert alert;
            // CHECK IF THE TEXTFIELDS ARE EMPTY OR

            if(admin_username.getText().isEmpty()
                    || admin_password.getText().isEmpty()){
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please fill all blank fields");
                alert.showAndWait();
            }else {

                prepare = connect.prepareStatement(adminData);
                prepare.setString(1, admin_username.getText());
                prepare.setString(2, admin_password.getText());
                result = prepare.executeQuery();

                if(result.next()){

                    alert = new Alert (Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Login !");
                    alert.showAndWait();
                    admin_loginBtn.getScene().getWindow().hide();


                    parent root = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);
                    Stage.setScene(scene);
                    Stage.show();

                }else{
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Wrong Username/Password");
                    alert.showAndWait();
                }
            }


        }catch (Exception e){e.printStackTrace();}
    }

    public void switchForm(ActionEvent event){
        if( event.getSource()== admin_hyperLink){
            admin_form.setVisible(false);
            employee_form.setVisible(true);
        }else if (event.getSource()==employee_hyperLink){
            admin_form.setVisible(true);
            employee_form.setVisible(false);
        }
    }

    public void close(){
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}




