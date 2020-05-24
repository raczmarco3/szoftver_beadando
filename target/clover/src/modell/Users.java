/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package modell;

import modell.User;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Random;

/**
 * Class represents the list of users
 */
@XmlRootElement(name = "users")
public class Users {public static class __CLR4_4_1ejejkala4egi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,553,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private List<User> Users;

    /**
     *
     * @return the list of users
     */
    public List<User> getUsers() {try{__CLR4_4_1ejejkala4egi.R.inc(523);
        __CLR4_4_1ejejkala4egi.R.inc(524);return Users;
    }finally{__CLR4_4_1ejejkala4egi.R.flushNeeded();}}

    @XmlElement(name = "user")
    public void setUsers(List<User> Users) {try{__CLR4_4_1ejejkala4egi.R.inc(525);
        __CLR4_4_1ejejkala4egi.R.inc(526);this.Users = Users;
    }finally{__CLR4_4_1ejejkala4egi.R.flushNeeded();}}

    /**
     * @param Users gets every user
     * @return returns an unused index
     */
    public int newUserId(List<User> Users){try{__CLR4_4_1ejejkala4egi.R.inc(527);
        __CLR4_4_1ejejkala4egi.R.inc(528);int id=0;
        __CLR4_4_1ejejkala4egi.R.inc(529);for (User user : Users)
        {{
            __CLR4_4_1ejejkala4egi.R.inc(530);if((((user.getUserId()>id)&&(__CLR4_4_1ejejkala4egi.R.iget(531)!=0|true))||(__CLR4_4_1ejejkala4egi.R.iget(532)==0&false))){{
                __CLR4_4_1ejejkala4egi.R.inc(533);id=user.getUserId();
            }
        }}
        }__CLR4_4_1ejejkala4egi.R.inc(534);return id+1;
    }finally{__CLR4_4_1ejejkala4egi.R.flushNeeded();}}
    public String generateAccountNumber(){try{__CLR4_4_1ejejkala4egi.R.inc(535);
        __CLR4_4_1ejejkala4egi.R.inc(536);String accountNumber = "ser-";
        __CLR4_4_1ejejkala4egi.R.inc(537);Random rand = new Random();
        __CLR4_4_1ejejkala4egi.R.inc(538);int rand_int = rand.nextInt(1000);
        __CLR4_4_1ejejkala4egi.R.inc(539);accountNumber = accountNumber + rand_int;
        __CLR4_4_1ejejkala4egi.R.inc(540);if((((checkAccountNumber(accountNumber))&&(__CLR4_4_1ejejkala4egi.R.iget(541)!=0|true))||(__CLR4_4_1ejejkala4egi.R.iget(542)==0&false))) {{
            __CLR4_4_1ejejkala4egi.R.inc(543);return accountNumber;
        }}else{{
            __CLR4_4_1ejejkala4egi.R.inc(544);generateAccountNumber();
        }
        }__CLR4_4_1ejejkala4egi.R.inc(545);return "Hiba";
    }finally{__CLR4_4_1ejejkala4egi.R.flushNeeded();}}
    private boolean checkAccountNumber(String accountNumber){try{__CLR4_4_1ejejkala4egi.R.inc(546);
        __CLR4_4_1ejejkala4egi.R.inc(547);for (User user : Users)
        {{
            __CLR4_4_1ejejkala4egi.R.inc(548);if((((user.getAccountNumber() == accountNumber)&&(__CLR4_4_1ejejkala4egi.R.iget(549)!=0|true))||(__CLR4_4_1ejejkala4egi.R.iget(550)==0&false))){{
                __CLR4_4_1ejejkala4egi.R.inc(551);return false;
            }
        }}
        }__CLR4_4_1ejejkala4egi.R.inc(552);return true;
    }finally{__CLR4_4_1ejejkala4egi.R.flushNeeded();}}
}
