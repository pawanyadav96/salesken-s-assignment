<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Student Data</title>
</head>
<style>
   
    h1{
        text-align: center;
        color: red;
        
    }
    
    form{
        display: flex; 
        flex-direction: column;
        width: 30%;
        gap: 5px;
        border: 3px solid yellow;
        padding: 30px 20px;
        margin: auto;
    }
    input{
        padding: 15px;
        border-radius: 5px;
        font-size: 12px;
    }
    button{
        padding: 20px;
        border-radius: 5px;
        color: red;
        background-color: yellow;
        
    }
    button:hover{
        background-color: red;
        color: white;
    }
</style>
<body>

<h1>Save Student </h1>
<form method="post">
    <input type="number" name="studentId" placeholder="Student Id">
    <br>
    <input type="text" name="studentName" placeholder="Student Name">
    <br>
    <input type="number" name="mathematics" placeholder="Mathematics Marks">
    <br>
    <input type="number" name="science"placeholder="Science Marks">
    <br>
    <input type="number" name="english" placeholder="English Marks">
    <br>
    <input type="number" name="semester" placeholder="Semester">
    <br>
    <button>Submit</button>
</form>

</body>
</html>