package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Main;

import java.io.IOException;

public class MainController {

    @FXML
    private javafx.scene.control.Button workerButton;
    @FXML private javafx.scene.control.Button userButton;

    public void worker_select(ActionEvent actionEvent) throws Exception{

        Stage stage0 = (Stage) workerButton.getScene().getWindow();
        stage0.close();

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/worker.fxml"));
        stage.setTitle("Banki Alkalmazás");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void user_select(ActionEvent actionEvent) throws IOException {

        Stage stage0 = (Stage) userButton.getScene().getWindow();
        stage0.close();

        Stage stage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/user.fxml"));
        stage.setTitle("Banki Alkalmazás");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
