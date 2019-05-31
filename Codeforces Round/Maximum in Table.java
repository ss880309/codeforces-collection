import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main 
{   
  /*
  http://codeforces.com/contest/509/problem/A
  1
  10 6
  AACATGAAGG
  TTTTGGCCAA
  TTTGGCCAAA
  GATCAGATTT
  CCCGGGGGGA
  ATCGATGCAT
 */

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    while(sc.hasNext())
    {
      int N = sc.nextInt();
      int[][] n = new int[N][N];
      for(int i=0;i<N;i++)
      {
        n[0][i] = 1;
        n[i][0] = 1;
      }
      
      for(int i=1;i<N;i++)
      {
        for(int j=1;j<N;j++)
        {
          n[i][j] = n[i-1][j] + n[i][j-1];
          
        }
        
      }      
      System.out.println(n[N-1][N-1]);
      
    }
  }
}

