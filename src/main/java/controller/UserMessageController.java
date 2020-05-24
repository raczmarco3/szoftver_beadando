package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import modell.User;

import java.io.IOException;
@Slf4j
public class UserMessageController {

    private User user = new User();
    public void initUser(User user){
        this.user = user;
    }
    public void back(ActionEvent actionEvent) throws IOException {
        log.info("Vissza a menübe!");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }
}
