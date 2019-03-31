import com.github.codetest.service.PrintService;

import java.util.HashMap;

public class MainApp {

    public static void main(String[] args) {
        HashMap<Integer,String> numberMap = new HashMap<Integer, String>();
        numberMap.put(3,"Fizz");
        numberMap.put(5,"Buzz");
        Integer startVal = 1;
        Integer endVal = 100;
        PrintService.printNumberAsList(startVal,endVal,numberMap);
    }
}
