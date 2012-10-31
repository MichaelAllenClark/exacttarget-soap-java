/*
 * XML Type:  List
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.List
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML List(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ListImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.List
{
    
    public ListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTNAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ListName");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Category");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Type");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName SUBSCRIBERS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscribers");
    private static final javax.xml.namespace.QName LISTCLASSIFICATION$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ListClassification");
    private static final javax.xml.namespace.QName AUTOMATEDEMAIL$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutomatedEmail");
    private static final javax.xml.namespace.QName SENDCLASSIFICATION$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassification");
    
    
    /**
     * Gets the "ListName" element
     */
    public java.lang.String getListName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ListName" element
     */
    public org.apache.xmlbeans.XmlString xgetListName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ListName" element
     */
    public boolean isSetListName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "ListName" element
     */
    public void setListName(java.lang.String listName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTNAME$0);
            }
            target.setStringValue(listName);
        }
    }
    
    /**
     * Sets (as xml) the "ListName" element
     */
    public void xsetListName(org.apache.xmlbeans.XmlString listName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LISTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LISTNAME$0);
            }
            target.set(listName);
        }
    }
    
    /**
     * Unsets the "ListName" element
     */
    public void unsetListName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTNAME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$2, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORY$2, 0);
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
            return get_store().count_elements(CATEGORY$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$2);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATEGORY$2);
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
            get_store().remove_element(CATEGORY$2, 0);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public com.exacttarget.wsdl.partnerapi.ListTypeEnum.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.ListTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public com.exacttarget.wsdl.partnerapi.ListTypeEnum xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListTypeEnum)get_store().find_element_user(TYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(com.exacttarget.wsdl.partnerapi.ListTypeEnum.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$4);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(com.exacttarget.wsdl.partnerapi.ListTypeEnum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListTypeEnum)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ListTypeEnum)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$4, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$6, 0);
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
            get_store().find_all_element_users(SUBSCRIBERS$8, targetList);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBERS$8, i);
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
            return get_store().count_elements(SUBSCRIBERS$8);
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
            arraySetterHelper(subscribersArray, SUBSCRIBERS$8);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBERS$8, i);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().insert_element_user(SUBSCRIBERS$8, i);
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
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBERS$8);
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
            get_store().remove_element(SUBSCRIBERS$8, i);
        }
    }
    
    /**
     * Gets the "ListClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.ListClassificationEnum.Enum getListClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTCLASSIFICATION$10, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.ListClassificationEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ListClassification" element
     */
    public com.exacttarget.wsdl.partnerapi.ListClassificationEnum xgetListClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListClassificationEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListClassificationEnum)get_store().find_element_user(LISTCLASSIFICATION$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ListClassification" element
     */
    public boolean isSetListClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTCLASSIFICATION$10) != 0;
        }
    }
    
    /**
     * Sets the "ListClassification" element
     */
    public void setListClassification(com.exacttarget.wsdl.partnerapi.ListClassificationEnum.Enum listClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LISTCLASSIFICATION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LISTCLASSIFICATION$10);
            }
            target.setEnumValue(listClassification);
        }
    }
    
    /**
     * Sets (as xml) the "ListClassification" element
     */
    public void xsetListClassification(com.exacttarget.wsdl.partnerapi.ListClassificationEnum listClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ListClassificationEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.ListClassificationEnum)get_store().find_element_user(LISTCLASSIFICATION$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ListClassificationEnum)get_store().add_element_user(LISTCLASSIFICATION$10);
            }
            target.set(listClassification);
        }
    }
    
    /**
     * Unsets the "ListClassification" element
     */
    public void unsetListClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTCLASSIFICATION$10, 0);
        }
    }
    
    /**
     * Gets the "AutomatedEmail" element
     */
    public com.exacttarget.wsdl.partnerapi.Email getAutomatedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(AUTOMATEDEMAIL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AutomatedEmail" element
     */
    public boolean isSetAutomatedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOMATEDEMAIL$12) != 0;
        }
    }
    
    /**
     * Sets the "AutomatedEmail" element
     */
    public void setAutomatedEmail(com.exacttarget.wsdl.partnerapi.Email automatedEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(AUTOMATEDEMAIL$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(AUTOMATEDEMAIL$12);
            }
            target.set(automatedEmail);
        }
    }
    
    /**
     * Appends and returns a new empty "AutomatedEmail" element
     */
    public com.exacttarget.wsdl.partnerapi.Email addNewAutomatedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(AUTOMATEDEMAIL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "AutomatedEmail" element
     */
    public void unsetAutomatedEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOMATEDEMAIL$12, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$14, 0);
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
            return get_store().count_elements(SENDCLASSIFICATION$14) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$14, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$14);
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
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$14);
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
            get_store().remove_element(SENDCLASSIFICATION$14, 0);
        }
    }
}
