/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import jaxb.JAXBHelper;
import modell.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
@Slf4j
public class RegistrationController {public static class __CLR4_4_15353kala4ebc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,270,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @FXML
    private javafx.scene.control.Button closeButton;
    public void back_to_main(ActionEvent actionEvent) throws IOException {try{__CLR4_4_15353kala4ebc.R.inc(183);
        __CLR4_4_15353kala4ebc.R.inc(184);log.info("Vissza a men\u00fcbe!");
        __CLR4_4_15353kala4ebc.R.inc(185);Stage stage = (Stage) closeButton.getScene().getWindow();
        __CLR4_4_15353kala4ebc.R.inc(186);stage.close();
        __CLR4_4_15353kala4ebc.R.inc(187);Stage primaryStage = new Stage();
        __CLR4_4_15353kala4ebc.R.inc(188);Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/user.fxml"));
        __CLR4_4_15353kala4ebc.R.inc(189);primaryStage.setTitle("Banki Alkalmaz\u00e1s");
        __CLR4_4_15353kala4ebc.R.inc(190);primaryStage.setResizable(false);
        __CLR4_4_15353kala4ebc.R.inc(191);primaryStage.setScene(new Scene(root));
        __CLR4_4_15353kala4ebc.R.inc(192);primaryStage.show();
    }finally{__CLR4_4_15353kala4ebc.R.flushNeeded();}}
    @FXML
    private TextField birthDateField;
    @FXML
    private TextField birthMonthField;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField birthDayField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField passwordField;
    @FXML
    private javafx.scene.control.Button registrationButton;
    public void registration(ActionEvent actionEvent) throws IOException, JAXBException {try{__CLR4_4_15353kala4ebc.R.inc(193);
        __CLR4_4_15353kala4ebc.R.inc(194);if((((birthDateField.getText().isEmpty() || birthMonthField.getText().isEmpty() ||
                firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() ||
                birthDayField.getText().isEmpty() || emailField.getText().isEmpty() ||
                passwordField.getText().isEmpty())&&(__CLR4_4_15353kala4ebc.R.iget(195)!=0|true))||(__CLR4_4_15353kala4ebc.R.iget(196)==0&false))){{
            __CLR4_4_15353kala4ebc.R.inc(197);log.error("A regisztr\u00e1ci\u00f3s adatok \u00fcresek!");
            __CLR4_4_15353kala4ebc.R.inc(198);Alert alert = new Alert(Alert.AlertType.ERROR);
            __CLR4_4_15353kala4ebc.R.inc(199);alert.setTitle("Hiba");
            __CLR4_4_15353kala4ebc.R.inc(200);alert.setHeaderText(null);
            __CLR4_4_15353kala4ebc.R.inc(201);alert.setContentText("A mez\u0151k nem lehetnek \u00fcresek!");
            __CLR4_4_15353kala4ebc.R.inc(202);alert.showAndWait();
        }}else {__CLR4_4_15353kala4ebc.R.inc(203);if((((!birthDateField.getText().isEmpty() && (Integer.parseInt(birthDateField.getText())<1900 || Integer.parseInt(birthDateField.getText())>2020))&&(__CLR4_4_15353kala4ebc.R.iget(204)!=0|true))||(__CLR4_4_15353kala4ebc.R.iget(205)==0&false))){{
                 __CLR4_4_15353kala4ebc.R.inc(206);Alert alert = new Alert(Alert.AlertType.ERROR);
            __CLR4_4_15353kala4ebc.R.inc(207);log.error("Hib\u00e1s \u00e9vsz\u00e1m");
                __CLR4_4_15353kala4ebc.R.inc(208);alert.setTitle("Hiba");
                __CLR4_4_15353kala4ebc.R.inc(209);alert.setHeaderText(null);
                __CLR4_4_15353kala4ebc.R.inc(210);alert.setContentText("A sz\u00fclet\u00e9si \u00e9v nem lehet kisebb,mint 1900 \u00e9s nem lehet nagyobb,mint 2020");
                __CLR4_4_15353kala4ebc.R.inc(211);alert.showAndWait();

        }}else {__CLR4_4_15353kala4ebc.R.inc(212);if((((!birthMonthField.getText().isEmpty() && (Integer.parseInt(birthMonthField.getText())<1 || Integer.parseInt(birthMonthField.getText())>12))&&(__CLR4_4_15353kala4ebc.R.iget(213)!=0|true))||(__CLR4_4_15353kala4ebc.R.iget(214)==0&false))){{
            __CLR4_4_15353kala4ebc.R.inc(215);Alert alert = new Alert(Alert.AlertType.ERROR);
            __CLR4_4_15353kala4ebc.R.inc(216);log.error("hib\u00e1s h\u00f3nap");
            __CLR4_4_15353kala4ebc.R.inc(217);alert.setTitle("Hiba");
            __CLR4_4_15353kala4ebc.R.inc(218);alert.setHeaderText(null);
            __CLR4_4_15353kala4ebc.R.inc(219);alert.setContentText("A h\u00f3nap csak 1 \u00e9s 12 k\u00f6z\u00f6tti sz\u00e1m lehet!");
            __CLR4_4_15353kala4ebc.R.inc(220);alert.showAndWait();

        }}else {__CLR4_4_15353kala4ebc.R.inc(221);if((((!birthDayField.getText().isEmpty() && (Integer.parseInt(birthDayField.getText())<1 || Integer.parseInt(birthDayField.getText())>31))&&(__CLR4_4_15353kala4ebc.R.iget(222)!=0|true))||(__CLR4_4_15353kala4ebc.R.iget(223)==0&false))){{
            __CLR4_4_15353kala4ebc.R.inc(224);Alert alert = new Alert(Alert.AlertType.ERROR);
            __CLR4_4_15353kala4ebc.R.inc(225);log.error("Hib\u00e1s nap");
            __CLR4_4_15353kala4ebc.R.inc(226);alert.setTitle("Hiba");
            __CLR4_4_15353kala4ebc.R.inc(227);alert.setHeaderText(null);
            __CLR4_4_15353kala4ebc.R.inc(228);alert.setContentText("A nap csak 1 \u00e9s 31 k\u00f6z\u00f6tti sz\u00e1m lehet!");
            __CLR4_4_15353kala4ebc.R.inc(229);alert.showAndWait();
        }}else{{
            __CLR4_4_15353kala4ebc.R.inc(230);int birthDateField_ = Integer.parseInt(birthDateField.getText());
            __CLR4_4_15353kala4ebc.R.inc(231);int birthMonthField_ = Integer.parseInt(birthMonthField.getText());
            __CLR4_4_15353kala4ebc.R.inc(232);int birthDayField_ = Integer.parseInt(birthDayField.getText());
            __CLR4_4_15353kala4ebc.R.inc(233);User user = new User(birthDateField_, birthMonthField_, birthDayField_);
            __CLR4_4_15353kala4ebc.R.inc(234);user.setPassword(passwordField.getText());
            __CLR4_4_15353kala4ebc.R.inc(235);user.setLastName(lastNameField.getText());
            __CLR4_4_15353kala4ebc.R.inc(236);user.setFirstName(firstNameField.getText());
            __CLR4_4_15353kala4ebc.R.inc(237);user.setEmail(emailField.getText());
            __CLR4_4_15353kala4ebc.R.inc(238);log.info("A regisztr\u00e1ci\u00f3 sikeres");
            //Users users_ = JAXBHelper.fromXML(Users.class, new FileInputStream("users.xml"));
            __CLR4_4_15353kala4ebc.R.inc(239);JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            __CLR4_4_15353kala4ebc.R.inc(240);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            __CLR4_4_15353kala4ebc.R.inc(241);Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));

            __CLR4_4_15353kala4ebc.R.inc(242);JAXBContext jaxbContext2 = JAXBContext.newInstance(Accounts.class);
            __CLR4_4_15353kala4ebc.R.inc(243);Unmarshaller unmarshaller2 = jaxbContext2.createUnmarshaller();
            __CLR4_4_15353kala4ebc.R.inc(244);Accounts Accounts = (Accounts) unmarshaller2.unmarshal(new File("accounts.xml"));

            __CLR4_4_15353kala4ebc.R.inc(245);List<Account> accountList = Accounts.getAccounts();
            __CLR4_4_15353kala4ebc.R.inc(246);List<User> userList = users.getUsers();

            __CLR4_4_15353kala4ebc.R.inc(247);user.setUserId(users.newUserId(userList));
            __CLR4_4_15353kala4ebc.R.inc(248);user.setAccountNumber(users.generateAccountNumber());
            __CLR4_4_15353kala4ebc.R.inc(249);userList.add(user);
            __CLR4_4_15353kala4ebc.R.inc(250);users.setUsers(userList);
            __CLR4_4_15353kala4ebc.R.inc(251);Account newAccount = new Account();
            __CLR4_4_15353kala4ebc.R.inc(252);newAccount.setAccountBalance(0);
            __CLR4_4_15353kala4ebc.R.inc(253);newAccount.setAccountNumber(user.getAccountNumber());
            __CLR4_4_15353kala4ebc.R.inc(254);accountList.add(newAccount);
            __CLR4_4_15353kala4ebc.R.inc(255);Accounts.setAccounts(accountList);

            __CLR4_4_15353kala4ebc.R.inc(256);Marshaller marshaller = jaxbContext.createMarshaller();
            __CLR4_4_15353kala4ebc.R.inc(257);marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            __CLR4_4_15353kala4ebc.R.inc(258);marshaller.marshal(users, new File("users.xml"));

            __CLR4_4_15353kala4ebc.R.inc(259);Marshaller marshaller2 = jaxbContext2.createMarshaller();
            __CLR4_4_15353kala4ebc.R.inc(260);marshaller2.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            __CLR4_4_15353kala4ebc.R.inc(261);marshaller2.marshal(Accounts, new File("accounts.xml"));


            __CLR4_4_15353kala4ebc.R.inc(262);Stage stage = (Stage) closeButton.getScene().getWindow();
            __CLR4_4_15353kala4ebc.R.inc(263);stage.close();
            __CLR4_4_15353kala4ebc.R.inc(264);Stage primaryStage = new Stage();
            __CLR4_4_15353kala4ebc.R.inc(265);Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/user.fxml"));
            __CLR4_4_15353kala4ebc.R.inc(266);primaryStage.setTitle("Banki Alkalmaz\u00e1s");
            __CLR4_4_15353kala4ebc.R.inc(267);primaryStage.setResizable(false);
            __CLR4_4_15353kala4ebc.R.inc(268);primaryStage.setScene(new Scene(root));
            __CLR4_4_15353kala4ebc.R.inc(269);primaryStage.show();
        }
    }}}}}finally{__CLR4_4_15353kala4ebc.R.flushNeeded();}}
}
