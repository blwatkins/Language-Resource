const appMock = require('../src/app');
require('../src/index');

jest.mock('../src/app');

describe('test suite', () => {

    it('2 * 2 = 4', () => {
        expect(2 * 2).toEqual(4);
    });

    it('calls app.listen()', () => {
        expect(appMock.listen).toHaveBeenCalled();
    });
});
