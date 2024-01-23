/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticexceptionyahya;
public class ArithmeticExceptionYahya {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            // Pembagian oleh nol akan menyebabkan ArithmeticException
            int result = numerator / denominator;
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            // Tangani ArithmeticException di sini
            System.out.println("Terjadi ArithmeticException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
