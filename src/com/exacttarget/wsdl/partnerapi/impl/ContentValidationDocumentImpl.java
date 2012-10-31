/*
 * An XML document type.
 * Localname: ContentValidation
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ContentValidationDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ContentValidation(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ContentValidationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ContentValidationDocument
{
    
    public ContentValidationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTVALIDATION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ContentValidation");
    
    
    /**
     * Gets the "ContentValidation" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentValidation getContentValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidation target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidation)get_store().find_element_user(CONTENTVALIDATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ContentValidation" element
     */
    public void setContentValidation(com.exacttarget.wsdl.partnerapi.ContentValidation contentValidation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidation target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidation)get_store().find_element_user(CONTENTVALIDATION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentValidation)get_store().add_element_user(CONTENTVALIDATION$0);
            }
            target.set(contentValidation);
        }
    }
    
    /**
     * Appends and returns a new empty "ContentValidation" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentValidation addNewContentValidation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidation target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidation)get_store().add_element_user(CONTENTVALIDATION$0);
            return target;
        }
    }
}
