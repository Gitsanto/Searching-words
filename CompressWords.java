


import java.util.ArrayList;

public class CompressLetter {
    public static void main(String[] args) {
        String[] X = {"a","b","b","c","c","c","d","d","d","d","e","e","e","e","e"};
        int i, n = 0;
        int L = X.length;
       ArrayList Y = new ArrayList();
        String h = X[0];
        int p = 0;
        for(i = 0;i < L;i++)
    {
        if(X[i]!=h)
        {
            if(n>=4)
            {
                Y.add("*");
                Y.add(Integer.toString(n));
            }
          
          Y.add(X[i]);
            h=X[i];
            p=p+1;
            n = 1;
            
        }
        else{
            n = n + 1;
        if(n >= 4)
        {
          if(i==L-1)
          {
            Y.add("*");
            Y.add(Integer.toString(n));
          }
        }
          else{
           Y.add(X[i]);
            p=p+1;
          }
        }
    }
        System.out.println(Y);
    }    
}
