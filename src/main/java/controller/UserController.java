package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.Main;
import modell.User;
import modell.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class UserController {
    @FXML
    private javafx.scene.control.Button closeButton;
    @FXML
    private javafx.scene.control.Button registrationButton;
    public void back_to_main(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/main.fxml"));
        primaryStage.setTitle("Banki Alkalmazás");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void registration(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) registrationButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/registration.fxml"));
        primaryStage.setTitle("Banki Alkalmazás");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    @FXML
    private TextField emailInput;
    @FXML
    private TextField pwInput;
    public void bejelentkezes(ActionEvent actionEvent) throws IOException, JAXBException {
        if (emailInput.getText().isEmpty() || pwInput.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A mezők nem lehetnek üresek!");
            alert.showAndWait();
        } else {
            String email = emailInput.getText();
            String password = pwInput.getText();
            if (login(email, password)) {
                User user;
                user = LoggedInUser(email);
                if (user.getEmail().isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Hiba");
                    alert.setHeaderText(null);
                    alert.setContentText("A bejelentkezés nem sikerült!");
                    alert.showAndWait();
                } else {
                    /*Stage stage = (Stage) bejelentkezesButton.getScene().getWindow();
                    stage.close();
                        */
                    /*UserLoggedInController InitData = new UserLoggedInController();
                    InitData.setLoggedin(user);*/

                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
                    Parent root = fxmlLoader.load();
                    fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
                    Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    stage2.setScene(new Scene(root));
                    stage2.show();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hiba");
                alert.setHeaderText(null);
                alert.setContentText("A bejelentkezés nem sikerült!");
                alert.showAndWait();
            }
        }
    }

    private boolean login(String email, String password) throws FileNotFoundException, JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));
        List<User> userList = users.getUsers();
        for (User user : userList)
        {
            if(user.getEmail().equals(email)  &&  user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    private User LoggedInUser(String email) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));
        List<User> userList = users.getUsers();
        User user = new User();

        for (User user_ : userList)
        {
            if(user_.getEmail().equals(email)){
                user = user_;
                return user;
            }
        }
        return user;
    }
}
