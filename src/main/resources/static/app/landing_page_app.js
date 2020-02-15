(function () {
    'use strict';

    var app = angular.module('com.landing', []);

    app.config(ConfigApp);
    ConfigApp.$inject = ['$urlRouterProvider', 'growlProvider', '$httpProvider',
        '$injector', 'ScrollBarsProvider', '$stateProvider', 'coreUrlConstants', 'uiGmapGoogleMapApiProvider'];
    function ConfigApp($urlRouterProvider, growlProvider, $httpProvider,
                       $injector, ScrollBarsProvider, $stateProvider, coreUrlConstants, uiGmapGoogleMapApiProvider) {

    }

    angular
        .module('com.landing')
        .controller('landingController', Controller);

    Controller.$inject = ['$state', '$uibModal', 'growl'];

    function Controller($state, $uibModal, growl) {
        var vm = this;

        activate();

        ////////////////

        function activate() {
        }
    }




})();
