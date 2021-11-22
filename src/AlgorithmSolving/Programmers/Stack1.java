package AlgorithmSolving.Programmers;

import java.util.Stack;

class Stack1 {
    public int solution(int[][] board, int[] moves) {  //55131
        Stack<Integer> stack = new Stack();
        stack.push(0);
        int answer = 0;
        for (int num : moves) {  //5
            System.out.println(num);
            int movesIndex = num - 1;
            System.out.println(movesIndex);
            for (int i = 0; i < board.length; i++) {
                if (board[i][movesIndex] != 0) {
                    if (stack.peek() == board[i][movesIndex]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][movesIndex]);
                    }
                    board[i][movesIndex] = 0;
                    break;
                }
            }
        }


        return answer;
    }

//    public static void main(String[] args) {
//        Stack1 s = new Stack1();
//        int [] []  board = new int[5][5];
//        int [] moves = {1,5,3,5,1,2,1,4};
//        s.solution(board,moves);
//        board[0][-1]=0;
//    }
}