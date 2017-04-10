
import java.util.*;
public class organizaer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Tell me how many people?");
		int amount = in.nextInt();
		in.nextLine();
		String[] name=new String[amount];
		for (int x=0;x<amount;x++)
		{
			System.out.println("Okay give me a persons name.");
			
			name[x]= in.nextLine();
		}
		Arrays.sort(name);
		System.out.println("Okay the first name is "+name[0]);
		System.out.println("The middle name is "+name[name.length/2]);
		System.out.println("The last name is "+name[name.length-1]);
		in.close();
	}
}