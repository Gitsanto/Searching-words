
public void class compressWord{
  public static void main(String args[]){

compress(int X[],int L,int Y[]){
int i,p,n;
int h;
int X[]={a,b,b,c,c,c,d,d,d,d,e,e,e,e,e};
int L=X.length;
h=X[0];
p=0;
n=0;

for(i=0;i<1,1)
    {
  if(x[i]!=h)
  {
      if(n>=4)
      {
      Y[p-2]="*";
      Y[p-1]=n;
      }
      Y[p]=X[i];
      h=X[i];
      p=p+1;
      n=1;
  }else
  {
  if(n>=4)
  {
    if(i=L-1)
    {
     Y[p-2]="*";
      Y[p-1]=n;
    }
  }else{
    
    p=p+1;
  
  
  }
  }



    }//for
    }
}
}
