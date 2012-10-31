/*
 * An XML document type.
 * Localname: List
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one List(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ListDocument
{
    
    public ListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    
    
    /**
     * Gets the "List" element
     */
    public com.exacttarget.wsdl.partnerapi.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "List" element
     */
    public void setList(com.exacttarget.wsdl.partnerapi.List list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$0);
            }
            target.set(list);
        }
    }
    
    /**
     * Appends and returns a new empty "List" element
     */
    public com.exacttarget.wsdl.partnerapi.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$0);
            return target;
        }
    }
}
