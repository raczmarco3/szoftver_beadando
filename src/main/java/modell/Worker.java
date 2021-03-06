package modell;

import controller.LocalDateAdapter;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

/**
 * class represent a worker
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Worker {
    private int WorkerId;
    private String FirstName;
    private String LastName;
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
    @Setter(AccessLevel.NONE)
    private LocalDate Birth;
    private String Email;
    private String Password;

    /**
     *
     * @param birthYear year of birth
     * @param birthMonth month of birth
     * @param birthDay day of birth
     * the constructor sets the birth
     */
    public Worker(int birthYear, int birthMonth, int birthDay){
        this.Birth = LocalDate.of(birthYear, birthMonth, birthDay);
    }

    public Worker(){

    }
}
