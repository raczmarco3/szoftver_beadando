package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import modell.User;

import java.io.IOException;

public class RegistrationController {
    @FXML
    private javafx.scene.control.Button closeButton;
    public void back_to_main(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/user.fxml"));
        primaryStage.setTitle("Banki Alkalmazás");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    @FXML
    private TextField birthDateField;
    @FXML
    private TextField birthMonthField;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField birthDayField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private javafx.scene.control.Button registrationButton;
    public void registration(ActionEvent actionEvent) throws IOException {
        if(birthDateField.getText().isEmpty() || birthMonthField.getText().isEmpty() ||
                firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() ||
                birthDayField.getText().isEmpty() || emailField.getText().isEmpty() ||
                passwordField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A mezők nem lehetnek üresek!");
            alert.showAndWait();
        }else if(!birthDateField.getText().isEmpty() && (Integer.parseInt(birthDateField.getText())<1900 || Integer.parseInt(birthDateField.getText())>2020)){
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hiba");
                alert.setHeaderText(null);
                alert.setContentText("A születési év nem lehet kisebb,mint 1900 és nem lehet nagyobb,mint 2020");
                alert.showAndWait();

        }else if(!birthMonthField.getText().isEmpty() && (Integer.parseInt(birthMonthField.getText())<1 || Integer.parseInt(birthMonthField.getText())>12)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A hónap csak 1 és 12 közötti szám lehet!");
            alert.showAndWait();

        }else if(!birthDayField.getText().isEmpty() && (Integer.parseInt(birthDayField.getText())<1 || Integer.parseInt(birthDayField.getText())>31)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A nap csak 1 és 31 közötti szám lehet!");
            alert.showAndWait();
        }else{
            int birthDateField_ = Integer.parseInt(birthDateField.getText());
            int birthMonthField_ = Integer.parseInt(birthMonthField.getText());
            int birthDayField_ = Integer.parseInt(birthDayField.getText());
            User user = new User(birthDateField_, birthMonthField_, birthDayField_);
            
            System.out.println(user.getBirth());

            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/user.fxml"));
            primaryStage.setTitle("Banki Alkalmazás");
            primaryStage.setResizable(false);
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }
    }
}
