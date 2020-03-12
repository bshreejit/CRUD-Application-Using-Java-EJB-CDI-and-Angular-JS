(function(){
    angular.module('app.developer', [])
        .factory("getAllDevelopers", function($http){
                var data = {};
                data.get = $http.get('http://localhost:9090/EmployeesCrudApplication-web/webresources/developercrud/getalldevelopers').then(function(response){
                        return response.data;
                },
                function(error){
                        console.log("The request failed : " + error);
                    }
                );
                data.getAllDevelopers = function(){
                    return data.get;
                };
                return data;
            })
})();