var app = angular.module('xremApp', ['ngRoute', 'xremControllers']);

app.config(['$routeProvider', function($routeProvider){
	$routeProvider.when('/',{
		templateUrl: 'app/views/admin/home.html',
		controller: 'AdminHomeCtrl'
	}).otherwise({
		redirectTo: '/'
	});
}]);

var controllers = angular.module('xremControllers', []);
var services = angular.module('xremServices', []);