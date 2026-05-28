class Mathutils{
public int Add(int a, int b){
    return a+b;
}
public double Add(double a,double b){
    return a+b;
}
public int Add(int a,int b,int c){
    return a+b+c;
}
}
class StringUtils{
String Reverse(String word){
    String rev="";
    for(int i=word.length()-1; i>=0;i--){
        rev+=word.charAt(i);
    }
    return rev;
}
boolean isPalindrome(String name){
    String reversed=Reverse(name);
    return name.equals(reversed);

}
int Vowels(String word){
    int count=0;
    word=word.toLowerCase();
    for(int i=0; i<word.length();i++){
        char c = word.charAt(i);
        if(c=='a' || c=='e' ||c=='i' || c=='o' || c=='u'){
            count++;
        }
    }
    return count;
}
}
public class MathStringUtils{
    public static void main(String [] args){
        Mathutils m=new Mathutils();
        System.out.println(m.Add(2,3));
        System.out.println(m.Add(2.5,3.5));
        System.out.println(m.Add(2,3,4));

        StringUtils s= new StringUtils();
        System.out.println(s.Reverse("hello"));
        System.out.println(s.isPalindrome("madam"));
        System.out.println(s.Vowels("programming"));
    }
}