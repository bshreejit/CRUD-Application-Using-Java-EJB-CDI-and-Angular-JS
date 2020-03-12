(function () {
    angular.module('app.developer')
        .controller('DeveloperPostController', function ($scope, $http) {
            $scope.testcontroller = "TEST SUCCEEDED!"
            $scope.phonenumbers = [''];

            // Test methtod
            $scope.test = function (addemployee) {
                console.log(adddeveloper);
            }
            // POST Methods
            $scope.createDeveloper = function (adddeveloper) {
                console.log("Inside post method");
                console.log(adddeveloper);
                $http.post('http://localhost:9090/EmployeesCrudApplication-web/webresources/developercrud/savedeveloper',
                    JSON.stringify(adddeveloper))
                    .then(function successCallback(response) {
                        alert("Developer data has been successfully added.");
                    }, function errorCallback(response) {
                        alert("Error while adding developer data. Try Again!");
                    });
            };

            $scope.addPhone = function () {
                $scope.phonenumbers.push('');
            }
        })
})();