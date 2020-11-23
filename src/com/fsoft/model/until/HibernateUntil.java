package com.fsoft.model.until;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUntil {
	public static void main(String[] args) {
		getSessionFactory();
	}

	 private static final SessionFactory sessionFactory = buildSessionFactory();
	 
	    private static SessionFactory buildSessionFactory() {
	        try {
	            // Create the SessionFactory from hibernate.cfg.xml
	            return new Configuration().configure().buildSessionFactory();
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	 
	    public static void shutdown() {
	        // Close caches and connection pools
	        getSessionFactory().close();
	    }
	    
	    
	    private static Validator validator = buildValidator();

	    public static Validator getValidator() {
	        return validator;
	    }

	    private static Validator buildValidator() {
	        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	        return factory.getValidator();
	    }
}
