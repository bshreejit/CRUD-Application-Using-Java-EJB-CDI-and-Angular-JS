(function () {
	angular.module('app.employee', [])
		.factory('getService', ['$http', function ($http) {
			var data = {};
			data.get = $http.get('http://localhost:9090/EmployeesCrudApplication-web/webresources/employeecrud/getallemployees').then(function (response) {
				return response.data;
			},
				function (error) {
					console.log("The request failed : " + error);
				}
			);
			data.getAllEmployees = function () {
				return data.get;
			};
			return data;
		}])
})();