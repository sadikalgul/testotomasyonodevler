package com.robotdreams;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Generate an ArithmeticException:
        generateException(10,0,3,"merhaba");

        // 2. Generate an ArrayIndexOutOfBoundsException:
        generateException(20,2,6,"Dunya");

        // 3. NullPointerException: Accessing a null object
        generateException(20,2,2,null);

        // 4. NumberFormatException: Attempting to parse a non-numeric string
        generateException(20,2,2,"ali");

    }

    public static void generateException(int val1,int val2, int index,String textVal)
    {
        try {
            String text = textVal;
            int calc = val1 / val2;
            int[] numbers = new int[5];
            numbers[index] = calc;
            System.out.println(text.length());
            int iVal = Integer.parseInt(textVal);

        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }catch (NumberFormatException e) { // Catch any other unexpected exceptions
            System.out.println("An NumberFormatException exception occurred: " + e.getMessage());
        } catch (Exception e) { // Catch any other unexpected exceptions
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        }

    }
}