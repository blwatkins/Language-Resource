const express = require('express');
const request = require('supertest');
const colorRoutes = require('../src/color-routes');

jest.mock('../src/library', () => ({
    saveColors: jest.fn()
}));

jest.mock('../data/colors.json', () => [
    {color: "aaa", hex: "test aaa"},
    {color: "bbb", hex: "test bbb"}
]);

const app = express();
app.use('/colors', colorRoutes);

describe('color routes', () => {

    it('GET /colors - success', async () => {
        const response = await request(app).get('/colors');
        expect(response.body).toEqual([
            {color: "aaa", hex: "test aaa"},
            {color: "bbb", hex: "test bbb"}
        ]);
    });

    it('DELETE /colors/:color - success', async () => {
        const response = await request(app).delete('/colors/bbb');
        expect(response.body).toEqual({
            status: "success",
            removed: "bbb",
            colorsCount: 1
        });
    });

});
