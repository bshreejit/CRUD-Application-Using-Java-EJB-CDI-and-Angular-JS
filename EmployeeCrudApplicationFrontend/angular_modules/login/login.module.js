(function(){
    angular.module("app.login", [])
    .config(function($stateProvider){
        $stateProvider.
            state('login', {
                url: "/login",
                templateUrl: './angular_modules/login/login.html',
                controller: 'LoginController',
                controllerAs: "loginCtrl"
            })
    });
})();