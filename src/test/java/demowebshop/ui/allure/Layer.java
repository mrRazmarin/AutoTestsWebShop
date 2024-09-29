package demowebshop.ui.allure;

import io.qameta.allure.LabelAnnotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@LabelAnnotation(name = "layer")
public @interface Layer {
    String value();
}
