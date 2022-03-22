package chap06.lecture.p11annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
// annotation이 어느범위까지 유지 될건지 정의해야함.
	// SOURCE, CLASS, RUNTIME가 있고 이중, CLASS가 기본 값
}
