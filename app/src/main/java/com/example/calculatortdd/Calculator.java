package com.example.calculatortdd;

import android.widget.Switch;

public class Calculator {
    public String display = "0";
    public String previousDisplay = "0";
    public String operator = "";

    public void press(String n) {
        if(n == "c"){
            display = "0";
            return;
        }

        if (n == "+" || n == "-" || n == "*" || n == "/") {
            if (operator != "") {
                // After the first operator we need to reduce the previous terms.
                calculate(operator);
            }

            previousDisplay = display;
            display = "0";
            operator = n;
            return;
        }

        if (n == "=") {
            calculate(operator);
            operator = "";
            return;
        }
        if (display == "0") {
            display = n;
            return;
        }

        display += n;
        return;
    }

    private void calculate(String operator) {
        switch (operator) {
            case "+":
                display = String.valueOf(Integer.parseInt(previousDisplay) + Integer.parseInt(display));
                break;
            case "-":
                display = String.valueOf(Integer.parseInt(previousDisplay) - Integer.parseInt(display));
                break;
            case "*":
                display = String.valueOf(Integer.parseInt(previousDisplay) * Integer.parseInt(display));
                break;
            case "/":
                display = String.valueOf(Integer.parseInt(previousDisplay) / Integer.parseInt(display));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
    }


}
