/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package modell;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Class represent an account
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Account {
    private String AccountNumber;
    private int AccountBalance;
}
