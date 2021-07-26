var app=angular.module('myApp',["ngRoute"])

app.config(function($routeProvider){
	$routeProvider.when("/one",{
		templateUrl:"one.html",
		controller:"myctrl"
	}).when("/two",{
		templateUrl:"two.html",
		controller:"myctrl2"
		
	})
	
})
app.controller('myctrl',function($scope){
	$scope.msg="im from 1st controller"
})
app.controller('myctrl2',function($scope){
	$scope.msg="im from 2nd controller"
})