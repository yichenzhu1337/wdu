<html>
    <head>
        <title>whiteboard</title>
    </head>
    <body>
        <h2>Hello World! JSP</h2>

        <p>Download</p>
        <div>
           <a href="http://localhost/projects/whiteboard-application/src/main/webapp/uploads/new.txt" target="_blank" download>download</a>
        </div>

        <div class="yz-container">
            <style>
                .yz-container {
                    padding: 50px;
                }
                h1 {
                    text-align:center;
                }
            </style>
            <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
            <link href="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/dropzone.css" rel="stylesheet" >
            <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/dropzone/4.3.0/min/dropzone.min.js"></script>

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




