import { subtract } from "./calculator";

/**
 * compute the modulus of 2 operands
 * @param l left operand
 * @param r right operand
 */
export function modulus(l: number, r: number): number {
    const sign = Math.sign(l);
    l = Math.abs(l);
    r = Math.abs(r);
    while(l >= r) {
        l = subtract(l, r);
    }
    return l * sign;
}