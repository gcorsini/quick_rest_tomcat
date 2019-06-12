
package hello_world_soap12_http.types;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="minor" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="major" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
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
    "minor",
    "major"
})
@XmlRootElement(name = "faultDetail")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
public class FaultDetail {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    protected short minor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    protected short major;

    /**
     * Ruft den Wert der minor-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    public short getMinor() {
        return minor;
    }

    /**
     * Legt den Wert der minor-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    public void setMinor(short value) {
        this.minor = value;
    }

    /**
     * Ruft den Wert der major-Eigenschaft ab.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    public short getMajor() {
        return major;
    }

    /**
     * Legt den Wert der major-Eigenschaft fest.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2019-03-20T09:43:03+01:00", comments = "JAXB RI v2.3.2")
    public void setMajor(short value) {
        this.major = value;
    }

}
