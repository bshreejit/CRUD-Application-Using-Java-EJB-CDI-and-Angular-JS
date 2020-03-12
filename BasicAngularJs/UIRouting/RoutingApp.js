var app = angular.module("routingApp",['ui.router'])
app.config(function($stateProvider, $urlRouterProvider){

        // $urlRouterProvider.otherwise("partial/home")        
        $stateProvider.state( 'home', {
            name : "home",
            url : "partial/home", 
            templateUrl  : '/home.html'
            // views: {
            //     '@': {
            //         templateUrl: 'home.html'
            //       }
            // }
            
        });
        $stateProvider.state('about', {
            name : "about",
            url: "partial/about", 
            templateUrl : "/about.html"
        });
    })