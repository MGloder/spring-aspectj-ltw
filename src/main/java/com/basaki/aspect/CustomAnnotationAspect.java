package com.basaki.aspect;

import com.basaki.annotation.CustomAnnotation;
import com.basaki.service.ExampleService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@code CustomAnnotationAspect} intercepts any private method execution if a
 * method is tagged with {@code com.basaki.annotation.CustomAnnotation}
 * annotation.
 * <p>
 *
 * @author Indra Basak
 * @since 02/07/18
 */
@Aspect
public class CustomAnnotationAspect {

    private static final Logger
            log = LoggerFactory.getLogger(CustomAnnotationAspect.class);

    private ExampleService exampleService;

    @Around("@annotation(anno) && execution(* *(..))")
    public void inspectMethod(ProceedingJoinPoint jp, CustomAnnotation anno) throws Throwable {
        // get info
        // save
        // proceesd
        // save
        log.info(
                "Entering CustomAnnotationAspect.inspectMethod() in class "
                        + jp.getSignature().getDeclaringTypeName()
                        + " - method: " + jp.getSignature().getName()
                        + " description: " + anno.description());
        jp.proceed();
        log.info("11111");
    }
}
