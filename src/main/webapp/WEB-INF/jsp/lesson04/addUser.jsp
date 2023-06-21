<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<div calss = container"">
   <h1>회원가입</h1>
   
   <form method="post" action="/lesson04/ex01/add_user">
   		<div class="form-group">
   			<label for="name">이름</label>
   			<input type="text" id = "name" name ="name" class="form-controll col-3" palceholer="이름을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="yyyymmdd">생년월일</label>
   			<input type="text" id = "yyyymmdd" name ="yyyymmdd" class="form-controll col-3" palceholer="생년월일(예,19990101)을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="email">email</label>
   			<input type="text" id = "email" name ="email" class="form-controll col-3" palceholer="이메일을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="introduce">자기소개</label>
   			<textarea  id = "introduce" name ="introduce" class="form-controll col-3"></textarea>
   		</div>
        <input type="submit" class="btn btn-info" value="회원가입">
   
   </form>
   
</div>   
</body>
</html>