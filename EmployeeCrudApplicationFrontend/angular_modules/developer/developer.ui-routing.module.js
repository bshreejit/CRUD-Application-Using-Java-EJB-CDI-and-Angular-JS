(function () {
    angular.module("app.developer", [])
        .config(function ($stateProvider) {
            $stateProvider.state('main.developer', {
                name: "developer",
                url: "/developer",
                templateUrl: "./html/developer.html"
            })
            .state('main.developer.adddeveloper', {
                name: "adddeveloper",
                url: "/developer/adddeveloper",
                templateUrl: "./html/adddeveloper.html"
            })
            .state('main.developer.editdeveloper', {
                name: "editdeveloper",
                url: "/developer/editdeveloper",
                templateUrl: "./html/developer/editdeveloper.html"
            });
        })
})();