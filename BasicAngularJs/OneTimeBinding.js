var app = angular.module("app" , [])

app.controller("OneTimeBindingController" ,['$scope',  function($scope)
{
    var counter = 0;
    var names = ["John", "Thomson", "Bob", "Charlie"];
    $scope.onClick = function(clickEvent){
        $scope.name = names[counter % names.length];
        counter++;
    }
}])