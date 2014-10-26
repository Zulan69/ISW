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
public class Medicamentos {
    private String  id;
    private String  nombre;
    private String suministro;
    private String fecha_hora;
    private String alarma;
    private String tratamiento_nombre;
    
    
    public Medicamentos(String id,String name,String sum,String fecha,String ala,String name_trat){
        this.id=id;
        this.fecha_hora=fecha;
        this.nombre=name;
        this.suministro=sum;
        this.alarma=ala;
        this.tratamiento_nombre=name_trat;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getId(){
        return id;
    }
    public String getFecha(){
        return fecha_hora;
    }
    public String getSuministro(){
        return suministro;
    }
    public String getNombreTratamiento(){
        return tratamiento_nombre;
    }
    
    public String getAlarma(){
        return alarma;
    }
}
