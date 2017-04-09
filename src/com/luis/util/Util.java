package com.luis.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Util {
	
		private static SessionFactory sf = build();

		private static SessionFactory build() {
			try {
				
				StandardServiceRegistry ServiceRegistre = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metadata = new MetadataSources(ServiceRegistre).getMetadataBuilder().build();
				return metadata.getSessionFactoryBuilder().build();
				
			} catch (Throwable e) {
				
				System.err.println("la creacion de SessionFactory fallo"+e);
				throw new ExceptionInInitializerError(e);
			}
			
		}

	public static SessionFactory getSf()
	{
		return sf;
	}

}
