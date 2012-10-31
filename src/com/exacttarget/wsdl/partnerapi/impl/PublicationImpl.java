/*
 * XML Type:  Publication
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Publication
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Publication(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class PublicationImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Publication
{
    
    public PublicationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName ISACTIVE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsActive");
    private static final javax.xml.namespace.QName SENDCLASSIFICATION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassification");
    private static final javax.xml.namespace.QName SUBSCRIBERS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscribers");
    private static final javax.xml.namespace.QName CATEGORY$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Category");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "IsActive" element
     */
    public boolean getIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsActive" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsActive" element
     */
    public boolean isSetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISACTIVE$2) != 0;
        }
    }
    
    /**
     * Sets the "IsActive" element
     */
    public void setIsActive(boolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISACTIVE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISACTIVE$2);
            }
            target.setBooleanValue(isActive);
        }
    }
    
    /**
     * Sets (as xml) the "IsActive" element
     */
    public void xsetIsActive(org.apache.xmlbeans.XmlBoolean isActive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISACTIVE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISACTIVE$2);
            }
            target.set(isActive);
        }
    }
    
    /**
     * Unsets the "IsActive" element
     */
    public void unsetIsActive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISACTIVE$2, 0);
        }
    }
    
    /**
     * Gets the "SendClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassification getSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SendClassification" element
     */
    public boolean isSetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDCLASSIFICATION$4) != 0;
        }
    }
    
    /**
     * Sets the "SendClassification" element
     */
    public void setSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification sendClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$4);
            }
            target.set(sendClassification);
        }
    }
    
    /**
     * Appends and returns a new empty "SendClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.SendClassification addNewSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SendClassification" element
     */
    public void unsetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDCLASSIFICATION$4, 0);
        }
    }
    
    /**
     * Gets the "Subscribers" element
     */
    public com.exacttarget.wsdl.partnerapi.Publication.Subscribers getSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Publication.Subscribers target = null;
            target = (com.exacttarget.wsdl.partnerapi.Publication.Subscribers)get_store().find_element_user(SUBSCRIBERS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Subscribers" element
     */
    public boolean isSetSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERS$6) != 0;
        }
    }
    
    /**
     * Sets the "Subscribers" element
     */
    public void setSubscribers(com.exacttarget.wsdl.partnerapi.Publication.Subscribers subscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Publication.Subscribers target = null;
            target = (com.exacttarget.wsdl.partnerapi.Publication.Subscribers)get_store().find_element_user(SUBSCRIBERS$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Publication.Subscribers)get_store().add_element_user(SUBSCRIBERS$6);
            }
            target.set(subscribers);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscribers" element
     */
    public com.exacttarget.wsdl.partnerapi.Publication.Subscribers addNewSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Publication.Subscribers target = null;
            target = (com.exacttarget.wsdl.partnerapi.Publication.Subscribers)get_store().add_element_user(SUBSCRIBERS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Subscribers" element
     */
    public void unsetSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERS$6, 0);
        }
    }
    
    /**
     * Gets the "Category" element
     */
    public int getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Category" element
     */
    public org.apache.xmlbeans.XmlInt xgetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Category" element
     */
    public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$8) != 0;
        }
    }
    
    /**
     * Sets the "Category" element
     */
    public void setCategory(int category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$8);
            }
            target.setIntValue(category);
        }
    }
    
    /**
     * Sets (as xml) the "Category" element
     */
    public void xsetCategory(org.apache.xmlbeans.XmlInt category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATEGORY$8);
            }
            target.set(category);
        }
    }
    
    /**
     * Unsets the "Category" element
     */
    public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$8, 0);
        }
    }
    /**
     * An XML Subscribers(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class SubscribersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Publication.Subscribers
    {
        
        public SubscribersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBSCRIBER$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
        
        
        /**
         * Gets array of all "Subscriber" elements
         */
        public com.exacttarget.wsdl.partnerapi.Subscriber[] getSubscriberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBSCRIBER$0, targetList);
                com.exacttarget.wsdl.partnerapi.Subscriber[] result = new com.exacttarget.wsdl.partnerapi.Subscriber[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Subscriber" element
         */
        public com.exacttarget.wsdl.partnerapi.Subscriber getSubscriberArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Subscriber target = null;
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Subscriber" element
         */
        public int sizeOfSubscriberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBSCRIBER$0);
            }
        }
        
        /**
         * Sets array of all "Subscriber" element
         */
        public void setSubscriberArray(com.exacttarget.wsdl.partnerapi.Subscriber[] subscriberArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subscriberArray, SUBSCRIBER$0);
            }
        }
        
        /**
         * Sets ith "Subscriber" element
         */
        public void setSubscriberArray(int i, com.exacttarget.wsdl.partnerapi.Subscriber subscriber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Subscriber target = null;
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subscriber);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Subscriber" element
         */
        public com.exacttarget.wsdl.partnerapi.Subscriber insertNewSubscriber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Subscriber target = null;
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().insert_element_user(SUBSCRIBER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Subscriber" element
         */
        public com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscriber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Subscriber target = null;
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Subscriber" element
         */
        public void removeSubscriber(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBSCRIBER$0, i);
            }
        }
    }
}
