import express from 'express';
import bodyParser from 'body-parser';

// specify the port will run on
const port = 8012;
const app = express();

/**
 * Loggin middleware
 * This callback will be invoked anytime a request is made 
 * regardless of url or http method
 *  */ 
app.use((req, res, next) => {
    console.log(`request made with url: ${req.url} and method ${req.method}`)
    next(); // pass request on to search for the next piece of middleware
});

// set up body parser to convert json body to object stored on req.body
app.use(bodyParser.json());

app.get('/test', (req, res) => {
    res.send('this is a test endpoint');
});

app.get('/data', (req, res) => {
    res.json({
        name: 'Island',
        quality: 'new',
        price: '0.15',
        game: 'MTG'
    });
});

app.post('/login', (req, res) => {
    console.log('body = ', req.body); 
    res.json({
        username: 'btkruppa',
        email: 'blake.kruppa@revature.com',
        firstName: 'Blake',
        lastName: 'Kruppa'
    })
});

app.delete('/logout', (req, res) => {``
    res.end();
});


app.get('/cards', (req, res) => {
    res.send([
        {
            name: 'Island',
            price: 0.15,
            quality: 'new',
            game: 'MTG'
        },
        {
            name: 'Squirtle',
            price: 2.5,
            quality: 'used',
            game: 'Pokemon'
        }
    ])
})


app.listen(port, () => {
    console.log('app started on port: ' + port)
});