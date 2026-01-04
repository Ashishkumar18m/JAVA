package JAVA;
import java.util.Scanner;

public class String_p {
    

    public static void main(String[] args){
        String s1="Hello World I am Ashish Kumar";
        Scanner s=new Scanner(System.in);
        String s2=s.nextLine();
        System.out.print(s2);
// largest word in string 
        /*String[] s2=s1.split(" ");
        String l="";
        for(String word:s2){
            System.out.println(word+" ");
            
        }
         for(String word:s2){
             if(word.length()>l.length()){
                 l=word;
             }
           
        }
          System.out.println(l.length()+" "+l);
          */
// count vowels and spaces 
    /*String s2=s1.toLowerCase();
    int co=0;
    for(int i=0;i<s2.length();i++){
        char c=s2.charAt(i);
        if(c=='a'||c=='e'||c=='u'||c=='o'||c=='i'||c==' '){
            co++;
            System.out.print(c+" ");
        }
    }
    System.out.print(co);*/
  
    
//Character frequencies:    
    
    String str="Hello World I am Ashish Kumar";
        str = str.replace(" ", "").toLowerCase(); // remove spaces and ignore case

        int[] freq = new int[256]; // for all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
        
        
// p

        String str1="Hello";
        String rev="";
        for(int i=str1.length()-1;i>=0;i--){
            rev+=str1.charAt(i);
        }
        System.out.print(rev);
        if(str1.equalsIgnoreCase(rev)){
            System.out.print("\npalindrome");
        }
        else{
            System.out.print("\nnot");
        }
}
    
}
