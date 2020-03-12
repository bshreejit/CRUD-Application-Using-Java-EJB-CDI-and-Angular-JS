var app = angular.module("app", [])

app.controller("ParentController" , function($scope){
    var vm = $scope;
      var child = vm.$new();
      $scope.result = " ";

        $scope.parentCall = function() {
            parent.salutation = "Hello";
          parent.name = "Scott";
          $scope.result = parent.salutation + " " + parent.name;
        }
        //If not initialized new then the output is undefined
        $scope.childCall = function() {
            child.salutation = "Welcome";
          child.name = "Robert";
          $scope.result = child.salutation + " " + child.name;
          
        }
        $scope.getMessage = function() {
            setTimeout(function() {
              $scope.message = 'Fetched after two seconds';
              console.log('message:' + $scope.message);
              $scope.$apply(); //this triggers a $digest
            }, 1000);
          };
})