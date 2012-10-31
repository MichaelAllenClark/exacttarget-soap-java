/*
 * XML Type:  ArrayOfObjectDefinitionRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ArrayOfObjectDefinitionRequest(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ArrayOfObjectDefinitionRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ArrayOfObjectDefinitionRequest
{
    
    public ArrayOfObjectDefinitionRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTDEFINITIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectDefinitionRequest");
    
    
    /**
     * Gets array of all "ObjectDefinitionRequest" elements
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest[] getObjectDefinitionRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OBJECTDEFINITIONREQUEST$0, targetList);
            com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest[] result = new com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ObjectDefinitionRequest" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest getObjectDefinitionRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest)get_store().find_element_user(OBJECTDEFINITIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ObjectDefinitionRequest" element
     */
    public boolean isNilObjectDefinitionRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest)get_store().find_element_user(OBJECTDEFINITIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ObjectDefinitionRequest" element
     */
    public int sizeOfObjectDefinitionRequestArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTDEFINITIONREQUEST$0);
        }
    }
    
    /**
     * Sets array of all "ObjectDefinitionRequest" element
     */
    public void setObjectDefinitionRequestArray(com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest[] objectDefinitionRequestArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(objectDefinitionRequestArray, OBJECTDEFINITIONREQUEST$0);
        }
    }
    
    /**
     * Sets ith "ObjectDefinitionRequest" element
     */
    public void setObjectDefinitionRequestArray(int i, com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest objectDefinitionRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest)get_store().find_element_user(OBJECTDEFINITIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(objectDefinitionRequest);
        }
    }
    
    /**
     * Nils the ith "ObjectDefinitionRequest" element
     */
    public void setNilObjectDefinitionRequestArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest)get_store().find_element_user(OBJECTDEFINITIONREQUEST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ObjectDefinitionRequest" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest insertNewObjectDefinitionRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest)get_store().insert_element_user(OBJECTDEFINITIONREQUEST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ObjectDefinitionRequest" element
     */
    public com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest addNewObjectDefinitionRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest target = null;
            target = (com.exacttarget.wsdl.partnerapi.ObjectDefinitionRequest)get_store().add_element_user(OBJECTDEFINITIONREQUEST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ObjectDefinitionRequest" element
     */
    public void removeObjectDefinitionRequest(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTDEFINITIONREQUEST$0, i);
        }
    }
}
