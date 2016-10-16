
public class CompressLetter{
  public static void main(String args[]){
  

String[] X	={"a","b","b","c","c","c","d","d","d","d","e","e","e","e","e"};
int i,n = 0;
int L=X.length;
String h=X[0];
String[] Y = {""};
int p=0;


for(i=0;i<4;i++)
    {
  if(X[i]!=h)
  {
      if(n>=4)
      {
    	  Y[p-2]="*";
          Y[p-1]= n;
      }
      Y[p]=X[i];
      h=X[i];
      p=p+1;
      n=1;
  }else{
  if(n>=4)
  {
    if(i==L-1)
    {
      Y[p-2]="*";
      Y[p-1]=n;
     }else{
      Y[p]=X[i];
      p=p+1;
  
  
  }
  }


  }
}
System.out.println(Y);


}}
