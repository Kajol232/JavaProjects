/*
  */
package linearsearc;

/**
 *
 * @
 */
public class search {
    int x;
    int a[];
  public search(int z, int y[]){
    x= z;
    a=y;
  }
  public int linse(int x, int a[]){
      int result=0;
  for (int i =0; i<a.length; i++){
    if (x ==a[i]){
     result =i+1;
     break;
    }
    else {
    continue;
    }
  }
  return result;
  }
    
}
