/*
 * XML Type:  SuppressionListDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SuppressionListDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SuppressionListDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SuppressionListDefinition extends com.exacttarget.wsdl.partnerapi.APIObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SuppressionListDefinition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("suppressionlistdefinitionf1e4type");
    
    /**
     * Gets the "Name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "Name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "Name" element
     */
    boolean isSetName();
    
    /**
     * Sets the "Name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "Name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "Name" element
     */
    void unsetName();
    
    /**
     * Gets the "Category" element
     */
    long getCategory();
    
    /**
     * Gets (as xml) the "Category" element
     */
    org.apache.xmlbeans.XmlLong xgetCategory();
    
    /**
     * True if has "Category" element
     */
    boolean isSetCategory();
    
    /**
     * Sets the "Category" element
     */
    void setCategory(long category);
    
    /**
     * Sets (as xml) the "Category" element
     */
    void xsetCategory(org.apache.xmlbeans.XmlLong category);
    
    /**
     * Unsets the "Category" element
     */
    void unsetCategory();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "Description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "Description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "Contexts" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts getContexts();
    
    /**
     * True if has "Contexts" element
     */
    boolean isSetContexts();
    
    /**
     * Sets the "Contexts" element
     */
    void setContexts(com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts contexts);
    
    /**
     * Appends and returns a new empty "Contexts" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts addNewContexts();
    
    /**
     * Unsets the "Contexts" element
     */
    void unsetContexts();
    
    /**
     * Gets the "Fields" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields getFields();
    
    /**
     * True if has "Fields" element
     */
    boolean isSetFields();
    
    /**
     * Sets the "Fields" element
     */
    void setFields(com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields fields);
    
    /**
     * Appends and returns a new empty "Fields" element
     */
    com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields addNewFields();
    
    /**
     * Unsets the "Fields" element
     */
    void unsetFields();
    
    /**
     * Gets the "SubscriberCount" element
     */
    long getSubscriberCount();
    
    /**
     * Gets (as xml) the "SubscriberCount" element
     */
    org.apache.xmlbeans.XmlLong xgetSubscriberCount();
    
    /**
     * True if has "SubscriberCount" element
     */
    boolean isSetSubscriberCount();
    
    /**
     * Sets the "SubscriberCount" element
     */
    void setSubscriberCount(long subscriberCount);
    
    /**
     * Sets (as xml) the "SubscriberCount" element
     */
    void xsetSubscriberCount(org.apache.xmlbeans.XmlLong subscriberCount);
    
    /**
     * Unsets the "SubscriberCount" element
     */
    void unsetSubscriberCount();
    
    /**
     * An XML Contexts(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Contexts extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Contexts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("contextsa084elemtype");
        
        /**
         * Gets array of all "Context" elements
         */
        com.exacttarget.wsdl.partnerapi.SuppressionListContext[] getContextArray();
        
        /**
         * Gets ith "Context" element
         */
        com.exacttarget.wsdl.partnerapi.SuppressionListContext getContextArray(int i);
        
        /**
         * Returns number of "Context" element
         */
        int sizeOfContextArray();
        
        /**
         * Sets array of all "Context" element
         */
        void setContextArray(com.exacttarget.wsdl.partnerapi.SuppressionListContext[] contextArray);
        
        /**
         * Sets ith "Context" element
         */
        void setContextArray(int i, com.exacttarget.wsdl.partnerapi.SuppressionListContext context);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Context" element
         */
        com.exacttarget.wsdl.partnerapi.SuppressionListContext insertNewContext(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Context" element
         */
        com.exacttarget.wsdl.partnerapi.SuppressionListContext addNewContext();
        
        /**
         * Removes the ith "Context" element
         */
        void removeContext(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts newInstance() {
              return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Fields(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Fields extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("fields084felemtype");
        
        /**
         * Gets array of all "Field" elements
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField[] getFieldArray();
        
        /**
         * Gets ith "Field" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField getFieldArray(int i);
        
        /**
         * Returns number of "Field" element
         */
        int sizeOfFieldArray();
        
        /**
         * Sets array of all "Field" element
         */
        void setFieldArray(com.exacttarget.wsdl.partnerapi.DataExtensionField[] fieldArray);
        
        /**
         * Sets ith "Field" element
         */
        void setFieldArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionField field);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Field" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField insertNewField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Field" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionField addNewField();
        
        /**
         * Removes the ith "Field" element
         */
        void removeField(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields newInstance() {
              return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SuppressionListDefinition parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
