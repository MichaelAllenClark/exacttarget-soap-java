/*
 * XML Type:  ExtractRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExtractRequest
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ExtractRequest(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ExtractRequestImpl extends com.exacttarget.wsdl.partnerapi.impl.RequestImpl implements com.exacttarget.wsdl.partnerapi.ExtractRequest
{
    
    public ExtractRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Client");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ID");
    private static final javax.xml.namespace.QName OPTIONS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Options");
    private static final javax.xml.namespace.QName PARAMETERS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Parameters");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName DEFINITION$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Definition");
    
    
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
     * Gets the "ID" element
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    public org.apache.xmlbeans.XmlString xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    public void xsetID(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "Options" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractOptions getOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractOptions)get_store().find_element_user(OPTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Options" element
     */
    public void setOptions(com.exacttarget.wsdl.partnerapi.ExtractOptions options)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractOptions)get_store().find_element_user(OPTIONS$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractOptions)get_store().add_element_user(OPTIONS$4);
            }
            target.set(options);
        }
    }
    
    /**
     * Appends and returns a new empty "Options" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractOptions addNewOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractOptions)get_store().add_element_user(OPTIONS$4);
            return target;
        }
    }
    
    /**
     * Gets the "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters)get_store().find_element_user(PARAMETERS$6, 0);
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
            return get_store().count_elements(PARAMETERS$6) != 0;
        }
    }
    
    /**
     * Sets the "Parameters" element
     */
    public void setParameters(com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters)get_store().find_element_user(PARAMETERS$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters)get_store().add_element_user(PARAMETERS$6);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters)get_store().add_element_user(PARAMETERS$6);
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
            get_store().remove_element(PARAMETERS$6, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDescription getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDescription target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDescription)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(com.exacttarget.wsdl.partnerapi.ExtractDescription description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDescription target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDescription)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractDescription)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Appends and returns a new empty "Description" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDescription addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDescription target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDescription)get_store().add_element_user(DESCRIPTION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "Definition" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDefinition getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition)get_store().find_element_user(DEFINITION$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Definition" element
     */
    public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITION$10) != 0;
        }
    }
    
    /**
     * Sets the "Definition" element
     */
    public void setDefinition(com.exacttarget.wsdl.partnerapi.ExtractDefinition definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition)get_store().find_element_user(DEFINITION$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition)get_store().add_element_user(DEFINITION$10);
            }
            target.set(definition);
        }
    }
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    public com.exacttarget.wsdl.partnerapi.ExtractDefinition addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExtractDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExtractDefinition)get_store().add_element_user(DEFINITION$10);
            return target;
        }
    }
    
    /**
     * Unsets the "Definition" element
     */
    public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITION$10, 0);
        }
    }
    /**
     * An XML Parameters(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExtractRequest.Parameters
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
        public com.exacttarget.wsdl.partnerapi.ExtractParameter[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$0, targetList);
                com.exacttarget.wsdl.partnerapi.ExtractParameter[] result = new com.exacttarget.wsdl.partnerapi.ExtractParameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Parameter" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractParameter getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameter target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameter)get_store().find_element_user(PARAMETER$0, i);
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
        public void setParameterArray(com.exacttarget.wsdl.partnerapi.ExtractParameter[] parameterArray)
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
        public void setParameterArray(int i, com.exacttarget.wsdl.partnerapi.ExtractParameter parameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameter target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameter)get_store().find_element_user(PARAMETER$0, i);
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
        public com.exacttarget.wsdl.partnerapi.ExtractParameter insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameter target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameter)get_store().insert_element_user(PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        public com.exacttarget.wsdl.partnerapi.ExtractParameter addNewParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExtractParameter target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExtractParameter)get_store().add_element_user(PARAMETER$0);
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
