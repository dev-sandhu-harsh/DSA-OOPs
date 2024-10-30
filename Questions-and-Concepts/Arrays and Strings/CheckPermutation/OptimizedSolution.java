import java.util.HashMap;

public class OptimizedSolution {
    public static void main(String args[]){
        String s1 ="aabc";
        String s2 ="bcaa";
        System.out.println(checkPermutation(s1, s2));
    }
    public static Boolean checkPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                map.replace(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            }else{
                map.put(s1.charAt(i), 1);
            }
        }
        for(int i=0; i<s2.length(); i++){
            if(map.containsKey(s2.charAt(i))){
                if(map.get(s2.charAt(i)) == 1){
                    map.remove(s2.charAt(i));
                }else{
                    map.replace(s2.charAt(i), map.get(s2.charAt(i)) -1);
                }
            }else{
                return false;
            }
        }
        return map.size() == 0;
    }
}
