//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.19 at 08:22:19 PM IST 
//


package org.w3._2001.xmlschema;

import java.util.Calendar;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Calendar>
{


    public Calendar unmarshal(String value) {
        return (javax.xml.bind.DatatypeConverter.parseDateTime(value));
    }

    public String marshal(Calendar value) {
        if (value == null) {
            return null;
        }
        return (javax.xml.bind.DatatypeConverter.printDateTime(value));
    }

}
