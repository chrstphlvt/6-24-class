import express from 'express';

// the user router represents a subset of the application
// for all enpoints starting with /users
export const usersRouter = express.Router();

/**
 * /users
 * find all users
 */
usersRouter.get('', (req, res) => {
    res.send('found all users');
});


/**
 * /users/:id
 * find user by some id
 */
usersRouter.get('/:id', (req, res) => {
    console.log(`finding user with id: ${req.params.id}`);
    res.send(`finding user with id: ${req.params.id}`);
});

/**
 * /users/firstName/:firstName
 */
usersRouter.get('/firstName/:firstName', (req, res) => {
    console.log(`finding user with first name: ${req.params.firstName}`);
    res.send(`finding user with first name: ${req.params.firstName}`);
});

/**
 * /users
 * create new user resource
 */
usersRouter.post('', (req, res) => {
    res.send(`adding new user: ${JSON.stringify(req.body)}`);
});

/**
 * /users
 * partially update user resource
 */
usersRouter.patch('', (req, res) => {
    res.send(`updating user: ${JSON.stringify(req.body)}`);
});

/**
 * /users
 * delete user by id
 */
usersRouter.delete('/:id', (req, res) => {
    console.log(`deleting user with id: ${req.params.id}`);
    res.send(`deleting user with id: ${req.params.id}`);
});