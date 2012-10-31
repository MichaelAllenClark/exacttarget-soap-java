/*
 * An XML document type.
 * Localname: PrivateIP
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PrivateIPDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one PrivateIP(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class PrivateIPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PrivateIPDocument
{
    
    public PrivateIPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVATEIP$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateIP");
    
    
    /**
     * Gets the "PrivateIP" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateIP getPrivateIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateIP target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().find_element_user(PRIVATEIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PrivateIP" element
     */
    public void setPrivateIP(com.exacttarget.wsdl.partnerapi.PrivateIP privateIP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateIP target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().find_element_user(PRIVATEIP$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().add_element_user(PRIVATEIP$0);
            }
            target.set(privateIP);
        }
    }
    
    /**
     * Appends and returns a new empty "PrivateIP" element
     */
    public com.exacttarget.wsdl.partnerapi.PrivateIP addNewPrivateIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateIP target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().add_element_user(PRIVATEIP$0);
            return target;
        }
    }
}
