var app = angular.module('app', [])


app.controller('FormController', ['$scope', function($scope) {
    $scope.master = {};
          
    $scope.update = function(user) {
        $scope.master = angular.copy(user);
    };
          
    $scope.reset = function() {
        $scope.user = angular.copy($scope.master);
    };

    $scope.reset();
}]);


app.directive("username" ,  function(modelValue, viewValue){
    return {
        
    }
})