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


/**
 * /cards/:id
 * find cards by id
 */
cardsRouter.get('/:id', (req, res) => {
    res.send(`finding cards by id: ${req.params.id}`);
});

/**
 * /cards/owner/:ownerId
 * find cards by owner's id
 */
cardsRouter.get('/owner/:ownerId', (req, res) => {
    res.send(`finding cards by owner's id: ${req.params.ownerId}`);
});


/**
 * /cards
 * create new card resource
 */
cardsRouter.post('', (req, res) => {
    res.send(`adding new card: ${JSON.stringify(req.body)}`);
});

/**
 * /cards
 * partially update card resource
 */
cardsRouter.patch('', (req, res) => {
    res.send(`updating card: ${JSON.stringify(req.body)}`);
});

/**
 * /cards
 * delete card by id
 */
cardsRouter.delete('/:id', (req, res) => {
    console.log(`deleting card with id: ${req.params.id}`);
    res.send(`deleting card with id: ${req.params.id}`);
});