/*
 * An XML document type.
 * Localname: Campaign
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CampaignDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one Campaign(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class CampaignDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.CampaignDocument
{
    
    public CampaignDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAMPAIGN$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Campaign");
    
    
    /**
     * Gets the "Campaign" element
     */
    public com.exacttarget.wsdl.partnerapi.Campaign getCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Campaign target = null;
            target = (com.exacttarget.wsdl.partnerapi.Campaign)get_store().find_element_user(CAMPAIGN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Campaign" element
     */
    public void setCampaign(com.exacttarget.wsdl.partnerapi.Campaign campaign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Campaign target = null;
            target = (com.exacttarget.wsdl.partnerapi.Campaign)get_store().find_element_user(CAMPAIGN$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Campaign)get_store().add_element_user(CAMPAIGN$0);
            }
            target.set(campaign);
        }
    }
    
    /**
     * Appends and returns a new empty "Campaign" element
     */
    public com.exacttarget.wsdl.partnerapi.Campaign addNewCampaign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Campaign target = null;
            target = (com.exacttarget.wsdl.partnerapi.Campaign)get_store().add_element_user(CAMPAIGN$0);
            return target;
        }
    }
}
