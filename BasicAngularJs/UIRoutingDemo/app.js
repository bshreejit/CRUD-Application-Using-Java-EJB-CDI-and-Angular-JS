var app = angular.module("app",['ui.router'])
app.config(function($stateProvider, $urlRouterProvider){

        // $urlRouterProvider.otherwise("partial/home")        
        $stateProvider.state( 'home', {
            name : "home",
            url : "partial/home", 
            templateUrl  : '/home.html'
           
            
        });
        
    })