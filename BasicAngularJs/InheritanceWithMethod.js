var app = angular.module("app", [])

app.controller("MainController", function($scope){
    
    $scope.callFunction = function(){
        $scope.var = "Main-Controller"
    }
})

app.controller("SubController", function($scope){
    
    $scope.callFunction = function(){
        $scope.var = "Sub-controller"
    }
})
app.controller("ChildController", function($scope){
    
    $scope.callFunction = function(){
        $scope.var = "Child-controller"
    }
})