/*
 * An XML document type.
 * Localname: UpdateOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.UpdateOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one UpdateOptions(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class UpdateOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.UpdateOptionsDocument
{
    
    public UpdateOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEOPTIONS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UpdateOptions");
    
    
    /**
     * Gets the "UpdateOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.UpdateOptions getUpdateOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UpdateOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.UpdateOptions)get_store().find_element_user(UPDATEOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateOptions" element
     */
    public void setUpdateOptions(com.exacttarget.wsdl.partnerapi.UpdateOptions updateOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UpdateOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.UpdateOptions)get_store().find_element_user(UPDATEOPTIONS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.UpdateOptions)get_store().add_element_user(UPDATEOPTIONS$0);
            }
            target.set(updateOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.UpdateOptions addNewUpdateOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UpdateOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.UpdateOptions)get_store().add_element_user(UPDATEOPTIONS$0);
            return target;
        }
    }
}
