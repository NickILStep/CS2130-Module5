package cs2130;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Part 1, run Geometric
        System.out.println("\nGeometric Sequences");
        System.out.println(Sequence.Geometric(18, 3, 2.3));
        System.out.println(Sequence.Geometric(6, 12, 3.7));
        System.out.println(Sequence.Geometric(13, 8.2, 4.5));

        // Part 1, run Arithmetic
        System.out.println("\nArithmetic Sequences");
        System.out.println(Sequence.Arithmetic(18, 3, 2.3));
        System.out.println(Sequence.Arithmetic(6, 12, 3.7));
        System.out.println(Sequence.Arithmetic(13, 8.2, 4.5));

        // Part 2, run Div and Mod
        System.out.println("\nUsing Div and Mod");
        System.out.println(Integers.Div(38, 5));
        // System.out.println(Integers.Mod(38, 5));
        System.out.println(Integers.Div(-38, 5));
        // System.out.println(Integers.Mod(-38, 5));
        System.out.println(Integers.Div(489, 16));
        // System.out.println(Integers.Mod(489, 16));
        System.out.println(Integers.Div(-489, 16));
        // System.out.println(Integers.Mod(-489, 16));


        // Part 2, run Gcd and Lcm
        System.out.println("\nUsing Gcd and Lcm");

    }
}