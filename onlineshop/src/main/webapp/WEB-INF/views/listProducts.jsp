<div class="container">

	<div class="row">
		<!-- would be to dispaly sidebar  -->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>



		</div>
		<!-- To dispaly the product  -->
		<div class="col-md-9">
			<!-- added breadCrumb Component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home"></a></li>
							<li class=" active">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userClickAllProducts==true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home"></a></li>
							<li class=" active">Category</li>
							<li class=" active">${category.name}</li>
						</ol>
					</c:if>
				</div>

			</div>
		</div>


	</div>





</div>