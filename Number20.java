
/**
 * Write a description of class Number20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Number20
{
    public static void main(String[] args) {
        int[] array = {10, 22, 15, 24, 30};
        
        for (int num : array) {
            if (num % 2 == 0 && num > 20) {
                System.out.println(num);
            }
        }
    }
}
