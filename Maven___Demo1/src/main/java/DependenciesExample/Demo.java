package DependenciesExample;

import org.apache.commons.lang3.StringUtils;

public class Demo {
    public static void main(String[] args) {
        String teststring=" ";
        if(StringUtils.isEmpty("teststring")){
            System.out.println("string is empty");
        }
        else{
            System.out.println("string is not empty");
        }
    }
}
