<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html" ; "charset=UTF-8">
<title>Área y perímetro de figuras geométricas</title>
<!--Bootsrap 5 CDN-->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<!--Fontawesome CDN-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
<!-- Estilos personalizados -->
<link rel="stylesheet" type="text/css" href="css/estilos.css">
<!--error en chrome a partir del 2020-->
<link rel="shortcut icon" href="#">
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>Calcurar área y perímetro</h3>
				</div>
				<div class="card-body">
					<form action="IndexServlet" method="post">
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Figura</span>
							</div>
							<select name="comboFiguras" class="form-control" id="comboFiguras">
								<option value="seleccione">Seleccione</option>
								<option value="cuadrado">Cuadrado</option>
								<option value="circulo">Círculo</option>
								<option value="rectangulo">Rectángulo</option>
								<option value="rombo">Rombo</option>
								<option value="trapecio">Trapecio</option>
								<option value="triangulo">Triángulo</option>
							</select>
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Lado</span>
							</div>
							<input type="text" class="form-control" name="lado"
								placeholder="cms">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Base</span>
							</div>
							<input type="text" class="form-control" name="base"
								placeholder="cms">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Altura</span>
							</div>
							<input type="text" class="form-control" name="altura"
								placeholder="cms">
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Radio</span>
							</div>
							<input type="text" class="form-control" name="radio"
								placeholder="cm">
						</div>
						<div><h4 style="color:white ;" >Resultados</h4></div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Area</span>
							</div>
							<p class="form-control"><%=request.getAttribute("area") %></p>
						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text">Perimetro</span>
							</div>
							<p class="form-control"><%=request.getAttribute("perimetro") %></p>
						</div>	
						<div class="form-group">
							<input type="submit" value="Evaluar"
								class="btn float-right login_btn">
						</div>
					</form>
				</div>
				<div class="card-footer"></div>
			</div>
		</div>
	</div>
</body>
</html>