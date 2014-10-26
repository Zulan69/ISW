/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    $("#barraNavegacion").children().each(function () {
        $(this).removeClass("active");
    });
    $("#barraNavegacion").children("#Ficha").addClass("active");

   // $('.datatables').dataTable().fnDestroy();
   // $('.datatables').DataTable();

    $("#div-medicamentos").hide();

    $("#div-controles").hide();
    $("#div-tutores").hide();
    $("#div-tutorados").hide();
    $("#div-citas").hide();

    //botones
    $("#btn-medicamentos").click(function () {
        removerActivos();
        $(this).removeClass("btn-primary");
        $(this).addClass("btn-success");
        $("#div-medicamentos").show();

        $("#div-controles").hide();
        $("#div-tutores").hide();
        $("#div-tutorados").hide();
        $("#div-citas").hide();
    });

    $("#btn-controles").click(function () {
        removerActivos();
        $(this).removeClass("btn-primary");
        $(this).addClass("btn-default");
        $("#div-controles").show();

        $("#div-medicamentos").hide();
        $("#div-tutores").hide();
        $("#div-tutorados").hide();
        $("#div-citas").hide();
    });

    $("#btn-citas").click(function () {
        removerActivos();
        $(this).removeClass("btn-primary");
        $(this).addClass("btn-default");
        $("#div-controles").hide();

        $("#div-medicamentos").hide();
        $("#div-tutores").hide();
        $("#div-tutorados").hide();
        $("#div-citas").show();
    });

    $("#btn-tutores").click(function () {
        removerActivos();
        $(this).removeClass("btn-primary");
        $(this).addClass("btn-default");
        $("#div-tutores").show();
        $("#div-controles").hide();
        $("#div-medicamentos").hide();

        $("#div-tutorados").hide();
        $("#div-citas").hide();
    });

    $("#btn-tutorados").click(function () {
        removerActivos();
        $(this).removeClass("btn-primary");
        $(this).addClass("btn-default");
        $("#div-tutorados").show();

        $("#div-controles").hide();
        $("#div-medicamentos").hide();
        $("#div-tutores").hide();
        $("#div-citas").hide();
    });
});

function removerActivos() {

    $("#list-nav-ficha").children().each(function () {
        $(this).children().removeClass("btn-default");
        $(this).children().addClass("btn-primary");
    });
}
