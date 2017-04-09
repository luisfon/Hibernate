package com.luis.util;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.luis.pojos.Usuarios;

public class Test {

	public static void main(String[] args) {

		// importo mi clase donde cree el SessionFactory
		Session session = Util.getSf().openSession();

		session.beginTransaction();

		// se crea una instancia de la clase pojo que usaremos en la db
		@SuppressWarnings("unused")
		Usuarios usuario = new Usuarios("Magali", "Duarte", "Florez", 30);
		/* se salva el usuario
		session.save(usuario);*/
		
		/*mostrar todos los usuarios
        
		
		Query<Usuarios>query = session.createQuery("from Usuarios");
		
	
		List<Usuarios>listaUser=query.list();
		
		for(Usuarios us:listaUser){
			
			System.out.println(us);
		}*/
		
		/*buscar por id*/
		
		Query<Usuarios>query =session.createQuery("from Usuarios where idUser=:id");
		query.setParameter("id","4");
		
		List<Usuarios>listaUs=query.list();
		
		for(Usuarios us:listaUs)
		{
			System.out.println(us);
		}
		
		session.getTransaction().commit();
		session.close();

	}

}
