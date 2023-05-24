package nonobserver;

import java.io.*;

public class NonObserver {

    public static void main(String[] args) throws IOException {
        Subject subj = new  Subject();
        String valueStr;
        
        InputStreamReader values = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(values);

        System.out.print("Input integer : ");
        valueStr = br.readLine();
        subj.setState(Integer.parseInt(valueStr));
    }
}
