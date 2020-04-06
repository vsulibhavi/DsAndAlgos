package backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreak {

    public static Set<String> dict = new HashSet<>(Arrays.asList(new String[]{"i", "like", "sam", "sung", "samsungs", "mobile", "ice",
            "cream", "icecream", "man", "go", "mango","a", "b", "c", "bc", "ab"}));



    public static void main(String[] args){

        String word = "ilikeSamsungsmangoicecream";
        String abcdWord = "abcde";

     //   wordBreak("ilikeSamsung");
        System.out.println(wordBreakSpellCorrect(abcdWord.toLowerCase().toCharArray(),0,abcdWord.length()-1));
        int[] lookup = new int[word.length() + 1];
        Arrays.fill(lookup, -1);

        printAllWordBreak(word.toLowerCase().toCharArray(),0,word.length()-1,"");

    }

    private static boolean wordBreakSpellCorrect(char[] spellWord,int start,int end) {

        if(start >end ) return true;
        StringBuffer stringBuffer = new StringBuffer();

        for(int i  =start;i<=end;i++){

            stringBuffer.append(spellWord[i]);
            if(dict.contains(stringBuffer.toString()))
            {
                System.out.println("dict word :"+stringBuffer.toString()+" wordbreak "+ new String(spellWord).substring(i+1,end+1));
               boolean otherWordCorrect =  wordBreakSpellCorrect(spellWord,i+1,end);
               if(otherWordCorrect == false)
                   continue;
               return true;
            }


        }
        return false;

    }


    public static void printAllWordBreak(char[] spellWord,int start,int end,String correctedWord){


        if(start >end )
            System.out.println(correctedWord);
        StringBuffer stringBuffer = new StringBuffer();

        for(int i  =start;i<=end;i++){

            stringBuffer.append(spellWord[i]);
            if(dict.contains(stringBuffer.toString()))
            {
                printAllWordBreak(spellWord,i+1,end,correctedWord + " "+ stringBuffer.toString());

            }

        }


    }


}


