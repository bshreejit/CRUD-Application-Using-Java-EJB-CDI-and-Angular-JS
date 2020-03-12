var app = angular.module('app', []);

// Three ways of defining a controller

// 1. Using the Main method 
// var MainController = function ($scope){
//     $scope.val = "Test"
// }

// 2. 
app.controller("MainController" , function ($scope){
    // $scope.numbers = [1,2,2,3,5]  
    $scope.data = {val : "Hello"}
    $scope.style = true;
    $scope.$watch("data.val", function(datalength)
       {
            $scope.data.toolong = datalength.length > 15;
       } 
    )
    $scope.numbers = [1,2,3,5]  
    
    $scope.users = [{"name":"SB","age":"25"},
                    {"name":"MB","age":"32"}]
    $scope.user = {"name":"SB","age":"25"}
})

app.controller("SubController" , function($scope){

})

// app.controller("ShoppingController", function($scope){
//     $scope.items = [
//         {title: 'Paint pots', quantity: 8, price: 3.95},
//         {title: 'Polka dots', quantity: 17, price: 12.95},
//         {title: 'Pebbles', quantity: 5, price: 6.95}
//         ];
//         $scope.remove = function(index) {
//         $scope.items.splice(index, 1);
//         }
//     })

// 3. MOst preferred way
// angular.module("app",[]).controller("MainController", function($scope){
// $scope.val = "Test"
// })



