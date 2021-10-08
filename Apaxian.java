import java.util.Scanner;

public class Apaxian{

    /*
    * The extendName find the extend name of young Apaxians based on the ending of their names.
    * The method has two string as input and returns one string. 
    */
    public static String extendName(String Y, String P){
        int n = Y.length();
        if(Y.endsWith("e")){
            return (Y + "x" + P);
        }
        else if(Y.endsWith("a") || Y.endsWith("i") || Y.endsWith("o") || Y.endsWith("u")){
            return (Y.substring(0, n-1) + "ex" + P);
        }
        else if (Y.substring(n-2, n).compareTo("ex") ==  0){
            return(Y + P);
        }
        else{
            return (Y + "ex" + P);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Y = scan.next();
        String P = scan.next();
        String output = extendName(Y, P);
        System.out.println(output);
    }


}