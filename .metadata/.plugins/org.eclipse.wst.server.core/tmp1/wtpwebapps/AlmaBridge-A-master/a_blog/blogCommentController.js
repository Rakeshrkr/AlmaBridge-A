angular.module('almaApp').controller('blogCommentController',['$scope',function($scope){
            var blogComment = {
                
                rating:'5',
                comment:'',
                author:'',
                date:new Date().toISOString()
            }
            
            $scope.blogComment = blogComment ;
            $scope.addComment = function(){
                $scope.blog.comments.push(blogComment);
                $scope.blogCommentForm.$setPristine();
                $scope.blogComment={
                author:'',
                rating:5,
                comment:'',
                date:new Date().toISOString()
                    
                    
                }
                
                console.log(this.blogComment);
                
            };
        }])