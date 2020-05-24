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
import jaxb.JAXBHelper;
import lombok.extern.slf4j.Slf4j;
import main.Main;
import modell.User;
import modell.Users;
import modell.Worker;
import modell.Workers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
@Slf4j
public class WorkerController {public static class __CLR4_4_1b7b7kala4edf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,475,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML private javafx.scene.control.Button closeButton;
    public void back_to_main(ActionEvent actionEvent) throws IOException {try{__CLR4_4_1b7b7kala4edf.R.inc(403);
        __CLR4_4_1b7b7kala4edf.R.inc(404);log.info("Vissza a men\u00fcbe!");
        __CLR4_4_1b7b7kala4edf.R.inc(405);Stage stage = (Stage) closeButton.getScene().getWindow();
        __CLR4_4_1b7b7kala4edf.R.inc(406);stage.close();
        __CLR4_4_1b7b7kala4edf.R.inc(407);Stage primaryStage = new Stage();
        __CLR4_4_1b7b7kala4edf.R.inc(408);Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/main.fxml"));
        __CLR4_4_1b7b7kala4edf.R.inc(409);primaryStage.setTitle("Banki Alkalmaz\u00e1s");
        __CLR4_4_1b7b7kala4edf.R.inc(410);primaryStage.setResizable(false);
        __CLR4_4_1b7b7kala4edf.R.inc(411);primaryStage.setScene(new Scene(root));
        __CLR4_4_1b7b7kala4edf.R.inc(412);primaryStage.show();
    }finally{__CLR4_4_1b7b7kala4edf.R.flushNeeded();}}
    @FXML private javafx.scene.control.Button bejelentkezesButton;
    @FXML
    private TextField emailField;
    @FXML
    private TextField jelszoField;
    public void bejelentkezes(ActionEvent actionEvent) throws IOException, JAXBException {try{__CLR4_4_1b7b7kala4edf.R.inc(413);
        __CLR4_4_1b7b7kala4edf.R.inc(414);if((((emailField.getText().isEmpty() || jelszoField.getText().isEmpty())&&(__CLR4_4_1b7b7kala4edf.R.iget(415)!=0|true))||(__CLR4_4_1b7b7kala4edf.R.iget(416)==0&false))){{
            __CLR4_4_1b7b7kala4edf.R.inc(417);log.error("A dolgozo bejelentkez\u00e9si adatai \u00fcresek!");
            __CLR4_4_1b7b7kala4edf.R.inc(418);Alert alert = new Alert(Alert.AlertType.ERROR);
            __CLR4_4_1b7b7kala4edf.R.inc(419);alert.setTitle("Hiba");
            __CLR4_4_1b7b7kala4edf.R.inc(420);alert.setHeaderText(null);
            __CLR4_4_1b7b7kala4edf.R.inc(421);alert.setContentText("A mez\u0151k nem lehetnek \u00fcresek!");
            __CLR4_4_1b7b7kala4edf.R.inc(422);alert.showAndWait();
        }}else{{
            __CLR4_4_1b7b7kala4edf.R.inc(423);String email = emailField.getText();
            __CLR4_4_1b7b7kala4edf.R.inc(424);String password = jelszoField.getText();
            __CLR4_4_1b7b7kala4edf.R.inc(425);if((((login(email, password))&&(__CLR4_4_1b7b7kala4edf.R.iget(426)!=0|true))||(__CLR4_4_1b7b7kala4edf.R.iget(427)==0&false))){{
                __CLR4_4_1b7b7kala4edf.R.inc(428);Worker worker = new Worker();
                __CLR4_4_1b7b7kala4edf.R.inc(429);worker = LoggedInWorker(email);
                __CLR4_4_1b7b7kala4edf.R.inc(430);if((((worker.getEmail().isEmpty())&&(__CLR4_4_1b7b7kala4edf.R.iget(431)!=0|true))||(__CLR4_4_1b7b7kala4edf.R.iget(432)==0&false))){{
                    __CLR4_4_1b7b7kala4edf.R.inc(433);Alert alert = new Alert(Alert.AlertType.ERROR);
                    __CLR4_4_1b7b7kala4edf.R.inc(434);alert.setTitle("Hiba");
                    __CLR4_4_1b7b7kala4edf.R.inc(435);alert.setHeaderText(null);
                    __CLR4_4_1b7b7kala4edf.R.inc(436);alert.setContentText("A bejelentkez\u00e9s nem siker\u00fclt!");
                    __CLR4_4_1b7b7kala4edf.R.inc(437);alert.showAndWait();
                }}else{{
                    /*Stage stage = (Stage) bejelentkezesButton.getScene().getWindow();
                    stage.close();
                        */
                    __CLR4_4_1b7b7kala4edf.R.inc(438);WorkerLoggedInController InitData = new WorkerLoggedInController();
                    __CLR4_4_1b7b7kala4edf.R.inc(439);InitData.setLoggedin(worker);
                    __CLR4_4_1b7b7kala4edf.R.inc(440);log.info("Dolgozol bejelentkezes sikeres!");
                    __CLR4_4_1b7b7kala4edf.R.inc(441);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/workerloggedin.fxml"));
                    __CLR4_4_1b7b7kala4edf.R.inc(442);Parent root = fxmlLoader.load();
                    __CLR4_4_1b7b7kala4edf.R.inc(443);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    __CLR4_4_1b7b7kala4edf.R.inc(444);stage2.setScene(new Scene(root));
                    __CLR4_4_1b7b7kala4edf.R.inc(445);stage2.show();
                }
            }}}else{{
                __CLR4_4_1b7b7kala4edf.R.inc(446);Alert alert = new Alert(Alert.AlertType.ERROR);
                __CLR4_4_1b7b7kala4edf.R.inc(447);alert.setTitle("Hiba");
                __CLR4_4_1b7b7kala4edf.R.inc(448);alert.setHeaderText(null);
                __CLR4_4_1b7b7kala4edf.R.inc(449);alert.setContentText("A bejelentkez\u00e9s nem siker\u00fclt!");
                __CLR4_4_1b7b7kala4edf.R.inc(450);alert.showAndWait();
            }
        }}
    }}finally{__CLR4_4_1b7b7kala4edf.R.flushNeeded();}}
    private boolean login(String email, String password) throws FileNotFoundException, JAXBException {try{__CLR4_4_1b7b7kala4edf.R.inc(451);
        __CLR4_4_1b7b7kala4edf.R.inc(452);JAXBContext jaxbContext = JAXBContext.newInstance(Workers.class);
        __CLR4_4_1b7b7kala4edf.R.inc(453);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        __CLR4_4_1b7b7kala4edf.R.inc(454);Workers workers = (Workers) unmarshaller.unmarshal(new File("workers.xml"));
        __CLR4_4_1b7b7kala4edf.R.inc(455);List<Worker> workerList = workers.getWorkers();

        __CLR4_4_1b7b7kala4edf.R.inc(456);for (Worker worker : workerList)
        {{
            __CLR4_4_1b7b7kala4edf.R.inc(457);if((((worker.getEmail().equals(email)  &&  worker.getPassword().equals(password))&&(__CLR4_4_1b7b7kala4edf.R.iget(458)!=0|true))||(__CLR4_4_1b7b7kala4edf.R.iget(459)==0&false))){{
                __CLR4_4_1b7b7kala4edf.R.inc(460);return true;
            }
        }}
        }__CLR4_4_1b7b7kala4edf.R.inc(461);return false;
    }finally{__CLR4_4_1b7b7kala4edf.R.flushNeeded();}}
    private Worker LoggedInWorker(String email) throws JAXBException {try{__CLR4_4_1b7b7kala4edf.R.inc(462);
        __CLR4_4_1b7b7kala4edf.R.inc(463);JAXBContext jaxbContext = JAXBContext.newInstance(Workers.class);
        __CLR4_4_1b7b7kala4edf.R.inc(464);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        __CLR4_4_1b7b7kala4edf.R.inc(465);Workers workers = (Workers) unmarshaller.unmarshal(new File("workers.xml"));
        __CLR4_4_1b7b7kala4edf.R.inc(466);List<Worker> workerList = workers.getWorkers();
        __CLR4_4_1b7b7kala4edf.R.inc(467);Worker worker = new Worker();

        __CLR4_4_1b7b7kala4edf.R.inc(468);for (Worker worker_ : workerList)
        {{
            __CLR4_4_1b7b7kala4edf.R.inc(469);if((((worker_.getEmail().equals(email))&&(__CLR4_4_1b7b7kala4edf.R.iget(470)!=0|true))||(__CLR4_4_1b7b7kala4edf.R.iget(471)==0&false))){{
                __CLR4_4_1b7b7kala4edf.R.inc(472);worker = worker_;
                __CLR4_4_1b7b7kala4edf.R.inc(473);return worker;
            }
        }}
            }__CLR4_4_1b7b7kala4edf.R.inc(474);return worker;
    }finally{__CLR4_4_1b7b7kala4edf.R.flushNeeded();}}
}
