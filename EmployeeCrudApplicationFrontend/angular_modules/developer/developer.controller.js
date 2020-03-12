(function(){
  angular.module('app.developer')
    .controller("DeveloperController", ['$scope', 'getAllDevelopers', '$http' , function($scope, getAllDevelopers, $http){
    
    $scope.submit = true;
    $scope.adddeveloper = {}
    $scope.devlopers=[];
    $scope.editdeveloperdata = {}
        
    // GET Methods
    $scope.getAllData = function(){
        getAllDevelopers.getAllDevelopers().then(function(response) {
            $scope.developers = response;
        });
    };

    $scope.getDataById = function(developerid){
        $http({
            method: 'GET',
            url: "http://localhost:9090/EmployeesCrudApplication-web/webresources/developercrud/getdeveloperbyid/"+ developerid
        }).then(
            function successCallback(response) {
            console.log(response.data);

            $scope.editdeveloperdata = response.data;
        
          }, function errorCallback(response) {
            alert("Sorry! No records found.");
          });
    };

    $scope.search = function(searchId){
        $http({
            method: 'GET',
            url: "http://localhost:9090/EmployeesCrudApplication-web/webresources/developercrud/getdeveloperbyid/"+ searchId
          }).then(function successCallback(response) {
        
            $scope.developers = response;
        
          }, function errorCallback(response) {
        
            alert("Sorry! No records found.");
        
          });
    };

   
    // UPDATE Developer
    $scope.updateDeveloper = function(updateemployee){
        $http.put('http://localhost:9090/EmployeesCrudApplication-web/webresources/developercrud/updatedeveloper' + updateDeveloper.id,
                (updateDeveloper))
          .then(function successCallback(response) {
            alert("Developer details has been successfully updated.");
          }, function errorCallback(response) {
            alert("Error while updating developer details. Try Again!");
        });
    };

    // DELETE Method
    $scope.deleteEmployee = function(id) {
        console.log("Developer id is " + id)
        $http({
          method: 'DELETE',
          url: 'http://localhost:9090/EmployeesCrudApplication-web/webresources/developercrud/deletedeveloper/' + id
    
        }).then(function successCallback(response) {
        //   alert("developer has been deleted Successfully");   
        //   $windows.location.reload(); 
        }, function errorCallback(response) {
          alert("Error. while deleting user Try Again!");
        });
    
      };
    
    // Reset Method
    $scope.reset = function(){
        $scope.developers= {};
    };

    
}])
})();