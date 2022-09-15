// Index 
// Basic types line 4
// Tuple types line 14
// Union types line 20
// enum types line 32
// object types line 47
// Type Assertion line 59
// Function types line 66
// Interface line 79
// Class line 91
// Access Modifiers line 104
// Static Properties line 112
// Abstract Classes line 119
// Generics line 128
// Modules line 138
// Namespaces line 148
// Namespaces and Modules line 158
// Declaration Merging line 168

// Basic Types in Typescript (Type Annotations) - String, Number, Boolean, Array, Tuple, Enum, Any, Void, Null and Undefined, Never, 
//Object and Type Assertions (Type Casting) - Type Inference and Type Aliases (Custom Types)
let id: number = 5
let company: string = 'Traversy Media'
let isPublished: boolean = true
let x: any = 'Hello'

let ids: number[] = [1, 2, 3, 4, 5]
let arr: any[] = [1, true, 'Hello']
// Tuple (fixed length and type) - not used much anymore in TS 3.0 and above (use interface instead) 
let person: [number, string, boolean] = [1, 'Brad', true]
// Tuple Array (mixed types) - not recommended to use this type of array in typescript 
// because it is not type safe and can cause bugs  in the code 
let employees: [number, string][]
// Type Aliases (Custom Types) - use this instead of Tuple Array (mixed types) 
employees = [
  [1, 'Brad'],
  [2, 'John'],
  [3, 'Jill'],
]

// Union Types (multiple types) - use pipe symbol | to separate types in union type declaration (e.g. let id: string | number)
let pid: string | number
pid = '22'

// Enum (enumerated type) - use enum to define a set of named constants (e.g. enum Direction1 { Up, Down, Left, Right }) 
enum Direction1 {
  Up = 1,
  Down,
  Left,
  Right,
}

enum Direction2 {
  Up = 'Up',
  Down = 'Down',
  Left = 'Left',
  Right = 'Right',
}

// Objects (Type Inference) - use interface to define a custom type (e.g. interface Person { id: number, name: string }) 
type User = {
  id: number
  name: string
}

const user: User = {
  id: 1,
  name: 'John',
}

// Type Assertion (Type Casting) - use angle bracket syntax (e.g. <string>variable) or as syntax (e.g. variable as string) 
let cid: any = 1
// let customerId = <number>cid // angle bracket syntax (e.g. <string>variable) 
let customerId = cid as number

// Functions (Type Inference) - use interface to define a custom type (e.g. interface AddFn { (a: number, b: number): number }) 
function addNum(x: number, y: number): number {
  return x + y
}

// Void (no return type) - use void to define a function that does not return anything 
function log(message: string | number): void {
  console.log(message)
}

// Interfaces (Type Inference) - use interface to define a custom type (e.g. interface Person { id: number, name: string }) 
interface UserInterface {
  readonly id: number
  name: string
  age?: number
}

const user1: UserInterface = {
  id: 1,
  name: 'John',
}

interface MathFunc {
  (x: number, y: number): number
}

const add: MathFunc = (x: number, y: number): number => x + y
const sub: MathFunc = (x: number, y: number): number => x - y

interface PersonInterface {
  id: number
  name: string
  register(): string
}

// Classes  (Type Inference) - use interface to define a custom type (e.g. interface Person { id: number, name: string })
class Person implements PersonInterface {
  id: number
  name: string

  
  constructor(id: number, name: string) {
    this.id = id
    this.name = name
  }

  register() {
    return `${this.name} is now registered`
  }
}

const brad = new Person(1, 'Brad Traversy')
const mike = new Person(2, 'Mike Jordan')

// Subclasses (Type Inference) - use interface to define a custom type (e.g. interface Person { id: number, name: string })
class Employee extends Person {
  position: string

  constructor(id: number, name: string, position: string) {
    super(id, name)
    this.position = position
  }
}

const emp = new Employee(3, 'Shawn', 'Developer')

// Generics (Type Inference) - use interface to define a custom type (e.g. interface Person { id: number, name: string })
function getArray<T>(items: T[]): T[] {
  return new Array().concat(items)
}

let numArray = getArray<number>([1, 2, 3, 4])
let strArray = getArray<string>(['brad', 'John', 'Jill'])
strArray.push(1) // Throws error because we are pushing a number to a string array 