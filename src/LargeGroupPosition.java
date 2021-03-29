import java.util.ArrayList;
import java.util.List;

public class LargeGroupPosition {
    public static void main(String[] args){
        String str = "abbxxxxzzy";
        List<List<Integer>> Groups = new ArrayList<>();
        for(int i = 0;i < str.length();i++){

            String s1 = str.substring(i,i+1);
            List<Integer> list = new ArrayList<>();
            list.add(i);
            int j = 0;
            for(j = i+1;j < str.length();j++){
                String s2 = str.substring(j,j+1);
                if(!s1.equals(s2)){
                    break;
                }
            }
            list.add(j-1);
            i = j-1;

            if((list.get(1) - list.get(0)) >= 2){
                Groups.add(list);
            }
        }

        // 打印验证
        for (List<Integer> list : Groups) {
            for (Integer integer : list) {
                System.out.print(integer + ",");
            }
            System.out.println();
        }
    }
}
