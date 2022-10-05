//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.05 a las 08:57:47 AM CDT 
//


package com.cine.service.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSala"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fila"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="^[A-F]{1}$"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="columna"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minExclusive value="0"/&gt;
 *               &lt;maxInclusive value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="estado"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Disponible"/&gt;
 *               &lt;enumeration value="Mantenimiento"/&gt;
 *               &lt;enumeration value="Reservada"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSala",
    "fila",
    "columna",
    "estado"
})
@XmlRootElement(name = "Sala")
public class Sala {

    protected int idSala;
    @XmlElement(required = true)
    protected String fila;
    protected int columna;
    @XmlElement(required = true)
    protected String estado;

    /**
     * Obtiene el valor de la propiedad idSala.
     * 
     */
    public int getIdSala() {
        return idSala;
    }

    /**
     * Define el valor de la propiedad idSala.
     * 
     */
    public void setIdSala(int value) {
        this.idSala = value;
    }

    /**
     * Obtiene el valor de la propiedad fila.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFila() {
        return fila;
    }

    /**
     * Define el valor de la propiedad fila.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFila(String value) {
        this.fila = value;
    }

    /**
     * Obtiene el valor de la propiedad columna.
     * 
     */
    public int getColumna() {
        return columna;
    }

    /**
     * Define el valor de la propiedad columna.
     * 
     */
    public void setColumna(int value) {
        this.columna = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
