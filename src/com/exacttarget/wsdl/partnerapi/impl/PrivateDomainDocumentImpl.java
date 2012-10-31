/*
 * An XML document type.
 * Localname: PrivateDomain
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PrivateDomainDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one PrivateDomain(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class PrivateDomainDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PrivateDomainDocument
{
    
    public PrivateDomainDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVATEDOMAIN$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomain");
    
    
    /**
     * Gets the "PrivateDomain" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateDomain getPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomain target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().find_element_user(PRIVATEDOMAIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrivateDomain" element
     */
    public void setPrivateDomain(com.exacttarget.wsdl.partnerapi.PrivateDomain privateDomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomain target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().find_element_user(PRIVATEDOMAIN$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().add_element_user(PRIVATEDOMAIN$0);
            }
            target.set(privateDomain);
        }
    }
    
    /**
     * Appends and returns a new empty "PrivateDomain" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateDomain addNewPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomain target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().add_element_user(PRIVATEDOMAIN$0);
            return target;
        }
    }
}
