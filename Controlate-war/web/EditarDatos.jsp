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
                                <form name="sentMessage" id="contactForm" novalidate>
                                    <div class="row control-group">
                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                            <label>Dirección</label>
                                            <input type="text" class="form-control" placeholder="Direccion" id="direccion" required data-validation-required-message="Ingresa tu Dirección">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                    <div class="row control-group">
                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                            <label>Region</label>
                                            <input type="text" class="form-control" placeholder="Region" id="region" required data-validation-required-message="Ingresa tu Region">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                    <div class="row control-group">
                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                            <label>Ciudad</label>
                                            <input type="text" class="form-control" placeholder="Ciudad" id="ciudad" required data-validation-required-message="Ingresa tu Ciudad">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                    <div class="row control-group">
                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                            <label>Comuna</label>
                                            <input type="text" class="form-control" placeholder="Comuna" id="comuna" required data-validation-required-message="Ingresa tu Comuna">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                    <div class="row control-group">
                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                            <label>Celular</label>
                                            <input type="tel" class="form-control" placeholder="Telefono Celular" id="celular" required data-validation-required-message="Ingresa tu Telefono Celular.">
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                    <div class="row control-group">
                                        <div class="form-group col-xs-12 floating-label-form-group controls">
                                            <label>Contraseña</label>
                                            <input type="password"class="form-control" placeholder="Nueva Contraseña" id="pass" required data-validation-required-message="Ingresa tu contraseña."></input>
                                            <p class="help-block text-danger"></p>
                                        </div>
                                    </div>
                                    <br>
                                    <div id="success"></div>
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
