
const mockCalculator = {
    subtract: jest.fn() // create a mock function for subtract
}

// instead of using the actual calulator file, everything will be imported form 
// my mock object
jest.mock('./calculator', () => {
    return mockCalculator
})

// needs to go after the mock calculator
import {modulus} from './math-application';

// set up a test suite for multiple tests to be in
describe('math application tests', () => {

    // runs once before any other test case is run
    // we can do some setup here
    beforeAll(() => {
        mockCalculator.subtract.mockImplementation((...nums: number[]) => {
            // mock implementation for the subtract method
            return nums.reduce((acc, cur) => acc -= cur);
        })
    })

    it('modulus returns 7 for 7 and 9', () => {
        const result = modulus(7,9);
        expect(result).toEqual(7);
    })

    test('modulus returns 2 for 9 and 7', () => {
        const result = modulus(9,7);
        expect(result).toEqual(2);
    })

    test('modulus returns -2 for -9 and -7', () => {
        const result = modulus(-9,-7);
        expect(result).toEqual(-2);
    })

    test('modulus returns -2 for -9 and 7', () => {
        const result = modulus(-9,7);
        expect(result).toEqual(-2);
    })

    test('modulus returns 0 for 21 and 7', () => {
        const result = modulus(21,7);
        expect(result).toEqual(0);
    })
})