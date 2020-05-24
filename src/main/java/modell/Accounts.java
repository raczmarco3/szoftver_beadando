package modell;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "accounts")
public class Accounts {
    private List<Account> Accounts;

    public List<Account> getAccounts() {
        return Accounts;
    }

    @XmlElement(name = "account")
    public void setAccounts(List<Account> Accounts) {
        this.Accounts = Accounts;
    }

}
