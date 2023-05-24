package Observer;

import java.io.*;

public class ObserverTest {
    public static void main(String[] args) throws IOException {
        Subject  subj = new  Subject();
        HexObserver hexObserver = new HexObserver(subj);
        OctObserver octObserver = new OctObserver(subj);
        BinObserver binObserver = new BinObserver(subj);
        String valueStr;

        InputStreamReader values = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(values);

        do {
            System.out.print("Input integer : ");
            valueStr = br.readLine();
            if (valueStr.equalsIgnoreCase("00"))
                break;
            subj.setState( Integer.parseInt(valueStr));
        } while (true);
    }
}
