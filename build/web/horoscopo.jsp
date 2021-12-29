<%-- 
    Document   : horoscopo
    Created on : 13/03/2021, 20:34:19
    Author     : Matheus
--%>
<%@page import="java.io.RandomAccessFile"%>
<%@page import="cl.Signo"%>
<%
    String data ="",signo,imagem,mensagem;
%>
<%
    if(request.getParameter("data")!=null)
        data = (String)request.getParameter("data");
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
        <script src="js/funcoes.js" type="text/javascript"></script>
        <title>Horóscopo Diário</title>
    </head>
    <body class="fundo">
        <section class="login-block">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="md-float-material form-material" method="POST">
                            <div class="auth-box card">
                                <div class="card-block">
                                    <div class="row">
                                        <div class="col-md-12">
                                            <h3 class="text-center heading">Insira sua data de nascimento para gerar seu Horóscopo diário!</h3>
                                        </div>
                                    </div>
                                    <form method="" onsubmit="GeraHor(this)" class="form-group form-primary"> <input type="date" class="form-control" name="data" value="" id="data"> 
                                    </br></br><div class="col-md-12"> <input type="submit" class="btn btn-primary btn-md btn-block waves-effect text-center m-b-20" name="submit" value="Gerar..."> 
                                        </div>
                                    </form>
                                    <img style="margin-left: 37%" src="" id="imagem">
                                    <h1 style="text-align: center" id="signo" class="text-center heading"></h1>
                                    <p style="text-align: center" id="mensagem" class="text-center heading"></p>
                                    <a style="align-items: right" class="btn btn-primary btn-md btn-block waves-effect text-center m-b-20" href="InvalidaSessao">Sair</a>
                                </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            
            </div>
        </section>
    </body>
</html>
