package Aspects;


import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component
public class NextMonth implements AfterReturningAdvice
{
    public void afterReturning(Object returnValue, Method method, Object[] args,
                               Object target) throws Throwable{
        System.out.println("After");
    }
}
