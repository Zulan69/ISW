<%-- 
    Document   : Login
    Created on : 15-oct-2014, 15:56:38
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib prefix="t" tagdir="/WEB-INF/tags/" %>

<%
    String mensaje = "";
    if (request.getAttribute("mensaje") != null) {

        mensaje = request.getAttribute("mensaje").toString();
        
        
    }
%>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="freelancer/css/freelancer.css">
    <link rel="stylesheet" href="css/styles.css">
     <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    <!-- Latest compiled and minified JavaScript -->
    <script src="jquery/jquery-2.1.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <<script src="freelancer/js/freelancer.js"></script>



</head>


<body>

    <!-- Button trigger modal -->
     <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" >Controlate</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        
                    </li>
                    <li class="page-scroll">
                        
                    </li>
                    <li class="page-scroll">
                        
                    </li>
                    <li class="page-scroll">
                        <a data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-log-in"></span> Entrar <span class="badge"></span></a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    
    
<!--    <button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
        INICIA SESIÓN 
    </button>-->
 <header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src="freelancer/img/profile.png" alt="">
                    <div class="intro-text">
                        <span class="name">Controlate</span>
                        <hr class="star-light">
                        <span class="skills">Para tener mas salud!</span>
                    </div>
                </div>
            </div>
        </div>
    </header>


    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">

            <div class="container">
                <div class="row">
                    <div class="col-md-5 col-md-offset-1">
                        <div class="panel panel-default">
                            <div class="panel-heading"> 
                                
                                <div class="left">
                                    <span class="glyphicon glyphicon-log-in"></span> Entrar <span class="badge"></span>
                                </div>
<!--                                <div class="right">
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
                                </div>-->
                                        
                            </div>

                            <div class="panel-body">
                                <form id="form-login" action="Servlet_login" class="form-horizontal" role="form">
                                    <div class="form-group">
                                        <label for="rut" class="col-sm-3 control-label">Rut</label>
                                        <div class="col-sm-9">
                                            <input type="text" placeholder="Rut" name="rut" class="form-control" id="inputEmail3" required="" >
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="inputPassword3" class="col-sm-3 control-label">Contraseña</label>
                                        <div class="col-sm-9">
                                            <input type="password" placeholder="Contraseña "name="pass"  class="form-control" id="inputPassword3" required="">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-offset-3 col-sm-9">
                                            <div class="checkbox">
                                                <label class="">
                                                    <input type="checkbox" class="">Recordar</label> 
                                            </div>
                                        </div>
                                    </div>

                                    <div class="form-group last">
                                        <div class="col-sm-offset-3 col-sm-9">
                                            <input type="submit" value="Inicia Session" class="btn btn-success btn-sm" />
                                            <button type="reset" class="btn btn-default btn-sm">Limpiar</button>
                                            <p class="text-danger" id="mensajeError"><%= mensaje %></p>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="panel-footer">
                                ¿No estas registrado? <a href="#" class="">Registrate</a>
                                 <div class="rightBottom">
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Cerrar</button>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>


