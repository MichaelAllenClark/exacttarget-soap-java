/*
 * An XML document type.
 * Localname: ListAttributeRestrictedValue
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ListAttributeRestrictedValue(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ListAttributeRestrictedValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValueDocument
{
    
    public ListAttributeRestrictedValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTATTRIBUTERESTRICTEDVALUE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ListAttributeRestrictedValue");
    
    
    /**
     * Gets the "ListAttributeRestrictedValue" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue getListAttributeRestrictedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().find_element_user(LISTATTRIBUTERESTRICTEDVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListAttributeRestrictedValue" element
     */
    public void setListAttributeRestrictedValue(com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue listAttributeRestrictedValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().find_element_user(LISTATTRIBUTERESTRICTEDVALUE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().add_element_user(LISTATTRIBUTERESTRICTEDVALUE$0);
            }
            target.set(listAttributeRestrictedValue);
        }
    }
    
    /**
     * Appends and returns a new empty "ListAttributeRestrictedValue" element
     */
    public com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue addNewListAttributeRestrictedValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListAttributeRestrictedValue)get_store().add_element_user(LISTATTRIBUTERESTRICTEDVALUE$0);
            return target;
        }
    }
}
