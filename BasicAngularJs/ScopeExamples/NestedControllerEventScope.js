var app = angular.module("app", [])

app.controller("MainController", function($scope, $rootScope){
    $rootScope.hello = "Hello from the "
    $scope.OnClick = function(evt){
        $scope.$broadcast("SendDown", "Main Controller")
    }

    $scope.$on('SendDown', function(evt, data){
        $scope.message =  data;
    })

    $scope.$on('SendUp', function(evt, data){
        $scope.message =  data;
    })
})
app.controller("MiddleController", function($scope){
    $scope.OnBroadCastClick = function(evt){
        $scope.$broadcast("SendDown", "Middle Controller")
    }
    $scope.OnEmitClick = function(evt){
        $scope.$emit("SendUp", "Middle Controller")
    }
    $scope.$on('SendDown', function(evt, data){
        $scope.message =  data;
    }) 
    $scope.$on('SendUp', function(evt, data){
        $scope.message =  data;
    })
})

app.controller("LeafController", function($scope){ 
    $scope.OnClick = function(evt){
        $scope.$emit("SendUp", "Leaf Controller")
    }
    $scope.$on('SendUp', function(evt, data){
        $scope.message =  data;
    })
    $scope.$on('SendDown', function(evt, data){
        $scope.message =  data;
    }) 
})
