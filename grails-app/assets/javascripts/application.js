// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-2.2.0.min
//= require bootstrap
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
    (function($) {
        $('#spinner').ajaxStart(function() {
            $(this).fadeIn();
        }).ajaxStop(function() {
            $(this).fadeOut();
        });
    })(jQuery);
}

var flagdarkMode = false;

function modeGelap() {
    if (flagdarkMode){
        document.getElementById("badan").style.backgroundColor = "#000000";
        document.getElementById("div").style.color = "#ffffff";
    }else{
        document.getElementById("badan").style.backgroundColor = "#ffffff";
        document.getElementById("div").style.color = "#000000";
    }
};