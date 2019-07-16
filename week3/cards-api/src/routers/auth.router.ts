import express from 'express';
import * as UserDao from '../daos/users.dao';

export const authRouter = express.Router();

authRouter.post('/login', (req, res) => {
    const { username, password } = req.body;
    const user = UserDao.findByUsernameAndPassword(username, password);
    if (user) {
        req.session.user = user;
        res.end();
    } else {
        req.session.destroy(() => { });
        res.status(400);
        res.send('Invalid Credentials');
    }
});


authRouter.get('/check-session', (req, res) => {
    res.json(req.session);
});