package chap06.lecture.p11annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 메소드에만 붙이도록 하겠다.
@Retention(RetentionPolicy.RUNTIME) // 적용범위를 runtime까지 하도록 하겠다ㅓ,
public @interface MyAnnotation3 {

}
