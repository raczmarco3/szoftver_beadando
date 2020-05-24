package modell;

import controller.LocalDateAdapter;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Class represents a User
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class User {
    private int UserId;
    private String FirstName;
    private String LastName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    @Setter(AccessLevel.NONE)
    private LocalDate Birth;
    private String Password;
    private String Email;
    private String AccountNumber;
    private Boolean ApprovedRegistration = false;

    /**
     * @param birthYear year of birth
     * @param birthMonth month of birth
     * @param birthDay day of birth
     *  the constructor sets the birth
     */
    public User(int birthYear, int birthMonth, int birthDay){
        this.Birth = LocalDate.of(birthYear, birthMonth, birthDay);
    }

    public User(){

    }
}
