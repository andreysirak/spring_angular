(function () {
	'use strict';
	
	angular
			.module('com.tt.fleet')
			.directive('uiSelectOpenOnFocus', Directive);

	Directive.$inject = ['$timeout'];
	
	function Directive($timeout){
		var directive = {
		require: 'uiSelect',
		restrict: 'A',
		link: linkFunc
			};

		return directive;

		function linkFunc($scope, el, attrs, uiSelect) {
			var closing = false;

			angular.element(uiSelect.focusser).on('focus', function() {
				if(!closing) {
					uiSelect.activate();
				}
			});

			// Because ui-select immediately focuses the focusser after closing
			// we need to not re-activate after closing
			$scope.$on('uis:close', function() {
				closing = true;
				$timeout(function() {
					closing = false;
				});
			});
		}
	}

})();