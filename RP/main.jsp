<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>

<html>

<head>

    <title> Recommend Project Subject </title>

    <meta charset="utf-8">

    <link rel="stylesheet" href="css/window.css">

    <script src="js/checkbox.js"></script>

    <link href="https://fonts.googleapis.com/css?family=Bowlby+One+SC&display=swap&subset=latin-ext" rel="stylesheet">
    <link href="https://fonts.google.com/noto/specimen/Noto+Serif+Display" rel="stylesheet" type='text/css'>
</head>

<body>

<div class="header">
    Recommend Project
    <div class="name">
        By. GochangWattaGam
    </div>
</div>

<div class="container">

    <div class="item1">
    	<form method="get" action="show.jsp">
	        <h3> Choose your interest.</h3><br><br>
	        <label><input type='checkbox' name='chk' value='app' id="app" class='chkselect'> APP</label><br><br>
	        <label><input type='checkbox' name='chk' value='web' id="web" class='chkselect'> WEB</label><br><br>
	        <label><input type='checkbox' name='chk' value='ai' id="ai" class='chkselect'> AI</label><br><br>
	        <div>
	            <button class="search_btn" type="submit" style="float: right;">
	                Search
	            </button>
	        </div>
        </form>
    </div>
</div>
<div class="footer"></div>
</body>
</html>