<html>
    <head>
        <title>whiteboard</title>
        <link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.css" rel="stylesheet" >
        <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/min/dropzone.min.js"></script>
    </head>
    <body>
        <div class="yz-container">
            <h2>Download</h2>
            <a href="http://localhost/projects/whiteboard-application/src/main/webapp/uploads/new.txt" target="_blank" download>download</a>

            <div id="master-doc-upload-zone" class="dropzone"></div>

            <script>
                (function($) {
                    Dropzone.autoDiscover = false;
                    $(document).ready(function() {
                        $("div#master-doc-upload-zone").dropzone({
                            url: "/api/v1/course-materials/upload",
                            method: 'POST',
                            maxFilesize: 10
                        });
                    });
                })(jQuery);
            </script>
        </div>
    </body>
</html>




