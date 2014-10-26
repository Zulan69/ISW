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
public class Tutores {
    private String  id;
    private String  nombre;
    private String parentesco;
    
   
    
    
    public Tutores(String id,String nameDoc,String espDoc){
        this.id=id;
        
        this.nombre=nameDoc;
        this.parentesco=espDoc;
        
        
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getId(){
        return id;
    }
    public String getParentesco(){
        return parentesco;
    }
}
