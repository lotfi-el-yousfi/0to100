package com.company.mysqljpa.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Around("execution(* com.company.mysqljpa.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object proceed = joinPoint.proceed();  // Proceed with the method call

        long executionTime = System.currentTimeMillis() - start;

        log.error(joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}

