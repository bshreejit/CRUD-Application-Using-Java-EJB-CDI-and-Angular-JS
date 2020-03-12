var app = angular.module("app", [])

app.controller("VehicleController", function($scope)
{
    $scope.vehicle = "bus";

    // $scope.car = function(){
    //     // console.log("You choose car!!")
    //     $scope.vehicle = "car"
    // }
    // $scope.bike = function(){
    //     // console.log("You choose bike!!")
    //     $scope.vehicle = "bike"
    // }
    $scope.customVehicle =function(vehicle){
        $scope.vehicle = vehicle;
    }
})