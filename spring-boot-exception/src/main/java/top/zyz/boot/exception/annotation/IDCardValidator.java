package top.zyz.boot.exception.annotation;

import io.micrometer.common.util.StringUtils;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


import java.util.regex.Pattern;

public class IDCardValidator implements ConstraintValidator<IDCard, String> {

    private static final String REGEX_IDCard = "(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";

    @Override
    public void initialize(IDCard idCard){
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isBlank(value)) {
            return true;
        }
        return Pattern.matches(REGEX_IDCard,value);
    }
}
