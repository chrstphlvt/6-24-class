let a:number = 5;

// a = 'hello'; // not allowed because a is of type number

function add(one: number, two: number):number {
    return one + two;
}

console.log(a);
console.log(add(5,25));

let obj = {
    name: 'blake'
}

// obj.someOtherField = 5 // not valid code because someOtherField does not exist on this obj
