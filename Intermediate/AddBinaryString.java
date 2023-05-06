package Dsa.Intermediate;

public class AddBinaryString {
    public static void main(String[] args) {
        String A="10101";
        String B="1001";
        System.out.println(addBinaryString(A, B));
    }

    public static String addBinaryString(String A, String B){
        StringBuilder sb=new StringBuilder();
        int i=A.length()-1, j=B.length()-1, Sum, Carry=0;
        while(i>=0 || j>=0 || Carry!=0){
            Sum=Carry;                   //until i & j is on 0th index from last index
            if(i>=0){                    //if i is greater thn 0 index
                Sum+=A.charAt(i)-'0';    //Sum=0+1(49)-0(48)=1
            }
            if(j>=0){
                Sum+=B.charAt(j)-'0';
            }
            sb.append((Sum%2));     //1+1=2%2=0 or 1+0=1%2=1 or 0+0=0%2=0
            Carry=Sum/2;               //1+1=2/2=1 or 1+0=1/2=0 or 0+0=0%2=0
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}