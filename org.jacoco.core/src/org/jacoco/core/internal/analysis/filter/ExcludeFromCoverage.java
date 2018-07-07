package org.jacoco.core.internal.analysis.filter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Filters annotated methods.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface ExcludeFromCoverage {
}
