package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import modell.Account;
import modell.Accounts;
import modell.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class BalanceController {
    private User user = new User();
    public void initUser(User user){
        this.user = user;
    }
    @FXML
    private Label balanceammount;

    public void setLabel() throws JAXBException {
        balanceammount.setText(getBalance());
    }
    private String getBalance() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Accounts.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Accounts Accounts = (Accounts) unmarshaller.unmarshal(new File("accounts.xml"));
        List<Account> accountList = Accounts.getAccounts();
        for (Account account : accountList)
        {
            if(account.getAccountNumber().equals(user.getAccountNumber()) ){
                return String.valueOf(account.getAccountBalance());
            }
        }
        return "hiba";
    }
    public void megse(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }

    public BalanceController() throws JAXBException {
       setLabel();
    }
}
