<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<meta charset="UTF-8">
</head>
<body>
<div class = "container">
   <h1>회원가입</h1>   
	<div class="form-group">
   		<label for="name">이름</label>
   		<div class="d-flex">
	   		<input type="text" id = "name" name ="name" class="form-controll col-3" placeholder="이름을 입력하세요">
	   		<button type="button" class="btn btn-warning" id="nameChkBtn">중복확인</button>
	   	</div>	
	   	<small id="nameStatusArea"></small>
   	</div>
   	<input type="button" id = "joinBtn" class="btn btn-info" value="회원가입"> 
</div>	
<script>
   $(document).ready(function(){
	   $('#nameChkBtn').on('click', function() {
		   let name = $('#name').val().trim();
		   
		   //이름이 입력됐는지 확인
		   if(!name) {
			   // nameStatusArea의 하위태그들을 초기화한다
			   $('#nameStatusArea').empty();//자식태그들을 모두 비움
			   $('#nameStatusArea').append('<span class="text-danger">이름이 비어있습니다</span> ');
			   return;
		   }
		   
		   //이름중복확인(AJAX통신)
		   $.ajax({
			   //request
			   type:"GET" // get일때는 생략가능
			   ,url:"/lesson06/ex02/is_duplication"
			   ,data:{"name":name}
			   	   
			   //response
			   ,success:function(data){
				   if (data.isDuplication) { //중복
					   $('#nameStatusArea').empty();//자식태그들을 모두 비움
					   $('#nameStatusArea').append('<span class="text-danger">중복된 이름입니다.</span>');
				   }
				   else{
					   $('#nameStatusArea').empty();//자식태그들을 모두 비움
				   }
					   
			   }
			   ,error:function(request,status, error){
				   alert("중복확인에 실팼습니다");			   
				   
			   }
			   
		   });
		   
	   });
	   
	   //회원가입버튼 클릭
	   $("#joinBtn").on('click', function(){
		   
		   console.log($('#nameStatusArea').children().length);
		   
		   // 만약 nameStatusArea에 아무 자식노드가 없다면 회원가입을 한다.
		   if($('#nameStatusArea').children().length == 0) {
			   alert("가입가능");	
		   }else {
			   alert("가입불가");	
		   }
		   
	   });
   });
</script>
</body>
</html>