/*4. Try creating an array to represent the tic-tac-toe board to the right.
       4.1.How would you access the value in the bottom right square with
       Java code?

 */
public class Main {
    public static void main(String[] args) {

        char[][] ticTacToe = {
                {'o', 'x', 'x'},
                {'x', 'o', 'o'},
                {'x', 'o', 'o'},
        };

        System.out.println(ticTacToe[2][2]);
    }
}