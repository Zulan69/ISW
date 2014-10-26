<%-- 
    Document   : barraNav
    Created on : 18-10-2014, 15:08:39
    Author     : Hector
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header page-scroll">
                        
                        <a class="navbar-brand" >Controlate</a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul id="barraNavegacion" class="nav navbar-nav navbar-right">
                            <li id="Ficha"  >
                            <a href="Servlet_ficha">
                                <span class="glyphicon glyphicon-folder-open"></span> Ficha <span class="badge"></span>
                            </a>
                        </li>
                        <li id="Alarmas"  class="">
                            <a href="Alarmas.jsp">
                                <span class="glyphicon glyphicon-time"></span> Alarmas <span class="badge"></span>
                            </a>
                        </li>
                        <li  id="Citas"  class="">
                            <a href="Citas.jsp">
                                <span class="glyphicon glyphicon-calendar"></span> Citas <span class="badge"></span>
                            </a>
                        </li>
                        <li id="Tutores" class="">
                            <a  href="Tutores.jsp">
                                <span class="glyphicon glyphicon-bookmark"></span> Tutores <span class="badge"></span>
                            </a>
                        </li>
                        <li id="Editar"  class="">
                            <a href="RecuperacionDatos_Editar">
                                <span class="glyphicon glyphicon-user"></span> Editar Datos <span class="badge"></span>
                            </a>
                        </li>
                        <li  id="Examenes" class="">
                            <a href="Examenes.jsp">
                                <span class="glyphicon glyphicon-zoom-in"></span> Examenes <span class="badge"></span>
                            </a>
                        </li>
                        <li  class=" salir">
                            <a href="Servlet_salir" >
                                <span class="glyphicon glyphicon-log-out"></span><tex> Salir</tex> <span class="badge"></span>
                            </a>
                        </li>
                        </ul>
                        <h1><span class="label label-info ">Bienvenido <%= request.getSession(true).getAttribute("usuario").toString() %></span></h1>
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
                
                <!-- /.container-fluid -->
            </nav>
