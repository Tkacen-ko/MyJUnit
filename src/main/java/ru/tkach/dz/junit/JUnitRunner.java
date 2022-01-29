package ru.tkach.dz.junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JUnitRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        MyFavoriteTest myFavoriteTest = new MyFavoriteTest();
        Method[] methodsMyFavoriteTest = MyFavoriteTest.class.getDeclaredMethods();

        int passedTests = 0;
        int failedTests = 0;
        for (Method method : methodsMyFavoriteTest) {
            if (method.isAnnotationPresent(TkachTest.class)) {
                //System.out.println(method.getName());
                try {
                    method.invoke(myFavoriteTest);
                    System.out.println(method.getName() + ": PASSED!");
                    passedTests++;
                }catch (Exception e){
                    System.out.println(method.getName() + ": FAILED!");
                    failedTests++;
                }

            }
        }
        System.out.println("\nКоличество упавших тестов: "+failedTests);
        System.out.println("Количество пройденных тестов: "+passedTests);
    }
}
