/*
 * XML Type:  APIObject
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.APIObject
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML APIObject(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class APIObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.APIObject
{
    
    public APIObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Client");
    private static final javax.xml.namespace.QName PARTNERKEY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerKey");
    private static final javax.xml.namespace.QName PARTNERPROPERTIES$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerProperties");
    private static final javax.xml.namespace.QName CREATEDDATE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CreatedDate");
    private static final javax.xml.namespace.QName MODIFIEDDATE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ModifiedDate");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ID");
    private static final javax.xml.namespace.QName OBJECTID$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectID");
    private static final javax.xml.namespace.QName CUSTOMERKEY$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CustomerKey");
    private static final javax.xml.namespace.QName OWNER$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Owner");
    private static final javax.xml.namespace.QName CORRELATIONID$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CorrelationID");
    private static final javax.xml.namespace.QName OBJECTSTATE$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectState");
    
    
    /**
     * Gets the "Client" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID getClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Client" element
     */
    public boolean isSetClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENT$0) != 0;
        }
    }
    
    /**
     * Sets the "Client" element
     */
    public void setClient(com.exacttarget.wsdl.partnerapi.ClientID client)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENT$0);
            }
            target.set(client);
        }
    }
    
    /**
     * Appends and returns a new empty "Client" element
     */
    public com.exacttarget.wsdl.partnerapi.ClientID addNewClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Client" element
     */
    public void unsetClient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENT$0, 0);
        }
    }
    
    /**
     * Gets the "PartnerKey" element
     */
    public java.lang.String getPartnerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERKEY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerKey" element
     */
    public org.apache.xmlbeans.XmlString xgetPartnerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERKEY$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PartnerKey" element
     */
    public boolean isNilPartnerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERKEY$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PartnerKey" element
     */
    public boolean isSetPartnerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERKEY$2) != 0;
        }
    }
    
    /**
     * Sets the "PartnerKey" element
     */
    public void setPartnerKey(java.lang.String partnerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERKEY$2);
            }
            target.setStringValue(partnerKey);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerKey" element
     */
    public void xsetPartnerKey(org.apache.xmlbeans.XmlString partnerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERKEY$2);
            }
            target.set(partnerKey);
        }
    }
    
    /**
     * Nils the "PartnerKey" element
     */
    public void setNilPartnerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERKEY$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PartnerKey" element
     */
    public void unsetPartnerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERKEY$2, 0);
        }
    }
    
    /**
     * Gets array of all "PartnerProperties" elements
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty[] getPartnerPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTNERPROPERTIES$4, targetList);
            com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PartnerProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty getPartnerPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARTNERPROPERTIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PartnerProperties" element
     */
    public int sizeOfPartnerPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERPROPERTIES$4);
        }
    }
    
    /**
     * Sets array of all "PartnerProperties" element
     */
    public void setPartnerPropertiesArray(com.exacttarget.wsdl.partnerapi.APIProperty[] partnerPropertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partnerPropertiesArray, PARTNERPROPERTIES$4);
        }
    }
    
    /**
     * Sets ith "PartnerProperties" element
     */
    public void setPartnerPropertiesArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty partnerProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARTNERPROPERTIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(partnerProperties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PartnerProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty insertNewPartnerProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(PARTNERPROPERTIES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PartnerProperties" element
     */
    public com.exacttarget.wsdl.partnerapi.APIProperty addNewPartnerProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(PARTNERPROPERTIES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "PartnerProperties" element
     */
    public void removePartnerProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERPROPERTIES$4, i);
        }
    }
    
    /**
     * Gets the "CreatedDate" element
     */
    public java.util.Calendar getCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreatedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDDATE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreatedDate" element
     */
    public boolean isSetCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "CreatedDate" element
     */
    public void setCreatedDate(java.util.Calendar createdDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDDATE$6);
            }
            target.setCalendarValue(createdDate);
        }
    }
    
    /**
     * Sets (as xml) the "CreatedDate" element
     */
    public void xsetCreatedDate(org.apache.xmlbeans.XmlDateTime createdDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATEDDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATEDDATE$6);
            }
            target.set(createdDate);
        }
    }
    
    /**
     * Unsets the "CreatedDate" element
     */
    public void unsetCreatedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDDATE$6, 0);
        }
    }
    
    /**
     * Gets the "ModifiedDate" element
     */
    public java.util.Calendar getModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ModifiedDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ModifiedDate" element
     */
    public boolean isNilModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ModifiedDate" element
     */
    public boolean isSetModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "ModifiedDate" element
     */
    public void setModifiedDate(java.util.Calendar modifiedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIEDDATE$8);
            }
            target.setCalendarValue(modifiedDate);
        }
    }
    
    /**
     * Sets (as xml) the "ModifiedDate" element
     */
    public void xsetModifiedDate(org.apache.xmlbeans.XmlDateTime modifiedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MODIFIEDDATE$8);
            }
            target.set(modifiedDate);
        }
    }
    
    /**
     * Nils the "ModifiedDate" element
     */
    public void setNilModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIEDDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MODIFIEDDATE$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ModifiedDate" element
     */
    public void unsetModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDDATE$8, 0);
        }
    }
    
    /**
     * Gets the "ID" element
     */
    public int getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlInt xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$10) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$10);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$10, 0);
        }
    }
    
    /**
     * Gets the "ObjectID" element
     */
    public java.lang.String getObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectID" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$12, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "ObjectID" element
     */
    public boolean isNilObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "ObjectID" element
     */
    public boolean isSetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTID$12) != 0;
        }
    }
    
    /**
     * Sets the "ObjectID" element
     */
    public void setObjectID(java.lang.String objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTID$12);
            }
            target.setStringValue(objectID);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectID" element
     */
    public void xsetObjectID(org.apache.xmlbeans.XmlString objectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTID$12);
            }
            target.set(objectID);
        }
    }
    
    /**
     * Nils the "ObjectID" element
     */
    public void setNilObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTID$12);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "ObjectID" element
     */
    public void unsetObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTID$12, 0);
        }
    }
    
    /**
     * Gets the "CustomerKey" element
     */
    public java.lang.String getCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERKEY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerKey" element
     */
    public org.apache.xmlbeans.XmlString xgetCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERKEY$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "CustomerKey" element
     */
    public boolean isSetCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERKEY$14) != 0;
        }
    }
    
    /**
     * Sets the "CustomerKey" element
     */
    public void setCustomerKey(java.lang.String customerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERKEY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERKEY$14);
            }
            target.setStringValue(customerKey);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerKey" element
     */
    public void xsetCustomerKey(org.apache.xmlbeans.XmlString customerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERKEY$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERKEY$14);
            }
            target.set(customerKey);
        }
    }
    
    /**
     * Unsets the "CustomerKey" element
     */
    public void unsetCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERKEY$14, 0);
        }
    }
    
    /**
     * Gets the "Owner" element
     */
    public com.exacttarget.wsdl.partnerapi.Owner getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Owner target = null;
            target = (com.exacttarget.wsdl.partnerapi.Owner)get_store().find_element_user(OWNER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Owner" element
     */
    public boolean isSetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNER$16) != 0;
        }
    }
    
    /**
     * Sets the "Owner" element
     */
    public void setOwner(com.exacttarget.wsdl.partnerapi.Owner owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Owner target = null;
            target = (com.exacttarget.wsdl.partnerapi.Owner)get_store().find_element_user(OWNER$16, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Owner)get_store().add_element_user(OWNER$16);
            }
            target.set(owner);
        }
    }
    
    /**
     * Appends and returns a new empty "Owner" element
     */
    public com.exacttarget.wsdl.partnerapi.Owner addNewOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Owner target = null;
            target = (com.exacttarget.wsdl.partnerapi.Owner)get_store().add_element_user(OWNER$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Owner" element
     */
    public void unsetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNER$16, 0);
        }
    }
    
    /**
     * Gets the "CorrelationID" element
     */
    public java.lang.String getCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorrelationID" element
     */
    public org.apache.xmlbeans.XmlString xgetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONID$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "CorrelationID" element
     */
    public boolean isSetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONID$18) != 0;
        }
    }
    
    /**
     * Sets the "CorrelationID" element
     */
    public void setCorrelationID(java.lang.String correlationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIONID$18);
            }
            target.setStringValue(correlationID);
        }
    }
    
    /**
     * Sets (as xml) the "CorrelationID" element
     */
    public void xsetCorrelationID(org.apache.xmlbeans.XmlString correlationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONID$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRELATIONID$18);
            }
            target.set(correlationID);
        }
    }
    
    /**
     * Unsets the "CorrelationID" element
     */
    public void unsetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONID$18, 0);
        }
    }
    
    /**
     * Gets the "ObjectState" element
     */
    public java.lang.String getObjectState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTSTATE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectState" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTSTATE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "ObjectState" element
     */
    public boolean isSetObjectState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTSTATE$20) != 0;
        }
    }
    
    /**
     * Sets the "ObjectState" element
     */
    public void setObjectState(java.lang.String objectState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTSTATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTSTATE$20);
            }
            target.setStringValue(objectState);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectState" element
     */
    public void xsetObjectState(org.apache.xmlbeans.XmlString objectState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTSTATE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTSTATE$20);
            }
            target.set(objectState);
        }
    }
    
    /**
     * Unsets the "ObjectState" element
     */
    public void unsetObjectState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTSTATE$20, 0);
        }
    }
}
