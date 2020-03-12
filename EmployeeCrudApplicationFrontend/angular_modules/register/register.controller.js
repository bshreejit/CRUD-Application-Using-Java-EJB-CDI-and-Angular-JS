(function(){
    angular.module('app.register')
        .controller('RegisterController', function($state){
            var v = this;
            v.details = {};
            v.createLogin = createLogin;
            initialize();

            function initialize(){
                console.log('Inside the Register Contreolller;');
            }

            function createLogin(registerDetails){
                console.log('Register button hit successfully!!')
                v.details = registerDetails;
                $state.go('main.register.details');
            }
        })
})();

