import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HE_MultipleOfThree {
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
                solver.solve(br.readLine());
			}

		} 
        catch (IOException e) 
        {
			e.printStackTrace();
            System.out.println("Error:");
            System.out.println(output);
		}
    }

}

class Solver {	
    public void solve(String input) 
    {
        HE_MultipleOfThree.output = input;
        if(Integer.parseInt(input) % 3 == 0)
        {
            System.out.println(input);
            return;
        }
        String[] arr = input.split("");
        String[] arrN = new String[arr.length + 1];

        for(int i = 1; i < arrN.length; i++)
        {
            arrN[i] = arr[i - 1];
        }

        for(int j = 0; j < arrN.length; j++)
        {

            while(j == arrN.length - 1 || Integer.parseInt(arrN[j]) < Integer.parseInt(arrN[j + 1]))
            {
                if(checkDivisibleByThree(arrN))
                {
                    System.out.println(String.join("", arrN));
                    return;
                }

                int nextInt = Integer.parseInt(arrN[j]) + 1;
                arrN[j] = String.valueOf(nextInt);
            }
            arrN[j] = arrN[j + 1];
            arrN[j + 1] = "0";
        }
    }

    public static Boolean checkDivisibleByThree(String[] arrN)
    {
        int remain = Integer.parseInt(arrN[0]);
        for(int i = 1; i < arrN.length; i++)
        {
            remain = (remain * 10 + Integer.parseInt(arrN[i])) % 3;
        }
        return remain == 0 ? true : false;
    }
}