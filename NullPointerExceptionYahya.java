/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nullpointeryahya;

public class NullPointerExceptionYahya {
    public static void main(String[] args) {
        String text = null;

        try {
            // Mencoba mengakses metode atau properti dari objek yang bernilai null
            int length = text.length(); // Ini akan menyebabkan NullPointerException
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            // Menangani NullPointerException di sini
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
