public class BruteForce{
    public static void main(String args[]){
        String s1 ="aabc";
        String s2 ="bcax";
        System.out.println(checkPermutation(s1, s2));
    }
    public static Boolean checkPermutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            int j = 0;
            for(j=0; j<s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j)) break;
            }
            if(j == s2.length()) return false;
        }
        return true;
    }
}

//Problem: this will not work if string contains non-unique characters