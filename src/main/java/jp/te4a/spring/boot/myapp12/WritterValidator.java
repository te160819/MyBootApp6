package jp.te4a.spring.boot.myapp12;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import lombok.Data;
import lombok.NoArgsConstructor;
public class WritterValidator implements ConstraintValidator<Writter,String>{
	String ok;
	@Override
	public void initialize(Writter nv){ 
		ok =  nv.ok(); 
	}
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		System.out.println("TEST");
		if(in == null){
			return false;
		}
		System.out.println(in.equals(ok));
		
		boolean resultFlg = in.equals(ok);

		return !resultFlg;
	}
}
