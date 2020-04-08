package Week1;
import edu.duke.*;

public class CeaserCipher {
    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabetu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetl = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabetu = alphabetu.substring(key) + alphabetu.substring(0, key);
        String shiftedAlphabetl = alphabetl.substring(key) + alphabetl.substring(0, key);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            if (alphabetu.indexOf(currChar) != -1) {
                int idx = alphabetu.indexOf(currChar);
                char newChar = shiftedAlphabetu.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }

            else if (alphabetl.indexOf(currChar) != -1) {
                int idx = alphabetl.indexOf(currChar);
                char newChar = shiftedAlphabetl.charAt(idx);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }

    public String encryptTwoKeys(String input, int key1, int key2) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabetu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetl = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabeteu = alphabetu.substring(key1) + alphabetu.substring(0, key1);
        String shiftedAlphabetou = alphabetu.substring(key2) + alphabetu.substring(0, key2);
        String shiftedAlphabetel = alphabetl.substring(key1) + alphabetl.substring(0, key1);
        String shiftedAlphabetol = alphabetl.substring(key2) + alphabetl.substring(0, key2);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            if (i % 2 == 0) {
                if (alphabetu.indexOf(currChar) != -1) {
                    int idx = alphabetu.indexOf(currChar);
                    char newChar = shiftedAlphabeteu.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }

                else if (alphabetl.indexOf(currChar) != -1) {
                    int idx = alphabetl.indexOf(currChar);
                    char newChar = shiftedAlphabetel.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            } else {
                if (alphabetu.indexOf(currChar) != -1) {
                    int idx = alphabetu.indexOf(currChar);
                    char newChar = shiftedAlphabetou.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }

                else if (alphabetl.indexOf(currChar) != -1) {
                    int idx = alphabetl.indexOf(currChar);
                    char newChar = shiftedAlphabetol.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            }
        }
        return encrypted.toString();
    }

    public void testCaesar() {
        System.out.println(encrypt("First Legion", 3));
        System.out.println(encryptTwoKeys("First Legion", 1, 3));
    }

    public static void main(String[] args) {
        CeaserCipher c =new CeaserCipher();
        c.testCaesar();
    }
}