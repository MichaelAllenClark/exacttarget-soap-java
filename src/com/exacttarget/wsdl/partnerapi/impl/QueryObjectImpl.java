/*
 * XML Type:  QueryObject
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.QueryObject
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML QueryObject(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class QueryObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.QueryObject
{
    
    public QueryObjectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectType");
    private static final javax.xml.namespace.QName PROPERTIES$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Properties");
    private static final javax.xml.namespace.QName OBJECTS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Objects");
    
    
    /**
     * Gets the "ObjectType" element
     */
    public java.lang.String getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectType" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ObjectType" element
     */
    public void setObjectType(java.lang.String objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPE$0);
            }
            target.setStringValue(objectType);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectType" element
     */
    public void xsetObjectType(org.apache.xmlbeans.XmlString objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTTYPE$0);
            }
            target.set(objectType);
        }
    }
    
    /**
     * Gets array of all "Properties" elements
     */
    public java.lang.String[] getPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTIES$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Properties" element
     */
    public java.lang.String getPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Properties" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTIES$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Properties" element
     */
    public org.apache.xmlbeans.XmlString xgetPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Properties" element
     */
    public int sizeOfPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$2);
        }
    }
    
    /**
     * Sets array of all "Properties" element
     */
    public void setPropertiesArray(java.lang.String[] propertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertiesArray, PROPERTIES$2);
        }
    }
    
    /**
     * Sets ith "Properties" element
     */
    public void setPropertiesArray(int i, java.lang.String properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(properties);
        }
    }
    
    /**
     * Sets (as xml) array of all "Properties" element
     */
    public void xsetPropertiesArray(org.apache.xmlbeans.XmlString[]propertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertiesArray, PROPERTIES$2);
        }
    }
    
    /**
     * Sets (as xml) ith "Properties" element
     */
    public void xsetPropertiesArray(int i, org.apache.xmlbeans.XmlString properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(properties);
        }
    }
    
    /**
     * Inserts the value as the ith "Properties" element
     */
    public void insertProperties(int i, java.lang.String properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTIES$2, i);
            target.setStringValue(properties);
        }
    }
    
    /**
     * Appends the value as the last "Properties" element
     */
    public void addProperties(java.lang.String properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTIES$2);
            target.setStringValue(properties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Properties" element
     */
    public org.apache.xmlbeans.XmlString insertNewProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTIES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Properties" element
     */
    public org.apache.xmlbeans.XmlString addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTIES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Properties" element
     */
    public void removeProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$2, i);
        }
    }
    
    /**
     * Gets array of all "Objects" elements
     */
    public com.exacttarget.wsdl.partnerapi.QueryObject[] getObjectsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECTS$4, targetList);
            com.exacttarget.wsdl.partnerapi.QueryObject[] result = new com.exacttarget.wsdl.partnerapi.QueryObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Objects" element
     */
    public com.exacttarget.wsdl.partnerapi.QueryObject getObjectsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().find_element_user(OBJECTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Objects" element
     */
    public int sizeOfObjectsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTS$4);
        }
    }
    
    /**
     * Sets array of all "Objects" element
     */
    public void setObjectsArray(com.exacttarget.wsdl.partnerapi.QueryObject[] objectsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objectsArray, OBJECTS$4);
        }
    }
    
    /**
     * Sets ith "Objects" element
     */
    public void setObjectsArray(int i, com.exacttarget.wsdl.partnerapi.QueryObject objects)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().find_element_user(OBJECTS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objects);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Objects" element
     */
    public com.exacttarget.wsdl.partnerapi.QueryObject insertNewObjects(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().insert_element_user(OBJECTS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Objects" element
     */
    public com.exacttarget.wsdl.partnerapi.QueryObject addNewObjects()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.QueryObject target = null;
            target = (com.exacttarget.wsdl.partnerapi.QueryObject)get_store().add_element_user(OBJECTS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Objects" element
     */
    public void removeObjects(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTS$4, i);
        }
    }
}
