/*
 * XML Type:  TriggeredSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML TriggeredSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class TriggeredSendImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSend
{
    
    public TriggeredSendImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIGGEREDSENDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendDefinition");
    private static final javax.xml.namespace.QName SUBSCRIBERS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscribers");
    private static final javax.xml.namespace.QName ATTRIBUTES$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Attributes");
    
    
    /**
     * Gets the "TriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TriggeredSendDefinition" element
     */
    public void setTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition triggeredSendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSENDDEFINITION$0);
            }
            target.set(triggeredSendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "TriggeredSendDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSENDDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Subscribers" elements
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber[] getSubscribersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSCRIBERS$2, targetList);
            com.exacttarget.wsdl.partnerapi.Subscriber[] result = new com.exacttarget.wsdl.partnerapi.Subscriber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Subscribers" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber getSubscribersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBERS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Subscribers" element
     */
    public int sizeOfSubscribersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERS$2);
        }
    }
    
    /**
     * Sets array of all "Subscribers" element
     */
    public void setSubscribersArray(com.exacttarget.wsdl.partnerapi.Subscriber[] subscribersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subscribersArray, SUBSCRIBERS$2);
        }
    }
    
    /**
     * Sets ith "Subscribers" element
     */
    public void setSubscribersArray(int i, com.exacttarget.wsdl.partnerapi.Subscriber subscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBERS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subscribers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscribers" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber insertNewSubscribers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().insert_element_user(SUBSCRIBERS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Subscribers" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBERS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Subscribers" element
     */
    public void removeSubscribers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERS$2, i);
        }
    }
    
    /**
     * Gets array of all "Attributes" elements
     */
    public com.exacttarget.wsdl.partnerapi.Attribute[] getAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ATTRIBUTES$4, targetList);
            com.exacttarget.wsdl.partnerapi.Attribute[] result = new com.exacttarget.wsdl.partnerapi.Attribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Attributes" element
     */
    public com.exacttarget.wsdl.partnerapi.Attribute getAttributesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Attribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().find_element_user(ATTRIBUTES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Attributes" element
     */
    public int sizeOfAttributesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTES$4);
        }
    }
    
    /**
     * Sets array of all "Attributes" element
     */
    public void setAttributesArray(com.exacttarget.wsdl.partnerapi.Attribute[] attributesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(attributesArray, ATTRIBUTES$4);
        }
    }
    
    /**
     * Sets ith "Attributes" element
     */
    public void setAttributesArray(int i, com.exacttarget.wsdl.partnerapi.Attribute attributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Attribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().find_element_user(ATTRIBUTES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(attributes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Attributes" element
     */
    public com.exacttarget.wsdl.partnerapi.Attribute insertNewAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Attribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().insert_element_user(ATTRIBUTES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Attributes" element
     */
    public com.exacttarget.wsdl.partnerapi.Attribute addNewAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Attribute target = null;
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().add_element_user(ATTRIBUTES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Attributes" element
     */
    public void removeAttributes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTES$4, i);
        }
    }
}
