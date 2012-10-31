/*
 * XML Type:  Message
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Message
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Message(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class MessageImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Message
{
    
    public MessageImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXTBODY$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TextBody");
    
    
    /**
     * Gets the "TextBody" element
     */
    public java.lang.String getTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTBODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TextBody" element
     */
    public org.apache.xmlbeans.XmlString xgetTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXTBODY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TextBody" element
     */
    public boolean isSetTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXTBODY$0) != 0;
        }
    }
    
    /**
     * Sets the "TextBody" element
     */
    public void setTextBody(java.lang.String textBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXTBODY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXTBODY$0);
            }
            target.setStringValue(textBody);
        }
    }
    
    /**
     * Sets (as xml) the "TextBody" element
     */
    public void xsetTextBody(org.apache.xmlbeans.XmlString textBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXTBODY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXTBODY$0);
            }
            target.set(textBody);
        }
    }
    
    /**
     * Unsets the "TextBody" element
     */
    public void unsetTextBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXTBODY$0, 0);
        }
    }
}
