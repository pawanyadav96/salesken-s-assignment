<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Average Marks</title>
</head>
<style>
   
    
    form{
        display: flex;
        flex-direction: column;
        border-radius: 10px;
        width: 20%;
        gap: 15px;
        border: 5px solid red;
        padding: 25px 20px;
        margin: auto;
    }
    input{
        padding: 20px;
        border-radius: 5px;
        font-size: 15px;
    }
    button{
        text-decoration: double;
        padding: 20px;
        border-radius: 10px;
        color: black;
        background-color: yellow
        
    }
  
</style>

<body>

<h1>Average By Subject</h1>
<form method="post">
    <input type="text" name="subject" placeholder="Subject name">
    <br>
   
    <button>Submit</button>
</form>

</body>
</html>