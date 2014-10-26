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
public class Controles {
    private String  id;
    private String  nombre;
    private String fecha_hora;
    private String tratamiento;
    private String alarma;
    
   
    
    
    public Controles(String id,String name,String fecha,String tratamiento,String ala){
        this.id=id;
        this.fecha_hora=fecha;
        this.nombre=name;
        this.tratamiento=tratamiento;
        this.alarma=ala;
        
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
    public String getEspecialidad(){
        return tratamiento;
    }
    
    public String getAlarma(){
        return alarma;
    }
}
