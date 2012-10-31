/*
 * XML Type:  CreateOptions
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CreateOptions
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML CreateOptions(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class CreateOptionsImpl extends com.exacttarget.wsdl.partnerapi.impl.OptionsImpl implements com.exacttarget.wsdl.partnerapi.CreateOptions
{
    
    public CreateOptionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINER$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Container");
    
    
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
}
