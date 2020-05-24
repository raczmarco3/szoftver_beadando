/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import main.Main;
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

@Slf4j
public class BefizetesController {public static class __CLR4_4_12121kala4e8z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,116,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private User user = new User();
    public void initUser(User user){try{__CLR4_4_12121kala4e8z.R.inc(73);
        __CLR4_4_12121kala4e8z.R.inc(74);this.user = user;
    }finally{__CLR4_4_12121kala4e8z.R.flushNeeded();}}
    @FXML
    private javafx.scene.control.Button megseButton;
    @FXML
    private javafx.scene.control.Button befizetesButton;
    @FXML
    private TextField ammount;
    public void befizetes(ActionEvent actionEvent) throws JAXBException, IOException {try{__CLR4_4_12121kala4e8z.R.inc(75);
        __CLR4_4_12121kala4e8z.R.inc(76);if((((ammount.getText().isEmpty())&&(__CLR4_4_12121kala4e8z.R.iget(77)!=0|true))||(__CLR4_4_12121kala4e8z.R.iget(78)==0&false))){{
            __CLR4_4_12121kala4e8z.R.inc(79);log.error("\u00dcres befizet\u00e9s mez\u0151!");
            __CLR4_4_12121kala4e8z.R.inc(80);Alert alert = new Alert(Alert.AlertType.ERROR);
            __CLR4_4_12121kala4e8z.R.inc(81);alert.setTitle("Hiba");
            __CLR4_4_12121kala4e8z.R.inc(82);alert.setHeaderText(null);
            __CLR4_4_12121kala4e8z.R.inc(83);alert.setContentText("A mez\u0151 nem lehet \u00fcresek!");
            __CLR4_4_12121kala4e8z.R.inc(84);alert.showAndWait();
        }}else{{
            __CLR4_4_12121kala4e8z.R.inc(85);int ammount_ = Integer.parseInt(ammount.getText());
            __CLR4_4_12121kala4e8z.R.inc(86);befizetes_(ammount_, user.getAccountNumber());
            __CLR4_4_12121kala4e8z.R.inc(87);log.info("Sikeres befizet\u00e9s a sz\u00e1ml\u00e1ra!");

            __CLR4_4_12121kala4e8z.R.inc(88);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
            __CLR4_4_12121kala4e8z.R.inc(89);Parent root = fxmlLoader.load();
            __CLR4_4_12121kala4e8z.R.inc(90);fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
            __CLR4_4_12121kala4e8z.R.inc(91);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_4_12121kala4e8z.R.inc(92);stage2.setScene(new Scene(root));
            __CLR4_4_12121kala4e8z.R.inc(93);stage2.show();
        }
    }}finally{__CLR4_4_12121kala4e8z.R.flushNeeded();}}

    public boolean befizetes_(int ammount, String AccountNumber) throws JAXBException {try{__CLR4_4_12121kala4e8z.R.inc(94);
        __CLR4_4_12121kala4e8z.R.inc(95);JAXBContext jaxbContext = JAXBContext.newInstance(Accounts.class);
        __CLR4_4_12121kala4e8z.R.inc(96);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        __CLR4_4_12121kala4e8z.R.inc(97);Accounts Accounts = (Accounts) unmarshaller.unmarshal(new File("accounts.xml"));
        __CLR4_4_12121kala4e8z.R.inc(98);List<Account> accountList = Accounts.getAccounts();

        __CLR4_4_12121kala4e8z.R.inc(99);for (Account account : accountList)
        {{
            __CLR4_4_12121kala4e8z.R.inc(100);if((((account.getAccountNumber().equals(AccountNumber) )&&(__CLR4_4_12121kala4e8z.R.iget(101)!=0|true))||(__CLR4_4_12121kala4e8z.R.iget(102)==0&false))){{
                __CLR4_4_12121kala4e8z.R.inc(103);account.setAccountBalance(account.getAccountBalance() + ammount);
                __CLR4_4_12121kala4e8z.R.inc(104);Marshaller marshaller = jaxbContext.createMarshaller();
                __CLR4_4_12121kala4e8z.R.inc(105);marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                __CLR4_4_12121kala4e8z.R.inc(106);marshaller.marshal(Accounts, new File("accounts.xml"));
                __CLR4_4_12121kala4e8z.R.inc(107);return true;
            }
        }}

        }__CLR4_4_12121kala4e8z.R.inc(108);return false;
    }finally{__CLR4_4_12121kala4e8z.R.flushNeeded();}}

    public void megse(ActionEvent actionEvent) throws IOException {try{__CLR4_4_12121kala4e8z.R.inc(109);
        __CLR4_4_12121kala4e8z.R.inc(110);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
        __CLR4_4_12121kala4e8z.R.inc(111);Parent root = fxmlLoader.load();
        __CLR4_4_12121kala4e8z.R.inc(112);fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
        __CLR4_4_12121kala4e8z.R.inc(113);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_12121kala4e8z.R.inc(114);stage2.setScene(new Scene(root));
        __CLR4_4_12121kala4e8z.R.inc(115);stage2.show();
    }finally{__CLR4_4_12121kala4e8z.R.flushNeeded();}}
}
