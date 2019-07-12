import express from 'express';
import * as userDao from '../daos/users.dao';

// the user router represents a subset of the application
// for all enpoints starting with /users
export const usersRouter = express.Router();

/**
 * /users
 * find all users
 */
usersRouter.get('', (req, res) => {
    res.json(userDao.findAll());
});


/**
 * /users/:id
 * find user by some id
 */
usersRouter.get('/:id', (req, res) => {
    const user = userDao.findById(+req.params.id);
    res.json(user);
});

/**
 * /users/firstName/:firstName
 */
usersRouter.get('/firstName/:firstName', (req, res) => {
    const firstName = req.params.firstName;
    const users = userDao.findByFirstName(firstName);
    res.json(users);
});

/**
 * /users
 * create new user resource
 */
usersRouter.post('', (req, res) => {
    const user = req.body;
    userDao.save(user);

    res.status(201); // created status code
    res.json(user);
});

/**
 * /users
 * partially update user resource
 */
usersRouter.patch('', (req, res) => {
    userDao.patch(req.body);
    res.end();
});

/**
 * /users
 * delete user by id
 */
usersRouter.delete('/:id', (req, res) => {
    userDao.deleteUser(+req.params.id);
    res.end();
});