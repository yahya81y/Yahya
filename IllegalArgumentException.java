/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IllegalArgumentExceptionYahya;

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            // Memanggil metode dengan argumen tidak valid
            int result = divide(-10, 2); // Ini akan menyebabkan IllegalArgumentException
            System.out.println("Hasil pembagian: " + result);
        } catch (IllegalArgumentException e) {
            // Menangani IllegalArgumentException di sini
            System.out.println("Terjadi IllegalArgumentException: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static int divide(int numerator, int denominator) {
        if (denominator <= 0) {
            // Melemparkan IllegalArgumentException jika denominaturnya tidak valid
            throw new IllegalArgumentException("Denominator harus lebih besar dari nol");
        }

        return numerator / denominator;
    }
}
