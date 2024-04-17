public class CountPrefixes {
    public int countPrefixes(String[] words, String s) {
        int out = 0;

        for(int i=0; i<words.length; i++){
            String temp = words[i];
            if(temp.length() > s.length()){
                continue;
            }
            String a = s.substring(0,temp.length());
            if(a.equals(temp)){
                out++;
            }
        }
        return out;
    }
}
