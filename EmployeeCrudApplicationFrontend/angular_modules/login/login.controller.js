(function(){
    angular.module("app.login")
    .controller("LoginController", function( $state){
        var v1 = this;
        v1.login = true;
        v1.superUser = false;
        v1.loginBtn = loginBtn; 
        v1.checkSuperUserOrNot = checkSuperUserOrNot;
        v1.userlogin = {
            username : '',
            password : '' 
        }
        v1.superUserLogin = {
            username : '',
            password : '',
            superPassword : ''
            
        }
        function loginBtn(){
            console.log("login button hit success!!")
            // if(v1.superUser = true){
            //     if ((v1.superUserLogin.username == "shreejit") && (v1.superUserLogin.password == "abc123")
            //         && (v1.superUserLogin.superPassword == "abc123")) {
            //         console.log('Login Success!!!');
            //         v1.login = false;
            //         $state.go('main.home');
            //     }
            //     else{
            //         v1.superUser = false;
            //     }
            // }
            // else
            {
                if ((v1.userlogin.username == "abc123") && (v1.userlogin.password == "abc123")) {
                    console.log('Login Success!!!');
                    v1.login = false;
                    $state.go('main.home');
                }
                else{
                    v1.superUser = false;
                }
            }
            // v1.login = false;
            // $state.go('main.home');
        }

        function checkSuperUserOrNot(){

            console.log("Evaluating super user or not!!");
            
            if (angular.equals(v1.userlogin.username, "shreejit")) {
                // console.log("Comparision Successful!");
                v1.superUser = true;
            }
            else{
                v1.superUser = false;
            }
        }

    })
})();