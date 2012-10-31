/*
 * An XML document type.
 * Localname: PrivateDomainSet
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PrivateDomainSetDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one PrivateDomainSet(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class PrivateDomainSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PrivateDomainSetDocument
{
    
    public PrivateDomainSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVATEDOMAINSET$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomainSet");
    
    
    /**
     * Gets the "PrivateDomainSet" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateDomainSet getPrivateDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomainSet target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().find_element_user(PRIVATEDOMAINSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrivateDomainSet" element
     */
    public void setPrivateDomainSet(com.exacttarget.wsdl.partnerapi.PrivateDomainSet privateDomainSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomainSet target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().find_element_user(PRIVATEDOMAINSET$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().add_element_user(PRIVATEDOMAINSET$0);
            }
            target.set(privateDomainSet);
        }
    }
    
    /**
     * Appends and returns a new empty "PrivateDomainSet" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateDomainSet addNewPrivateDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomainSet target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().add_element_user(PRIVATEDOMAINSET$0);
            return target;
        }
    }
}
