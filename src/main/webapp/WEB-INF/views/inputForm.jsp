<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Enter Weight and Height</title>
</head>
<body>
<form action="/javax-servlets/bmi" method="post">

    <label for="weight">Weight (lbs):</label>
    <input type="number" id="weight" name="weight" required><br>
    <label for="height">Height (inches):</label>
    <input type="number" id="height" name="height" required><br>
    <button type="submit">Calculate BMI</button>
</form>
</body>
</html>
