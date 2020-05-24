/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import main.Main;

import java.io.IOException;

@Slf4j
public class MainController {public static class __CLR4_4_14j4jkala4eak{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,183,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    private javafx.scene.control.Button workerButton;
    @FXML private javafx.scene.control.Button userButton;

    public void worker_select(ActionEvent actionEvent) throws Exception{try{__CLR4_4_14j4jkala4eak.R.inc(163);

        __CLR4_4_14j4jkala4eak.R.inc(164);Stage stage0 = (Stage) workerButton.getScene().getWindow();
        __CLR4_4_14j4jkala4eak.R.inc(165);stage0.close();
        __CLR4_4_14j4jkala4eak.R.inc(166);log.info("Dolgoz\u00f3 kiv\u00e1lasztva!");
        __CLR4_4_14j4jkala4eak.R.inc(167);Stage stage = new Stage();
        __CLR4_4_14j4jkala4eak.R.inc(168);Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/worker.fxml"));
        __CLR4_4_14j4jkala4eak.R.inc(169);stage.setTitle("Banki Alkalmaz\u00e1s");
        __CLR4_4_14j4jkala4eak.R.inc(170);stage.setResizable(false);
        __CLR4_4_14j4jkala4eak.R.inc(171);stage.setScene(new Scene(root));
        __CLR4_4_14j4jkala4eak.R.inc(172);stage.show();
    }finally{__CLR4_4_14j4jkala4eak.R.flushNeeded();}}

    public void user_select(ActionEvent actionEvent) throws IOException {try{__CLR4_4_14j4jkala4eak.R.inc(173);

        __CLR4_4_14j4jkala4eak.R.inc(174);Stage stage0 = (Stage) userButton.getScene().getWindow();
        __CLR4_4_14j4jkala4eak.R.inc(175);stage0.close();
        __CLR4_4_14j4jkala4eak.R.inc(176);log.info("user kiv\u00e1lasztva!");
        __CLR4_4_14j4jkala4eak.R.inc(177);Stage stage = new Stage();
        __CLR4_4_14j4jkala4eak.R.inc(178);Parent root = FXMLLoader.load(Main.class.getResource("/Fxml/user.fxml"));
        __CLR4_4_14j4jkala4eak.R.inc(179);stage.setTitle("Banki Alkalmaz\u00e1s");
        __CLR4_4_14j4jkala4eak.R.inc(180);stage.setResizable(false);
        __CLR4_4_14j4jkala4eak.R.inc(181);stage.setScene(new Scene(root));
        __CLR4_4_14j4jkala4eak.R.inc(182);stage.show();
    }finally{__CLR4_4_14j4jkala4eak.R.flushNeeded();}}
}
