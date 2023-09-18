package Problem_67;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        //Fill 2D List
        File file = new File("Problem_67/test.txt");
        List<List<Integer>> triangle = new ArrayList<List<Integer>>(); 
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                List<Integer> row = new ArrayList<Integer>();
                while (line != ""){
                    int spaceIdx = line.indexOf(" ");
                    if (spaceIdx == -1){
                        int num = Integer.parseInt(line);
                        row.add(num);
                        line = "";
                    } else {
                        int num = Integer.parseInt(line.substring(0, spaceIdx));
                        row.add(num);
                        line = line.substring(spaceIdx + 1);
                    }
                }
                triangle.add(row);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        //Maximum path finder
        int maximum = max(triangle, 0, 0);
        System.out.println(maximum);
    }

    public static int max(List<List<Integer>> list, int row, int column){
        if (row == list.size() - 1){
            return list.get(row).get(column);
        }
        int left = max(list, row + 1, column);
        int right = max(list, row + 1, column + 1);
        if (left > right){
            return left + list.get(row).get(column);
        } else {
            return right + list.get(row).get(column);
        }
    }
}
