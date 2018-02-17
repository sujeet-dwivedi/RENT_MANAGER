
$(function(){
    var windowH = $(window).height();
    var wrapperH = $('#viewform').height();
    if(windowH > wrapperH) {                            
        $('#viewform').css({'height':($(window).height())+'px'});
    }                                                                               
    $(window).resize(function(){
        var windowH = $(window).height();
        var wrapperH = $('#viewform').height();
        var differenceH = windowH - wrapperH;
        var newH = wrapperH + differenceH;
        var truecontentH = $('#truecontent').height();
        if(windowH > truecontentH) {
            $('#viewform').css('height', (newH)+'px');
        }

    })          
});