(function () {
  angular.module('app.manager')
    .controller("ManagerController", ['$scope', 'getAllManagers', '$http', function ($scope, getAllManagers, $http) {

      $scope.submit = true;
      $scope.addmanager = {}
      $scope.managers = [];
      $scope.editmanagerdata = {}


      // GET Methods
      $scope.getAllData = function () {
        getAllManagers.getAllManagers().then(function (response) {
          $scope.managers = response;
        });
      };

      $scope.getDataById = function (managerid) {
        $http({
          method: 'GET',
          url: "http://localhost:9090/EmployeesCrudApplication-web/webresources/managercrud/getmanagerbyid/" + managerid
        }).then(
          function successCallback(response) {
            console.log(response.data);
            $scope.editmanagerdata = response.data;

          }, function errorCallback(response) {
            alert("Sorry! No records found.");
          });
      };

      $scope.search = function (searchId) {
        $http({
          method: 'GET',
          url: "http://localhost:9090/EmployeesCrudApplication-web/webresources/managercrud/getmanagerbyid/" + searchId
        }).then(function successCallback(response) {

          $scope.managers = response;

        }, function errorCallback(response) {

          alert("Sorry! No records found.");

        });
      };

      // POST Methods
      $scope.createManager = function (addmanager) {
        console.log(addmanager);
        $http.post('http://localhost:9090/EmployeesCrudApplication-web/webresources/managercrud/savemanager',
          JSON.stringify(addmanager))
          .then(function successCallback(response) {
            alert("Manager data has been successfully added.");
          }, function errorCallback(response) {
            alert("Error while adding manager data. Try Again!");
          });
      };

      // UPDATE Manager
      $scope.updateManager = function (updatemanager) {
        $http.put('http://localhost:9090/EmployeesCrudApplication-web/webresources/managercrud/updatemanager' + updatemanager.id,
          (updatemanager))
          .then(function successCallback(response) {
            alert("Manager details has been successfully updated.");
          }, function errorCallback(response) {
            alert("Error while updating manager details. Try Again!");
          });
      };

      // DELETE Method
      $scope.deleteManager = function (id) {
        console.log("Manager id is " + id)
        $http({
          method: 'DELETE',
          url: 'http://localhost:9090/EmployeesCrudApplication-web/webresources/managercrud/deletemanager/' + id

        }).then(function successCallback(response) {
        }, function errorCallback(response) {
          alert("Error. while deleting user Try Again!");
        });

      };

      // Reset Method
      $scope.reset = function () {
        $scope.employees = {};
      };


    }])
})();