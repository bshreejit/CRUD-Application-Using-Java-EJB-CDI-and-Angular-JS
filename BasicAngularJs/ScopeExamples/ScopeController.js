var app = angular.module("app", [])

app.controller("GreetController", function($scope,$rootScope){
    $scope.name = 'World';
    $rootScope.department = 'AngularJS';
})

app.controller("ListController", function($scope){
    $scope.names = ['Ajay', 'Saman', 'Hari'];
})