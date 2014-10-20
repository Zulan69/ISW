<%-- 
    Document   : layout
    Created on : 15-10-2014, 16:41:12
    Author     : Hector
--%>

<%@tag description="Overall template" pageEncoding="UTF-8"%>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="scripts" fragment="true" %>
<%@attribute name="title" fragment="true" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:invoke fragment="title"></jsp:invoke>
            <link rel="icon" type="image/png" href="images/favicon.png" />
            <!-- Latest compiled and minified CSS -->
            <link rel="stylesheet" href="bootstrap-3.2.0/css/bootstrap.css">
            <link rel="stylesheet" href="freelancer/css/freelancer.css">
            <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
            <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
            <!-- Optional theme -->

            <link rel="stylesheet" href="css/styles.css">
            <!-- Latest compiled and minified JavaScript -->
            
            <script src="jquery/jquery-2.1.1.js"></script>
            <script src="bootstrap-3.2.0/js/bootstrap.js"></script>
        <jsp:invoke fragment="scripts"></jsp:invoke>
        </head>
        <body>
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
                            <a href="Ficha.jsp">
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
                            <a href="EditarDatos.jsp">
                                <span class="glyphicon glyphicon-user"></span> Editar Datos <span class="badge"></span>
                            </a>
                        </li>
                        <li  id="Examenes" class="">
                            <a href="Examenes.jsp">
                                <span class="glyphicon glyphicon-zoom-in"></span> Examenes <span class="badge"></span>
                            </a>
                        </li>
                        <li 
                            class=" salir">
                            <a href="login.jsp" >
                                <span class="glyphicon glyphicon-log-out"></span><tex> Salir</tex> <span class="badge"></span>
                            </a>
                        </li>
                        
                        </ul>
                        <br><br><br>
                        <div ><h3> Bienvenido : <%= request.getSession(true).getAttribute("user").toString() %></h3></div>
                        
                        
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
                <!-- /.container-fluid -->
            </nav>
            <header>
            <div  class="container">
                
                <jsp:doBody/>
            </div>
            </header>
            <div id="pagefooter">
                <jsp:invoke fragment="footer"/>
            </div>
        
    </body>
</html>