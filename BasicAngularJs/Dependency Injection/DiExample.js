var app = angular.module("app",[])

// DI using the Value-Component(Uses key-value pair)
app.value('StudentName', "John")

//Implicit Annotation (Passing the dependency as the parameter of the controller construct function)
// When it is instantiated, AngularJS will throw an error due to Strict Dependency
app.controller("MainController", function($scope, DIService, StudentName){
    $scope.message ="Student's name is : "
    $scope.name = StudentName;
    $scope.display = DIService.display();
})

//Inline- Array Annotation
app.controller("SubController", ['$scope','DIService', 'StudentName', function($scope, DIService){
    $scope.message ="Student's name is : "
    $scope.name = StudentName;
    $scope.display = DIService.display();
}])

//Inject-Property Annotation(Recommended)
var LeafController= function($scope, DIService, StudentName){
    $scope.message ="Student's name is : "
    $scope.name = StudentName;
    $scope.display = DIService.display();
}
LeafController.$inject = ['$scope','DIService',  'StudentName']
app.controller("LeafController", LeafController);

//Service
app.service("DIService", function(){
    this.display = function(){
        return "Successfully injected !!!"
    }
})