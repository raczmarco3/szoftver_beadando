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
import modell.User;
import modell.Users;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Slf4j
public class UserController {public static class __CLR4_4_17i7ikala4ec0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,351,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @FXML
    private javafx.scene.control.Button closeButton;
    @FXML
    private javafx.scene.control.Button registrationButton;
    public void back_to_main(ActionEvent actionEvent) throws IOException {try{__CLR4_4_17i7ikala4ec0.R.inc(270);
        __CLR4_4_17i7ikala4ec0.R.inc(271);log.info("Vissza a men\u00fcbe!");
        __CLR4_4_17i7ikala4ec0.R.inc(272);Stage stage = (Stage) closeButton.getScene().getWindow();
        __CLR4_4_17i7ikala4ec0.R.inc(273);stage.close();
        __CLR4_4_17i7ikala4ec0.R.inc(274);Stage primaryStage = new Stage();
        __CLR4_4_17i7ikala4ec0.R.inc(275);Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/main.fxml"));
        __CLR4_4_17i7ikala4ec0.R.inc(276);primaryStage.setTitle("Banki Alkalmaz\u00e1s");
        __CLR4_4_17i7ikala4ec0.R.inc(277);primaryStage.setResizable(false);
        __CLR4_4_17i7ikala4ec0.R.inc(278);primaryStage.setScene(new Scene(root));
        __CLR4_4_17i7ikala4ec0.R.inc(279);primaryStage.show();
    }finally{__CLR4_4_17i7ikala4ec0.R.flushNeeded();}}

    public void registration(ActionEvent actionEvent) throws IOException {try{__CLR4_4_17i7ikala4ec0.R.inc(280);
        __CLR4_4_17i7ikala4ec0.R.inc(281);log.info("Regisztr\u00e1ci\u00f3 kiv\u00e1lasztva!");
        __CLR4_4_17i7ikala4ec0.R.inc(282);Stage stage = (Stage) registrationButton.getScene().getWindow();
        __CLR4_4_17i7ikala4ec0.R.inc(283);stage.close();
        __CLR4_4_17i7ikala4ec0.R.inc(284);Stage primaryStage = new Stage();
        __CLR4_4_17i7ikala4ec0.R.inc(285);Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/registration.fxml"));
        __CLR4_4_17i7ikala4ec0.R.inc(286);primaryStage.setTitle("Banki Alkalmaz\u00e1s");
        __CLR4_4_17i7ikala4ec0.R.inc(287);primaryStage.setResizable(false);
        __CLR4_4_17i7ikala4ec0.R.inc(288);primaryStage.setScene(new Scene(root));
        __CLR4_4_17i7ikala4ec0.R.inc(289);primaryStage.show();
    }finally{__CLR4_4_17i7ikala4ec0.R.flushNeeded();}}
    @FXML
    private TextField emailInput;
    @FXML
    private TextField pwInput;
    public void bejelentkezes(ActionEvent actionEvent) throws IOException, JAXBException {try{__CLR4_4_17i7ikala4ec0.R.inc(290);
        __CLR4_4_17i7ikala4ec0.R.inc(291);if ((((emailInput.getText().isEmpty() || pwInput.getText().isEmpty())&&(__CLR4_4_17i7ikala4ec0.R.iget(292)!=0|true))||(__CLR4_4_17i7ikala4ec0.R.iget(293)==0&false))) {{
            __CLR4_4_17i7ikala4ec0.R.inc(294);log.error("A bejelentkez\u00e9si adatok \u00fcresek");
            __CLR4_4_17i7ikala4ec0.R.inc(295);Alert alert = new Alert(Alert.AlertType.ERROR);
            __CLR4_4_17i7ikala4ec0.R.inc(296);alert.setTitle("Hiba");
            __CLR4_4_17i7ikala4ec0.R.inc(297);alert.setHeaderText(null);
            __CLR4_4_17i7ikala4ec0.R.inc(298);alert.setContentText("A mez\u0151k nem lehetnek \u00fcresek!");
            __CLR4_4_17i7ikala4ec0.R.inc(299);alert.showAndWait();
        } }else {{
            __CLR4_4_17i7ikala4ec0.R.inc(300);String email = emailInput.getText();
            __CLR4_4_17i7ikala4ec0.R.inc(301);String password = pwInput.getText();
            __CLR4_4_17i7ikala4ec0.R.inc(302);if ((((login(email, password))&&(__CLR4_4_17i7ikala4ec0.R.iget(303)!=0|true))||(__CLR4_4_17i7ikala4ec0.R.iget(304)==0&false))) {{
                __CLR4_4_17i7ikala4ec0.R.inc(305);User user;
                __CLR4_4_17i7ikala4ec0.R.inc(306);user = LoggedInUser(email);
                __CLR4_4_17i7ikala4ec0.R.inc(307);if ((((user.getEmail().isEmpty())&&(__CLR4_4_17i7ikala4ec0.R.iget(308)!=0|true))||(__CLR4_4_17i7ikala4ec0.R.iget(309)==0&false))) {{
                    __CLR4_4_17i7ikala4ec0.R.inc(310);Alert alert = new Alert(Alert.AlertType.ERROR);
                    __CLR4_4_17i7ikala4ec0.R.inc(311);alert.setTitle("Hiba");
                    __CLR4_4_17i7ikala4ec0.R.inc(312);alert.setHeaderText(null);
                    __CLR4_4_17i7ikala4ec0.R.inc(313);alert.setContentText("A bejelentkez\u00e9s nem siker\u00fclt!");
                    __CLR4_4_17i7ikala4ec0.R.inc(314);alert.showAndWait();
                } }else {{
                    /*Stage stage = (Stage) bejelentkezesButton.getScene().getWindow();
                    stage.close();
                        */
                    /*UserLoggedInController InitData = new UserLoggedInController();
                    InitData.setLoggedin(user);*/
                    __CLR4_4_17i7ikala4ec0.R.inc(315);log.info("A bejelentkez\u00e9s sikeres");
                    __CLR4_4_17i7ikala4ec0.R.inc(316);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/userloggedin.fxml"));
                    __CLR4_4_17i7ikala4ec0.R.inc(317);Parent root = fxmlLoader.load();
                    __CLR4_4_17i7ikala4ec0.R.inc(318);fxmlLoader.<UserLoggedInController>getController().setLoggedin(user);
                    __CLR4_4_17i7ikala4ec0.R.inc(319);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    __CLR4_4_17i7ikala4ec0.R.inc(320);stage2.setScene(new Scene(root));
                    __CLR4_4_17i7ikala4ec0.R.inc(321);stage2.show();
                }
            }} }else {{
                __CLR4_4_17i7ikala4ec0.R.inc(322);Alert alert = new Alert(Alert.AlertType.ERROR);
                __CLR4_4_17i7ikala4ec0.R.inc(323);alert.setTitle("Hiba");
                __CLR4_4_17i7ikala4ec0.R.inc(324);alert.setHeaderText(null);
                __CLR4_4_17i7ikala4ec0.R.inc(325);alert.setContentText("A bejelentkez\u00e9s nem siker\u00fclt!");
                __CLR4_4_17i7ikala4ec0.R.inc(326);alert.showAndWait();
            }
        }}
    }}finally{__CLR4_4_17i7ikala4ec0.R.flushNeeded();}}

