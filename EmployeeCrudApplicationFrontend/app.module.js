(function () {
    'use strict';
    angular.module("app", ['ui.router',
        'app.login',
        'app.navigation',
        'app.home',
        'app.employee',
        'app.manager',
        'app.developer',
        'app.register'])
        .config(config)
        .run(run);

    function run($state) {
        console.log('inside run block');
        $state.go('login');
    }

    function config($stateProvider, $urlRouterProvider) {
        console.log('Inside config funtion');

        $stateProvider.
            state('main', {
                abstract : 'true', // Abstract state can't be activated by itself, its explicitly activated when a child state is activated
                url: "/",
                controller: "NavigationController",
                controllerAs: "navigationCtrl",
                templateUrl: "./angular_modules/navigation/main.html"
            })
            
    }

})();