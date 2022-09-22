package br.com.agtec.ConfigurationBeanExample.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;


@Target(ElementType.FIELD)//onde poderá ser usado. No caso, indica q a anotação será usada em um campo
@Retention(RetentionPolicy.RUNTIME)
@Autowired//será injetável
@Qualifier("camaro")//recebe o valor do bean definido com nome camaro
public @interface Camaro {

}
