package homework;

import classwork.Version;

public class Calc {
    public double add(double c, double d) {
        double result = c + d;
        return result;
    }

    public double sub(double c, double d) {
        double result = c - d;
        return result;
    }

    public double mult(double c, double d) {
        double result = c * d;
        return result;
    }

    public double separ(double c, double d) {
        if (d == 0)
        {
            Integer j = (int) c;
            Integer i = (int) d;
            int result1 = j / i;
            return result1;
              }
              else {
                double result = c / d;
                    return result;
                }

        }
    }



