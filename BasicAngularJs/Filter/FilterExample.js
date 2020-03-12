var app=angular.module("app", [])

app.controller("FilterController", function($scope){
    $scope.name= ["John", "Adam", "Jack" , "Sarad" , "Jill", "VIcky"];
})

// Custom Filter
app.filter("CustomFilter", function(){
    return function(input){
        var result = "";
        input = input || "";
        for(var i = 0;i < input.length;i++){
            result = input.chatAt(i) +result;
        }
    }
})