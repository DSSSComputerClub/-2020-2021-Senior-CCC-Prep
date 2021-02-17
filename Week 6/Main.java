import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rowNum = Integer.parseInt(reader.readLine()); 
        int colNum = Integer.parseInt(reader.readLine()); 

        int table[][] = new int[rowNum][colNum];

        for (int i = 0; i < table.length; i++){
            StringTokenizer tokens = new StringTokenizer(reader.readLine(), " ");
            while (tokens.hasMoreTokens()){
            for (int j = 0; j < table[i].length; j++){
                table[i][j] = Integer.parseInt(tokens.nextToken());
            }
        }
        }
        reader.close();

        HashSet<String> list = new HashSet<String>();
        boolean canWeEscape = canEscape(table, rowNum, colNum, rowNum, colNum, false, list);

        if (canWeEscape) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


    }

    public static boolean canEscape (int elements[][], int row, int col, int rowIndex, int colIndex, boolean check, HashSet<String> list) {
        
        boolean flag = false; 

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++){
                if (elements[i][j] == (rowIndex * colIndex) && !list.contains(i + "," + j)) {
                    list.add(i + "," + j);
                    flag = true;
                    if (i == 0 && j == 0) {
                        check = true;
                        return check;
                    }
                    boolean isOut = canEscape(elements, row, col, i + 1, j+1, check, list);
                    if (isOut) {
                        return isOut;
                    }
                }
            }
        }

        if (!flag) {
            return flag;
        }

        return check;

    }

}