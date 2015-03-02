package ec.com.vipsoft.ce.backend.managedbean;

import java.io.Serializable;

import com.vaadin.cdi.UIScoped;
@UIScoped
public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5832781639216703014L;
	private String name;
	private String rucEmisor;
	private String puntoEmision;
	private String codigoEstablecimiento;
	private Integer idPuntoEmision;
	private Integer idEstablecimiento;
	private String razonSocialEmisor;
	private String direccionMatriz;
	private String direccionEstablecimiento;
	private boolean obligadoContabilidad;
	private String numeroContribuyenteEspecial;
	private String nombreComercial;
	private boolean facturaEnPruebas;
	private boolean comprobnateRetencionEnPruebas;
	private boolean notaCreditoEnPruebas;
	private boolean noteDebitoEnPruebas;
	private boolean guiaRemisionEnpruebas;
	

	public boolean isFacturaEnPruebas() {
		return facturaEnPruebas;
	}

	public void setFacturaEnPruebas(boolean facturaEnPruebas) {
		this.facturaEnPruebas = facturaEnPruebas;
	}

	public boolean isComprobnateRetencionEnPruebas() {
		return comprobnateRetencionEnPruebas;
	}

	public void setComprobnateRetencionEnPruebas(
			boolean comprobnateRetencionEnPruebas) {
		this.comprobnateRetencionEnPruebas = comprobnateRetencionEnPruebas;
	}

	public boolean isNotaCreditoEnPruebas() {
		return notaCreditoEnPruebas;
	}

	public void setNotaCreditoEnPruebas(boolean notaCreditoEnPruebas) {
		this.notaCreditoEnPruebas = notaCreditoEnPruebas;
	}

	public boolean isNoteDebitoEnPruebas() {
		return noteDebitoEnPruebas;
	}

	public void setNoteDebitoEnPruebas(boolean noteDebitoEnPruebas) {
		this.noteDebitoEnPruebas = noteDebitoEnPruebas;
	}

	public boolean isGuiaRemisionEnpruebas() {
		return guiaRemisionEnpruebas;
	}

	public void setGuiaRemisionEnpruebas(boolean guiaRemisionEnpruebas) {
		this.guiaRemisionEnpruebas = guiaRemisionEnpruebas;
	}

	public String getRazonSocialEmisor() {
		return razonSocialEmisor;
	}

	public void setRazonSocialEmisor(String razonSocialEmisor) {
		this.razonSocialEmisor = razonSocialEmisor;
	}

	public String getDireccionMatriz() {
		return direccionMatriz;
	}

	public void setDireccionMatriz(String direccionMatriz) {
		this.direccionMatriz = direccionMatriz;
	}

	public String getDireccionEstablecimiento() {
		return direccionEstablecimiento;
	}

	public void setDireccionEstablecimiento(String direccionEstablecimiento) {
		this.direccionEstablecimiento = direccionEstablecimiento;
	}

	public boolean isObligadoContabilidad() {
		return obligadoContabilidad;
	}

	public void setObligadoContabilidad(boolean obligadoContabilidad) {
		this.obligadoContabilidad = obligadoContabilidad;
	}

	public String getNumeroContribuyenteEspecial() {
		return numeroContribuyenteEspecial;
	}

	public void setNumeroContribuyenteEspecial(String numeroContribuyenteEspecial) {
		this.numeroContribuyenteEspecial = numeroContribuyenteEspecial;
	}

	public Integer getIdPuntoEmision() {
		return idPuntoEmision;
	}

	public void setIdPuntoEmision(Integer idPuntoEmision) {
		this.idPuntoEmision = idPuntoEmision;
	}

	public Integer getIdEstablecimiento() {
		return idEstablecimiento;
	}

	public void setIdEstablecimiento(Integer idEstablecimiento) {
		this.idEstablecimiento = idEstablecimiento;
	}

	public String getRucEmisor() {
		return rucEmisor;
	}

	public void setRucEmisor(String rucEmisor) {
		this.rucEmisor = rucEmisor;
	}

	public String getPuntoEmision() {
		return puntoEmision;
	}

	public void setPuntoEmision(String puntoEmision) {
		this.puntoEmision = puntoEmision;
	}

	public String getCodigoEstablecimiento() {
		return codigoEstablecimiento;
	}

	public void setCodigoEstablecimiento(String codigoEstablecimiento) {
		this.codigoEstablecimiento = codigoEstablecimiento;
	}

	public UserInfo() {
		this.name = "stranger";
	}

	public UserInfo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNombreComercial(String string) {
		nombreComercial=string;
		
	}

	public String getNombreComercial() {
		return nombreComercial;
	}
	
}
