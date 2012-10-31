/*
 * XML Type:  SimpleFilterPart
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SimpleFilterPart
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SimpleFilterPart(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SimpleFilterPartImpl extends com.exacttarget.wsdl.partnerapi.impl.FilterPartImpl implements com.exacttarget.wsdl.partnerapi.SimpleFilterPart
{
    
    public SimpleFilterPartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Property");
    private static final javax.xml.namespace.QName SIMPLEOPERATOR$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SimpleOperator");
    private static final javax.xml.namespace.QName VALUE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Value");
    private static final javax.xml.namespace.QName DATEVALUE1$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DateValue");
    
    
    /**
     * Gets the "Property" element
     */
    public java.lang.String getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Property" element
     */
    public org.apache.xmlbeans.XmlString xgetProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Property" element
     */
    public void setProperty(java.lang.String property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTY$0);
            }
            target.setStringValue(property);
        }
    }
    
    /**
     * Sets (as xml) the "Property" element
     */
    public void xsetProperty(org.apache.xmlbeans.XmlString property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Gets the "SimpleOperator" element
     */
    public com.exacttarget.wsdl.partnerapi.SimpleOperators.Enum getSimpleOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEOPERATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SimpleOperators.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SimpleOperator" element
     */
    public com.exacttarget.wsdl.partnerapi.SimpleOperators xgetSimpleOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SimpleOperators target = null;
            target = (com.exacttarget.wsdl.partnerapi.SimpleOperators)get_store().find_element_user(SIMPLEOPERATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SimpleOperator" element
     */
    public void setSimpleOperator(com.exacttarget.wsdl.partnerapi.SimpleOperators.Enum simpleOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEOPERATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIMPLEOPERATOR$2);
            }
            target.setEnumValue(simpleOperator);
        }
    }
    
    /**
     * Sets (as xml) the "SimpleOperator" element
     */
    public void xsetSimpleOperator(com.exacttarget.wsdl.partnerapi.SimpleOperators simpleOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SimpleOperators target = null;
            target = (com.exacttarget.wsdl.partnerapi.SimpleOperators)get_store().find_element_user(SIMPLEOPERATOR$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SimpleOperators)get_store().add_element_user(SIMPLEOPERATOR$2);
            }
            target.set(simpleOperator);
        }
    }
    
    /**
     * Gets array of all "Value" elements
     */
    public java.lang.String[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Value" element
     */
    public java.lang.String getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Value" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Value" element
     */
    public org.apache.xmlbeans.XmlString xgetValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$4);
        }
    }
    
    /**
     * Sets array of all "Value" element
     */
    public void setValueArray(java.lang.String[] valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$4);
        }
    }
    
    /**
     * Sets ith "Value" element
     */
    public void setValueArray(int i, java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) array of all "Value" element
     */
    public void xsetValueArray(org.apache.xmlbeans.XmlString[]valueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valueArray, VALUE$4);
        }
    }
    
    /**
     * Sets (as xml) ith "Value" element
     */
    public void xsetValueArray(int i, org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(value);
        }
    }
    
    /**
     * Inserts the value as the ith "Value" element
     */
    public void insertValue(int i, java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(VALUE$4, i);
            target.setStringValue(value);
        }
    }
    
    /**
     * Appends the value as the last "Value" element
     */
    public void addValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$4);
            target.setStringValue(value);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Value" element
     */
    public org.apache.xmlbeans.XmlString insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(VALUE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Value" element
     */
    public org.apache.xmlbeans.XmlString addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$4, i);
        }
    }
    
    /**
     * Gets array of all "DateValue" elements
     */
    public java.util.Calendar[] getDateValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATEVALUE1$6, targetList);
            java.util.Calendar[] result = new java.util.Calendar[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getCalendarValue();
            return result;
        }
    }
    
    /**
     * Gets ith "DateValue" element
     */
    public java.util.Calendar getDateValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEVALUE1$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "DateValue" elements
     */
    public org.apache.xmlbeans.XmlDateTime[] xgetDateValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATEVALUE1$6, targetList);
            org.apache.xmlbeans.XmlDateTime[] result = new org.apache.xmlbeans.XmlDateTime[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "DateValue" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALUE1$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlDateTime)target;
        }
    }
    
    /**
     * Returns number of "DateValue" element
     */
    public int sizeOfDateValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEVALUE1$6);
        }
    }
    
    /**
     * Sets array of all "DateValue" element
     */
    public void setDateValue1Array(java.util.Calendar[] dateValue1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateValue1Array, DATEVALUE1$6);
        }
    }
    
    /**
     * Sets ith "DateValue" element
     */
    public void setDateValue1Array(int i, java.util.Calendar dateValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEVALUE1$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setCalendarValue(dateValue1);
        }
    }
    
    /**
     * Sets (as xml) array of all "DateValue" element
     */
    public void xsetDateValue1Array(org.apache.xmlbeans.XmlDateTime[]dateValue1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateValue1Array, DATEVALUE1$6);
        }
    }
    
    /**
     * Sets (as xml) ith "DateValue" element
     */
    public void xsetDateValue1Array(int i, org.apache.xmlbeans.XmlDateTime dateValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEVALUE1$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateValue1);
        }
    }
    
    /**
     * Inserts the value as the ith "DateValue" element
     */
    public void insertDateValue1(int i, java.util.Calendar dateValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATEVALUE1$6, i);
            target.setCalendarValue(dateValue1);
        }
    }
    
    /**
     * Appends the value as the last "DateValue" element
     */
    public void addDateValue1(java.util.Calendar dateValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEVALUE1$6);
            target.setCalendarValue(dateValue1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DateValue" element
     */
    public org.apache.xmlbeans.XmlDateTime insertNewDateValue1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().insert_element_user(DATEVALUE1$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DateValue" element
     */
    public org.apache.xmlbeans.XmlDateTime addNewDateValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEVALUE1$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "DateValue" element
     */
    public void removeDateValue1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEVALUE1$6, i);
        }
    }
}
