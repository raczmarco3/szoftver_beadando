package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import modell.User;
import modell.Users;
import modell.Worker;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WorkerLoggedInController {
    @FXML public ListView new_ = new ListView();
    private Worker worker;

    public void setLoggedin(Worker worker){
        this.worker=worker;
    }

    public void newRegistrationList(List<User> users) throws JAXBException {
       /*ObservableList<User> items = FXCollections.observableArrayList ();
        items.addAll(users);
        newregistration.setItems(items);
        */
        //newregistration.getItems().addAll(users);
        new_.getItems().addAll(users);
    }

    public WorkerLoggedInController() throws JAXBException {
       newRegistrationList(getAllUnApprovedUser());
    }

    private List<User> getAllUnApprovedUser() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));
        List<User> userList = users.getUsers();
        List<User> unApprovedUsers = new ArrayList();

        for (User user : userList)
        {
            Boolean state = user.getApprovedRegistration();
            if(state == false){
                unApprovedUsers.add(user);
            }
        }
        return unApprovedUsers;
    }
}
