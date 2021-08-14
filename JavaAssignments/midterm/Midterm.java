
package midterm;

public class Midterm {
    
    public static void main(String[] args) {
        System.out.println(foundWord("abcdefg"));    
}
    public static String foundWord(String s){
        String result = "";
        int len = s.length();
        System.out.println(len);
        int j=0;
        int k=9;
        while(j<k){
            if(j<4){
                result += s.charAt(k%len);
            }
            if(j/2 != 1){
                result += s.charAt(j%len);
            }
            j++;
            k--;
            System.out.print(j + " ");
            System.out.println(k);

        }
        return result;
        
    }
}
    

