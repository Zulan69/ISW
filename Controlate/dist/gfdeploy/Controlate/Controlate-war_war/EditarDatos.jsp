<%-- 
    Document   : Citas
    Created on : 15-10-2014, 18:05:22
    Author     : Hector
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@taglib prefix="t" tagdir="/WEB-INF/tags/" %>
<t:layout>
    <jsp:attribute name="title"><title>Editar Datos</title></jsp:attribute>
    <jsp:attribute name="scripts">
        <script src="js/editarDatos.js"></script>

    </jsp:attribute>

    <jsp:attribute name="header">
        <h1>Bienvenido</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">

    </jsp:attribute>
    <jsp:body>
        <!-- Contact Section -->
        <section id="contact">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2>Edita tus Datos</h2>
                        <hr class="star-primary">
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2">
                        <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
                        <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
                        <form action="Servlet_CambioDatos" name="sentMessage" id="contactForm" novalidate>

                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Ficha</h6>
                                    <h3>${Ficha}</h3>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Nombre</h6>
                                    <h3>${Nombre}</h3>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Rut</h6>
                                    <h3>${Rut}</h3>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Fecha de Nacimiento</h6>
                                    <h3> ${FechaNac}</h3>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Genero</h6>
                                    <h3> ${Genero}</h3>
                                </div>
                            </div>   
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls ">
                                    <h6>Dirección</h6>
                                    <input name="Direccion" type="text" class="form-control" placeholder="Direccion" id="direccion" required data-validation-required-message="Ingresa tu Dirección" value="${Direccion}">

                                    <p class="help-block text-danger"></p>

                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls ">
                                    <h6>Region</h6>
                                    <input name="Region" type="text" class="form-control" placeholder="Region" id="region" required data-validation-required-message="Ingresa tu Region" value="${Region}">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Comuna</h6>
                                    <input name="Comuna" type="text" class="form-control" placeholder="Comuna" id="region" required data-validation-required-message="Ingresa tu Comuna" value="${Comuna}">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Ciudad</h6>
                                    <input name="Ciudad" type="text" class="form-control" placeholder="Ciudad" id="ciudad" required data-validation-required-message="Ingresa tu Ciudad" value="${Ciudad}">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Celular</h6>
                                    <input name="Celular" type="text" class="form-control" placeholder="Celular" id="comuna" required data-validation-required-message="Ingresa tu Celular" value="${Celular}">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Email</h6>
                                    <input name="Email" type="text" class="form-control" placeholder="Email" id="celular" required data-validation-required-message="Ingresa tu Email." value="${Email}">
                                    <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Previsión</h6>
                                    <h3> ${Prevision}</h3>
                                </div>
                            </div>                
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Tipo de Sangre</h6>
                                    <h3> ${TipoSangre}</h3>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Estatura</h6>
                                    <h3> ${Estatura}</h3>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <h6>Peso</h6>
                                    <h3> ${Peso}</h3>
                                </div>
                            </div>
                            <div class="row control-group">
                                <div class="form-group col-xs-12 floating-label-form-group controls">
                                    <label>Contraseña</label>
                                    <input name="Pass" type="password" class="form-control" placeholder="Ingresa tu contraseña para validar los cambios" id="pass" required data-validation-required-message="Ingresa tu Contraseña."><br
                                        <p class="help-block text-danger"></p>
                                </div>
                            </div>
                            <br>
                            <div class="row">
                                <div class="form-group col-xs-12">
                                    <button type="submit" class="btn btn-success btn-lg">Enviar </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>

    </jsp:body>
</t:layout>

