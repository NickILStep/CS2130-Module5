package cs2130;

import java.util.ArrayList;

public class Sequence {

    public static ArrayList<Double> Geometric(int how_many,
                                              double initial_term,
                                              double common_ratio) {

        ArrayList<Double> geometricResults = new ArrayList<Double>();
        geometricResults.add(initial_term);

        for(int i = 1; i < how_many; i++) {
            geometricResults.add(geometricResults.get(i-1)*common_ratio);
        }

        return geometricResults;
    }

    public static ArrayList<Double> Arithmetic(int how_many,
                                               double initial_term,
                                               double common_difference) {
        
        ArrayList<Double> arithmeticResults = new ArrayList<Double>();
        arithmeticResults.add(initial_term);

        for(int i = 1; i < how_many; i++) {
            arithmeticResults.add(arithmeticResults.get(i-1)+common_difference);
        }

        return arithmeticResults;
    }
}
