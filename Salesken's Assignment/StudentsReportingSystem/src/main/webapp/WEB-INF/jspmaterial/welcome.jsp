
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>

<style>
    

    #container{
        width: 25%;
        margin: auto;
        padding: 35px 10px;

    }
    a{
        display: block;
        text-decoration: none;
        font-size: large;
        padding:20px 20px;
        text-align: center;
        border: 3px dotted royalblue;
    }
    a:hover{
        background-color: black;
        color: red;
        cursor: pointer;
    }


</style>

<body>

<h1> Welcome to student record system </h1>
<div id="container">
    <a href="/saveStudent">Add Student</a>
    <br>
    <a href="/getPercentage">Average Percentage of class</a>
    <br>
    <a href="/avgMarks">Average marks of Students in a subject</a>
    <br>
    <a href="/topTwo">Top 2  student</a>
</div>


</body>
</html>