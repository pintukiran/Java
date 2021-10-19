import java.util.*;
class Test{
    public static void main(String[] args){
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1.add(1);
        a1.add(3);
        a1.add(4);
        a1.add(6);
        a1.add(6);
        //if have same arguments values then that is duplicates
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(a1.get(3));
       
    }
}