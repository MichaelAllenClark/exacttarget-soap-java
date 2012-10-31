/*
 * XML Type:  ExtractDescription
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractDescription
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ExtractDescription(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ExtractDescriptionImpl extends com.exacttarget.wsdl.partnerapi.impl.ExtractTemplateImpl implements com.exacttarget.wsdl.partnerapi.ExtractDescription
{
    
    public ExtractDescriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Parameters");
    
    
    /**
     * Gets the "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
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
    public void setParameters(com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters)get_store().add_element_user(PARAMETERS$0);
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
     * An XML Parameters(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractDescription.Parameters
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
}
