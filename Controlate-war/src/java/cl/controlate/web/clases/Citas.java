/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.controlate.web.clases;

/**
 *
 * @author Hector
 */
public class Citas {
    private String  id;
    private String  nombreDoc;
    private String especialidadDoc;
    private String fecha_hora;
    private String alarma;
   
    
    
    public Citas(String id,String nameDoc,String espDoc,String fecha,String ala){
        this.id=id;
        this.fecha_hora=fecha;
        this.nombreDoc=nameDoc;
        this.especialidadDoc=espDoc;
        this.alarma=ala;
        
    }
    
    public String getNombre(){
        return nombreDoc;
    }
    public String getId(){
        return id;
    }
    public String getFecha(){
        return fecha_hora;
    }
    public String getEspecialidad(){
        return especialidadDoc;
    }
    
    public String getAlarma(){
        return alarma;
    }
}
