import express from 'express';

// specify the port will run on
const port = 8012;
const app = express();

/**
 * This callback will be invoked anytime a request is made 
 * regardless of url or http method
 *  */ 
app.use((req, res) => {
    console.log(`request made with url: ${req.url} and method ${req.method}`)
    res.send('hello');
});


app.listen(port, () => {
    console.log('app started on port: ' + port)
});