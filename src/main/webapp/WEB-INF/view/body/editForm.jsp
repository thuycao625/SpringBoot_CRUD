<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<div style="margin: 5%">
	<h1>Edit Student</h1>

		<form class="form-group"  action="<%=request.getContextPath()%>/edit" method="POST" style="width: 50%" >

			<input class="form-control" type="hidden" name="id" value="${data.id}"> <br>

			Name: <input class="form-control" type="text" name="name" value="${data.name}"> <br>

			Age: <input class="form-control" type="text" name="age" value="${data.age}"><br>

			License Car Number: <input class="form-control" type="text" name="license_number"
			value="${data.license_number}"> <br>

			<input class="btn btn-success" type="submit" value="edit" style="margin-top: 30px; width: 100%">
		</form>
	</div>
</body>
</html>