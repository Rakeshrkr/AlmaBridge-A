almaApp.controller('homeController', [
                            		  '$scope',
                            		  
                            		  '$location',
                            		  '$rootScope',
                            		  '$http',function($scope,$location,$rootScope,$http) {
// create a message to display in our view
	
	$scope.logout = function logout(){
    	$rootScope.currentUserName = '';
    	$rootScope.currentUserId = '';
    	$rootScope.currentUserRoleId = '';
    	
    	$rootScope.isLogged = false;
    	/*$rootScope.isUserLoggedIn = $sessionStorage.isLogged;*/
    	
    	/*$rootScope.isUserAdmin = $sessionStorage.isAdmin;*/
		$location.path('/');
		console.log('You are logged out successfully ');
		window.alert('You are logged out successfully ');
    };
/*$scope.message = 'Everyone come and see how good I look!';*/
}]);