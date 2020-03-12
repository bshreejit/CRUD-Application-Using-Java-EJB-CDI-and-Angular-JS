(function () {
    angular.module("app.manager", ['ui.router'])
        .config(function ($stateProvider) {
            $stateProvider.state('main.manager', {
                name: "manager",
                url: "/manager",
                templateUrl: "./html/manager/manager.html"
            })
            .state('main.manager.addmanager', {
                name: "addmanager",
                url: "/manager/addmanager",
                templateUrl: "./html/manager/addmanager.html"
            })
            .state('main.manager.editmanager', {
                name: "editmanager",
                url: "/manager/editmanager",
                templateUrl: "./html/manager/editmanager.html"
            });
        })
})();