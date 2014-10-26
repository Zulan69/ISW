/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {

    $("#form-login").submit(function () {
        var ret = false;
        
        $.ajax({
            type: "GET",
            url: "Servlet_verificarDatos",
            dataType: "text",
            data: "rut=" + $("#inputEmail3").val() + "&pass=" + $("#inputPassword3").val(),
            async:false,
            success: function(data){
                 $("#mensajeError").text(data);
                    
                    //alert($("#mensajeError").text().length);

                    if ($("#mensajeError").text().length > 3) {
                        ret= false;
                       
                    }
                    else {
                       ret= true;
                      
                    }
                   
                
            }

        });


   
        return ret;

    });



});

