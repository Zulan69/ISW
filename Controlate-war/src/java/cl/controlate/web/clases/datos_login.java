/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.controlate.web.clases;

/**
 *
 * @author dev
 */

public class datos_login {
    
    String sName;
    String sRut;
    Integer iError;
    String sError;

    public datos_login(String sName,String sRut, Integer iError, String sError) {
        this.sName = sName;
        this.sRut = sRut;
        this.iError = iError;
        this.sError = sError;
    }

    public String getsRut() {
        return sRut;
    }

    public void setsRut(String sRut) {
        this.sRut = sRut;
    }

    public String getsName() {
        return sName;
    }

    public Integer getiError() {
        return iError;
    }

    public String getsError() {
        return sError;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setiError(Integer iError) {
        this.iError = iError;
    }

    public void setsError(String sError) {
        this.sError = sError;
    }
    
   
    
}
