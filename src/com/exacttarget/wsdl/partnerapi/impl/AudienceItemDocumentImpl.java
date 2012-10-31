/*
 * An XML document type.
 * Localname: AudienceItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AudienceItemDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one AudienceItem(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class AudienceItemDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.AudienceItemDocument
{
    
    public AudienceItemDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDIENCEITEM$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AudienceItem");
    
    
    /**
     * Gets the "AudienceItem" element
     */
    public com.exacttarget.wsdl.partnerapi.AudienceItem getAudienceItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AudienceItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().find_element_user(AUDIENCEITEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AudienceItem" element
     */
    public void setAudienceItem(com.exacttarget.wsdl.partnerapi.AudienceItem audienceItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AudienceItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().find_element_user(AUDIENCEITEM$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().add_element_user(AUDIENCEITEM$0);
            }
            target.set(audienceItem);
        }
    }
    
    /**
     * Appends and returns a new empty "AudienceItem" element
     */
    public com.exacttarget.wsdl.partnerapi.AudienceItem addNewAudienceItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AudienceItem target = null;
            target = (com.exacttarget.wsdl.partnerapi.AudienceItem)get_store().add_element_user(AUDIENCEITEM$0);
            return target;
        }
    }
}
