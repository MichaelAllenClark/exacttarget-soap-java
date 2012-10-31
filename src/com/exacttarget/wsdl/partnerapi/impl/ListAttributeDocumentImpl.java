/*
 * An XML document type.
 * Localname: ListAttribute
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ListAttribute(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ListAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ListAttributeDocument
{
    
    public ListAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ListAttribute");
    
    
    /**
     * Gets the "ListAttribute" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttribute getListAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().find_element_user(LISTATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListAttribute" element
     */
    public void setListAttribute(com.exacttarget.wsdl.partnerapi.ListAttribute listAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().find_element_user(LISTATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().add_element_user(LISTATTRIBUTE$0);
            }
            target.set(listAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "ListAttribute" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttribute addNewListAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttribute)get_store().add_element_user(LISTATTRIBUTE$0);
            return target;
        }
    }
}
