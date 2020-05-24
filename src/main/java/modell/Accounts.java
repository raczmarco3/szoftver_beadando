package modell;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 *
 * Class represents the List of accounts
 */
@XmlRootElement(name = "accounts")
public class Accounts {
    private List<Account> Accounts;

    /**
     *
     * @return every account
     */
    public List<Account> getAccounts() {
        return Accounts;
    }

    /**
     * @param Accounts
     * set the accounts
     */
    @XmlElement(name = "account")
    public void setAccounts(List<Account> Accounts) {
        this.Accounts = Accounts;
    }

}
