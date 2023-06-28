<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<%--ajax를 사용하려면 jquery 원본필요 --%>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<div class = "container">
   <h1>회원가입</h1>   
   <form method="post" action="/lesson06/ex01/add_user">
   		<div class="form-group">
   			<label for="name">이름</label>
   			<input type="text" id = "name" name ="name" class="form-controll col-3" placeholder="이름을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="yyyymmdd">생년월일</label>
   			<input type="text" id = "yyyymmdd" name ="yyyymmdd" class="form-controll col-3" placeholder="생년월일(예,19990101)을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="email">email</label>
   			<input type="text" id = "email" name ="email" class="form-controll col-3" placeholder="이메일을 입력하세요">
   		</div>
   		<div class="form-group">
   			<label for="introduce">자기소개</label>
   			<textarea  id = "introduce" name ="introduce" class="form-controll col-3"></textarea>
   		</div>
   		<!-- AJAX통신을 호출할때는 반드시 버튼을 button타입으로 지정한다(form -->
        <!-- <input type="submit" class="btn btn-info" value="회원가입"> -->
        <input type="button" id = "joinBtn" class="btn btn-info" value="회원가입">
   
   </form>
   
</div>   
<script>

   $(document).ready(function() {
	   // 1. form태그 - submit
	   // submit이 일어날때(form태그가 일어날때))
	   /*  $('form').on('submit', function(e) {
		   //e.preventDefult();//submit되는것을 막는다(화면유지)
		   //alert("서브밋 버튼 클릭");
		   //validation
		   let name = $('#name').val().trim();
		   if (name == '') {
			   alert("이름을 입력하세요");
			   return false;//서브밋 안함, 서브밋 이벤트일때는 return false
		   }
		   
		   let yyyymmdd = $('#yyyymmdd').val().trim();
		   if (!yyyymmdd) {
			   alert("생년월일을 입력하세요");
			   return false;//서브밋 안함, 서브밋 이벤트일때는 return false
		   }
		   // 여기까지 도달하면 서브밋 수행
		   alert("서브밋 수행");
	   }) */
	   
	   
	   //2) jquery의 AJAX 통신 이용하기
	   
	   
	   $('#joinBtn').on('click', function() {
   			
   			//validation
		   let name = $('#name').val().trim();
		   if (name == '') {
			   alert("이름을 입력하세요");
			   return;//서브밋 안함, 서브밋 이벤트일때는 return false
		   }
		   
		   let yyyymmdd = $('#yyyymmdd').val().trim();
		   if (!yyyymmdd) {
			   alert("생년월일을 입력하세요");
			   return;//서브밋 안함, 서브밋 이벤트일때는 return false
		   }
		   
		   let email = $('input[name=email]').val().trim();
		   let introduce = $('input[name=introduce]').val();
		   
		   console.log(name);
		   console.log(yyyymmdd);
		   console.log(email);
		   console.log(introduce);
		   
		   // 서버전송 - AJAX 통신 - 브라우저가 하는걸 AJAX가 다한다
		   /*$.ajax({
			   // request
			   type:"post" //"POST"도 가능
			   ,url:"/lesson06/ex01/add_user" // 뷰페이지로 절대 보내지 않음
			   ,data:{"name":name, "yyyymmdd":yyyymmdd, "email":email,"introduce":introduce}
		   
			   // response , d는 response의 결과값
			   ,success:function(d){
				   alert(d);
				   if(d=="성공") {
					   location.href = "/lesson06/ex01/after_add_user_view";
				   }else {
					   alert("회원가입에 실패했습니다.");
				   }
			   }   
			   ,complete:function() {
				   alert("성공이든 실패든 완료되면 띄워진다");
			   }	   
			   ,error:function(request, status, error) {
				   alert(request);
				   alert(status);
				   alert(error);
			   }
		   })*/
   		})  
   })

</script>
</body>
</html>