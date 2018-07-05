<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProxiBanque</title>
<link rel="stylesheet"
	href="<c:url value = "bootstrap/css/bootstrap.min.css"></c:url>">
<link rel="stylesheet"
	href="<c:url value = "bootstrap/css/style.css"></c:url>">
<script src="<c:url value = "bootstrap/js/bootstrap.min.js"></c:url>"></script>
</head>
<body>

	<nav class="navbar navbar-inverse navbar-static-top">

		<div class="container-fluid">

			<ul class="nav navbar-left">

				<li role="presentation"><a href="clientsoperations.jsp"><span
						class="glyphicon glyphicon-home" aria-hidden="true"></span>
						Accueil ProxyBanque</a></li>

			</ul>

		</div>

		<input path="id" type="hidden" name="conseillerId"
			value="${conseillerClientele.id}" />

		<!-- Banner -->

		<div id="banner">

			<h2>Application ProxiBanque</h2>

			<p>Modifier votre profil</p>

			<br>



			<div class="container">




				<label for="adresseClient" class="col-sm-2 col-form-label">N°
					rue</label>

				<div class="col-sm-10">

					<input path="adresse" value="${client.numRue}" type="text"
						class="form-control" id="adresseClient" name="adresseClient"
						placeholder="ex:13" /> <br>

				</div>

				<label for="adresseClient" class="col-sm-2 col-form-label">Nom
					rue</label>

				<div class="col-sm-10">

					<input path="adresse" value="${client.nomRue}" type="text"
						class="form-control" id="adresseClient" name="adresseClient"
						placeholder="ex:Rue Gambetta" /> <br>

				</div>

				<label for="complementAdresse" class="col-sm-2 col-form-label">Complément
					adresse</label>

				<div class="col-sm-10">

					<input path="complementAdresse" value="${client.adressOpt}"
						type="text" class="form-control" id="complementAdressClient"
						name="complementAdressClient" placeholder="ex:Rue Gambetta" /> <br>

				</div>




				<label for="nomClient" class="col-sm-2 col-form-label">Code
					postal</label>

				<div class="col-sm-10">

					<input path="codePostal" value="${client.codePostal}" type="text"
						class="form-control" id="cpClient" name="cpClient"
						placeholder="ex:75000" /> <br>

				</div>





				<label for="villeClient" class="col-sm-2 col-form-label">Ville</label>

				<div class="col-sm-10">

					<input path="ville" value="${client.ville}" type="text"
						class="form-control" id="villeClient" name="villeClient"
						placeholder="ex:Paris" /> <br>

				</div>





				<label for="telClient" class="col-sm-2 col-form-label">Pays</label>

				<div class="col-sm-10">

					<input path="telephone" value="${client.pays}" type="text"
						pattern="" class="form-control" id="paysClient" name="paysClient"
						placeholder="ex:France" /> <br>

				</div>





				<button type="submit" class="btn btn-success btn-lg">Valider</button>
				</form>

			</div>

		</div>




		<!-- Section 1  -->
		<div id="one" class="container-fluid">
			<div class="center">
				<h2>Gestion De Compte</h2>
				<p>L'application ProxiBanque vous offre un outil de gestion pour
					répondre à vos Besoins.</p>
				<br>
			</div>
			<div id="div1" class="center col-xs-4">
				<span class="glyphicon glyphicon-refresh"></span>
				<p>Vous permet de mettre à jour vos informations.</p>
			</div>
			<div id="div1" class="center col-xs-4">
				<span class="glyphicon glyphicon-folder-open"></span>
				<p>Vous permet de consulter votre compte Courant et Epargne.</p>
			</div>
			<div id="div1" class="center col-xs-4">
				<span class="glyphicon glyphicon-euro"></span>
				<p>Vous permet d'effectuer des virements de compte à compte.</p>
			</div>
			</section>
</body>
</html>