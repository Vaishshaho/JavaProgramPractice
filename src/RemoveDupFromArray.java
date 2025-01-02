import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDupFromArray {

    public static void main(String[] args){
        int a[] = {10,20,20,30,30,40,50,50,60,70,70,80,90};
        //Using HashSet
       /* HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i< a.length; i++){
            if(!(hs.contains(a[i]))){
                hs.add(a[i]);
            }
        }
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }*/
        //Without Using HashSet\
       /* Arrays.sort(a);
        int temp[] = new int[a.length];
        int k =0;
        for(int i =0; i< a.length-1; i++){
            if(a[i]!=a[i+1]){
                temp[k] = a[i];
                k++;
            }
        }
        temp[k++]=a[a.length-1];
        int result[] = new int[k];
        System.arraycopy(temp,0,result,0,k);
        System.out.println(Arrays.toString(result));*/
    }
}
