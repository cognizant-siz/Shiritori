package Shiritori;

import java.util.ArrayList;
import java.util.List;

public class Shiritori {
    public String[] shiritoriArray(String[] testArr){
        List<String> resultList = new ArrayList<>();
        if(testArr==null) return (String[]) resultList.toArray();
        if(testArr[0].length()>=1)
            resultList.add(testArr[0]);
        else
            return new String[0];
        for(int i = 1; i <testArr.length; i++){
            if(testArr[i].length()<1) break;
            if(testArr[i].charAt(0)==testArr[i-1].charAt(testArr[i-1].length()-1)){
                resultList.add(testArr[i]);
            } else {
                break;
            }
        }
        return resultList.toArray(String[]::new);
    }
}
