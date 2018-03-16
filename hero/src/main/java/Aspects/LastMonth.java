package Aspects;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class LastMonth implements MethodBeforeAdvice
{
    public void before(Method method, Object[] args, Object targer) throws Throwable{
        System.out.println("Last Month Dawg");
    }
}
