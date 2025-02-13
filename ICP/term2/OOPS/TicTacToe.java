import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Game game = new Game(3);
        game.run();
    }
}

class Game {
    Players player1;
    Players player2;

    Board board;

    Game(int size) {
        board = new Board(size);
        player1 = new Players("Player1", 'X');
        player2 = new Players("Player2", 'O');
    }

    public void run() {
        int turns = this.board.size * this.board.size;
        board.init();
        board.display();
        while (turns > 0) {
            
            if (turns % 2 == 0) {
                if(makeMove(player1)) break;
            } else
                if(makeMove(player2)) break;
            turns--;
        }
    }
    private boolean makeMove(Players currentPlayer){
        currentPlayer.makeMove(board);
        board.clear();
        board.display();
        return board.isWinner(currentPlayer.symbol);

    }
}

class Players {
    String name;
    char symbol;

    Players(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void makeMove(Board board) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your row & column: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        // row--;
        // column--;
        int n=board.size;
        if(row<0 || column<0||row>=n||column>=n||board.get(row,column)=='X'||board.get(row,column)=='O'){
            System.out.println("Invalid input! please try again");
            this.makeMove(board);
        }
        else board.set(row,column,this.symbol);
        sc.close();
    }
}

class Board {
    char[][] grid;
    int size;

    Board(int size) {
        this.size = size;
        grid = new char[size][size];
    }

    void init() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.grid[i][j] = '#';
            }
        }
    }
    void set(int row,int column,char s){
        this.grid[row][column]=s;
    }
    public char get(int row,int column){
        return this.grid[row][column];
    }
    public boolean isWinner(char sym){
        if(checkRows(sym)||checkCols(sym)||checkDiagonal(sym)){
            return true;
        }
        else return false;
    }
    private boolean checkRows(char sym){
        for(int i=0;i<size;i++){
            if(checkRow(i,sym)) return true;
        }
        return false;
    }
    private boolean checkRow(int row,char sym){
        for(int i=0;i<size;i++){
            if(this.grid[row][i]!=sym) return false;
        }
        return true;
    }
    private boolean checkCols(char sym){
        for(int i=0;i<size;i++){
            if(checkCol(i,sym)) return true;
        }
        return false;
    }
    private boolean checkCol(int col,char sym){
        for(int i=0;i<size;i++){
            if(this.grid[i][col]!=sym) return false;
        }
        return true;
    }
    private boolean checkDiagonal(char sym){
        return checkDiag1(sym)|| checkDiag2(sym);
    }
    private boolean checkDiag1(char sym){
        for(int i=0;i<size;i++){
            if(this.grid[i][i]!=sym) return false;
        }
        return true;
    }
    private boolean checkDiag2(char sym){
        for(int i=0;i<size;i++){
            if(this.grid[i][size-1-i]!=sym) return false;
        }
        return true;
    }

    boolean check() {
        if (this.grid[0][0] == this.grid[0][1] && this.grid[0][1] == this.grid[0][2] && this.grid[0][0] != '#') {
            System.out.println("Player " + this.grid[0][0] + " wins");
            return true;
        } else if (this.grid[1][0] == this.grid[1][1] && this.grid[1][1] == this.grid[1][2] && this.grid[1][0] != '#') {
            System.out.println("Player " + this.grid[1][0] + " wins");
            return true;
        } else if (this.grid[2][0] == this.grid[2][1] && this.grid[2][1] == this.grid[2][2] && this.grid[2][0] != '#') {
            System.out.println("Player " + this.grid[2][0] + " wins");
            return true;
        } else if (this.grid[0][0] == this.grid[1][0] && this.grid[1][0] == this.grid[2][0] && this.grid[0][0] != '#') {
            System.out.println("Player " + this.grid[0][0] + " wins");
            return true;
        } else if (this.grid[0][1] == this.grid[1][1] && this.grid[1][1] == this.grid[2][1] && this.grid[0][1] != '#') {
            System.out.println("Player " + this.grid[0][1] + " wins");
            return true;
        } else if (this.grid[0][2] == this.grid[1][2] && this.grid[1][2] == this.grid[2][2] && this.grid[0][2] != '#') {
            System.out.println("Player " + this.grid[0][2] + " wins");
            return true;
        } else if (this.grid[0][0] == this.grid[1][1] && this.grid[1][1] == this.grid[2][2] && this.grid[0][0] != '#') {
            System.out.println("Player " + this.grid[0][0] + " wins");
            return true;
        } else if (this.grid[0][2] == this.grid[1][1] && this.grid[1][1] == this.grid[2][0] && this.grid[0][2] != '#') {
            System.out.println("Player " + this.grid[0][2] + " wins");
            return true;
        }
        return false;
    }

    void display() {
        for (int i = 0; i < 6; i++) {
            System.out.print("--");
        }
        System.out.print("-");
        System.out.println();
        System.out.print("| ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 2)
                    System.out.print(this.grid[i][j] + " | ");
                else
                    System.out.print(this.grid[i][j]);
            }
            System.out.println(" | ");
            for (int a = 0; a < 6; a++) {
                System.out.print("--");
            }
            System.out.print("-");
            if (i != 2)
                System.out.print("\n| ");
        }

    }

    void clear() {
        System.out.print("\033[7A");
        System.out.print("\033[2J");
    }

}
