package com.siren.liu.sample.aop;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

@Aspect
public class ReportAspect {
    private static final String POINT_REPORT = "@annotation(com.siren.liu.sample.aop.Report)";

    @Pointcut(POINT_REPORT)
    public void reportMethod() {

    }

    @Before("reportMethod()")
    public void beforeJPoints(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        if (!method.isAnnotationPresent(Report.class)) {
            return;
        }
        Report report = method.getAnnotation(Report.class);
        Log.d("siren4", "Before id:" + report.eventId() + " data:" + report.data());
    }

//    @Around("reportMethod()")
//    public void aroundJPoints(ProceedingJoinPoint joinPoint) throws Throwable {
//        Log.d("siren4", "++Around++");
//        joinPoint.proceed();
//    }

    @After("reportMethod()")
    public void afterJPoints(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        if (!method.isAnnotationPresent(Report.class)) {
            return;
        }
        Report report = method.getAnnotation(Report.class);
        Log.d("siren4", "After id:" + report.eventId() + " data:" + report.data());
    }

}
