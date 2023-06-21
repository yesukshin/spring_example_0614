<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div calss = container"">
   <h1>학생가입</h1>
   
   <form method="post" action="/lesson04/ex02/add_student">
   		<div class="form-group">
   			<label for="name">이름</label>
   			<input type="text" id = "name" name ="name" class="form-controll col-3" palceholer="이름을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="phoneNumber">핸드폰</label>
   			<input type="text" id = "phoneNumber" name ="phoneNumber" class="form-controll col-3" palceholer="핸드폰을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="email">email</label>
   			<input type="text" id = "email" name ="email" class="form-controll col-3" palceholer="이메일을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="dreamJob">장래희망</label>
   			<input type="text" id = "dreamJob" name ="dreamJob" class="form-controll col-3" palceholer="장래희망을 입력하세요">
   		</div>
        <input type="submit" class="btn btn-info" value="학생가입">
   
   </form>
   
</div>   
</body>
</html>