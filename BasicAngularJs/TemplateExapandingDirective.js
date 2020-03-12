var app = angular("app", [])

app.controller("MainController", function($scope){
        $scope.user = {
            name = "sb",
            address = "ktm"
        }
})

app.directive("myUser", function(){
    return 
    {
        templateUrl : 'TemplateExpanding.html'
    }
})