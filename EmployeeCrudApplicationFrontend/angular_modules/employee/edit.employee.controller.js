(function () {
    angular.module('app.employee')
        .controller('EmployeeEditController', function ($scope) {
            // $scope.phonenumbers = [];
            $scope.editemployeedata = {};

            // $scope.addPhone= function(){
            //     $scope.phonenumbers.push('');
            // }

            console.log("inside child class");

            $scope.$on('broadcast', function (event, data) {
                $scope.editemployeedata = data;
                console.log("hello " + editemployeedata);
            })

        })
})