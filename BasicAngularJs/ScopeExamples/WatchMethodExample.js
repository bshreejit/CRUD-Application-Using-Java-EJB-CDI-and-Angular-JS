var app = angular.module("app", [])

app.controller("MainController", function($scope){
    $scope.message= "Hello"
    $scope.$watch('text', function(newvalue, oldvalue){
        $scope.newmessage= newvalue
        $scope.oldmessage = oldvalue
    })
})