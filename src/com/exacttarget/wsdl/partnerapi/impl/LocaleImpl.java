/*
 * XML Type:  Locale
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Locale
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Locale(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class LocaleImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Locale
{
    
    public LocaleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCALECODE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LocaleCode");
    
    
    /**
     * Gets the "LocaleCode" element
     */
    public java.lang.String getLocaleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocaleCode" element
     */
    public org.apache.xmlbeans.XmlString xgetLocaleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALECODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LocaleCode" element
     */
    public boolean isSetLocaleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALECODE$0) != 0;
        }
    }
    
    /**
     * Sets the "LocaleCode" element
     */
    public void setLocaleCode(java.lang.String localeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALECODE$0);
            }
            target.setStringValue(localeCode);
        }
    }
    
    /**
     * Sets (as xml) the "LocaleCode" element
     */
    public void xsetLocaleCode(org.apache.xmlbeans.XmlString localeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCALECODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCALECODE$0);
            }
            target.set(localeCode);
        }
    }
    
    /**
     * Unsets the "LocaleCode" element
     */
    public void unsetLocaleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALECODE$0, 0);
        }
    }
}
