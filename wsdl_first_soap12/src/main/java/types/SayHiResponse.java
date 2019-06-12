
package types;

import javax.annotation.Generated;
import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "responseType"
})
@XmlRootElement(name = "sayHiResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
public class SayHiResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    protected String responseType;

    /**
     * Ruft den Wert der responseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    public String getResponseType() {
        return responseType;
    }

    /**
     * Legt den Wert der responseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    public void setResponseType(String value) {
        this.responseType = value;
    }

}
