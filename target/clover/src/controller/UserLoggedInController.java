/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import modell.User;

import java.io.IOException;
@Slf4j
public class UserLoggedInController {public static class __CLR4_4_19r9rkala4ecm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,393,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private User user = new User();
    public void setLoggedin(User user){try{__CLR4_4_19r9rkala4ecm.R.inc(351);
        __CLR4_4_19r9rkala4ecm.R.inc(352);this.user=user;
    }finally{__CLR4_4_19r9rkala4ecm.R.flushNeeded();}}

    @FXML
    private javafx.scene.control.Button penzBefizetesButton;
    public void penzbefizetes(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19r9rkala4ecm.R.inc(353);
        __CLR4_4_19r9rkala4ecm.R.inc(354);log.info("P\u00e9nzbefizet\u00e9s kiv\u00e1lasztva!");
        __CLR4_4_19r9rkala4ecm.R.inc(355);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/befizetes.fxml"));
        __CLR4_4_19r9rkala4ecm.R.inc(356);Parent root = fxmlLoader.load();
        __CLR4_4_19r9rkala4ecm.R.inc(357);fxmlLoader.<BefizetesController>getController().initUser(user);
        __CLR4_4_19r9rkala4ecm.R.inc(358);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_19r9rkala4ecm.R.inc(359);stage2.setScene(new Scene(root));
        __CLR4_4_19r9rkala4ecm.R.inc(360);stage2.show();
    }finally{__CLR4_4_19r9rkala4ecm.R.flushNeeded();}}

    public void penzkivetel(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19r9rkala4ecm.R.inc(361);
        __CLR4_4_19r9rkala4ecm.R.inc(362);log.info("P\u00e9nzkive\u00e9tel kiv\u00e1lasztva!");
        __CLR4_4_19r9rkala4ecm.R.inc(363);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/kivetel.fxml"));
        __CLR4_4_19r9rkala4ecm.R.inc(364);Parent root = fxmlLoader.load();
        __CLR4_4_19r9rkala4ecm.R.inc(365);fxmlLoader.<KivetelController>getController().initUser(user);
        __CLR4_4_19r9rkala4ecm.R.inc(366);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_19r9rkala4ecm.R.inc(367);stage2.setScene(new Scene(root));
        __CLR4_4_19r9rkala4ecm.R.inc(368);stage2.show();
    }finally{__CLR4_4_19r9rkala4ecm.R.flushNeeded();}}

    public void egyenleg(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19r9rkala4ecm.R.inc(369);
        __CLR4_4_19r9rkala4ecm.R.inc(370);log.info("Egyenlek\u00e9rdez\u00e9s kiv\u00e1lasztva!");
        __CLR4_4_19r9rkala4ecm.R.inc(371);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/egyenleg.fxml"));
        __CLR4_4_19r9rkala4ecm.R.inc(372);Parent root = fxmlLoader.load();
        __CLR4_4_19r9rkala4ecm.R.inc(373);fxmlLoader.<BalanceController>getController().initUser(user);
        __CLR4_4_19r9rkala4ecm.R.inc(374);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_19r9rkala4ecm.R.inc(375);stage2.setScene(new Scene(root));
        __CLR4_4_19r9rkala4ecm.R.inc(376);stage2.show();
    }finally{__CLR4_4_19r9rkala4ecm.R.flushNeeded();}}

    public void atutalas(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19r9rkala4ecm.R.inc(377);
        __CLR4_4_19r9rkala4ecm.R.inc(378);log.info("\u00c1tutal\u00e1s kiv\u00e1lasztva!");
        __CLR4_4_19r9rkala4ecm.R.inc(379);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/atutalas.fxml"));
        __CLR4_4_19r9rkala4ecm.R.inc(380);Parent root = fxmlLoader.load();
        __CLR4_4_19r9rkala4ecm.R.inc(381);fxmlLoader.<AtutalasController>getController().initUser(user);
        __CLR4_4_19r9rkala4ecm.R.inc(382);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_19r9rkala4ecm.R.inc(383);stage2.setScene(new Scene(root));
        __CLR4_4_19r9rkala4ecm.R.inc(384);stage2.show();
    }finally{__CLR4_4_19r9rkala4ecm.R.flushNeeded();}}

    public void uzenetek(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19r9rkala4ecm.R.inc(385);
        __CLR4_4_19r9rkala4ecm.R.inc(386);log.info("\u00dczenetek kiv\u00e1lasztva!");
        __CLR4_4_19r9rkala4ecm.R.inc(387);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/usermsgs.fxml"));
        __CLR4_4_19r9rkala4ecm.R.inc(388);Parent root = fxmlLoader.load();
        __CLR4_4_19r9rkala4ecm.R.inc(389);fxmlLoader.<UserMessageController>getController().initUser(user);
        __CLR4_4_19r9rkala4ecm.R.inc(390);Stage stage2 = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_19r9rkala4ecm.R.inc(391);stage2.setScene(new Scene(root));
        __CLR4_4_19r9rkala4ecm.R.inc(392);stage2.show();
    }finally{__CLR4_4_19r9rkala4ecm.R.flushNeeded();}}

}
