/*
 * XML Type:  UpdateOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.UpdateOptions
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML UpdateOptions(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class UpdateOptionsImpl extends com.exacttarget.wsdl.partnerapi.impl.OptionsImpl implements com.exacttarget.wsdl.partnerapi.UpdateOptions
{
    
    public UpdateOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINER$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Container");
    private static final javax.xml.namespace.QName ACTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Action");
    
    
    /**
     * Gets the "Container" element
     */
    public com.exacttarget.wsdl.partnerapi.ContainerID getContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContainerID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContainerID)get_store().find_element_user(CONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Container" element
     */
    public boolean isSetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTAINER$0) != 0;
        }
    }
    
    /**
     * Sets the "Container" element
     */
    public void setContainer(com.exacttarget.wsdl.partnerapi.ContainerID container)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContainerID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContainerID)get_store().find_element_user(CONTAINER$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContainerID)get_store().add_element_user(CONTAINER$0);
            }
            target.set(container);
        }
    }
    
    /**
     * Appends and returns a new empty "Container" element
     */
    public com.exacttarget.wsdl.partnerapi.ContainerID addNewContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContainerID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContainerID)get_store().add_element_user(CONTAINER$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Container" element
     */
    public void unsetContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTAINER$0, 0);
        }
    }
    
    /**
     * Gets the "Action" element
     */
    public java.lang.String getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Action" element
     */
    public org.apache.xmlbeans.XmlString xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Action" element
     */
    public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Action" element
     */
    public void setAction(java.lang.String action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$2);
            }
            target.setStringValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "Action" element
     */
    public void xsetAction(org.apache.xmlbeans.XmlString action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTION$2);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "Action" element
     */
    public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTION$2, 0);
        }
    }
}
