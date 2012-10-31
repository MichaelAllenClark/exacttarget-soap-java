/*
 * An XML document type.
 * Localname: SendDefinitionList
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendDefinitionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one SendDefinitionList(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class SendDefinitionListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SendDefinitionListDocument
{
    
    public SendDefinitionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDDEFINITIONLIST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinitionList");
    
    
    /**
     * Gets the "SendDefinitionList" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinitionList getSendDefinitionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().find_element_user(SENDDEFINITIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendDefinitionList" element
     */
    public void setSendDefinitionList(com.exacttarget.wsdl.partnerapi.SendDefinitionList sendDefinitionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().find_element_user(SENDDEFINITIONLIST$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().add_element_user(SENDDEFINITIONLIST$0);
            }
            target.set(sendDefinitionList);
        }
    }
    
    /**
     * Appends and returns a new empty "SendDefinitionList" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinitionList addNewSendDefinitionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().add_element_user(SENDDEFINITIONLIST$0);
            return target;
        }
    }
}
