package Dsa.Self;

public class Repeating {
    public static char count[]=new char[26];
    public static void main(String[] args) {
        String str = "aabbccd";
        int fin = Nonrepeating(str);
        if(fin==-1){
            System.out.println("no non repeating character");
        }
        else{
            System.out.println("non repeating character" + " "+ str.charAt(fin));
        }

        // boolean repeating = true;

        // for (char i : str.toCharArray()){
        //     if (str.indexOf(i)==str.lastIndexOf(i)){
        //         System.out.println("non repeating character" + " "+ i);
        //         repeating = false;
        //     }
        // }
        // if (repeating){
        //     System.out.println("no non repeating character"+" "+0);
        // }
    }
    public static void countArray(String str){
        for (int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
    } 
    public static int Nonrepeating(String str){
        int result=-1;
        for(int i=0; i<str.length(); i++){
            if (count[str.charAt(i)]==1){
            result = i;}
        }
        return result;
    }
}
