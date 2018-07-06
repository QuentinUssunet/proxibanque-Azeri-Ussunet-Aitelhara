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

				<li role="presentation"><a href="index.jsp"><span
						class="glyphicon glyphicon-off" aria-hidden="true"></span>
						Se Déconnecter</a></li>

			</ul>

			<ul class="nav navbar-right">

				<form method="post">
					<input id="title" name="title" placeholder=" Name search " />
					<button class="btn btn-success">Valider</button>
				</form>

			</ul>

		</div>



		<!-- Banner -->

		<div id="banner">

			<h2>Application ProxiBanque</h2>

			<p>Bienvenue dans votre espace ProxiBanque</p>

			<br>



			<!-- Liste des comptes du client -->

			<div class="panel panel-default">

				<div class="panel-heading">

					Liste des comptes de:

					<c:out value="${client.prenom}" />

					<c:out value="${client.nom}" />

				</div>

				<div class="panel-body">

					<table class="table">

						<thead>

							<tr>

								<th>id</th>

								<th>Numero de compte</th>

								<th>Type de compte</th>

								<th>Date d'ouveture</th>

								<th>Type de Carte Bancaire</th>

								<th>Solde</th>

							</tr>

						</thead>

						<tbody>

							<c:forEach var="compte" items="${client.comptes}">

								<tr>

									<th><c:out value="${compte.id}" /></th>

									<th><c:out value="${compte.numeroDeCompte}" /></th>

									<td><c:out value="${compte.getClass().getSimpleName()}" /></td>

									<c:choose>
										<c:when
											test="${compte.getClass().getSimpleName() == 'CompteCourant'}">
											<td><c:out value="${compte.decouvert}" /></td>
										</c:when>
										<c:otherwise>
											<td><c:out value="--" /></td>
										</c:otherwise>
									</c:choose>

									<c:choose>
										<c:when
											test="${compte.getClass().getSimpleName() == 'CompteEpargne'}">
											<td><c:out value="${compte.taux}" /></td>
										</c:when>
										<c:otherwise>
											<td><c:out value="--" /></td>
										</c:otherwise>
									</c:choose>

									<th><c:out value="${compte.dateOuverture}" /></th>

									<th><c:out value="${compte.cb}" /></th>

									<th><c:out value="${compte.solde} Euro" /></th>

								</tr>

							</c:forEach>

						</tbody>

					</table>

				</div>

			</div>

			<c:url value="/" var="chemin" />

			<br>

			<form action="${chemin}virement" method="get"
				class="form-inline form-group container">

				<button type="submit" class="btn btn-success">Modifier
					votre Profil</button>

			</form>

			<br>

			<form action="${chemin}consulter" method="post"
				class="form-inline form-group container">

				<label for="idCompte">ID Compte </label> <select
					class="form-control" name="idCcompte" id="idCompte">

					<c:forEach var="compte" items="${listeCompte}">

						<option value="${compte.id}"><c:out value="${compte.id}" /></option>

					</c:forEach>

				</select>

				<button type="submit" class="btn btn-success">Effecteur un
					Retrait</button>

			</form>


			<br>
			
			
			<!-- A CHANGER POUR UN LIENT PLUTOT QU'UN FORM BOUTON -->
			<form action="${chemin}virement" method="get"
				class="form-inline form-group container">

				<button type="submit" class="btn btn-success">Effectuer un
					Virement</button>

			</form>

		</div>


		</div>

		</section>


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