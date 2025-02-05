package org.example;

public class ArithmeticFun {
    //psvm is the shortcut
    public static void main(String[] args) {
        //Arithmetic operatorss // these are binary operators
        //+ addition //- minus //* multiply /// divide //% modulo

        //first we decalre and initialize our 2 integer variables a nd b to litral constants(10 and 15)
        int a = 10;
        int b = 15;

        //then we declare and initialize our result to our litral values(a and b)
        //a + b // a and b in this operation are called operands
        //in this situation its called a binary operator because it takes 2 operands
        int result = a + b;

        int difference = a - b;
        int product = a * b;
        int quotient = b /a; //integer division so will be a whole number // trunkates the decimal value(loses that data)
        int remainder = b % a;

        System.out.println("result is " + result);
        System.out.println("diff is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("remainder is " + remainder);

        //compound Arithmetic Operators
        //+=  //-= //*= // /= // %=
        result += 20; //shortcut result = result + 20
        System.out.println("result is now " + result);

        //increment and decrement operators //these are unary operator
        // ++ increment by one // -- decrement by one
        result++;//++result increment before reading
        System.out.println("result++ " + result);
        result--;//--decrement before reading
        System.out.println("result-- " + result);

        //challenge
        product *= 2;
        System.out.println("2 x product " + product);
    }
}
