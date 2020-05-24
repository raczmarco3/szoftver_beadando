/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import lombok.extern.slf4j.Slf4j;
import modell.User;
import modell.Users;
import modell.Worker;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
@Slf4j
public class WorkerLoggedInController {public static class __CLR4_4_1d7d7kala4edz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,494,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @FXML public ListView new_ = new ListView();
    private Worker worker;

    public void setLoggedin(Worker worker){try{__CLR4_4_1d7d7kala4edz.R.inc(475);
        __CLR4_4_1d7d7kala4edz.R.inc(476);this.worker=worker;
    }finally{__CLR4_4_1d7d7kala4edz.R.flushNeeded();}}

    public void newRegistrationList(List<User> users) throws JAXBException {try{__CLR4_4_1d7d7kala4edz.R.inc(477);
       /*ObservableList<User> items = FXCollections.observableArrayList ();
        items.addAll(users);
        newregistration.setItems(items);
        */
        //newregistration.getItems().addAll(users);
        __CLR4_4_1d7d7kala4edz.R.inc(478);new_.getItems().addAll(users);
    }finally{__CLR4_4_1d7d7kala4edz.R.flushNeeded();}}

    public WorkerLoggedInController() throws JAXBException {try{__CLR4_4_1d7d7kala4edz.R.inc(479);
       __CLR4_4_1d7d7kala4edz.R.inc(480);newRegistrationList(getAllUnApprovedUser());
    }finally{__CLR4_4_1d7d7kala4edz.R.flushNeeded();}}

    private List<User> getAllUnApprovedUser() throws JAXBException {try{__CLR4_4_1d7d7kala4edz.R.inc(481);
        __CLR4_4_1d7d7kala4edz.R.inc(482);JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        __CLR4_4_1d7d7kala4edz.R.inc(483);Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        __CLR4_4_1d7d7kala4edz.R.inc(484);Users users = (Users) unmarshaller.unmarshal(new File("users.xml"));
        __CLR4_4_1d7d7kala4edz.R.inc(485);List<User> userList = users.getUsers();
        __CLR4_4_1d7d7kala4edz.R.inc(486);List<User> unApprovedUsers = new ArrayList();

        __CLR4_4_1d7d7kala4edz.R.inc(487);for (User user : userList)
        {{
            __CLR4_4_1d7d7kala4edz.R.inc(488);Boolean state = user.getApprovedRegistration();
            __CLR4_4_1d7d7kala4edz.R.inc(489);if((((state == false)&&(__CLR4_4_1d7d7kala4edz.R.iget(490)!=0|true))||(__CLR4_4_1d7d7kala4edz.R.iget(491)==0&false))){{
                __CLR4_4_1d7d7kala4edz.R.inc(492);unApprovedUsers.add(user);
            }
        }}
        }__CLR4_4_1d7d7kala4edz.R.inc(493);return unApprovedUsers;
    }finally{__CLR4_4_1d7d7kala4edz.R.flushNeeded();}}
}
