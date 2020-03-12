var application=angular.module("myapp",[])

application.service("random_service", function(){
    var num = Math.random()*10;
    this.generateRandom = function(){
        return num;
    }
})

application.factory("ramdom_factory", function(){
    //This object is not accessible to the other code as it is; so have to return this object
    var random_object={};
    var num = Math.random()*10;
    //INSTEAD OF USING THE THIS KEYWORD, IT MAKES USE OF A OBJECT AND WE CAN CREATE FUNTIONS AND EVERYTHING IN REFERENCE TO THAT
    random_object.generate = function(){
        return num;
    };
    return random_object;//All the properties,etc will be available to the outer code
})

application.controller("MainController", function($scope, ramdom_factory){
    
    $scope.generateRandom = function(){
        $scope.randomNumber = ramdom_factory.generate()
    }
 
})