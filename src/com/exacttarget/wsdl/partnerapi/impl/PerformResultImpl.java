/*
 * XML Type:  PerformResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PerformResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML PerformResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PerformResultImpl extends com.exacttarget.wsdl.partnerapi.impl.ResultImpl implements com.exacttarget.wsdl.partnerapi.PerformResult
{
    
    public PerformResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Object");
    private static final javax.xml.namespace.QName TASK$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Task");
    
    
    /**
     * Gets the "Object" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECT$0, 0);
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
    public void setObject(com.exacttarget.wsdl.partnerapi.APIObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(OBJECT$0);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "Object" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(OBJECT$0);
            return target;
        }
    }
    
    /**
     * Gets the "Task" element
     */
    public com.exacttarget.wsdl.partnerapi.TaskResult getTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TaskResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.TaskResult)get_store().find_element_user(TASK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Task" element
     */
    public void setTask(com.exacttarget.wsdl.partnerapi.TaskResult task)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TaskResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.TaskResult)get_store().find_element_user(TASK$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TaskResult)get_store().add_element_user(TASK$2);
            }
            target.set(task);
        }
    }
    
    /**
     * Appends and returns a new empty "Task" element
     */
    public com.exacttarget.wsdl.partnerapi.TaskResult addNewTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TaskResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.TaskResult)get_store().add_element_user(TASK$2);
            return target;
        }
    }
}
