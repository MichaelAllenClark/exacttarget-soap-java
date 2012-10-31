/*
 * XML Type:  ExtractDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ExtractDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ExtractDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.ExtractTemplateImpl implements com.exacttarget.wsdl.partnerapi.ExtractDefinition
{
    
    public ExtractDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Parameters");
    private static final javax.xml.namespace.QName VALUES$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Values");
    
    
    /**
     * Gets the "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
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
            return get_store().count_elements(PARAMETERS$0) != 0;
        }
    }
    
    /**
     * Sets the "Parameters" element
     */
    public void setParameters(com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters)get_store().add_element_user(PARAMETERS$0);
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
            get_store().remove_element(PARAMETERS$0, 0);
        }
    }
    
    /**
     * Gets the "Values" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values getValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values)get_store().find_element_user(VALUES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Values" element
     */
    public boolean isSetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUES$2) != 0;
        }
    }
    
    /**
     * Sets the "Values" element
     */
    public void setValues(com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values values)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values)get_store().find_element_user(VALUES$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values)get_store().add_element_user(VALUES$2);
            }
            target.set(values);
        }
    }
    
    /**
     * Appends and returns a new empty "Values" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values addNewValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values)get_store().add_element_user(VALUES$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Values" element
     */
    public void unsetValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUES$2, 0);
        }
    }
    /**
     * An XML Parameters(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractDefinition.Parameters
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
        public com.exacttarget.wsdl.partnerapi.ExtractParameterDescription[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$0, targetList);
                com.exacttarget.wsdl.partnerapi.ExtractParameterDescription[] result = new com.exacttarget.wsdl.partnerapi.ExtractParameterDescription[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Parameter" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractParameterDescription getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameterDescription target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameterDescription)get_store().find_element_user(PARAMETER$0, i);
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
        public void setParameterArray(com.exacttarget.wsdl.partnerapi.ExtractParameterDescription[] parameterArray)
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
        public void setParameterArray(int i, com.exacttarget.wsdl.partnerapi.ExtractParameterDescription parameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameterDescription target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameterDescription)get_store().find_element_user(PARAMETER$0, i);
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
        public com.exacttarget.wsdl.partnerapi.ExtractParameterDescription insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameterDescription target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameterDescription)get_store().insert_element_user(PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractParameterDescription addNewParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameterDescription target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameterDescription)get_store().add_element_user(PARAMETER$0);
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
    /**
     * An XML Values(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractDefinition.Values
    {
        
        public ValuesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Value");
        
        
        /**
         * Gets array of all "Value" elements
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty[] getValueArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALUE$0, targetList);
                com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Value" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty getValueArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(VALUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
                return get_store().count_elements(VALUE$0);
            }
        }
        
        /**
         * Sets array of all "Value" element
         */
        public void setValueArray(com.exacttarget.wsdl.partnerapi.APIProperty[] valueArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(valueArray, VALUE$0);
            }
        }
        
        /**
         * Sets ith "Value" element
         */
        public void setValueArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(VALUE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(value);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Value" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty insertNewValue(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(VALUE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Value" element
         */
        public com.exacttarget.wsdl.partnerapi.APIProperty addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.APIProperty target = null;
                target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(VALUE$0);
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
                get_store().remove_element(VALUE$0, i);
            }
        }
    }
}
