package Strings;

public class reverseSb {
    public static void main(String[] args) {
        String s = "Ritesh";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" Kumar");
        System.out.println(sb);
//        sb.reverse();
        // string builder sort nhi hota hai.
        System.out.println( "Before Reversed: " +sb);
        int i = 0, j = sb.length()-1;
        while(i <= j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println("After Reversed: "+sb);
    }
}
