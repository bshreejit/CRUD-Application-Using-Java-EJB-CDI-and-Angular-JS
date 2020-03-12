(function () {
  angular.module('app.employee', [])
    .factory('postService', ['$http', function ($http) {

      factory.post = function () {
        return $http({
          method: 'POST',
          url: 'http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/saveemployee',
          data: $scope.employee
        }).then(function successCallback(response) {
          $scope.employee.push(response.data);
          alert("New Employee has been added Successfully");
          return null;
        }, function errorCallback(response) {
          alert("Error while adding new employee. Try Again!");
        });
      }
      return post;
    }])
})();