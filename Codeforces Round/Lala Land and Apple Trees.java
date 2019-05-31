import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
  //http://codeforces.com/contest/558/problem/A
  static class node implements Comparable<node>
  {
    int x;
    int y;
    node(int x,int y) 
    {
      this.x = x;
      this.y = y;
    }
    public int compareTo(node t) 
    {

      if(Math.abs(this.x)>Math.abs(t.x))
        return 1;
      else if(Math.abs(this.x)==Math.abs(t.x))
        return 0;
      else
        return -1;
    }
  }

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext())
    {
      int N = sc.nextInt();
      ArrayList<node> a = new ArrayList<node>();
      ArrayList<node> b = new ArrayList<node>();
      node[] n = new node[N];
      for(int i=0;i<N;i++)
      {
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        if(x>=0)
        {
          a.add(new node(x,y));
        }
        else
        {
          b.add(new node(x,y));
        }
      }
      Collections.sort(a);
      Collections.sort(b);
      
      int len = Math.min(a.size(),b.size());
      
      if(len==0)
      {
        if(a.size()==0)
          System.out.println(b.get(0).y);
        else
          System.out.println(a.get(0).y);
        continue;
      }
      
      int first = 0;
      if(a.size()>=b.size())
        first = 1;
      else
        first = 2;
      
      int sum=0;
      try{
        for(int i=0;;i++)
        {
          if(first==1)
          {
            sum+=a.remove(0).y;
            first = 2;
          }
          else if(first==2)
          {
            sum+=b.remove(0).y;
            first = 1;
          }
  
        }
      }catch(Exception ex){}
      System.out.println(sum);

    }
  }
}