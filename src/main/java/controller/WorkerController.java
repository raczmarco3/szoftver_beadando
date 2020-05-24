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
import jaxb.JAXBHelper;
import lombok.extern.slf4j.Slf4j;
import main.Main;
import modell.User;
import modell.Users;
import modell.Worker;
import modell.Workers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
@Slf4j
public class WorkerController {

    @FXML private javafx.scene.control.Button closeButton;
    public void back_to_main(ActionEvent actionEvent) throws IOException {
        log.info("Vissza a menübe!");
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/main.fxml"));
        primaryStage.setTitle("Banki Alkalmazás");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    @FXML private javafx.scene.control.Button bejelentkezesButton;
    @FXML
    private TextField emailField;
    @FXML
    private TextField jelszoField;
    public void bejelentkezes(ActionEvent actionEvent) throws IOException, JAXBException {
        if(emailField.getText().isEmpty() || jelszoField.getText().isEmpty()){
            log.error("A dolgozo bejelentkezési adatai üresek!");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A mezők nem lehetnek üresek!");
            alert.showAndWait();
        }else{
            String email = emailField.getText();
            String password = jelszoField.getText();
            if(login(email, password)){
                Worker worker = new Worker();
                worker = LoggedInWorker(email);
                if(worker.getEmail().isEmpty()){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Hiba");
                    alert.setHeaderText(null);
                    alert.setContentText("A bejelentkezés nem sikerült!");
                    alert.showAndWait();
                }else{
                    /*Stage stage = (Stage) bejelentkezesButton.getScene().getWindow();
                    stage.close();
                        */
                    WorkerLoggedInController InitData = new WorkerLoggedInController();
                    InitData.setLoggedin(worker);
                    log.info("Dolgozol bejelentkezes sikeres!");
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/workerloggedin.fxml"));
                    Parent root = fxmlLoader.load();
                    Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    stage2.setScene(new Scene(root));
                    stage2.show();
                }
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Hiba");
                alert.setHeaderText(null);
                alert.setContentText("A bejelentkezés nem sikerült!");
                alert.showAndWait();
            }
        }
    }
    private boolean login(String email, String password) throws FileNotFoundException, JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Workers.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Workers workers = (Workers) unmarshaller.unmarshal(new File("workers.xml"));
        List<Worker> workerList = workers.getWorkers();

        for (Worker worker : workerList)
        {
            if(worker.getEmail().equals(email)  &&  worker.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    private Worker LoggedInWorker(String email) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Workers.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Workers workers = (Workers) unmarshaller.unmarshal(new File("workers.xml"));
        List<Worker> workerList = workers.getWorkers();
        Worker worker = new Worker();

        for (Worker worker_ : workerList)
        {
            if(worker_.getEmail().equals(email)){
                worker = worker_;
                return worker;
            }
        }
            return worker;
    }
}
