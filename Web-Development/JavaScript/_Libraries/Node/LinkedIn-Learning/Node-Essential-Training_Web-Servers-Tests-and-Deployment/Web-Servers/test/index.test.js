require('../src/index');
const appMock = require('../src/app');

jest.mock('../src/app');

describe('index.js -> app entry', () => {

    it ('true equals true', () => {
        expect(true).toEqual(true);
    });

    it('calls app.listen()', () => {
        expect(appMock.listen).toHaveBeenCalled();
    });

});
