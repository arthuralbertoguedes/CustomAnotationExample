package br.com.agtec.ConfigurationBeanExample.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Autowired
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Qualifier("gol")
public @interface Gol {

}
