/*
Problem: Valid Sudoku
Platform: LeetCode
Question URL: https://leetcode.com/problems/valid-sudoku/
Difficulty: Medium

Approach:
Use HashSets to track seen numbers in:
- Each row
- Each column
- Each 3x3 box

Traverse board once:
If number already exists → invalid.

Time Complexity: O(1)
(9x9 board = constant size)

Space Complexity: O(1)
*/

import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char num = board[i][j];

                if (num == '.')
                    continue;

                if (!seen.add(num + " in row " + i) ||
                    !seen.add(num + " in col " + j) ||
                    !seen.add(num + " in box " + i/3 + "-" + j/3))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        boolean result = isValidSudoku(board);

        System.out.println("Is valid Sudoku: " + result);
    }
}
