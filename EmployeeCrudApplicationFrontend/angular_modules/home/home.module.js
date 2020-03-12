(function(){
    'use strict';
    angular.module('app.home', [])
        .config(config);

    function config($stateProvider, $urlRouterProvider){

        $urlRouterProvider.otherwise("/details");
           
        $stateProvider.
            state('main.home', {
                url : "home", 
                templateUrl  : '../../angular_modules/home/home.html',
                controller : "HomeController",
                controllerAs : "homeCtrl"
            })
            .state('main.home.details', {
                url : "/details", 
                templateUrl  : '../../angular_modules/home/details.html',
                
            })
            .state('main.home.qualifications', {
                url : "/qualification", 
                templateUrl  : '../../angular_modules/home/qualification.html',
                
            })
    }
})();