package boot.validator;

import boot.annotation.UserUtil;
import boot.dto.UserDTO;
import org.apache.catalina.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserValidator implements ConstraintValidator<UserUtil, String> {
    @Override
    public void initialize(UserUtil constraintAnnotation) {

    }

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {


        return name==null?false:true;
    }

}
