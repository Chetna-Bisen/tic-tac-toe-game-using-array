import java.util.ArrayList;
import java.util.Arrays;

public class Tictactoe {
    private static ArrayList<ArrayList<String> > board;
    private static String playerSymbol = " ";
    private static String cpuSymbol = " ";

    //board to be initialized
    public void initBoard(){
        board = new ArrayList<ArrayList<String>>();
        board.add( new ArrayList<String>(Arrays.asList(" "," "," ")));
        board.add( new ArrayList<String>(Arrays.asList(" "," "," ")));
        board.add( new ArrayList<String>(Arrays.asList(" "," "," ")));
        }

//Symbol Selection
    public static void chooseSymbol(int userSymbolChoice){
        if (userSymbolChoice == 1){
            playerSymbol = "X";
            cpuSymbol  =  "O";
        }
        else{
            playerSymbol = "O";
            cpuSymbol = "X";
        }

    }
}

