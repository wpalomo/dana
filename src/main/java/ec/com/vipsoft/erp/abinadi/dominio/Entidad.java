/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.vipsoft.erp.abinadi.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 *Representa la entidad o empresa.
 * @author chrisvv
 */
@Entity
public class Entidad implements Serializable, Comparable<Entidad> {

    private static final long serialVersionUID = 1L;

    private Boolean ambienteProduccion;
    private byte[] archivop12;
    private boolean comprobanteRetencionEnPruebas;
    private boolean contribuyenteEspecial;
    /**
     * a este correo se notifica la autorizacion de comprobantes
     */
    private String correoNotificacionInterna;
    private String direccionMatriz;

    private boolean facturaEnPruebas;
    private boolean guiaRemisionEnPruebas;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreComercial;
    private boolean notaCreditoEnPruebas;
    private boolean notaDebitoEnPruebas;
    private boolean notificarXcorreo;
    private boolean obligadoContabilidad;
    private String passwordp12;
    private String razonSocial;
    private String resolucionContribuyenteEspecial;
    @Column(unique = true)
    private String ruc;
    @Column(name = "secf")
    private Integer secuenciacafactura;
    @Column(name = "segr")
    private Integer secuenciacaguiaremision;
    @Column(name = "senc")
    private Integer secuenciacanotacredito;
    @Column(name = "secnd")
    private Integer secuenciacanotadebito;
    @Column(name = "seret")
    private Integer secuenciacaretencion;
    protected Long secuenciaTransaccion;
    private Boolean usaComprobantesElectronicos;
    private  Boolean habilitado;
    public Entidad() {
        secuenciaTransaccion = 1L;
        inicializarSecuenciasCA();
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }    

