class RussianNestingDoll {
    public innerDoll: RussianNestingDoll;
    public size: string;
    color: string; // public by default so really don't need to specify
    constructor(innerDoll: RussianNestingDoll, size: string, color: string) {
        this.innerDoll = innerDoll;
        this.size = size;
        this.color = color;
    }
}

let doll1 = new RussianNestingDoll(null, 'tiny', 'red');
let doll2 = new RussianNestingDoll(doll1, 'small', 'blue');
let doll3 = new RussianNestingDoll(doll2, 'normal', 'green');
let doll4 = new RussianNestingDoll(doll3, 'huge', 'yellow');

console.log(doll4);


export class Shirt {
    constructor(
        public sleves: Sleeves = Sleeves.SLEEVELESS, 
        public color = '', 
        public collar = false, 
        public size = ''
    ) {}
}

// enums just define a set of constants
enum Sleeves {
    LONG = 'long',
    SHORT = 'short',
    QUARTER = 'quarter',
    SLEEVELESS = 'sleeveless'
}

let s = new Shirt(Sleeves.LONG, 'green', false, 'xm');
export let s2 = new Shirt();
console.log(s);
console.log(s2);

export default s;


