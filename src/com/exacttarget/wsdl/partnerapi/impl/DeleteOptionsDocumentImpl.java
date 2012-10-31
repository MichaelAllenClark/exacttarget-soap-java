/*
 * An XML document type.
 * Localname: DeleteOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DeleteOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one DeleteOptions(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class DeleteOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.DeleteOptionsDocument
{
    
    public DeleteOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEOPTIONS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeleteOptions");
    
    
    /**
     * Gets the "DeleteOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.DeleteOptions getDeleteOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeleteOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeleteOptions)get_store().find_element_user(DELETEOPTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteOptions" element
     */
    public void setDeleteOptions(com.exacttarget.wsdl.partnerapi.DeleteOptions deleteOptions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeleteOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeleteOptions)get_store().find_element_user(DELETEOPTIONS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeleteOptions)get_store().add_element_user(DELETEOPTIONS$0);
            }
            target.set(deleteOptions);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteOptions" element
     */
    public com.exacttarget.wsdl.partnerapi.DeleteOptions addNewDeleteOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeleteOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeleteOptions)get_store().add_element_user(DELETEOPTIONS$0);
            return target;
        }
    }
}
