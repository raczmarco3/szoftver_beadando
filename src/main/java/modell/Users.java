package modell;

import modell.User;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Random;

@XmlRootElement(name = "users")
public class Users {

    private List<User> Users;

    public List<User> getUsers() {
        return Users;
    }

    @XmlElement(name = "user")
    public void setUsers(List<User> Users) {
        this.Users = Users;
    }

    public int newUserId(List<User> Users){
        int id=0;
        for (User user : Users)
        {
            if(user.getUserId()>id){
                id=user.getUserId();
            }
        }
        return id+1;
    }
    public String generateAccountNumber(){
        String accountNumber = "ser-";
        Random rand = new Random();
        int rand_int = rand.nextInt(1000);
        accountNumber = accountNumber + rand_int;
        if(checkAccountNumber(accountNumber)) {
            return accountNumber;
        }else{
            generateAccountNumber();
        }
        return "Hiba";
    }
    private boolean checkAccountNumber(String accountNumber){
        for (User user : Users)
        {
            if(user.getAccountNumber() == accountNumber){
                return false;
            }
        }
        return true;
    }
}
