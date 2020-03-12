var app = angular.module("app", [])

app.controller("MainController", function($scope){
    $scope.greeting = {var : "Morning"}
})

app.controller("SubController" , function($scope){
    $scope.greeting  = {var: "Afternoon"}
})

app.controller("ChildController" , function($scope){
    $scope.greeting = {var : "Evening"}
})