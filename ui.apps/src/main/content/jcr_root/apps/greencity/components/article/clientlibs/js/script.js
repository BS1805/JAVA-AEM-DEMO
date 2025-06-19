(function(document, $) {
    "use strict";
    $(function() {
        console.log("Article component JS loaded");
        var $article = $('.cmp-article');
        if ($article.length) {
            $article.hover(
                function() { $(this).addClass('cmp-article--highlight'); },
                function() { $(this).removeClass('cmp-article--highlight'); }
            );
        }
    });
})(document, Granite && Granite.$ ? Granite.$ : window.jQuery);