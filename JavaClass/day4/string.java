package JavaClass.day4;

//import java.lang.reflect.Array;

public class string {
    public static void main(String args[]){
        String str = "  ";
        String str1 = new String("Java");
        String str2 = "Class";
        String str3 = "toptop";

        System.out.println(str1.hashCode()); //it will return address of of str1
        System.out.println(str.trim());//it will remove head and tail of string space
        System.out.println(str1.charAt(0));// it will return specified index value in str1
        System.out.println(str1.codePointAt(0));//it will return unicode for specified index value in str1
        System.out.println(str1.concat(str2));//it will add both str1 and str2
        System.out.println(str1.contains("a"));//if specified value is there in str1 will return true or else false
        System.out.println(str1.equals(str));//if both str1 and str will same return true or else false
        System.out.println(str3.substring(3, str3.length()));//it will return substring of specified range in str3 or else return fslse
        System.out.println(str3.indexOf("a"));//if specified value is there in str3 will return index of value or else -1
        System.out.println(str.isBlank());//if string is contains whitespace and empty string then return true or else false
        System.out.println(str1.isEmpty());//if string is contains only empty string then return true or else if it contains anything return false
        System.out.println(str1.lastIndexOf("a"));//Returns the index within this string of the last occurrence of the specified character.
        System.out.println(str1.length());//it will return the length of string
        System.out.println(str1.toLowerCase());//it will convert the string into lowercase
        System.out.println(str1.toUpperCase());//it will convert the string into uppercase
        System.out.println(str1.replace("a", "A"));//it wiil replace char in string old to new char
        System.out.println(str2.startsWith("Cl"));//if specified value is starts with string will return true or else false
        //System.out.println(str4.toString());//if specified value is ends with string will return true or else false
        //System.out.println(str.split(str3));//if specified value is ends with string will return true or else false
    }
}
