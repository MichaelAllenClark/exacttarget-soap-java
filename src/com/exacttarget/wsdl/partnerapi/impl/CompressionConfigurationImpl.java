/*
 * XML Type:  CompressionConfiguration
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CompressionConfiguration
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML CompressionConfiguration(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class CompressionConfigurationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.CompressionConfiguration
{
    
    public CompressionConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Type");
    private static final javax.xml.namespace.QName ENCODING$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Encoding");
    
    
    /**
     * Gets the "Type" element
     */
    public com.exacttarget.wsdl.partnerapi.CompressionType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.CompressionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public com.exacttarget.wsdl.partnerapi.CompressionType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CompressionType target = null;
            target = (com.exacttarget.wsdl.partnerapi.CompressionType)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(com.exacttarget.wsdl.partnerapi.CompressionType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(com.exacttarget.wsdl.partnerapi.CompressionType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CompressionType target = null;
            target = (com.exacttarget.wsdl.partnerapi.CompressionType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.CompressionType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Encoding" element
     */
    public com.exacttarget.wsdl.partnerapi.CompressionEncoding.Enum getEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.CompressionEncoding.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Encoding" element
     */
    public com.exacttarget.wsdl.partnerapi.CompressionEncoding xgetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CompressionEncoding target = null;
            target = (com.exacttarget.wsdl.partnerapi.CompressionEncoding)get_store().find_element_user(ENCODING$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Encoding" element
     */
    public boolean isSetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCODING$2) != 0;
        }
    }
    
    /**
     * Sets the "Encoding" element
     */
    public void setEncoding(com.exacttarget.wsdl.partnerapi.CompressionEncoding.Enum encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENCODING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENCODING$2);
            }
            target.setEnumValue(encoding);
        }
    }
    
    /**
     * Sets (as xml) the "Encoding" element
     */
    public void xsetEncoding(com.exacttarget.wsdl.partnerapi.CompressionEncoding encoding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CompressionEncoding target = null;
            target = (com.exacttarget.wsdl.partnerapi.CompressionEncoding)get_store().find_element_user(ENCODING$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.CompressionEncoding)get_store().add_element_user(ENCODING$2);
            }
            target.set(encoding);
        }
    }
    
    /**
     * Unsets the "Encoding" element
     */
    public void unsetEncoding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCODING$2, 0);
        }
    }
}
