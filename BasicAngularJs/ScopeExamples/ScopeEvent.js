var app = angular.module("app", [])

app.controller("EventController", function($scope){
    $scope.count = 0;
    $scope.$on('MyEvent', function() {
      $scope.count++;
    });    

})