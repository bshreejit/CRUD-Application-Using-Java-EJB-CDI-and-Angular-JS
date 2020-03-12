(function () {
    angular.module('app.manager', [])
        .factory("getAllManagers", function ($http) {
            var data = {};
            data.get = $http.get('http://localhost:9090/EmployeesCrudApplication-web/webresources/managercrud/getallmanagers').then(function (response) {
                return response.data;
            },
                function (error) {
                    console.log("The request failed : " + error);
                }
            );
            data.getAllManagers = function () {
                return data.get;
            };
            return data;
        })
})();