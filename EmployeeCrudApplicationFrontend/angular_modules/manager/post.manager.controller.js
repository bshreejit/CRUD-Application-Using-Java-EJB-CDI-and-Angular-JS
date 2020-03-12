(function () {
    angular.module('app.manager')
        .controller('ManagerPostController', function ($scope, $http) {
            $scope.testcontroller = "TEST SUCCEEDED!"
            $scope.phonenumbers = [''];

            // POST Methods
            $scope.createManager = function (addmanager) {
                console.log("Inside post method");
                console.log(addmanager);
                $http.post('http://localhost:9090/EmployeesCrudApplication-web/webresources/managercrud/savemanager',
                    JSON.stringify(addmanager))
                    .then(function successCallback(response) {
                        alert("Manager data has been successfully added.");
                    }, function errorCallback(response) {
                        alert("Error while adding manager data. Try Again!");
                    });
            };

            $scope.addPhone = function () {
                $scope.phonenumbers.push('');
            }
        })
})();