/*
 * XML Type:  ContentValidation
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ContentValidation
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ContentValidation(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ContentValidationImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ContentValidation
{
    
    public ContentValidationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATIONACTION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ValidationAction");
    private static final javax.xml.namespace.QName EMAIL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Email");
    private static final javax.xml.namespace.QName SUBSCRIBERS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscribers");
    
    
    /**
     * Gets the "ValidationAction" element
     */
    public com.exacttarget.wsdl.partnerapi.ValidationAction getValidationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ValidationAction target = null;
            target = (com.exacttarget.wsdl.partnerapi.ValidationAction)get_store().find_element_user(VALIDATIONACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ValidationAction" element
     */
    public boolean isSetValidationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDATIONACTION$0) != 0;
        }
    }
    
    /**
     * Sets the "ValidationAction" element
     */
    public void setValidationAction(com.exacttarget.wsdl.partnerapi.ValidationAction validationAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ValidationAction target = null;
            target = (com.exacttarget.wsdl.partnerapi.ValidationAction)get_store().find_element_user(VALIDATIONACTION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ValidationAction)get_store().add_element_user(VALIDATIONACTION$0);
            }
            target.set(validationAction);
        }
    }
    
    /**
     * Appends and returns a new empty "ValidationAction" element
     */
    public com.exacttarget.wsdl.partnerapi.ValidationAction addNewValidationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ValidationAction target = null;
            target = (com.exacttarget.wsdl.partnerapi.ValidationAction)get_store().add_element_user(VALIDATIONACTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "ValidationAction" element
     */
    public void unsetValidationAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDATIONACTION$0, 0);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    public com.exacttarget.wsdl.partnerapi.Email getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(com.exacttarget.wsdl.partnerapi.Email email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$2);
            }
            target.set(email);
        }
    }
    
    /**
     * Appends and returns a new empty "Email" element
     */
    public com.exacttarget.wsdl.partnerapi.Email addNewEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$2, 0);
        }
    }
    
    /**
     * Gets the "Subscribers" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers getSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers)get_store().find_element_user(SUBSCRIBERS$4, 0);
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
            return get_store().count_elements(SUBSCRIBERS$4) != 0;
        }
    }
    
    /**
     * Sets the "Subscribers" element
     */
    public void setSubscribers(com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers subscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers)get_store().find_element_user(SUBSCRIBERS$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers)get_store().add_element_user(SUBSCRIBERS$4);
            }
            target.set(subscribers);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscribers" element
     */
    public com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers addNewSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers)get_store().add_element_user(SUBSCRIBERS$4);
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
            get_store().remove_element(SUBSCRIBERS$4, 0);
        }
    }
    /**
     * An XML Subscribers(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class SubscribersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ContentValidation.Subscribers
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
