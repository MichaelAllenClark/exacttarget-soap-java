/*
 * XML Type:  UserMap
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.UserMap
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML UserMap(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class UserMapImpl extends com.exacttarget.wsdl.partnerapi.impl.APIPropertyImpl implements com.exacttarget.wsdl.partnerapi.UserMap
{
    
    public UserMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ETACCOUNTUSER$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ETAccountUser");
    private static final javax.xml.namespace.QName ADDITIONALDATA$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AdditionalData");
    
    
    /**
     * Gets the "ETAccountUser" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser getETAccountUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(ETACCOUNTUSER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ETAccountUser" element
     */
    public void setETAccountUser(com.exacttarget.wsdl.partnerapi.AccountUser etAccountUser)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().find_element_user(ETACCOUNTUSER$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().add_element_user(ETACCOUNTUSER$0);
            }
            target.set(etAccountUser);
        }
    }
    
    /**
     * Appends and returns a new empty "ETAccountUser" element
     */
    public com.exacttarget.wsdl.partnerapi.AccountUser addNewETAccountUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AccountUser target = null;
            target = (com.exacttarget.wsdl.partnerapi.AccountUser)get_store().add_element_user(ETACCOUNTUSER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "AdditionalData" elements
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty[] getAdditionalDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALDATA$2, targetList);
            com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AdditionalData" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty getAdditionalDataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(ADDITIONALDATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AdditionalData" element
     */
    public int sizeOfAdditionalDataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALDATA$2);
        }
    }
    
    /**
     * Sets array of all "AdditionalData" element
     */
    public void setAdditionalDataArray(com.exacttarget.wsdl.partnerapi.APIProperty[] additionalDataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(additionalDataArray, ADDITIONALDATA$2);
        }
    }
    
    /**
     * Sets ith "AdditionalData" element
     */
    public void setAdditionalDataArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty additionalData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(ADDITIONALDATA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalData);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AdditionalData" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty insertNewAdditionalData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(ADDITIONALDATA$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AdditionalData" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty addNewAdditionalData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(ADDITIONALDATA$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AdditionalData" element
     */
    public void removeAdditionalData(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALDATA$2, i);
        }
    }
}
