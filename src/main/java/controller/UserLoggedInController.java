package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modell.User;

import java.io.IOException;

public class UserLoggedInController {
    private User user = new User();
    public void setLoggedin(User user){
        this.user=user;
    }

    @FXML
    private javafx.scene.control.Button penzBefizetesButton;
    public void penzbefizetes(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/befizetes.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<BefizetesController>getController().initUser(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }

    public void penzkivetel(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/kivetel.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<KivetelController>getController().initUser(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }

    public void egyenleg(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/egyenleg.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<BalanceController>getController().initUser(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }

    public void atutalas(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/atutalas.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<AtutalasController>getController().initUser(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }

    public void uzenetek(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/usermsgs.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<UserMessageController>getController().initUser(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }

}
