/*
 * XML Type:  SendDefinitionList
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendDefinitionList
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SendDefinitionList(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface SendDefinitionList extends com.exacttarget.wsdl.partnerapi.AudienceItem
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendDefinitionList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("senddefinitionlist4dbdtype");
    
    /**
     * Gets the "FilterDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.FilterDefinition getFilterDefinition();
    
    /**
     * True if has "FilterDefinition" element
     */
    boolean isSetFilterDefinition();
    
    /**
     * Sets the "FilterDefinition" element
     */
    void setFilterDefinition(com.exacttarget.wsdl.partnerapi.FilterDefinition filterDefinition);
    
    /**
     * Appends and returns a new empty "FilterDefinition" element
     */
    com.exacttarget.wsdl.partnerapi.FilterDefinition addNewFilterDefinition();
    
    /**
     * Unsets the "FilterDefinition" element
     */
    void unsetFilterDefinition();
    
    /**
     * Gets the "IsTestObject" element
     */
    boolean getIsTestObject();
    
    /**
     * Gets (as xml) the "IsTestObject" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsTestObject();
    
    /**
     * True if has "IsTestObject" element
     */
    boolean isSetIsTestObject();
    
    /**
     * Sets the "IsTestObject" element
     */
    void setIsTestObject(boolean isTestObject);
    
    /**
     * Sets (as xml) the "IsTestObject" element
     */
    void xsetIsTestObject(org.apache.xmlbeans.XmlBoolean isTestObject);
    
    /**
     * Unsets the "IsTestObject" element
     */
    void unsetIsTestObject();
    
    /**
     * Gets the "SalesForceObjectID" element
     */
    java.lang.String getSalesForceObjectID();
    
    /**
     * Gets (as xml) the "SalesForceObjectID" element
     */
    org.apache.xmlbeans.XmlString xgetSalesForceObjectID();
    
    /**
     * True if has "SalesForceObjectID" element
     */
    boolean isSetSalesForceObjectID();
    
    /**
     * Sets the "SalesForceObjectID" element
     */
    void setSalesForceObjectID(java.lang.String salesForceObjectID);
    
    /**
     * Sets (as xml) the "SalesForceObjectID" element
     */
    void xsetSalesForceObjectID(org.apache.xmlbeans.XmlString salesForceObjectID);
    
    /**
     * Unsets the "SalesForceObjectID" element
     */
    void unsetSalesForceObjectID();
    
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
     * Gets the "Parameters" element
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters getParameters();
    
    /**
     * True if has "Parameters" element
     */
    boolean isSetParameters();
    
    /**
     * Sets the "Parameters" element
     */
    void setParameters(com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters parameters);
    
    /**
     * Appends and returns a new empty "Parameters" element
     */
    com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters addNewParameters();
    
    /**
     * Unsets the "Parameters" element
     */
    void unsetParameters();
    
    /**
     * An XML Parameters(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Parameters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("parameters2963elemtype");
        
        /**
         * Gets array of all "Parameter" elements
         */
        com.exacttarget.wsdl.partnerapi.APIProperty[] getParameterArray();
        
        /**
         * Gets ith "Parameter" element
         */
        com.exacttarget.wsdl.partnerapi.APIProperty getParameterArray(int i);
        
        /**
         * Returns number of "Parameter" element
         */
        int sizeOfParameterArray();
        
        /**
         * Sets array of all "Parameter" element
         */
        void setParameterArray(com.exacttarget.wsdl.partnerapi.APIProperty[] parameterArray);
        
        /**
         * Sets ith "Parameter" element
         */
        void setParameterArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty parameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
         */
        com.exacttarget.wsdl.partnerapi.APIProperty insertNewParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        com.exacttarget.wsdl.partnerapi.APIProperty addNewParameter();
        
        /**
         * Removes the ith "Parameter" element
         */
        void removeParameter(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters newInstance() {
              return (com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.SendDefinitionList.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SendDefinitionList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SendDefinitionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
