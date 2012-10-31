/*
 * XML Type:  UpdateResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.UpdateResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML UpdateResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class UpdateResultImpl extends com.exacttarget.wsdl.partnerapi.impl.ResultImpl implements com.exacttarget.wsdl.partnerapi.UpdateResult
{
    
    public UpdateResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Object");
    private static final javax.xml.namespace.QName UPDATERESULTS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UpdateResults");
    private static final javax.xml.namespace.QName PARENTPROPERTYNAME$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ParentPropertyName");
    
    
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
     * Gets array of all "UpdateResults" elements
     */
    public com.exacttarget.wsdl.partnerapi.UpdateResult[] getUpdateResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UPDATERESULTS$2, targetList);
            com.exacttarget.wsdl.partnerapi.UpdateResult[] result = new com.exacttarget.wsdl.partnerapi.UpdateResult[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "UpdateResults" element
     */
    public com.exacttarget.wsdl.partnerapi.UpdateResult getUpdateResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UpdateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.UpdateResult)get_store().find_element_user(UPDATERESULTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "UpdateResults" element
     */
    public int sizeOfUpdateResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UPDATERESULTS$2);
        }
    }
    
    /**
     * Sets array of all "UpdateResults" element
     */
    public void setUpdateResultsArray(com.exacttarget.wsdl.partnerapi.UpdateResult[] updateResultsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(updateResultsArray, UPDATERESULTS$2);
        }
    }
    
    /**
     * Sets ith "UpdateResults" element
     */
    public void setUpdateResultsArray(int i, com.exacttarget.wsdl.partnerapi.UpdateResult updateResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UpdateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.UpdateResult)get_store().find_element_user(UPDATERESULTS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(updateResults);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UpdateResults" element
     */
    public com.exacttarget.wsdl.partnerapi.UpdateResult insertNewUpdateResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UpdateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.UpdateResult)get_store().insert_element_user(UPDATERESULTS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UpdateResults" element
     */
    public com.exacttarget.wsdl.partnerapi.UpdateResult addNewUpdateResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.UpdateResult target = null;
            target = (com.exacttarget.wsdl.partnerapi.UpdateResult)get_store().add_element_user(UPDATERESULTS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "UpdateResults" element
     */
    public void removeUpdateResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UPDATERESULTS$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTPROPERTYNAME$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPROPERTYNAME$4, 0);
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
            return get_store().count_elements(PARENTPROPERTYNAME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENTPROPERTYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENTPROPERTYNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARENTPROPERTYNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARENTPROPERTYNAME$4);
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
            get_store().remove_element(PARENTPROPERTYNAME$4, 0);
        }
    }
}
