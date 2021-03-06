package GestionAssitanceTouristique;

/**
 * Interface definition : ServiceStatSite
 * 
 * @author OpenORB Compiler
 */
public abstract class ServiceStatSitePOA extends org.omg.PortableServer.Servant
        implements ServiceStatSiteOperations, org.omg.CORBA.portable.InvokeHandler
{
    public ServiceStatSite _this()
    {
        return ServiceStatSiteHelper.narrow(_this_object());
    }

    public ServiceStatSite _this(org.omg.CORBA.ORB orb)
    {
        return ServiceStatSiteHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:GestionAssitanceTouristique/ServiceStatSite:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("afficherInfosES")) {
                return _invoke_afficherInfosES(_is, handler);
        } else if (opName.equals("getStatsSite")) {
                return _invoke_getStatsSite(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_getStatsSite(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;

        GestionAssitanceTouristique.Statistique[] _arg_result = getStatsSite();

        _output = handler.createReply();
        GestionAssitanceTouristique.t_listeStatHelper.write(_output,_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_afficherInfosES(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        GestionAssitanceTouristique.Visite[] arg0_in = GestionAssitanceTouristique.t_listeVisitesHelper.read(_is);

        afficherInfosES(arg0_in);

        _output = handler.createReply();

        return _output;
    }

}
