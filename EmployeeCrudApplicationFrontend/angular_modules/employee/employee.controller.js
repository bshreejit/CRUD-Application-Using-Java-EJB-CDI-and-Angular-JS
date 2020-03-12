(function(){
  angular.module('app.employee')
    .controller("EmployeeController", ['$scope', 'getService', '$http' , function($scope, getService, $http){
    
    $scope.submit = true;
    $scope.addemployee = {}
    $scope.employees=[];
    $scope.editemployeedata = {};
    $scope.phonenumbers = {};
    $scope.testcontroller= "TEST SUCCEEDED!!"

    // GET All Employees Details
    $scope.getAllData = function(){
        getService.getAllEmployees().then(function(response) {
            $scope.employees = response;
        });
    };
  
    //Get Employee Details to edit by ID
    $scope.getDataById = function(employeeid){
      console.log("Requesting the data by id!!")
        $http({
            method: 'GET',
            url: "http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/getemployeebyid/"+ employeeid
        }).then(
            function successCallback(response) {
              console.log(response.data);
              $scope.editemployeedata = response.data;
              $scope.$broadcast('broadcast', $scope.editemployeedata);
          }, function errorCallback(response) {
            alert("Sorry! No records found.");
          });
    };

    //Get Employees details by search by ID
    $scope.search = function(searchId){
        $http({
            method: 'GET',
            url: "http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/getemployeebyid/"+ searchId
          }).then(function successCallback(response) {
        
            $scope.employees = response;
        
          }, function errorCallback(response) {
        
            alert("Sorry! No records found.");
        
          });
    };
    
    // UPDATE Employee
    $scope.updateEmployee = function(updateemployee){
        $http.put('http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/updateemployee' + updateemployee.id,
                (updateemployee))
          .then(function successCallback(response) {
            alert("Employee details has been successfully updated.");
          }, function errorCallback(response) {
            alert("Error while updating employee details. Try Again!");
        });
    };

    // DELETE Method
    $scope.deleteEmployee = function(id) {
        console.log("Employee id is " + id)
        $http({
          method: 'DELETE',
          url: 'http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/deleteemployee/' + id
    
        }).then(function successCallback(response) {
          alert("Employee has deleted Successfully");   
        }, function errorCallback(response) {
          alert("Error. while deleting user Try Again!");
        });
    
      };
    
    // Reset Method
    $scope.reset = function(){
        $scope.employees= {};
    };


}])
})();