package utlls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    private static final Random random = new Random();
    public static boolean isMatchStringWithRegex(String string , String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        if(matcher.matches()) return true;
        return false;
    }

    public static Random getRandom(){
        return random;
    }

    public static <E> void swapObjectInArrayList(ArrayList<E> list ,int index1 , int index2){
        E temp = list.get(index1);
        list.set(index1 , list.get(index2));
        list.set(index2 , temp);
    }
}
