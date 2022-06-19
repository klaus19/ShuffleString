public class Shuffle {

    public String restoreString(String s,int[]indices){

        int n = indices.length;
        char[]ch = new char[n];
        for(int i=0;i<n;i++){
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }


    public static void main(String[] args) {

        String s = "codeleet";
        int[]rat = {4,5,6,7,0,2,1,3};

        Shuffle sf = new Shuffle();
         sf.restoreString(s,rat);
         System.out.println(sf.restoreString(s,rat));
    }
}
