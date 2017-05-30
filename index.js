var express     = require('express');
var app         = express();
var bodyParser  = require("body-parser");
var port = 5000;

app.use(express.static('public'));
app.use(express.static('src/views'));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.get('/', function(req, res){
    res.send({
        success: true
    });
});

app.post('/create-node', function(req, res){
    console.log(req.body);
    res.send(req.body);
});

app.get('/nodes', function(req, res){

    var mysql      = require('mysql');
    var connection = mysql.createConnection({
        host     : 'localhost',
        user     : 'root',
        password : '',
        database : 'sf_responsive'
    });

    connection.connect();

    connection.query('SELECT * FROM node LIMIT 10', function (error, results, fields) {
        //if (error) throw error;
        console.log('The solution is: ', results[0].solution);

        res.send(results);
        //res.send(results);
    });

    connection.end();
});

app.listen(port, function(err){
    console.log('running server on port ' + port);
});

// performance testing trick
/*
var seconds_start = new Date().getTime() / 1000;
for (var i = 0; i < 10000; i++) {
    console.log("a");
}
var seconds_end = new Date().getTime() / 1000;
console.log((seconds_end - seconds_start).toFixed(2) + "s");
*/
