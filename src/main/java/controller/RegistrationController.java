package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import main.Main;
import modell.Account;
import modell.Accounts;
import modell.User;
import jaxb.JAXBHelper;
import modell.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
@Slf4j
public class RegistrationController {
    @FXML
    private javafx.scene.control.Button closeButton;
    public void back_to_main(ActionEvent actionEvent) throws IOException {
        log.info("Vissza a menübe!");
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
    public void registration(ActionEvent actionEvent) throws IOException, JAXBException {
        if(birthDateField.getText().isEmpty() || birthMonthField.getText().isEmpty() ||
                firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() ||
                birthDayField.getText().isEmpty() || emailField.getText().isEmpty() ||
                passwordField.getText().isEmpty()){
            log.error("A regisztrációs adatok üresek!");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A mezők nem lehetnek üresek!");
            alert.showAndWait();
        }else if(!birthDateField.getText().isEmpty() && (Integer.parseInt(birthDateField.getText())<1900 || Integer.parseInt(birthDateField.getText())>2020)){
                 Alert alert = new Alert(Alert.AlertType.ERROR);
            log.error("Hibás évszám");
                alert.setTitle("Hiba");
                alert.setHeaderText(null);
                alert.setContentText("A születési év nem lehet kisebb,mint 1900 és nem lehet nagyobb,mint 2020");
                alert.showAndWait();

        }else if(!birthMonthField.getText().isEmpty() && (Integer.parseInt(birthMonthField.getText())<1 || Integer.parseInt(birthMonthField.getText())>12)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            log.error("hibás hónap");
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A hónap csak 1 és 12 közötti szám lehet!");
            alert.showAndWait();

        }else if(!birthDayField.getText().isEmpty() && (Integer.parseInt(birthDayField.getText())<1 || Integer.parseInt(birthDayField.getText())>31)){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            log.error("Hibás nap");
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A nap csak 1 és 31 közötti szám lehet!");
            alert.showAndWait();
        }else{
            int birthDateField_ = Integer.parseInt(birthDateField.getText());
            int birthMonthField_ = Integer.parseInt(birthMonthField.getText());
            int birthDayField_ = Integer.parseInt(birthDayField.getText());
            User user = new User(birthDateField_, birthMonthField_, birthDayField_);
            user.setPassword(passwordField.getText());
            user.setLastName(lastNameField.getText());
            user.setFirstName(firstNameField.getText());
            user.setEmail(emailField.getText());
            log.info("A regisztráció sikeres");
            //Users users_ = JAXBHelper.fromXML(Users.class, new FileInputStream("users.xml"));
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));

            JAXBContext jaxbContext2 = JAXBContext.newInstance(Accounts.class);
            Unmarshaller unmarshaller2 = jaxbContext2.createUnmarshaller();
            Accounts Accounts = (Accounts) unmarshaller2.unmarshal(new File("accounts.xml"));

            List<Account> accountList = Accounts.getAccounts();
            List<User> userList = users.getUsers();

            user.setUserId(users.newUserId(userList));
            user.setAccountNumber(users.generateAccountNumber());
            userList.add(user);
            users.setUsers(userList);
            Account newAccount = new Account();
            newAccount.setAccountBalance(0);
            newAccount.setAccountNumber(user.getAccountNumber());
            accountList.add(newAccount);
            Accounts.setAccounts(accountList);

            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(users, new File("users.xml"));

            Marshaller marshaller2 = jaxbContext2.createMarshaller();
            marshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller2.marshal(Accounts, new File("accounts.xml"));


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
