<div class="container">

	<!-- Display actual products -->
	<div class="col-md-9"></div>

	<!-- Added Breadcrumb component-->

	<div class="col-md-9">
		<div class="col-lg-12"></div>
		<c:if test="${userClickAllProducts == true }">
			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home</a></li>
				<li class="active">All Products</li>
			</ol>
		</c:if>

		<c:if test="${userClickCategoryProducts == true }">
			<ol class="breadcrumb">

				<li><a href="${contextRoot}/home">Home</a></li>
				<li class="active">Category</li>
				<li class="active">${category.name}</li>
			</ol>
		</c:if>

		<div class="row">
			<!-- Display SideBar -->
			<div class="col-md-3">
				<%@ include file="./shared/sidebar.jsp"%>
			</div>
		</div>

	</div>

</div>