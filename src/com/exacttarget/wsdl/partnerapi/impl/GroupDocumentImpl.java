/*
 * An XML document type.
 * Localname: Group
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one Group(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class GroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.GroupDocument
{
    
    public GroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Group");
    
    
    /**
     * Gets the "Group" element
     */
    public com.exacttarget.wsdl.partnerapi.Group getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Group target = null;
            target = (com.exacttarget.wsdl.partnerapi.Group)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(com.exacttarget.wsdl.partnerapi.Group group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Group target = null;
            target = (com.exacttarget.wsdl.partnerapi.Group)get_store().find_element_user(GROUP$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Group)get_store().add_element_user(GROUP$0);
            }
            target.set(group);
        }
    }
    
    /**
     * Appends and returns a new empty "Group" element
     */
    public com.exacttarget.wsdl.partnerapi.Group addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Group target = null;
            target = (com.exacttarget.wsdl.partnerapi.Group)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
}
