import java.util.Scanner;
//http://codeforces.com/contest/1167/problem/A
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int c=1;c<=cases;c++) {
			boolean isPhoneNumber = false;
			
			int len = sc.nextInt();
			String s = sc.next();
			for(int i=0;i<=len-11;i++)
			{
				if(s.charAt(i)=='8')
				{
					isPhoneNumber = true;
					break;
				}
			}
			System.out.println(isPhoneNumber?"YES":"NO");
		}
	}

}
