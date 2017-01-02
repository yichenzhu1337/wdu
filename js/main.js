$(function () {

    $('button.all')
        .on('click', function () {
            $('.flex-container > div')
                .show('slow');
        });

    $('button.blog')
        .on('click', function () {
            $('.flex-container > div')
                .show('slow')
                .filter(".f-video")
                .hide('slow');
        });

    $('button.vid')
        .on('click', function () {
            $('.flex-container > div')
                .show('slow')
                .filter(".f-blog")
                .hide('slow');
        });

/*    $('button.asc')
        .on('click', function () {
            console.log($('.flex-container > div').filter('[data-date]').sort(function(a, b){return b-a}));
        });*/









    $.sortByDate = function( elements, order ) {
        var arr = [];
        elements.each(function() {
            var obj = {},
                $el = $( this ),
                time = $el.find( "time" ).text(),
                date = new Date( $.trim( time ) ),
                timestamp = date.getTime();

            obj.html = $el[0].outerHTML;
            obj.time = timestamp;

            arr.push( obj );
        });

        var sorted = arr.sort(function( a, b ) {

            if( order == "ASC" ) {
                return a.time > b.time;
            } else {
                return b.time > a.time;
            }

        });

        return sorted;
    };

    // desc and ascending
    var $newer = $( "#newer" ),
        $older = $( "#older" ),
        $content = $( "#posts" ),
        $elements = $( ".post" );

    $newer.click(function() {
        var elements = $.sortByDate( $elements, "DESC" );
        var html = "";
        for( var i = 0; i < elements.length; ++i ) {
            html += elements[i].html;
        }
        $content[0].innerHTML = html;

        $(this)
            .addClass( "selected" )
            .siblings()
            .removeClass( "selected" );

        return false;
    });

    $older.click(function() {
        var elements = $.sortByDate( $elements, "ASC" );
        var html = "";
        for( var i = 0; i < elements.length; ++i ) {
            html += elements[i].html;
        }
        $content[0].innerHTML = html;
        $(this)
            .addClass( "selected" )
            .siblings()
            .removeClass( "selected" );

        return false;
    });

});