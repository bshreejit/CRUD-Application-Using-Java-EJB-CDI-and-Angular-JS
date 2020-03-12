(function () {
    angular.module('app.employee')
        .controller('EmployeePostController', function ($scope, $http) {
            $scope.testcontroller = "TEST SUCCEEDED!"
            $scope.phonenumbers = [''];

            // Test methtod
            $scope.test = function (addemployee) {
                console.log(addemployee);
            }
            // POST Methods
            $scope.createEmployee = function (addemployee) {
                console.log("Inside post method");
                console.log(addemployee);
                $http.post('http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/saveemployee',
                    JSON.stringify(addemployee))
                    .then(function successCallback(response) {
                        alert("Employee data has been successfully added.");
                    }, function errorCallback(response) {
                        alert("Error while adding employee data. Try Again!");
                    });
            };

            $scope.addPhone = function () {
                $scope.phonenumbers.push('');
            }
        })
})