(function(){
    angular.module('app.navigation',[])
        .controller('NavigationController', function(){
                
        })
        .directive('header', function(){
            return {
                templateUrl : "./includes/header.html"
            }
        }).
        config(config);

        function config($stateProvider)
        {
                
        }
        
})();