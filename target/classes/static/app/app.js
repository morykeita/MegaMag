// Ideally we would want to separate business loggic by have separate controllers and a services for our enpoints.

var app = angular.module('app', ['ngRoute', 'ui.bootstrap']);

app.config(function ($routeProvider, $locationProvider) {
    $routeProvider

        .when('/articles', {
            templateUrl: 'partials/articles',
            controller: 'articleController',
        })
        .when('/articleDetail/:id', {
            templateUrl: 'partials/articleDetail/',
            controller: 'articleDetailController',
        })
        .otherwise({
            redirectTo: '/articles',
        })
    $locationProvider.html5Mode({
        enabled: false,
        requireBase: false
    });
});

app.controller('articleDetailController', function ($scope, $routeParams, $http) {

    $scope.article = null;
    $http({
        method: 'GET',
        url: 'api/articles/' + $routeParams.id
    }).then(function (response) {
        $scope.article = response.data;
    });
})
app.controller('articleController', function ($scope, $http) {

    $scope.viewby = 10;
    $scope.totalItems = 0;
    $scope.currentPage = 1;
    $scope.itemsPerPage = $scope.viewby;
    $scope.maxSize = 5; //Number of pager buttons to show

    $scope.setPage = function (pageNo) {
        $scope.currentPage = pageNo;
    };
    $scope.pageChanged = function () {
        $scope.getArticles();
        console.log('Page changed to: ' + $scope.currentPage);
    };
    $scope.setItemsPerPage = function (num) {
        $scope.itemsPerPage = num;
    }


    $scope.articles = [];
    $scope.init = function () {
        $scope.getArticles();
    }

    $scope.getArticles = function () {
        $http({
            method: 'GET',
            url: "api/articles/?page=" + $scope.currentPage + "&size=" + $scope.itemsPerPage,
        }).then(function (response) {
            const data = response.data;
            $scope.totalItems = data.totalElements-1;
            $scope.totalPages = data.totalPages;
            $scope.numberOfPages = data.totalPages;
            $scope.articles = data.content;
        });
    }
});



