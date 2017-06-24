package com.annotat;

import java.lang.annotation.*;

/**
 * Created by ajkumar on 5/12/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Documented
public @interface ParentClass {
    Class<?> parent();
}
