(function(){
    angular.module('app.register', [])
        .config(config);

    function config($stateProvider){
        $stateProvider.
            state('main.register', {
                url: "register", 
                templateUrl : "../../angular_modules/register/register.html"
            })
            .state('main.register.details', {
                url: "/details", 
                templateUrl : "../../angular_modules/register/register_details.html"
            })
    }
})();