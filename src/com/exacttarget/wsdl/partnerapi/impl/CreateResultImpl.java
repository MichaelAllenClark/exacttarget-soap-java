/*
 * XML Type:  CreateResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.CreateResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML CreateResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class CreateResultImpl extends com.exacttarget.wsdl.partnerapi.impl.ResultImpl implements com.exacttarget.wsdl.partnerapi.CreateResult
{
    
    public CreateResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NEWID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NewID");
    private static final javax.xml.namespace.QName NEWOBJECTID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NewObjectID");
    private static final javax.xml.namespace.QName PARTNERKEY$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerKey");
    private static final javax.xml.namespace.QName OBJECT$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Object");
    private static final javax.xml.namespace.QName CREATERESULTS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CreateResults");
    private static final javax.xml.namespace.QName PARENTPROPERTYNAME$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ParentPropertyName");
    
    
    /**
     * Gets the "NewID" element
     */
    public int getNewID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NewID" element
     */
    public org.apache.xmlbeans.XmlInt xgetNewID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NEWID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NewID" element
     */
    public void setNewID(int newID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWID$0);
            }
            target.setIntValue(newID);
        }
    }
    
    /**
     * Sets (as xml) the "NewID" element
     */
    public void xsetNewID(org.apache.xmlbeans.XmlInt newID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NEWID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NEWID$0);
            }
            target.set(newID);
        }
    }
    
    /**
     * Gets the "NewObjectID" element
     */
    public java.lang.String getNewObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWOBJECTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NewObjectID" element
     */
    public org.apache.xmlbeans.XmlString xgetNewObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWOBJECTID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NewObjectID" element
     */
    public boolean isSetNewObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWOBJECTID$2) != 0;
        }
    }
    
    /**
     * Sets the "NewObjectID" element
     */
    public void setNewObjectID(java.lang.String newObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWOBJECTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWOBJECTID$2);
            }
            target.setStringValue(newObjectID);
        }
    }
    
    /**
     * Sets (as xml) the "NewObjectID" element
     */
    public void xsetNewObjectID(org.apache.xmlbeans.XmlString newObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NEWOBJECTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NEWOBJECTID$2);
            }
            target.set(newObjectID);
        }
    }
    
    /**
     * Unsets the "NewObjectID" element
     */
    public void unsetNewObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWOBJECTID$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERKEY$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERKEY$4, 0);
            return target;
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
            return get_store().count_elements(PARTNERKEY$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERKEY$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERKEY$4);
            }
            target.set(partnerKey);
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
            get_store().remove_element(PARTNERKEY$4, 0);
        }
    }
    
    /**
     * Gets the "Object" element
     */
    public com.exacttarget.wsdl.partnerapi.APIObject getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Object" element
     */
    public boolean isSetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$6) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().find_element_user(OBJECT$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(OBJECT$6);
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
            target = (com.exacttarget.wsdl.partnerapi.APIObject)get_store().add_element_user(OBJECT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Object" element
     */
    public void unsetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$6, 0);
        }
    }
    
    /**
     * Gets array of all "CreateResults" elements
     */
    public com.exacttarget.wsdl.partnerapi.CreateResult[] getCreateResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CREATERESULTS$8, targetList);
            com.exacttarget.wsdl.partnerapi.CreateResult[] result = new com.exacttarget.wsdl.partnerapi.CreateResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CreateResults" element
     */
    public com.exacttarget.wsdl.partnerapi.CreateResult getCreateResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateResult)get_store().find_element_user(CREATERESULTS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CreateResults" element
     */
    public int sizeOfCreateResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATERESULTS$8);
        }
    }
    
    /**
     * Sets array of all "CreateResults" element
     */
    public void setCreateResultsArray(com.exacttarget.wsdl.partnerapi.CreateResult[] createResultsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(createResultsArray, CREATERESULTS$8);
        }
    }
    
    /**
     * Sets ith "CreateResults" element
     */
    public void setCreateResultsArray(int i, com.exacttarget.wsdl.partnerapi.CreateResult createResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateResult)get_store().find_element_user(CREATERESULTS$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(createResults);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CreateResults" element
     */
    public com.exacttarget.wsdl.partnerapi.CreateResult insertNewCreateResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateResult)get_store().insert_element_user(CREATERESULTS$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CreateResults" element
     */
    public com.exacttarget.wsdl.partnerapi.CreateResult addNewCreateResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.CreateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.CreateResult)get_store().add_element_user(CREATERESULTS$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "CreateResults" element
     */
    public void removeCreateResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATERESULTS$8, i);
        }
    }
    
    /**
     * Gets the "ParentPropertyName" element
     */
    public java.lang.String getParentPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTPROPERTYNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ParentPropertyName" element
     */
    public org.apache.xmlbeans.XmlString xgetParentPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPROPERTYNAME$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ParentPropertyName" element
     */
    public boolean isSetParentPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARENTPROPERTYNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "ParentPropertyName" element
     */
    public void setParentPropertyName(java.lang.String parentPropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTPROPERTYNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTPROPERTYNAME$10);
            }
            target.setStringValue(parentPropertyName);
        }
    }
    
    /**
     * Sets (as xml) the "ParentPropertyName" element
     */
    public void xsetParentPropertyName(org.apache.xmlbeans.XmlString parentPropertyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPROPERTYNAME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTPROPERTYNAME$10);
            }
            target.set(parentPropertyName);
        }
    }
    
    /**
     * Unsets the "ParentPropertyName" element
     */
    public void unsetParentPropertyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARENTPROPERTYNAME$10, 0);
        }
    }
}
