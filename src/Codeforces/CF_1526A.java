import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CF_1526A {
    public static String output = "";
    
    public static void main(String[] args) 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int cases;
        try 
        {
			cases = Integer.parseInt(br.readLine().trim());
			Solver solver = new Solver();
			for (int i = 0; i < cases; i++) 
            {
                br.readLine();
                solver.solve(br.readLine());
			}

		} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
		// System.out.println(output);
    }

}

class Solver {	
    public void solve(String input) 
    {			
        String[] arr = input.split(" ");
        int[] arrInt = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arrInt);

        int pl = 0;
        int pr = arrInt.length - 1;

        while(pl < pr)
        {
            System.out.print(arrInt[pr] + " ");
            System.out.print(arrInt[pl] + " ");

            pl++;
            pr--;
        }
        System.out.print("\n");
    }
}