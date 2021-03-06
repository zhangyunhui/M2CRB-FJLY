package GestionAssitanceTouristique;

/** 
 * Helper class for : ServiceStatOffice
 *  
 * @author OpenORB Compiler
 */ 
public class ServiceStatOfficeHelper
{
    /**
     * Insert ServiceStatOffice into an any
     * @param a an any
     * @param t ServiceStatOffice value
     */
    public static void insert(org.omg.CORBA.Any a, GestionAssitanceTouristique.ServiceStatOffice t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract ServiceStatOffice from an any
     * @param a an any
     * @return the extracted ServiceStatOffice value
     */
    public static GestionAssitanceTouristique.ServiceStatOffice extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return GestionAssitanceTouristique.ServiceStatOfficeHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the ServiceStatOffice TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"ServiceStatOffice");
        }
        return _tc;
    }

    /**
     * Return the ServiceStatOffice IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:GestionAssitanceTouristique/ServiceStatOffice:1.0";

    /**
     * Read ServiceStatOffice from a marshalled stream
     * @param istream the input stream
     * @return the readed ServiceStatOffice value
     */
    public static GestionAssitanceTouristique.ServiceStatOffice read(org.omg.CORBA.portable.InputStream istream)
    {
        return(GestionAssitanceTouristique.ServiceStatOffice)istream.read_Object(GestionAssitanceTouristique._ServiceStatOfficeStub.class);
    }

    /**
     * Write ServiceStatOffice into a marshalled stream
     * @param ostream the output stream
     * @param value ServiceStatOffice value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, GestionAssitanceTouristique.ServiceStatOffice value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to ServiceStatOffice
     * @param obj the CORBA Object
     * @return ServiceStatOffice Object
     */
    public static ServiceStatOffice narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceStatOffice)
            return (ServiceStatOffice)obj;

        if (obj._is_a(id()))
        {
            _ServiceStatOfficeStub stub = new _ServiceStatOfficeStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to ServiceStatOffice
     * @param obj the CORBA Object
     * @return ServiceStatOffice Object
     */
    public static ServiceStatOffice unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof ServiceStatOffice)
            return (ServiceStatOffice)obj;

        _ServiceStatOfficeStub stub = new _ServiceStatOfficeStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
