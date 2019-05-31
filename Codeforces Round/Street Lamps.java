import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main 
{
  //http://codeforces.com/gym/100712/attachments
  public static void main(String[] args) 
  {
    //Scanner sc = new Scanner(System.in);
    sc sc = new sc();
    int T = sc.nextInt();//3
    StringBuilder sb = new StringBuilder();
    //while(sc.hasNext())
    for(int TT=0;TT<T;TT++)
    {
      int N = sc.nextInt();//6
      char[] n = new char[N+2+1];
      //char[] n = new char[N+2+1];
      String s = sc.next();//......
      for(int i=1;i<=N;i++)
      {
        n[i] = s.charAt(i-1);
      }
      
      n[0]='0';
      n[N+1]='0';
      n[N+2]='0';
      
      for(int i=0;i<N+3;i++)
      {
        if(n[i]=='*')
        {
          if(n[i-1]!='*')
            n[i-1] = '0';
          if(n[i+1]!='*')
            n[i+1] = '0';
        }
      }
      
      int count = 0;
      
      for(int i=0;i<N+3;i++)
      {
        if(n[i]=='.')
        {
          n[i] = '0';
          n[i+1] = '0';
          n[i+2] = '0';
          count++;
        }
        
      }

      System.out.println(count);

    }
  }
}



class sc implements Iterator<String>
{
  
  BufferedReader buffer;
  StringTokenizer token;
  
  public sc()
  {
    buffer = new BufferedReader(new InputStreamReader(System.in));
  }
  
  public sc(InputStream in)
  {
    buffer = new BufferedReader(new InputStreamReader(in));
  }
  
  public sc(File f) throws FileNotFoundException
  {
    buffer = new BufferedReader(new FileReader(f));
  }
  
  public boolean hasNext()
  {
    while(token == null || !token.hasMoreElements())
    {
      try
      {
        token = new StringTokenizer(buffer.readLine());
      }catch(IOException e)
      {
        return false;
      }
    }
    return true;
  }
  
  public String next()
  {
    if(hasNext()) 
      return token.nextToken();
    return null;
  }

  @Override
  public void remove()
  {
    return;
  }

  String nextLine()
  {
    if(hasNext()) 
      return token.nextToken("\n");
    return null;
  }
  
  char nextChar()
  {
    return next().charAt(0);
  }
  
  int nextInt()
  {
    return Integer.parseInt(next());
  }

  long nextLong()
  {
    return Long.parseLong(next());
  }
  
  double nextDouble()
  {
    return Double.parseDouble(next());
  }
  
  byte nextByte()
  {
    return Byte.parseByte(next());
  }
  
}