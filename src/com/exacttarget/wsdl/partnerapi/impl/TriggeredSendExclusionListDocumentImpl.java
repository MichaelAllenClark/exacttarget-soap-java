/*
 * An XML document type.
 * Localname: TriggeredSendExclusionList
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one TriggeredSendExclusionList(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class TriggeredSendExclusionListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionListDocument
{
    
    public TriggeredSendExclusionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIGGEREDSENDEXCLUSIONLIST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendExclusionList");
    
    
    /**
     * Gets the "TriggeredSendExclusionList" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList getTriggeredSendExclusionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().find_element_user(TRIGGEREDSENDEXCLUSIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TriggeredSendExclusionList" element
     */
    public void setTriggeredSendExclusionList(com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList triggeredSendExclusionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().find_element_user(TRIGGEREDSENDEXCLUSIONLIST$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().add_element_user(TRIGGEREDSENDEXCLUSIONLIST$0);
            }
            target.set(triggeredSendExclusionList);
        }
    }
    
    /**
     * Appends and returns a new empty "TriggeredSendExclusionList" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList addNewTriggeredSendExclusionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().add_element_user(TRIGGEREDSENDEXCLUSIONLIST$0);
            return target;
        }
    }
}
