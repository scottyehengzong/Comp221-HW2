



public class Apaxian{


    public String extendName(String Y, String P){
        int n = Y.length();
        if(Y.endsWith("e")){
            return (Y + "x" + P);
        }
        else if(Y.endsWith("a") || Y.endsWith("i") || Y.endsWith("o") || Y.endsWith("u")){
            return (Y.substring(0, n-1) + "ex" + P);
        }
        else if (Y.substring(n-2, n-1).compareTo("ex") == 0){
            return(Y + P);
        }
        else{
            return (Y + "ex" + P);
        }
    }

    public static void main(String[] args) {
        String Y = "alemaxe";
        String P = "maxos";
        String idealOutput = "alemaxexmaxos";
        String myOutput = extendName(Y,P);
    }


}