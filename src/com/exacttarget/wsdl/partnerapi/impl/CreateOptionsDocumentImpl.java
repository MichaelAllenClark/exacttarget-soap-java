/*
 * An XML document type.
 * Localname: CreateOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CreateOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one CreateOptions(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class CreateOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.CreateOptionsDocument
{
    
    public CreateOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEOPTIONS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CreateOptions");
    
    
    /**
     * Gets the "CreateOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.CreateOptions getCreateOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().find_element_user(CREATEOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateOptions" element
     */
    public void setCreateOptions(com.exacttarget.wsdl.partnerapi.CreateOptions createOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().find_element_user(CREATEOPTIONS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().add_element_user(CREATEOPTIONS$0);
            }
            target.set(createOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.CreateOptions addNewCreateOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateOptions)get_store().add_element_user(CREATEOPTIONS$0);
            return target;
        }
    }
}
