/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package jaxb;

import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Helper class to work with JAXB.
 */
public class JAXBHelper {public static class __CLR4_4_1dqdqkala4eei{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u004d\u0061\u0072\u0063\u006f\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u005f\u0062\u0065\u0061\u0064\u0061\u006e\u0064\u006f\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1590337896082L,8589935092L,508,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Serializes an object to XML. The output document is written in UTF-8 encoding.
     *
     * @param o the object to serialize
     * @param os the {@code OutputStream} to write to
     * @throws JAXBException if any problem occurs during serialization
     */
    public static void toXML(Object o, OutputStream os) throws JAXBException {try{__CLR4_4_1dqdqkala4eei.R.inc(494);
        __CLR4_4_1dqdqkala4eei.R.inc(495);try {
            __CLR4_4_1dqdqkala4eei.R.inc(496);JAXBContext context = JAXBContext.newInstance(o.getClass());
            __CLR4_4_1dqdqkala4eei.R.inc(497);Marshaller marshaller = context.createMarshaller();
            __CLR4_4_1dqdqkala4eei.R.inc(498);marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            __CLR4_4_1dqdqkala4eei.R.inc(499);marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            __CLR4_4_1dqdqkala4eei.R.inc(500);marshaller.marshal(o, os);
        } catch(JAXBException e) {
            __CLR4_4_1dqdqkala4eei.R.inc(501);throw e;
        }
    }finally{__CLR4_4_1dqdqkala4eei.R.flushNeeded();}}

    /**
     * Deserializes an object from XML.
     *
     * @param clazz the class of the object
     * @param is the {@code InputStream} to read from
     * @return the resulting object
     * @throws JAXBException if any problem occurs during deserialization
     */
    public static <T> T fromXML(Class<T> clazz, InputStream is) throws JAXBException {try{__CLR4_4_1dqdqkala4eei.R.inc(502);
        __CLR4_4_1dqdqkala4eei.R.inc(503);try {
            __CLR4_4_1dqdqkala4eei.R.inc(504);JAXBContext context = JAXBContext.newInstance(clazz);
            __CLR4_4_1dqdqkala4eei.R.inc(505);Unmarshaller unmarshaller = context.createUnmarshaller();
            __CLR4_4_1dqdqkala4eei.R.inc(506);return (T) unmarshaller.unmarshal(is);
        } catch(JAXBException e) {
            __CLR4_4_1dqdqkala4eei.R.inc(507);throw e;
        }
    }finally{__CLR4_4_1dqdqkala4eei.R.flushNeeded();}}

}
