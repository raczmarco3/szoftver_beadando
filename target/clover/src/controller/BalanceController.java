/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
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
public class BalanceController {public static class __CLR4_4_11c1ckala4e88{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,73,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private User user = new User();
    public void initUser(User user){try{__CLR4_4_11c1ckala4e88.R.inc(48);
        __CLR4_4_11c1ckala4e88.R.inc(49);this.user = user;
    }finally{__CLR4_4_11c1ckala4e88.R.flushNeeded();}}
    @FXML
    private Label balanceammount;

    public void setLabel() throws JAXBException {try{__CLR4_4_11c1ckala4e88.R.inc(50);
        __CLR4_4_11c1ckala4e88.R.inc(51);balanceammount.setText(getBalance());
    }finally{__CLR4_4_11c1ckala4e88.R.flushNeeded();}}
    private String getBalance() throws JAXBException {try{__CLR4_4_11c1ckala4e88.R.inc(52);
        __CLR4_4_11c1ckala4e88.R.inc(53);log.info("Valaki lek\u00e9rdezte az egyenleg\u00e9t");
        __CLR4_4_11c1ckala4e88.R.inc(54);JAXBContext jaxbContext = JAXBContext.newInstance(Accounts.class);
        __CLR4_4_11c1ckala4e88.R.inc(55);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        __CLR4_4_11c1ckala4e88.R.inc(56);Accounts Accounts = (Accounts) unmarshaller.unmarshal(new File("accounts.xml"));
        __CLR4_4_11c1ckala4e88.R.inc(57);List<Account> accountList = Accounts.getAccounts();
        __CLR4_4_11c1ckala4e88.R.inc(58);for (Account account : accountList)
        {{
            __CLR4_4_11c1ckala4e88.R.inc(59);if((((account.getAccountNumber().equals(user.getAccountNumber()) )&&(__CLR4_4_11c1ckala4e88.R.iget(60)!=0|true))||(__CLR4_4_11c1ckala4e88.R.iget(61)==0&false))){{
                __CLR4_4_11c1ckala4e88.R.inc(62);return String.valueOf(account.getAccountBalance());
            }
        }}
        }__CLR4_4_11c1ckala4e88.R.inc(63);return "hiba";
    }finally{__CLR4_4_11c1ckala4e88.R.flushNeeded();}}
    public void megse(ActionEvent actionEvent) throws IOException {try{__CLR4_4_11c1ckala4e88.R.inc(64);
        __CLR4_4_11c1ckala4e88.R.inc(65);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
        __CLR4_4_11c1ckala4e88.R.inc(66);Parent root = fxmlLoader.load();
        __CLR4_4_11c1ckala4e88.R.inc(67);fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
        __CLR4_4_11c1ckala4e88.R.inc(68);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_11c1ckala4e88.R.inc(69);stage2.setScene(new Scene(root));
        __CLR4_4_11c1ckala4e88.R.inc(70);stage2.show();
    }finally{__CLR4_4_11c1ckala4e88.R.flushNeeded();}}

    public BalanceController() throws JAXBException {try{__CLR4_4_11c1ckala4e88.R.inc(71);
       __CLR4_4_11c1ckala4e88.R.inc(72);setLabel();
    }finally{__CLR4_4_11c1ckala4e88.R.flushNeeded();}}
}
