package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Tomek on 2016-06-06.
 */
@Aspect
public class LoggingAspect {
    @Before("allGetters() && allCircleMethod()")
    public void loggingAdvice() {
        System.out.println("Advice run. Get method called ");
    }

    @Before("allCircleMethod()")
    public void loggingAdviceWithJoinPoint(JoinPoint joinPoint) {
        System.out.println("Logging advice with join point " + joinPoint.toString());
    }

    @Before("@annotation(Loggable)")
    public void secondAdvice() {
        System.out.println("Second advice");
    }

    @Before("args(String)")
    public void stringArgumentsMethod() {
        System.out.println("Method takes string has been called");
    }

    @Before("args(name)")
    public void nameArgumentMethod(String name) {
        System.out.println("Method takes name called with name : " + name);
    }

    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void afterThrowing(String name, Exception ex) {
        System.out.println("An exception has been thrown" + ex);
    }

    @Around("allGetters()")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

        Object returnValue = null;
        try {
            System.out.println("Before advice");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After returning");
        } catch (Throwable throwable) {
            System.out.println("After throwing");
        }
        System.out.println("After finally");
        return returnValue;
    }

    @Pointcut("execution(public * get*(..))")
    public void allGetters() {
    }

    @Pointcut("within(model.Circle)")
    public void allCircleMethod() {
    }
}
