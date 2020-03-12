var app = angular.module("app", [])

app.controller("ParseController", ['$scope', '$parse',  function($scope , $parse){
    $scope.$watch('expression', function(newVal, oldVal, scope) {
        if (newVal !== oldVal) {
            var parseFun = $parse(newVal);
           $scope.parsedValue = parseFun(scope);
        }
    })
}]) 