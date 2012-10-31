/*
 * XML Type:  Subscriber
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Subscriber
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Subscriber(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SubscriberImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Subscriber
{
    
    public SubscriberImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAILADDRESS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailAddress");
    private static final javax.xml.namespace.QName ATTRIBUTES$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Attributes");
    private static final javax.xml.namespace.QName SUBSCRIBERKEY$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberKey");
    private static final javax.xml.namespace.QName UNSUBSCRIBEDDATE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UnsubscribedDate");
    private static final javax.xml.namespace.QName STATUS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName PARTNERTYPE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerType");
    private static final javax.xml.namespace.QName EMAILTYPEPREFERENCE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailTypePreference");
    private static final javax.xml.namespace.QName LISTS$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Lists");
    private static final javax.xml.namespace.QName GLOBALUNSUBSCRIBECATEGORY$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "GlobalUnsubscribeCategory");
    private static final javax.xml.namespace.QName SUBSCRIBERTYPEDEFINITION$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberTypeDefinition");
    private static final javax.xml.namespace.QName ADDRESSES$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Addresses");
    private static final javax.xml.namespace.QName PRIMARYSMSADDRESS$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrimarySMSAddress");
    private static final javax.xml.namespace.QName PRIMARYSMSPUBLICATIONSTATUS$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrimarySMSPublicationStatus");
    private static final javax.xml.namespace.QName PRIMARYEMAILADDRESS$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrimaryEmailAddress");
    private static final javax.xml.namespace.QName LOCALE$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Locale");
    
    
    /**
     * Gets the "EmailAddress" element
     */
    public java.lang.String getEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailAddress" element
     */
    public boolean isSetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILADDRESS$0) != 0;
        }
    }
    
    /**
     * Sets the "EmailAddress" element
     */
    public void setEmailAddress(java.lang.String emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$0);
            }
            target.setStringValue(emailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "EmailAddress" element
     */
    public void xsetEmailAddress(org.apache.xmlbeans.XmlString emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS$0);
            }
            target.set(emailAddress);
        }
    }
    
    /**
     * Unsets the "EmailAddress" element
     */
    public void unsetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILADDRESS$0, 0);
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
            get_store().find_all_element_users(ATTRIBUTES$2, targetList);
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
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().find_element_user(ATTRIBUTES$2, i);
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
            return get_store().count_elements(ATTRIBUTES$2);
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
            arraySetterHelper(attributesArray, ATTRIBUTES$2);
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
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().find_element_user(ATTRIBUTES$2, i);
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
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().insert_element_user(ATTRIBUTES$2, i);
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
            target = (com.exacttarget.wsdl.partnerapi.Attribute)get_store().add_element_user(ATTRIBUTES$2);
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
            get_store().remove_element(ATTRIBUTES$2, i);
        }
    }
    
    /**
     * Gets the "SubscriberKey" element
     */
    public java.lang.String getSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriberKey" element
     */
    public org.apache.xmlbeans.XmlString xgetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriberKey" element
     */
    public boolean isSetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERKEY$4) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberKey" element
     */
    public void setSubscriberKey(java.lang.String subscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERKEY$4);
            }
            target.setStringValue(subscriberKey);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriberKey" element
     */
    public void xsetSubscriberKey(org.apache.xmlbeans.XmlString subscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBERKEY$4);
            }
            target.set(subscriberKey);
        }
    }
    
    /**
     * Unsets the "SubscriberKey" element
     */
    public void unsetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERKEY$4, 0);
        }
    }
    
    /**
     * Gets the "UnsubscribedDate" element
     */
    public java.util.Calendar getUnsubscribedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBEDDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnsubscribedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetUnsubscribedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UNSUBSCRIBEDDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnsubscribedDate" element
     */
    public boolean isSetUnsubscribedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSUBSCRIBEDDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "UnsubscribedDate" element
     */
    public void setUnsubscribedDate(java.util.Calendar unsubscribedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBEDDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSUBSCRIBEDDATE$6);
            }
            target.setCalendarValue(unsubscribedDate);
        }
    }
    
    /**
     * Sets (as xml) the "UnsubscribedDate" element
     */
    public void xsetUnsubscribedDate(org.apache.xmlbeans.XmlDateTime unsubscribedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(UNSUBSCRIBEDDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(UNSUBSCRIBEDDATE$6);
            }
            target.set(unsubscribedDate);
        }
    }
    
    /**
     * Unsets the "UnsubscribedDate" element
     */
    public void unsetUnsubscribedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSUBSCRIBEDDATE$6, 0);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberStatus xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberStatus)get_store().find_element_user(STATUS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$8) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(com.exacttarget.wsdl.partnerapi.SubscriberStatus.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$8);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(com.exacttarget.wsdl.partnerapi.SubscriberStatus status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberStatus)get_store().find_element_user(STATUS$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberStatus)get_store().add_element_user(STATUS$8);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$8, 0);
        }
    }
    
    /**
     * Gets the "PartnerType" element
     */
    public java.lang.String getPartnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERTYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerType" element
     */
    public org.apache.xmlbeans.XmlString xgetPartnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERTYPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "PartnerType" element
     */
    public boolean isSetPartnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERTYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "PartnerType" element
     */
    public void setPartnerType(java.lang.String partnerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERTYPE$10);
            }
            target.setStringValue(partnerType);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerType" element
     */
    public void xsetPartnerType(org.apache.xmlbeans.XmlString partnerType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERTYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERTYPE$10);
            }
            target.set(partnerType);
        }
    }
    
    /**
     * Unsets the "PartnerType" element
     */
    public void unsetPartnerType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERTYPE$10, 0);
        }
    }
    
    /**
     * Gets the "EmailTypePreference" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailType.Enum getEmailTypePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILTYPEPREFERENCE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.EmailType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailTypePreference" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailType xgetEmailTypePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailType target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailType)get_store().find_element_user(EMAILTYPEPREFERENCE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailTypePreference" element
     */
    public boolean isSetEmailTypePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILTYPEPREFERENCE$12) != 0;
        }
    }
    
    /**
     * Sets the "EmailTypePreference" element
     */
    public void setEmailTypePreference(com.exacttarget.wsdl.partnerapi.EmailType.Enum emailTypePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILTYPEPREFERENCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILTYPEPREFERENCE$12);
            }
            target.setEnumValue(emailTypePreference);
        }
    }
    
    /**
     * Sets (as xml) the "EmailTypePreference" element
     */
    public void xsetEmailTypePreference(com.exacttarget.wsdl.partnerapi.EmailType emailTypePreference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailType target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailType)get_store().find_element_user(EMAILTYPEPREFERENCE$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.EmailType)get_store().add_element_user(EMAILTYPEPREFERENCE$12);
            }
            target.set(emailTypePreference);
        }
    }
    
    /**
     * Unsets the "EmailTypePreference" element
     */
    public void unsetEmailTypePreference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILTYPEPREFERENCE$12, 0);
        }
    }
    
    /**
     * Gets array of all "Lists" elements
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberList[] getListsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LISTS$14, targetList);
            com.exacttarget.wsdl.partnerapi.SubscriberList[] result = new com.exacttarget.wsdl.partnerapi.SubscriberList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Lists" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberList getListsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().find_element_user(LISTS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Lists" element
     */
    public int sizeOfListsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LISTS$14);
        }
    }
    
    /**
     * Sets array of all "Lists" element
     */
    public void setListsArray(com.exacttarget.wsdl.partnerapi.SubscriberList[] listsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listsArray, LISTS$14);
        }
    }
    
    /**
     * Sets ith "Lists" element
     */
    public void setListsArray(int i, com.exacttarget.wsdl.partnerapi.SubscriberList lists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().find_element_user(LISTS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lists);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Lists" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberList insertNewLists(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().insert_element_user(LISTS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Lists" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberList addNewLists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberList)get_store().add_element_user(LISTS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "Lists" element
     */
    public void removeLists(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LISTS$14, i);
        }
    }
    
    /**
     * Gets the "GlobalUnsubscribeCategory" element
     */
    public com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory getGlobalUnsubscribeCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory target = null;
            target = (com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory)get_store().find_element_user(GLOBALUNSUBSCRIBECATEGORY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GlobalUnsubscribeCategory" element
     */
    public boolean isSetGlobalUnsubscribeCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GLOBALUNSUBSCRIBECATEGORY$16) != 0;
        }
    }
    
    /**
     * Sets the "GlobalUnsubscribeCategory" element
     */
    public void setGlobalUnsubscribeCategory(com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory globalUnsubscribeCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory target = null;
            target = (com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory)get_store().find_element_user(GLOBALUNSUBSCRIBECATEGORY$16, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory)get_store().add_element_user(GLOBALUNSUBSCRIBECATEGORY$16);
            }
            target.set(globalUnsubscribeCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "GlobalUnsubscribeCategory" element
     */
    public com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory addNewGlobalUnsubscribeCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory target = null;
            target = (com.exacttarget.wsdl.partnerapi.GlobalUnsubscribeCategory)get_store().add_element_user(GLOBALUNSUBSCRIBECATEGORY$16);
            return target;
        }
    }
    
    /**
     * Unsets the "GlobalUnsubscribeCategory" element
     */
    public void unsetGlobalUnsubscribeCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GLOBALUNSUBSCRIBECATEGORY$16, 0);
        }
    }
    
    /**
     * Gets the "SubscriberTypeDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition getSubscriberTypeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition)get_store().find_element_user(SUBSCRIBERTYPEDEFINITION$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SubscriberTypeDefinition" element
     */
    public boolean isSetSubscriberTypeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERTYPEDEFINITION$18) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberTypeDefinition" element
     */
    public void setSubscriberTypeDefinition(com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition subscriberTypeDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition)get_store().find_element_user(SUBSCRIBERTYPEDEFINITION$18, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition)get_store().add_element_user(SUBSCRIBERTYPEDEFINITION$18);
            }
            target.set(subscriberTypeDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriberTypeDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition addNewSubscriberTypeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberTypeDefinition)get_store().add_element_user(SUBSCRIBERTYPEDEFINITION$18);
            return target;
        }
    }
    
    /**
     * Unsets the "SubscriberTypeDefinition" element
     */
    public void unsetSubscriberTypeDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERTYPEDEFINITION$18, 0);
        }
    }
    
    /**
     * Gets the "Addresses" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber.Addresses getAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber.Addresses target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber.Addresses)get_store().find_element_user(ADDRESSES$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Addresses" element
     */
    public boolean isSetAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSES$20) != 0;
        }
    }
    
    /**
     * Sets the "Addresses" element
     */
    public void setAddresses(com.exacttarget.wsdl.partnerapi.Subscriber.Addresses addresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber.Addresses target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber.Addresses)get_store().find_element_user(ADDRESSES$20, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber.Addresses)get_store().add_element_user(ADDRESSES$20);
            }
            target.set(addresses);
        }
    }
    
    /**
     * Appends and returns a new empty "Addresses" element
     */
    public com.exacttarget.wsdl.partnerapi.Subscriber.Addresses addNewAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber.Addresses target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber.Addresses)get_store().add_element_user(ADDRESSES$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Addresses" element
     */
    public void unsetAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSES$20, 0);
        }
    }
    
    /**
     * Gets the "PrimarySMSAddress" element
     */
    public com.exacttarget.wsdl.partnerapi.SMSAddress getPrimarySMSAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSAddress target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSAddress)get_store().find_element_user(PRIMARYSMSADDRESS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimarySMSAddress" element
     */
    public boolean isSetPrimarySMSAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYSMSADDRESS$22) != 0;
        }
    }
    
    /**
     * Sets the "PrimarySMSAddress" element
     */
    public void setPrimarySMSAddress(com.exacttarget.wsdl.partnerapi.SMSAddress primarySMSAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSAddress target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSAddress)get_store().find_element_user(PRIMARYSMSADDRESS$22, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SMSAddress)get_store().add_element_user(PRIMARYSMSADDRESS$22);
            }
            target.set(primarySMSAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimarySMSAddress" element
     */
    public com.exacttarget.wsdl.partnerapi.SMSAddress addNewPrimarySMSAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSAddress target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSAddress)get_store().add_element_user(PRIMARYSMSADDRESS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimarySMSAddress" element
     */
    public void unsetPrimarySMSAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYSMSADDRESS$22, 0);
        }
    }
    
    /**
     * Gets the "PrimarySMSPublicationStatus" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum getPrimarySMSPublicationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYSMSPUBLICATIONSTATUS$24, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrimarySMSPublicationStatus" element
     */
    public com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus xgetPrimarySMSPublicationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus)get_store().find_element_user(PRIMARYSMSPUBLICATIONSTATUS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "PrimarySMSPublicationStatus" element
     */
    public boolean isSetPrimarySMSPublicationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYSMSPUBLICATIONSTATUS$24) != 0;
        }
    }
    
    /**
     * Sets the "PrimarySMSPublicationStatus" element
     */
    public void setPrimarySMSPublicationStatus(com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus.Enum primarySMSPublicationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIMARYSMSPUBLICATIONSTATUS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIMARYSMSPUBLICATIONSTATUS$24);
            }
            target.setEnumValue(primarySMSPublicationStatus);
        }
    }
    
    /**
     * Sets (as xml) the "PrimarySMSPublicationStatus" element
     */
    public void xsetPrimarySMSPublicationStatus(com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus primarySMSPublicationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus target = null;
            target = (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus)get_store().find_element_user(PRIMARYSMSPUBLICATIONSTATUS$24, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SubscriberAddressStatus)get_store().add_element_user(PRIMARYSMSPUBLICATIONSTATUS$24);
            }
            target.set(primarySMSPublicationStatus);
        }
    }
    
    /**
     * Unsets the "PrimarySMSPublicationStatus" element
     */
    public void unsetPrimarySMSPublicationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYSMSPUBLICATIONSTATUS$24, 0);
        }
    }
    
    /**
     * Gets the "PrimaryEmailAddress" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailAddress getPrimaryEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailAddress target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailAddress)get_store().find_element_user(PRIMARYEMAILADDRESS$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrimaryEmailAddress" element
     */
    public boolean isSetPrimaryEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIMARYEMAILADDRESS$26) != 0;
        }
    }
    
    /**
     * Sets the "PrimaryEmailAddress" element
     */
    public void setPrimaryEmailAddress(com.exacttarget.wsdl.partnerapi.EmailAddress primaryEmailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailAddress target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailAddress)get_store().find_element_user(PRIMARYEMAILADDRESS$26, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.EmailAddress)get_store().add_element_user(PRIMARYEMAILADDRESS$26);
            }
            target.set(primaryEmailAddress);
        }
    }
    
    /**
     * Appends and returns a new empty "PrimaryEmailAddress" element
     */
    public com.exacttarget.wsdl.partnerapi.EmailAddress addNewPrimaryEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailAddress target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailAddress)get_store().add_element_user(PRIMARYEMAILADDRESS$26);
            return target;
        }
    }
    
    /**
     * Unsets the "PrimaryEmailAddress" element
     */
    public void unsetPrimaryEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIMARYEMAILADDRESS$26, 0);
        }
    }
    
    /**
     * Gets the "Locale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale getLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LOCALE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Locale" element
     */
    public boolean isSetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCALE$28) != 0;
        }
    }
    
    /**
     * Sets the "Locale" element
     */
    public void setLocale(com.exacttarget.wsdl.partnerapi.Locale locale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().find_element_user(LOCALE$28, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LOCALE$28);
            }
            target.set(locale);
        }
    }
    
    /**
     * Appends and returns a new empty "Locale" element
     */
    public com.exacttarget.wsdl.partnerapi.Locale addNewLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Locale target = null;
            target = (com.exacttarget.wsdl.partnerapi.Locale)get_store().add_element_user(LOCALE$28);
            return target;
        }
    }
    
    /**
     * Unsets the "Locale" element
     */
    public void unsetLocale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCALE$28, 0);
        }
    }
    /**
     * An XML Addresses(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class AddressesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.Subscriber.Addresses
    {
        
        public AddressesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADDRESS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Address");
        
        
        /**
         * Gets array of all "Address" elements
         */
        public com.exacttarget.wsdl.partnerapi.SubscriberAddress[] getAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ADDRESS$0, targetList);
                com.exacttarget.wsdl.partnerapi.SubscriberAddress[] result = new com.exacttarget.wsdl.partnerapi.SubscriberAddress[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Address" element
         */
        public com.exacttarget.wsdl.partnerapi.SubscriberAddress getAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SubscriberAddress target = null;
                target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress)get_store().find_element_user(ADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Address" element
         */
        public int sizeOfAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESS$0);
            }
        }
        
        /**
         * Sets array of all "Address" element
         */
        public void setAddressArray(com.exacttarget.wsdl.partnerapi.SubscriberAddress[] addressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(addressArray, ADDRESS$0);
            }
        }
        
        /**
         * Sets ith "Address" element
         */
        public void setAddressArray(int i, com.exacttarget.wsdl.partnerapi.SubscriberAddress address)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SubscriberAddress target = null;
                target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress)get_store().find_element_user(ADDRESS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(address);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Address" element
         */
        public com.exacttarget.wsdl.partnerapi.SubscriberAddress insertNewAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SubscriberAddress target = null;
                target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress)get_store().insert_element_user(ADDRESS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Address" element
         */
        public com.exacttarget.wsdl.partnerapi.SubscriberAddress addNewAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SubscriberAddress target = null;
                target = (com.exacttarget.wsdl.partnerapi.SubscriberAddress)get_store().add_element_user(ADDRESS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Address" element
         */
        public void removeAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESS$0, i);
            }
        }
    }
}
