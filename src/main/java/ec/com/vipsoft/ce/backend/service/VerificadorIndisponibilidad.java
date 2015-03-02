package ec.com.vipsoft.ce.backend.service;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.com.vipsoft.ce.backend.model.CalendarioIndisponibilidad;

@Stateless
public class VerificadorIndisponibilidad {
	
	@PersistenceContext
	private EntityManager em;
	public boolean estamosEnContingencia(){
		
		boolean retorno=false;
		Query q=em.createQuery("select c from CalendarioIndisponibilidad c where c.fechaInicial<=?1 and c.fechaFinal>=?2");
		Date ahora=new Date();
		q.setParameter(1, ahora);
		q.setParameter(2, ahora);
		List<CalendarioIndisponibilidad>listaCalendario=q.getResultList();
		if(!listaCalendario.isEmpty()){
			retorno=true;
		}
		return retorno;
	}

}
