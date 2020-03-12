(function(){
    angular.module("app.employee", [])
        .config(config);
            
    function config($stateProvider){
            $stateProvider.state('main.employee', {
                url: "employee", 
                templateUrl : "../../angular_modules/employee/html/employee.html"
            })
            .state('main.employee.addemployee', {
                url: "/addemployee", 
                templateUrl : "./html/employee/addemployee.html"
            }).state('main.employee.editemployee', {
                url: "/editemployee", 
                templateUrl : "./html/employee/editemployee.html"
            });

        }
})();