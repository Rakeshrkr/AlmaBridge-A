/*almaApp.controller('registerController', function($scope) {
$scope.message = 'Look! I am a register page.';

});*/

'use strict'
angular.module('almaApp').controller(
		'registerController',
		 [
		  '$scope',
		  'registerService',
		  '$location',
		  '$rootScope',
		  '$http',
		  function($scope,registerService,$location,$rootScope,$http) {
			  console.log("Inside registerController 1");

			  var self = this;
			    self.user={errorCode:'',errorMsg:'',userId:null,name:'',password:'',email:'',address:'',mobile:'',roleId:'',reason:'',isOnline:'',status:''};
			    self.users=[];
			 
			    self.submit = submit;
			    self.edit = edit;
			    self.remove = remove;
			    self.reset = reset;
			 
			    console.log("self initialized.."+self.user.name);
			    fetchAllUsers();
			 
			    function fetchAllUsers(){
			        registerService.fetchAllUsers()
			            .then(
			       
			            function(d) {
			            	 console.log("fetching users and asigning to self.."+d.length);
			                self.users = d;
			                $scope.users =d ;
			            },
			            function(errResponse){
			                console.error('Error while fetching Users');
			            }
			        );
			    }
			    
			 
			    
			    $scope.makeAdmin = function makeAdmin(userId){
			        registerService.makeAdmin(userId)
			            .then(
			            function(d) {
			                /*$scope.currentBlog = d;*/
			                $location.path('/user');
			                window.alert("New Admin is created with userId "+userId);
			                console.log("new admin with id created..."+userId ) ;
			                /*$rootScope.currentBlog = d; 
			                $rootScope.currentBlogId = id; */
			            },
			            function(errResponse){
			                console.error('Error while making new admin');
			            }
			        );
			    }
			    
			    $scope.reject = function reject(userId){
			        registerService.reject(userId)
			            .then(
			            function(d) {
			                /*$scope.currentBlog = d;*/
			                $location.path('/user');
			                window.alert("user is rejected with userId "+userId);
			                console.log("user is rejected with userId..."+userId ) ;
			                /*$rootScope.currentBlog = d; 
			                $rootScope.currentBlogId = id; */
			            },
			            function(errResponse){
			                console.error('Error while making new admin');
			            }
			        );
			    }
			    
			    $scope.approve = function approve(userId){
			        registerService.approve(userId)
			            .then(
			            function(d) {
			                /*$scope.currentBlog = d;*/
			                $location.path('/user');
			                window.alert("New user is approved "+userId);
			                console.log("new user is approved..."+userId ) ;
			                /*$rootScope.currentBlog = d; 
			                $rootScope.currentBlogId = id; */
			            },
			            function(errResponse){
			                console.error('Error while approving user');
			            }
			        );
			    }
			 
			    function createUser(user){
			    	 console.log('Inside create user...');
			    	registerService.createUser(user)
			            .then(
			            fetchAllUsers,
			            function(errResponse){
			                console.error('Error while creating User');
			            }
			        );
			    }
			 
			    function updateUser(user, id){
			    	registerService.updateUser(user, id)
			            .then(
			            fetchAllUsers,
			            function(errResponse){
			                console.error('Error while updating User');
			            }
			        );
			    }
			 
			    function deleteUser(id){
			    	registerService.deleteUser(id)
			            .then(
			            fetchAllUsers,
			            function(errResponse){
			                console.error('Error while deleting User');
			            }
			        );
			    }
			 
			    function submit() {
			    	 console.log('Inside submit...');
			    	 console.log('User name', self.user.name);
			       /* if(self.user.userId===null){*/
			            createUser(self.user);
		/*	        }else{
			            updateUser(self.user, self.user.userId);
			            console.log('User updated with id ', self.user.userId);
			        }*/
			        reset();
			    }
			 
			    function edit(id){
			        console.log('id to be edited', id);
			        for(var i = 0; i < self.users.length; i++){
			            if(self.users[i].id === id) {
			                self.user = angular.copy(self.users[i]);
			                break;
			            }
			        }
			    }
			 
			    function remove(id){
			        console.log('id to be deleted', id);
			        if(self.user.id === id) {//clean form if the user to be deleted is shown there.
			            reset();
			        }
			        deleteUser(id);
			    }
			 
			 
			    function reset(){
			    	self.user={errorCode:'',errorMsg:'',userId:null,name:'',password:'',email:'',address:'',mobile:'',roleId:'',reason:'',isOnline:'',status:''};
			        $scope.form.$setPristine(); //reset Form
			    }
			  	
}]);