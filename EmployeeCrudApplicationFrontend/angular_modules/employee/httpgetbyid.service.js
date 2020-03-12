(function () {
  angular.module('app.employee', [])
    .factory('getByIdService', ['$scope', '$http', function ($scope, $http) {
      var editemployeedata = {};
      editemployeedata.getDataById = function (employeeid) {
        console.log("Requesting the data by id!!")
        $http({
          method: 'GET',
          url: "http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/getemployeebyid/" + employeeid
        }).then(
          function successCallback(response) {
            console.log(response.data);
            return editemployeedata = response.data;
          }, function errorCallback(response) {
            alert("Sorry! No records found.");
          });
      };
      return editemployeedata;
    }])
})();