package modell;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class Worker {
    private int WorkerId;
    private String FirstName;
    private String LastName;
    @Setter(AccessLevel.NONE)
    private LocalDate Birth;
    private String Password;

    public Worker(int birthYear, int birthMonth, int birthDay){
        this.Birth = LocalDate.of(birthYear, birthMonth, birthDay);
    }
}
