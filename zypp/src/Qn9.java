import java.util.ArrayList;

public class Qn9 {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println("Org ArrayList with dup: " + list);
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<list.size();i++){
            if(!a.contains(list.get(i))){
                a.add(list.get(i));
            }
        }
        System.out.println("removed Duplicacy: " + a);
    }
}


