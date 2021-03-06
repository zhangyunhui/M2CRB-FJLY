package GestionAssitanceTouristique;

/**
 * Interface definition : SiteTouristique
 * 
 * @author OpenORB Compiler
 */
public class _SiteTouristiqueStub extends org.omg.CORBA.portable.ObjectImpl
        implements SiteTouristique
{
    static final String[] _ids_list =
    {
        "IDL:GestionAssitanceTouristique/SiteTouristique:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = GestionAssitanceTouristique.SiteTouristiqueOperations.class;

    /**
     * Operation getHorairesFermeture
     */
    public short getHorairesFermeture()
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("getHorairesFermeture",true);
                    _input = this._invoke(_output);
                    short _arg_ret = _input.read_short();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("getHorairesFermeture",_opsClass);
                if (_so == null)
                   continue;
                GestionAssitanceTouristique.SiteTouristiqueOperations _self = (GestionAssitanceTouristique.SiteTouristiqueOperations) _so.servant;
                try
                {
                    return _self.getHorairesFermeture();
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
