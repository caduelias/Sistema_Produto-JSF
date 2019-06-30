package br.com.trabalho.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){	
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		StandardServiceRegistryBuilder registrarServico = new StandardServiceRegistryBuilder();
		registrarServico.applySettings(cfg.getProperties());
		StandardServiceRegistry servico = registrarServico.build();	
		return cfg.buildSessionFactory(servico);
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