    public Boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }
    @Override
    public int compareTo(Entidad o) {
        return ruc.compareTo(o.ruc);
    }

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Entidad)) {
            return false;
        }
        Entidad other = (Entidad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

	public Boolean getAmbienteProduccion() {
        return ambienteProduccion;
    }

    public byte[] getArchivop12() {
        return archivop12;
    }

    public String getCorreoNotificacionInterna() {
		return correoNotificacionInterna;
	}

    public String getDireccionMatriz() {
        return direccionMatriz;
    }

    public Long getId() {
        return id;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getPasswordp12() {
        return passwordp12;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getResolucionContribuyenteEspecial() {
        return resolucionContribuyenteEspecial;
    }

    public String getRuc() {
        return ruc;
    }

    public Integer getSecuenciacafactura() {
        return secuenciacafactura;
    }

    public Integer getSecuenciacaguiaremision() {
        return secuenciacaguiaremision;
    }

    public Integer getSecuenciacanotacredito() {
        return secuenciacanotacredito;
    }

    public Integer getSecuenciacanotadebito() {
        return secuenciacanotadebito;
    }

    public Integer getSecuenciacaretencion() {
        return secuenciacaretencion;
    }


    public Long getSecuenciaTransaccion() {
        return secuenciaTransaccion;
    }

    public Boolean getUsaComprobantesElectronicos() {
        return usaComprobantesElectronicos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    protected void inicializarSecuenciasCA() {
        secuenciacafactura = new Integer(1);
        secuenciacaguiaremision = new Integer(1);
        secuenciacanotacredito = new Integer(1);
        secuenciacanotadebito = new Integer(1);
        secuenciacaretencion = new Integer(1);
        secuenciaTransaccion = new Long(1);
    }

    public boolean isComprobanteRetencionEnPruebas() {
        return comprobanteRetencionEnPruebas;
    }

//    public Integer getCierreKardex() {
//        return cierreKardex;
//    }
//
//    public void setCierreKardex(Integer cierreKardex) {
//        this.cierreKardex = cierreKardex;
//    }

    public boolean isContribuyenteEspecial() {
        return contribuyenteEspecial;
    }

    public boolean isFacturaEnPruebas() {
        return facturaEnPruebas;
    }

    public boolean isGuiaRemisionEnPruebas() {
        return guiaRemisionEnPruebas;
    }

    public boolean isNotaCreditoEnPruebas() {
        return notaCreditoEnPruebas;
    }

    public boolean isNotaDebitoEnPruebas() {
        return notaDebitoEnPruebas;
    }

    public boolean isNotificarXcorreo() {
		return notificarXcorreo;
	}

    public boolean isObligadoContabilidad() {
        return obligadoContabilidad;
    }

    public void setAmbienteProduccion(Boolean ambienteProduccion) {
        this.ambienteProduccion = ambienteProduccion;
    }

    public void setArchivop12(byte[] archivop12) {
        this.archivop12 = archivop12;
    }

    public void setComprobanteRetencionEnPruebas(
            boolean comprobanteRetencionEnPruebas) {
        this.comprobanteRetencionEnPruebas = comprobanteRetencionEnPruebas;
    }

    public void setContribuyenteEspecial(boolean contribuyenteEspecial) {
        this.contribuyenteEspecial = contribuyenteEspecial;
    }

    public void setCorreoNotificacionInterna(String correoNotificacionInterna) {
		this.correoNotificacionInterna = correoNotificacionInterna;
	}

    public void setDireccionMatriz(String direccionMatriz) {
        this.direccionMatriz = direccionMatriz;
    }

    public void setFacturaEnPruebas(boolean facturaEnPruebas) {
        this.facturaEnPruebas = facturaEnPruebas;
    }

    public void setGuiaRemisionEnPruebas(boolean guiaRemisionEnPruebas) {
        this.guiaRemisionEnPruebas = guiaRemisionEnPruebas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public void setNotaCreditoEnPruebas(boolean notaCreditoEnPruebas) {
        this.notaCreditoEnPruebas = notaCreditoEnPruebas;
    }

    public void setNotaDebitoEnPruebas(boolean notaDebitoEnPruebas) {
        this.notaDebitoEnPruebas = notaDebitoEnPruebas;
    }

    public void setNotificarXcorreo(boolean notificarXcorreo) {
		this.notificarXcorreo = notificarXcorreo;
	}

    public void setObligadoContabilidad(boolean obligadoContabilidad) {
        this.obligadoContabilidad = obligadoContabilidad;
    }

    public void setPasswordp12(String passwordp12) {
        this.passwordp12 = passwordp12;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setResolucionContribuyenteEspecial(
            String resolucionContribuyenteEspecial) {
        this.resolucionContribuyenteEspecial = resolucionContribuyenteEspecial;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setSecuenciacafactura(Integer secuenciacafactura) {
        this.secuenciacafactura = secuenciacafactura;
    }

    public void setSecuenciacaguiaremision(Integer secuenciacaguiaremision) {
        this.secuenciacaguiaremision = secuenciacaguiaremision;
    }

    public void setSecuenciacanotacredito(Integer secuenciacanotacredito) {
        this.secuenciacanotacredito = secuenciacanotacredito;
    }

    public void setSecuenciacanotadebito(Integer secuenciacanotadebito) {
        this.secuenciacanotadebito = secuenciacanotadebito;
    }

    public void setSecuenciacaretencion(Integer secuenciacaretencion) {
        this.secuenciacaretencion = secuenciacaretencion;
    }

    public void setSecuenciaTransaccion(Long secuenciaTransaccion) {
        this.secuenciaTransaccion = secuenciaTransaccion;
    }

    public void setUsaComprobantesElectronicos(Boolean usaComprobantesElectronicos) {
        this.usaComprobantesElectronicos = usaComprobantesElectronicos;
    }

    public Integer siguienteCAFactura() {
        if (secuenciacafactura == null) {
            secuenciacafactura = 1;
        }
        return secuenciacafactura++;
    }

    public Integer siguienteCAGuiaRemision() {
        if (secuenciacaguiaremision == null) {
            secuenciacaguiaremision = 1;
        }
        return secuenciacaguiaremision++;
    }

    public Integer siguienteCANotaCredito() {
        if (secuenciacanotacredito == null) {
            secuenciacanotacredito = 1;
        }
        return secuenciacanotacredito++;
    }

    public Integer siguienteCANotaDebito() {
        if (secuenciacanotadebito == null) {
            secuenciacanotadebito = 1;
        }
        return secuenciacanotadebito++;
    }

    public Integer siguienteCARetencion() {
        if (secuenciacaretencion == null) {
            secuenciacaretencion = 1;
        }
        return secuenciacaretencion++;
    }

    public String siguienteTransaccion() {
        StringBuilder sb = new StringBuilder();
        int longitud = 8 - secuenciaTransaccion.toString().length();
        for (int i = 0; i > longitud; i++) {
            sb.append("0");
        }
        secuenciaTransaccion++;
        sb.append(secuenciaTransaccion);
        return sb.toString();
    }

	@Override
    public String toString() {
        return "ec.com.vipsoft.erp.abinadi.dominio.Entidad[ id=" + id + " ]";
    }

	@PrePersist
    public void verificarAntesPersistir() {
//        if (cierreKardex == null) {
//            SimpleDateFormat anio = new SimpleDateFormat("yyyy");
//            SimpleDateFormat mes = new SimpleDateFormat("MM");
//            StringBuilder sb = new StringBuilder(anio.format(new Date()));
//            if (Integer.parseInt(mes.format(new Date())) > 6) {
//                sb.append(2);
//            } else {
//                sb.append(1);
//            }
//            cierreKardex = Integer.valueOf(sb.toString());
//        }
    }

}