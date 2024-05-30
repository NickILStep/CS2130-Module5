package cs2130;

public class Integers {
    public static int Div(int number, int divisor) {

        int quotient = 0;
        int remainder = number;

        if(number >= 0) {
            while(remainder >= divisor) {
                quotient += 1;
                remainder -= divisor;
            }
        }
        else {
            while(remainder < 0) {
                quotient -= 1;
                remainder += divisor;
            }
        }
        return quotient;
    }

    public static int Mod(int number, int divisor) {

        int remainder = number;

        if(number >= 0) {
            while(remainder >= divisor) {
                remainder -= divisor;
            }
        }
        else {
            while(remainder < 0) {
                remainder += divisor;
            }
        }
        return remainder;
    }

    public static int Gcd(int x, int y) {

        if(y < x) {
            int temp = x;
            x = y;
            y = temp;
        }

        int remainder = Mod(y, x);

        while(remainder != 0) {
            y = x;
            x = remainder;
            remainder = Mod(y, x);
        }

        return x;
    }

    public static int Lcm(int x, int y) {

        return x * y / Gcd(x, y);
    }
}
