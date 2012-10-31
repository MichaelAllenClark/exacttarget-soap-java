/*
 * XML Type:  DataExtensionUpdateResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML DataExtensionUpdateResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface DataExtensionUpdateResult extends com.exacttarget.wsdl.partnerapi.UpdateResult
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataExtensionUpdateResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("dataextensionupdateresult540dtype");
    
    /**
     * Gets the "ErrorMessage" element
     */
    java.lang.String getErrorMessage();
    
    /**
     * Gets (as xml) the "ErrorMessage" element
     */
    org.apache.xmlbeans.XmlString xgetErrorMessage();
    
    /**
     * True if has "ErrorMessage" element
     */
    boolean isSetErrorMessage();
    
    /**
     * Sets the "ErrorMessage" element
     */
    void setErrorMessage(java.lang.String errorMessage);
    
    /**
     * Sets (as xml) the "ErrorMessage" element
     */
    void xsetErrorMessage(org.apache.xmlbeans.XmlString errorMessage);
    
    /**
     * Unsets the "ErrorMessage" element
     */
    void unsetErrorMessage();
    
    /**
     * Gets the "KeyErrors" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors getKeyErrors();
    
    /**
     * True if has "KeyErrors" element
     */
    boolean isSetKeyErrors();
    
    /**
     * Sets the "KeyErrors" element
     */
    void setKeyErrors(com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors keyErrors);
    
    /**
     * Appends and returns a new empty "KeyErrors" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors addNewKeyErrors();
    
    /**
     * Unsets the "KeyErrors" element
     */
    void unsetKeyErrors();
    
    /**
     * Gets the "ValueErrors" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors getValueErrors();
    
    /**
     * True if has "ValueErrors" element
     */
    boolean isSetValueErrors();
    
    /**
     * Sets the "ValueErrors" element
     */
    void setValueErrors(com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors valueErrors);
    
    /**
     * Appends and returns a new empty "ValueErrors" element
     */
    com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors addNewValueErrors();
    
    /**
     * Unsets the "ValueErrors" element
     */
    void unsetValueErrors();
    
    /**
     * An XML KeyErrors(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface KeyErrors extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyErrors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("keyerrors1f57elemtype");
        
        /**
         * Gets array of all "KeyError" elements
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError[] getKeyErrorArray();
        
        /**
         * Gets ith "KeyError" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError getKeyErrorArray(int i);
        
        /**
         * Returns number of "KeyError" element
         */
        int sizeOfKeyErrorArray();
        
        /**
         * Sets array of all "KeyError" element
         */
        void setKeyErrorArray(com.exacttarget.wsdl.partnerapi.DataExtensionError[] keyErrorArray);
        
        /**
         * Sets ith "KeyError" element
         */
        void setKeyErrorArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionError keyError);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "KeyError" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError insertNewKeyError(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "KeyError" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError addNewKeyError();
        
        /**
         * Removes the ith "KeyError" element
         */
        void removeKeyError(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors newInstance() {
              return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.KeyErrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ValueErrors(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface ValueErrors extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValueErrors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("valueerrorsc285elemtype");
        
        /**
         * Gets array of all "ValueError" elements
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError[] getValueErrorArray();
        
        /**
         * Gets ith "ValueError" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError getValueErrorArray(int i);
        
        /**
         * Returns number of "ValueError" element
         */
        int sizeOfValueErrorArray();
        
        /**
         * Sets array of all "ValueError" element
         */
        void setValueErrorArray(com.exacttarget.wsdl.partnerapi.DataExtensionError[] valueErrorArray);
        
        /**
         * Sets ith "ValueError" element
         */
        void setValueErrorArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionError valueError);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ValueError" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError insertNewValueError(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ValueError" element
         */
        com.exacttarget.wsdl.partnerapi.DataExtensionError addNewValueError();
        
        /**
         * Removes the ith "ValueError" element
         */
        void removeValueError(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors newInstance() {
              return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult.ValueErrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult newInstance() {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.DataExtensionUpdateResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
