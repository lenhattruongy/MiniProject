app = angular.module("admin-app",["ngRoute"]);

app.config(function($routeProvider){
	$routeProvider
	.when("/product",{
		templateUrl:"/assets/admin/product/index.html",
		controller:"product-ctrl"
	})
	.when("/authorize",{
		templateUrl:"/assets/admin/authority/index.html",
		controller:"authority-ctrl"
	})
	.when("/anauthorized",{
		 templateUrl:"/assets/admin/authority/anauthorized.html",
		 controller: "authority-ctrl"
	})
	.otherwise({
		template:"<h1 class='text-center'></h1>"
	});
})