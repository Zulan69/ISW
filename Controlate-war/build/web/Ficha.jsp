

<%@page import="cl.controlate.web.clases.Tutores"%>
<%@page import="cl.controlate.web.clases.Controles"%>
<%@page import="cl.controlate.web.clases.Citas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="cl.controlate.web.clases.Medicamentos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>

        <%@include file="pageIncludes/imports.jsp" %>
        <!-- Latest compiled and minified CSS -->

    </head>
    <body>
        <%@include file="pageIncludes/barraNav.jsp" %>
        <script src="js/ficha.js"></script>
        <header>
            <div class="container ">
                <div class="container">  
                    <!-- barra de navegacion modulo-->

                    <!-- Nav tabs -->
                    <ul id="list-nav-ficha" class="nav nav-tabs panel" role="tablist">
                        <li class="active">
                            <button type="button" id="btn-medicamentos" class="btn btn-primary">Medicamentos</button>
                            <!-- <a href="#medicamentos" role="tab" data-toggle="tab">Medicamentos</a> -->
                        </li>
                        <li>
                            <button type="button" id="btn-citas" class="btn btn-primary">Citas</button>
                        </li>
                        <li>
                            <button type="button" id="btn-controles" class="btn btn-primary">Controles</button>
                        </li>
                        <li>
                            <button type="button" id="btn-tutores" class="btn btn-primary">Mis tutores</button>
                        </li>
                        <li>
                            <button type="button" id="btn-tutorados" class="btn btn-primary">Mis tutorados</button>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <!-- medicamentos -->
                        <div id="div-medicamentos"  class="panel panel-success">
                            <div class="panel-heading"> Medicamentos</div>
                            <div class="panel-body">

                                <table class="display  table datatables" >
                                    <thead>

                                        <tr>
                                            <th> Nombre </th>
                                            <th> Dosis </th>
                                            <th> Fecha consumo </th>
                                            <th> Alarma </th>
                                            <th> Tratamiento </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            if (request.getAttribute("medicamentos") != null) {
                                                ArrayList<Medicamentos> med = (ArrayList<Medicamentos>) request.getAttribute("medicamentos");
                                                for (Medicamentos item : med) {
                                                    out.println("<tr >");
                                                    out.println("<td>");
                                                    out.println(item.getNombre());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getSuministro());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getFecha());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getAlarma());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getNombreTratamiento());
                                                    out.println("</td>");

                                                    out.println("</tr>");
                                                }
                                            } else {
                                                out.println("<tr >");
                                                out.println("<td colspan='4'>");
                                                out.println("No tiene medicamentos proximos");
                                                out.println("</td>");
                                            }
                                        %>
                                    </tbody>
                                </table>

                            </div>

                        </div>

                        <!-- controles -->
                        <div id="div-controles" class="panel panel-success">
                            <div class="panel-heading"> Controles</div>
                            <div class="panel-body">

                                <table class="display  table" >
                                    <thead>

                                        <tr>
                                            <th> Nombre </th>
                                            <th> Fecha </th>
                                            <th> Tratamiento </th>
                                            <th> Alarma </th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            if (request.getAttribute("controles") != null) {
                                                ArrayList<Controles> ctr = (ArrayList<Controles>) request.getAttribute("controles");
                                                for (Controles item : ctr) {
                                                    out.println("<tr >");
                                                    out.println("<td>");
                                                    out.println(item.getNombre());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getFecha());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getEspecialidad());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getAlarma());
                                                    out.println("</td>");

                                                    out.println("</tr>");
                                                }
                                            } else {
                                                out.println("<tr >");
                                                out.println("<td colspan='4'>");
                                                out.println("No tiene controles proximos");
                                                out.println("</td>");

                                                out.println("</tr>");
                                            }
                                        %>
                                    </tbody>
                                </table>

                            </div>

                        </div>

                        <!-- citas -->
                        <div id="div-citas" class="panel panel-success">
                            <div class="panel-heading"> Citas</div>
                            <div class="panel-body">

                                <table class="display  table" >
                                    <thead>

                                        <tr>
                                            <th> Nombre Doctor </th>
                                            <th> Especialidad </th>
                                            <th> Fecha consulta </th>
                                            <th> Alarma </th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            if (request.getAttribute("citas") != null) {
                                                ArrayList<Citas> citas = (ArrayList<Citas>) request.getAttribute("citas");
                                                for (Citas item : citas) {
                                                    out.println("<tr >");
                                                    out.println("<td>");
                                                    out.println(item.getNombre());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getEspecialidad());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getFecha());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getAlarma());
                                                    out.println("</td>");

                                                    out.println("</tr>");
                                                }
                                            } else {
                                                out.println("<tr >");
                                                out.println("<td colspan='4'>");
                                                out.println("No tiene citas proximas");
                                                out.println("</td>");

                                                out.println("</tr>");
                                            }
                                        %>
                                    </tbody>
                                </table>

                            </div>

                        </div>
                        <!-- tutorados -->
                        <div id="div-tutorados" class="panel panel-success">
                            <div class="panel-heading"> Tutorados</div>
                            <div class="panel-body">

                                <table class="display  table" >
                                    <thead>

                                        <tr>
                                            <th> Nombre </th>
                                            <th> Dosis </th>
                                            <th> Fecha consumo </th>
                                            <th> Alarma </th>
                                            <th> Tratamiento </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            if (request.getAttribute("medicamentos") != null) {
                                                ArrayList<Medicamentos> med = (ArrayList<Medicamentos>) request.getAttribute("medicamentos");
                                                for (Medicamentos item : med) {
                                                    out.println("<tr >");
                                                    out.println("<td>");
                                                    out.println(item.getNombre());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getSuministro());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getFecha());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getAlarma());
                                                    out.println("</td>");

                                                    out.println("<td>");
                                                    out.println(item.getNombreTratamiento());
                                                    out.println("</td>");

                                                    out.println("</tr>");
                                                }
                                            } else {

                                            }
                                        %>
                                    </tbody>
                                </table>

                            </div>

                        </div>
                        <!-- tutores -->
                        <div id="div-tutores" class="panel panel-success">
                            <div class="panel-heading"> Tutores</div>
                            <div class="panel-body">

                                <table class="display  table" >
                                    <thead>

                                        <tr>
                                            <th> Nombre </th>
                                            
                                            <th> Parentesco </th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            if (request.getAttribute("tutores") != null) {
                                                ArrayList<Tutores> tut = (ArrayList<Tutores>) request.getAttribute("tutores");
                                                for (Tutores item : tut) {
                                                    out.println("<tr >");
                                                    out.println("<td>");
                                                    out.println(item.getNombre());
                                                    out.println("</td>");

                                                   
                                                    out.println("<td>");
                                                    out.println(item.getParentesco());
                                                    out.println("</td>");

                                                    out.println("</tr>");
                                                }
                                            } else {

                                            }
                                        %>
                                    </tbody>
                                </table>

                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </header>

    </body>

</html>



