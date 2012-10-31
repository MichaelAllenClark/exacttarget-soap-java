/*
 * XML Type:  Query
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Query
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Query(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class QueryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Query
{
    
    public QueryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Object");
    private static final javax.xml.namespace.QName FILTER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Filter");
    
    
    /**
     * Gets the "Object" element
     */
    public com.exacttarget.wsdl.partnerapi.QueryObject getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Object" element
     */
    public void setObject(com.exacttarget.wsdl.partnerapi.QueryObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "Object" element
     */
    public com.exacttarget.wsdl.partnerapi.QueryObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
    
    /**
     * Gets the "Filter" element
     */
    public com.exacttarget.wsdl.partnerapi.FilterPart getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(FILTER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Filter" element
     */
    public boolean isSetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$2) != 0;
        }
    }
    
    /**
     * Sets the "Filter" element
     */
    public void setFilter(com.exacttarget.wsdl.partnerapi.FilterPart filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(FILTER$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(FILTER$2);
            }
            target.set(filter);
        }
    }
    
    /**
     * Appends and returns a new empty "Filter" element
     */
    public com.exacttarget.wsdl.partnerapi.FilterPart addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(FILTER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Filter" element
     */
    public void unsetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$2, 0);
        }
    }
}
