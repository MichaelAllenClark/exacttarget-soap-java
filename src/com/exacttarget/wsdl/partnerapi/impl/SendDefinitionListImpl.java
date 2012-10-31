/*
 * XML Type:  SendDefinitionList
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendDefinitionList
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SendDefinitionList(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SendDefinitionListImpl extends com.exacttarget.wsdl.partnerapi.impl.AudienceItemImpl implements com.exacttarget.wsdl.partnerapi.SendDefinitionList
{
    
    public SendDefinitionListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FilterDefinition");
    private static final javax.xml.namespace.QName ISTESTOBJECT$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsTestObject");
    private static final javax.xml.namespace.QName SALESFORCEOBJECTID$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SalesForceObjectID");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName PARAMETERS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Parameters");
    
    
    /**
     * Gets the "FilterDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.FilterDefinition getFilterDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterDefinition)get_store().find_element_user(FILTERDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FilterDefinition" element
     */
    public boolean isSetFilterDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTERDEFINITION$0) != 0;
        }
    }
    
    /**
     * Sets the "FilterDefinition" element
     */
    public void setFilterDefinition(com.exacttarget.wsdl.partnerapi.FilterDefinition filterDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterDefinition)get_store().find_element_user(FILTERDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.FilterDefinition)get_store().add_element_user(FILTERDEFINITION$0);
            }
            target.set(filterDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "FilterDefinition" element
     */
    public com.exacttarget.wsdl.partnerapi.FilterDefinition addNewFilterDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterDefinition)get_store().add_element_user(FILTERDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "FilterDefinition" element
     */
    public void unsetFilterDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTERDEFINITION$0, 0);
        }
    }
    
    /**
     * Gets the "IsTestObject" element
     */
    public boolean getIsTestObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTOBJECT$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsTestObject" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsTestObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTOBJECT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsTestObject" element
     */
    public boolean isSetIsTestObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTESTOBJECT$2) != 0;
        }
    }
    
    /**
     * Sets the "IsTestObject" element
     */
    public void setIsTestObject(boolean isTestObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTESTOBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTESTOBJECT$2);
            }
            target.setBooleanValue(isTestObject);
        }
    }
    
    /**
     * Sets (as xml) the "IsTestObject" element
     */
    public void xsetIsTestObject(org.apache.xmlbeans.XmlBoolean isTestObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISTESTOBJECT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISTESTOBJECT$2);
            }
            target.set(isTestObject);
        }
    }
    
    /**
     * Unsets the "IsTestObject" element
     */
    public void unsetIsTestObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTESTOBJECT$2, 0);
        }
    }
    
    /**
     * Gets the "SalesForceObjectID" element
     */
    public java.lang.String getSalesForceObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESFORCEOBJECTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SalesForceObjectID" element
     */
    public org.apache.xmlbeans.XmlString xgetSalesForceObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALESFORCEOBJECTID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SalesForceObjectID" element
     */
    public boolean isSetSalesForceObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SALESFORCEOBJECTID$4) != 0;
        }
    }
    
    /**
     * Sets the "SalesForceObjectID" element
     */
    public void setSalesForceObjectID(java.lang.String salesForceObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SALESFORCEOBJECTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SALESFORCEOBJECTID$4);
            }
            target.setStringValue(salesForceObjectID);
        }
    }
    
    /**
     * Sets (as xml) the "SalesForceObjectID" element
     */
    public void xsetSalesForceObjectID(org.apache.xmlbeans.XmlString salesForceObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SALESFORCEOBJECTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SALESFORCEOBJECTID$4);
            }
            target.set(salesForceObjectID);
        }
    }
    
    /**
     * Unsets the "SalesForceObjectID" element
     */
    public void unsetSalesForceObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SALESFORCEOBJECTID$4, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$6) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$6, 0);
        }
    }
    
    /**
     * Gets the "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters)get_store().find_element_user(PARAMETERS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Parameters" element
     */
    public boolean isSetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAMETERS$8) != 0;
        }
    }
    
    /**
     * Sets the "Parameters" element
     */
    public void setParameters(com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters)get_store().find_element_user(PARAMETERS$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters)get_store().add_element_user(PARAMETERS$8);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters)get_store().add_element_user(PARAMETERS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Parameters" element
     */
    public void unsetParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAMETERS$8, 0);
        }
    }
    /**
     * An XML Parameters(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters
    {
        
        public ParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMETER$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Parameter");
        
        
        /**
         * Gets array of all "Parameter" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Parameter" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Parameter" element
         */
        public int sizeOfParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMETER$0);
            }
        }
        
        /**
         * Sets array of all "Parameter" element
         */
        public void setParameterArray(com.exacttarget.wsdl.partnerapi.APIProperty[] parameterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(parameterArray, PARAMETER$0);
            }
        }
        
        /**
         * Sets ith "Parameter" element
         */
        public void setParameterArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty parameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(parameter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty addNewParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(PARAMETER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Parameter" element
         */
        public void removeParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMETER$0, i);
            }
        }
    }
}
