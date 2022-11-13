package ch.njol.minecraft.config.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface IntSlider {
	int min();

	int max();

	/**
	 * Unit to display, e.g. "%" or " blocks"
	 */
	String unit() default "";

	String minText() default "";

	String maxText() default "";
}