    private boolean login(String email, String password) throws FileNotFoundException, JAXBException {try{__CLR4_4_17i7ikala4ec0.R.inc(327);
        __CLR4_4_17i7ikala4ec0.R.inc(328);JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        __CLR4_4_17i7ikala4ec0.R.inc(329);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        __CLR4_4_17i7ikala4ec0.R.inc(330);Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));
        __CLR4_4_17i7ikala4ec0.R.inc(331);List<User> userList = users.getUsers();
        __CLR4_4_17i7ikala4ec0.R.inc(332);for (User user : userList)
        {{
            __CLR4_4_17i7ikala4ec0.R.inc(333);if((((user.getEmail().equals(email)  &&  user.getPassword().equals(password))&&(__CLR4_4_17i7ikala4ec0.R.iget(334)!=0|true))||(__CLR4_4_17i7ikala4ec0.R.iget(335)==0&false))){{
                __CLR4_4_17i7ikala4ec0.R.inc(336);return true;
            }
        }}
        }__CLR4_4_17i7ikala4ec0.R.inc(337);return false;
    }finally{__CLR4_4_17i7ikala4ec0.R.flushNeeded();}}

    private User LoggedInUser(String email) throws JAXBException {try{__CLR4_4_17i7ikala4ec0.R.inc(338);
        __CLR4_4_17i7ikala4ec0.R.inc(339);JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        __CLR4_4_17i7ikala4ec0.R.inc(340);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        __CLR4_4_17i7ikala4ec0.R.inc(341);Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));
        __CLR4_4_17i7ikala4ec0.R.inc(342);List<User> userList = users.getUsers();
        __CLR4_4_17i7ikala4ec0.R.inc(343);User user = new User();

        __CLR4_4_17i7ikala4ec0.R.inc(344);for (User user_ : userList)
        {{
            __CLR4_4_17i7ikala4ec0.R.inc(345);if((((user_.getEmail().equals(email))&&(__CLR4_4_17i7ikala4ec0.R.iget(346)!=0|true))||(__CLR4_4_17i7ikala4ec0.R.iget(347)==0&false))){{
                __CLR4_4_17i7ikala4ec0.R.inc(348);user = user_;
                __CLR4_4_17i7ikala4ec0.R.inc(349);return user;
            }
        }}
        }__CLR4_4_17i7ikala4ec0.R.inc(350);return user;
    }finally{__CLR4_4_17i7ikala4ec0.R.flushNeeded();}}
}
