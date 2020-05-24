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

public class AtutalasController {
    private User user = new User();
    public void initUser(User user){
        this.user = user;
    }

    public void megse(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
        Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage2.setScene(new Scene(root));
        stage2.show();
    }
    @FXML
    private TextField szamlaszamInput;
    @FXML
    private TextField osszegInput;
    public void atutalas(ActionEvent actionEvent) throws JAXBException, IOException {
        if(szamlaszamInput.getText().isEmpty() || osszegInput.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText(null);
            alert.setContentText("A mezők nem lehetnek üresek!");
            alert.showAndWait();
        }else{
            atutalas_(user.getAccountNumber(),szamlaszamInput.getText(), Integer.parseInt(osszegInput.getText()));

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
            Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage2.setScene(new Scene(root));
            stage2.show();
        }
    }

    private boolean atutalas_(String ownerAccountNumber, String accountNumber, int ammount) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Accounts.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Accounts Accounts = (Accounts) unmarshaller.unmarshal(new File("accounts.xml"));
        List<Account> accountList = Accounts.getAccounts();
        for (Account account : accountList)
        {
            if(account.getAccountNumber().equals(ownerAccountNumber) ){
                account.setAccountBalance(account.getAccountBalance()-ammount);
                Marshaller marshaller = jaxbContext.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(Accounts, new File("accounts.xml"));
            }else if(account.getAccountNumber().equals(accountNumber)){
                account.setAccountBalance(account.getAccountBalance()+ammount);
                Marshaller marshaller = jaxbContext.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                marshaller.marshal(Accounts, new File("accounts.xml"));
            }
        }
        return true;
    }
}
