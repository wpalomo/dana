package ec.com.vipsoft.ce.backend.service;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.jws.WebParam;

import ec.com.vipsoft.erp.abinadi.dominio.Entidad;
import ec.com.vipsoft.erp.abinadi.dominio.Establecimiento;

@Stateless
@WebService
public class RegistrarEntidad {
	
	@PersistenceContext
	private EntityManager em;
	public boolean registrarEntidad(@WebParam(name = "entidad") Entidad entidad,Establecimiento establecimiento){
		establecimiento.setEntidad(entidad);		
		em.persist(entidad);
		em.persist(establecimiento);
		return true;
	}

}
