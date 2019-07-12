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
})


/**
 * /users/:id
 * find user by some id
 */
usersRouter.get('/:id', (req, res) => {
    console.log(`finding user with id: ${req.params.id}`);
    res.send(`finding user with id: ${req.params.id}`);
})

/**
 * /users/firstName/:firstName
 */
usersRouter.get('/firstName/:firstName', (req, res) => {
    console.log(`finding user with first name: ${req.params.firstName}`);
    res.send(`finding user with first name: ${req.params.firstName}`);
})