/*
 * XML Type:  ResourceSpecification
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ResourceSpecification
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ResourceSpecification(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ResourceSpecificationImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ResourceSpecification
{
    
    public ResourceSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "URN");
    private static final javax.xml.namespace.QName AUTHENTICATION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Authentication");
    
    
    /**
     * Gets the "URN" element
     */
    public java.lang.String getURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URN" element
     */
    public org.apache.xmlbeans.XmlString xgetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "URN" element
     */
    public boolean isSetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URN$0) != 0;
        }
    }
    
    /**
     * Sets the "URN" element
     */
    public void setURN(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URN$0);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "URN" element
     */
    public void xsetURN(org.apache.xmlbeans.XmlString urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URN$0);
            }
            target.set(urn);
        }
    }
    
    /**
     * Unsets the "URN" element
     */
    public void unsetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URN$0, 0);
        }
    }
    
    /**
     * Gets the "Authentication" element
     */
    public com.exacttarget.wsdl.partnerapi.Authentication getAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Authentication target = null;
            target = (com.exacttarget.wsdl.partnerapi.Authentication)get_store().find_element_user(AUTHENTICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Authentication" element
     */
    public boolean isSetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATION$2) != 0;
        }
    }
    
    /**
     * Sets the "Authentication" element
     */
    public void setAuthentication(com.exacttarget.wsdl.partnerapi.Authentication authentication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Authentication target = null;
            target = (com.exacttarget.wsdl.partnerapi.Authentication)get_store().find_element_user(AUTHENTICATION$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Authentication)get_store().add_element_user(AUTHENTICATION$2);
            }
            target.set(authentication);
        }
    }
    
    /**
     * Appends and returns a new empty "Authentication" element
     */
    public com.exacttarget.wsdl.partnerapi.Authentication addNewAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Authentication target = null;
            target = (com.exacttarget.wsdl.partnerapi.Authentication)get_store().add_element_user(AUTHENTICATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Authentication" element
     */
    public void unsetAuthentication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATION$2, 0);
        }
    }
}
