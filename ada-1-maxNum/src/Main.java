import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        try{
            int nLines = Integer.parseInt(br.readLine());
            for (int i = 0; i < nLines; i++){
                String[] line = br.readLine().split(" ");
                int nSticks = Integer.parseInt(line[0]);
                for (int j = 1; j < nSticks; j++){
                    max = Math.max(max, Integer.parseInt(line[j]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(max);
    }
}