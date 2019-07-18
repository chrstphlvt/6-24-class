import { connectionPool } from '../util/connection.util';
import { PoolClient } from 'pg';


export async function findAll() {
    console.log('finding all users');
    let client: PoolClient;
    try {
        client = await connectionPool.connect(); // basically .then is everything after this
        const result = await client.query('SELECT * FROM app_user');
        return result.rows;
    } catch (err) {
        console.log(err);
    } finally {
        client && client.release();
    }
    console.log('found all');
    return undefined;
}

export async function findById(id: number) {
    console.log('finding all users');
    let client: PoolClient;
    try {
        client = await connectionPool.connect(); // basically .then is everything after this
        const result = await client.query('SELECT * FROM app_user WHERE user_id = $1', [id]);
        return result.rows[0];
    } catch (err) {
        console.log(err);
    } finally {
        client && client.release();
    }
    console.log('found all');
    return undefined;
}


export async function findByFirstName(firstName: string) {
    console.log('finding all users');
    let client: PoolClient;
    try {
        client = await connectionPool.connect(); // basically .then is everything after this
        const result = await client.query('SELECT * FROM app_user WHERE first_name = $1', [firstName]);
        return result.rows;
    } catch (err) {
        console.log(err);
    } finally {
        client && client.release();
    }
    console.log('found all');
    return undefined;
}



export async function findByUsernameAndPassword(username: string, password: string) {
    let client: PoolClient;
    try {
        client = await connectionPool.connect();

        // it is bad to use interpolation here because it allows sql injection
        // const queryString = `
        //     SELECT * FROM app_user
        //         WHERE username = '${username}' AND pass = '${password}'
        // `;

        // instead there is a built in way of handling this to prevent sql injection
        const queryString = `
            SELECT * FROM app_user
                WHERE username = $1 AND pass = $2
        `;
        const result = await client.query(queryString, [username, password]);
        return result.rows[0]; // there should really only be 1 row at best
    } catch (err) {
        console.log(err);
    } finally {
        client && client.release();
    }

}