package exercice4.exo1;

import java.util.Random;
import java.util.Scanner;

public class morpion {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        Boolean playerTurn = false;
        int first = rand.nextInt(0,2);
        
        String[][] board = {
            {" "," "," "},
            {" "," "," "},
            {" "," "," "}
        };

        if(first == 0){
            playerTurn = true;
        }

        while(!isWin(board) && !isDraw(board)){
            if (playerTurn){
                System.out.println("Joueur, c'est à votre tour. Entrez la ligne (0-2) et la colonne (0-2): ");
                String coordonne = scan.nextLine();
                String[] coordList = coordonne.split(" ");
                if (coordList.length != 2) {
                    System.err.println("Erreur : Entrez exactement la ligne (0-2) et la colonne (0-2).");
                    continue;
                }
                
                int line = Integer.parseInt(coordList[0]);
                int column = Integer.parseInt(coordList[1]);

                if (board[line][column] != " ") {
                    System.err.println("Erreur : Impossible d'écrire sur une case déjà utilisée");
                    continue;
                }
                else{
                    board[line][column] = "X";
                    playerTurn = false;
                }
            }
            else{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                botTurn(board);
                playerTurn = true;
            }
            displayBorad(board);
        }


        if (isWin(board) && !playerTurn){
            System.out.println("Félécitations, vous avez gagné !");
        }
        else if (isWin(board) && playerTurn){
            System.out.println("Dommage, vous avez perdu...");
        }
        else if (isDraw(board)){
            System.out.println("Egalité, pas de gagnant !");
        }

        scan.close();

    }

    private static void displayBorad(String[][] board){
        System.out.println("-------------");
        System.out.println("| " + board[0][0] + " | " +  board[0][1] + " | " +  board[0][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[1][0] + " | " +  board[1][1] + " | " +  board[1][2] + " |");
        System.out.println("-------------");
        System.out.println("| " + board[2][0] + " | " +  board[2][1] + " | " +  board[2][2] + " |");
        System.out.println("-------------");
    }

    private static Boolean isWin(String[][] board){
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && board[i][0] != " ") {
                return true;
            }
        }
    
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j]) && board[0][j]!= " ") {
                return true;
            }
        }
    
        if ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[0][0] != " ") ||
            (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && board[0][2] != " ")) {
            return true;
        }
    
        return false;
    }

    private static Boolean isDraw(String[][] board){
        for (String[] line:board){
            for (String value: line){
                if (value == " "){
                    return false;
                }
            }

        }
        return true;
    }

    private static String[][] botTurn(String[][] board){
        System.out.println("Tour de l'ordinateur: ");
        Random rand = new Random();

        if (board[1][1] == " "){
            board[1][1] = "O";
            return board;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]== " ") {
                    board[i][j] = "O";
                    if (isWin(board)) {
                        return board;
                    }
                    board[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == " ") {
                    board[i][j] = "X";
                    if (isWin(board)) {
                        board[i][j] = "O";
                        return board;
                    }
                    board[i][j] = " ";
                }
            }
        }

        int line = rand.nextInt(0,3);
        int column = rand.nextInt(0,3);

        while(board[line][column] != " "){
            line = rand.nextInt(0,3);
            column = rand.nextInt(0,3);
        }
        board[line][column] = "O";
        return board;
    }
}
