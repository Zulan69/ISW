/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.controlate.web.ejb;

import cl.controlate.web.clases.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.oracore.OracleType;

/**
 *
 * @author dev
 */
@Stateless
@LocalBean

public class Ejb_Rec_EditarDatos {

    private final Logger oLog1 = Logger.getLogger("Servlet_RecEditarDatos");
    private final Logger oLog2 = Logger.getLogger("Servlet_CambioDatos");

    @Resource(mappedName = "jdbc/Controlate")
    DataSource Ds;

    public datos recuperarDatos(String rut) {

        int cont = 1;
        try {

            Connection conexion = Ds.getConnection();
            CallableStatement oStm = conexion.prepareCall("{call PACIENTE$.DATOS_PACIENTE$(?,?,?,?)}");

            oStm.setString(cont++, rut);                       // Entrada el Rut
            oStm.registerOutParameter(cont++, OracleTypes.CURSOR);   // Cursor > Curdata
            oStm.registerOutParameter(cont++, Types.INTEGER); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR); // Descripcion de error

            oStm.execute();

            cont = 3;
            int iNumError = oStm.getInt(cont++);
            String sMsjError = oStm.getString(cont++);

            if (iNumError != 0) {
                oLog1.log(Level.SEVERE, iNumError + " - " + sMsjError);
                return null;

            }

            cont = 2;

            ResultSet oRs = (ResultSet) oStm.getObject(cont++); // Recibo la tabla con los datos del curdata
            datos datos_editar = null;
            while (oRs.next()) {   // Ojo
                Integer iFicha = oRs.getInt("FICHA");
                String sNombre = oRs.getString("NOMBRE");
                String sRut = oRs.getString("RUT");
                String sFechaNac = oRs.getString("FECHA_NACIMIENTO");
                String sGenero = oRs.getString("GENERO");
                String sDireccion = oRs.getString("DIRECCION");
                String sCiudad = oRs.getString("CIUDAD");
                String sComuna = oRs.getString("COMUNA");
                String sRegion = oRs.getString("REGION");
                Integer sCelular = oRs.getInt("TELEFONO");
                String sEmail = oRs.getString("EMAIL");
                String sPrevision = oRs.getString("PREVISION");
                String sTipoSangre = oRs.getString("TIPO_SANGRE");
                Float fEstatura = oRs.getFloat("ESTATURA");
                Float fPeso = oRs.getFloat("PESO");
                String sRutaFoto = oRs.getString("RUTA_FOTO");

                datos_editar = new datos(iFicha, sNombre, sRut, sFechaNac, sGenero, sDireccion, sCiudad, sComuna, sRegion, sCelular, sEmail, sPrevision, sTipoSangre, fEstatura, fPeso, sRutaFoto, "");
            }

            oStm.close();
            conexion.close();
            return datos_editar;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;

    }

    public datos modificar_datos(String rut, String Direccion, String Ciudad, String Comuna, String Region, String Telefono, String Email) {

        int cont = 1;
        try {

            Connection conexion = Ds.getConnection();
            CallableStatement oStm = conexion.prepareCall("{call PACIENTE$.EDITAR_DATOS$(?,?,?,?,?,?,?,?,?,?)}");

            oStm.setString(cont++, rut);                      // Entrada el Rut
            oStm.setString(cont++, Direccion);
            oStm.setString(cont++, Ciudad);
            oStm.setString(cont++, Comuna);
            oStm.setString(cont++, Region);
            oStm.setInt(cont++, Integer.parseInt(Telefono));
            oStm.setString(cont++, Email);
            oStm.registerOutParameter(cont++, OracleTypes.CURSOR);   // Cursor > Curdata 
            oStm.registerOutParameter(cont++, Types.INTEGER); // Codigo de error
            oStm.registerOutParameter(cont++, Types.VARCHAR); // Descripcion de error

            oStm.execute();

            cont = 9;
            int iNumError = oStm.getInt(cont++);
            String sMsjError = oStm.getString(cont++);

            if (iNumError != 0) {
                oLog2.log(Level.SEVERE, iNumError + " - " + sMsjError);
                return null;
            }

            cont = 8;
            ResultSet oRs = (ResultSet) oStm.getObject(cont++); // Recibo la tabla con los datos del curdata
            datos datos_editados = null;                         // Crea el Objeto datos, que llevara los datos cambiados
            while (oRs.next()) {   // Ojo
                Integer iFicha = oRs.getInt("FICHA");
                String sRut = oRs.getString("RUT");
                String sNombre = oRs.getString("NOMBRE");
                String sFechaNac = oRs.getString("FECHA_NACIMIENTO");
                String sGenero = oRs.getString("GENERO");
                String sDireccion = oRs.getString("DIRECCION");
                String sCiudad = oRs.getString("CIUDAD");
                String sComuna = oRs.getString("COMUNA");
                String sRegion = oRs.getString("REGION");
                Integer sCelular = oRs.getInt("TELEFONO");
                String sEmail = oRs.getString("EMAIL");
                String sPrevision = oRs.getString("PREVISION");
                String sTipoSangre = oRs.getString("TIPO_SANGRE");
                Float fEstatura = oRs.getFloat("ESTATURA");
                Float fPeso = oRs.getFloat("PESO");
                String sRutaFoto = oRs.getString("RUTA_FOTO");

                datos_editados = new datos(iFicha, sNombre, sRut, sFechaNac, sGenero, sDireccion, sCiudad, sComuna, sRegion, sCelular, sEmail, sPrevision, sTipoSangre, fEstatura, fPeso, sRutaFoto, "");
            }

            oStm.close();
            conexion.close();

            return datos_editados;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

}
