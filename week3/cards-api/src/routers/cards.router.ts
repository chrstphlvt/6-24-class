import express from 'express';

export const cardsRouter = express.Router();

/**
 * /cards
 * Find all cards
 */
cardsRouter.get('', (req, res) => {
    res.send('finding all cards');
});

/**
 * /cards/game/:game
 * find cards by game
 */
cardsRouter.get('/game/:game', (req, res) => {
    res.send(`finding cards by game: ${req.params.game}`);
});