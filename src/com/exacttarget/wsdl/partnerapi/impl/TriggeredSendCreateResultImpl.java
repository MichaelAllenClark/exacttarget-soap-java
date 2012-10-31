/*
 * XML Type:  TriggeredSendCreateResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML TriggeredSendCreateResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class TriggeredSendCreateResultImpl extends com.exacttarget.wsdl.partnerapi.impl.CreateResultImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSendCreateResult
{
    
    public TriggeredSendCreateResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERFAILURES$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberFailures");
    
    
    /**
     * Gets array of all "SubscriberFailures" elements
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberResult[] getSubscriberFailuresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSCRIBERFAILURES$0, targetList);
            com.exacttarget.wsdl.partnerapi.SubscriberResult[] result = new com.exacttarget.wsdl.partnerapi.SubscriberResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SubscriberFailures" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberResult getSubscriberFailuresArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().find_element_user(SUBSCRIBERFAILURES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SubscriberFailures" element
     */
    public int sizeOfSubscriberFailuresArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERFAILURES$0);
        }
    }
    
    /**
     * Sets array of all "SubscriberFailures" element
     */
    public void setSubscriberFailuresArray(com.exacttarget.wsdl.partnerapi.SubscriberResult[] subscriberFailuresArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subscriberFailuresArray, SUBSCRIBERFAILURES$0);
        }
    }
    
    /**
     * Sets ith "SubscriberFailures" element
     */
    public void setSubscriberFailuresArray(int i, com.exacttarget.wsdl.partnerapi.SubscriberResult subscriberFailures)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().find_element_user(SUBSCRIBERFAILURES$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subscriberFailures);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SubscriberFailures" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberResult insertNewSubscriberFailures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().insert_element_user(SUBSCRIBERFAILURES$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SubscriberFailures" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberResult addNewSubscriberFailures()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberResult)get_store().add_element_user(SUBSCRIBERFAILURES$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SubscriberFailures" element
     */
    public void removeSubscriberFailures(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERFAILURES$0, i);
        }
    }
}
