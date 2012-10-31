/*
 * An XML document type.
 * Localname: ConfigureRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * A document containing one ConfigureRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public interface ConfigureRequestMsgDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfigureRequestMsgDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("configurerequestmsg6ee0doctype");
    
    /**
     * Gets the "ConfigureRequestMsg" element
     */
    com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg getConfigureRequestMsg();
    
    /**
     * Sets the "ConfigureRequestMsg" element
     */
    void setConfigureRequestMsg(com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg configureRequestMsg);
    
    /**
     * Appends and returns a new empty "ConfigureRequestMsg" element
     */
    com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg addNewConfigureRequestMsg();
    
    /**
     * An XML ConfigureRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface ConfigureRequestMsg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfigureRequestMsg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("configurerequestmsg771celemtype");
        
        /**
         * Gets the "Options" element
         */
        com.exacttarget.wsdl.partnerapi.ConfigureOptions getOptions();
        
        /**
         * True if has "Options" element
         */
        boolean isSetOptions();
        
        /**
         * Sets the "Options" element
         */
        void setOptions(com.exacttarget.wsdl.partnerapi.ConfigureOptions options);
        
        /**
         * Appends and returns a new empty "Options" element
         */
        com.exacttarget.wsdl.partnerapi.ConfigureOptions addNewOptions();
        
        /**
         * Unsets the "Options" element
         */
        void unsetOptions();
        
        /**
         * Gets the "Action" element
         */
        java.lang.String getAction();
        
        /**
         * Gets (as xml) the "Action" element
         */
        org.apache.xmlbeans.XmlString xgetAction();
        
        /**
         * True if has "Action" element
         */
        boolean isSetAction();
        
        /**
         * Sets the "Action" element
         */
        void setAction(java.lang.String action);
        
        /**
         * Sets (as xml) the "Action" element
         */
        void xsetAction(org.apache.xmlbeans.XmlString action);
        
        /**
         * Unsets the "Action" element
         */
        void unsetAction();
        
        /**
         * Gets the "Configurations" element
         */
        com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations getConfigurations();
        
        /**
         * True if has "Configurations" element
         */
        boolean isSetConfigurations();
        
        /**
         * Sets the "Configurations" element
         */
        void setConfigurations(com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations configurations);
        
        /**
         * Appends and returns a new empty "Configurations" element
         */
        com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations addNewConfigurations();
        
        /**
         * Unsets the "Configurations" element
         */
        void unsetConfigurations();
        
        /**
         * An XML Configurations(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public interface Configurations extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configurations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("configurationsad83elemtype");
            
            /**
             * Gets array of all "Configuration" elements
             */
            com.exacttarget.wsdl.partnerapi.APIObject[] getConfigurationArray();
            
            /**
             * Gets ith "Configuration" element
             */
            com.exacttarget.wsdl.partnerapi.APIObject getConfigurationArray(int i);
            
            /**
             * Returns number of "Configuration" element
             */
            int sizeOfConfigurationArray();
            
            /**
             * Sets array of all "Configuration" element
             */
            void setConfigurationArray(com.exacttarget.wsdl.partnerapi.APIObject[] configurationArray);
            
            /**
             * Sets ith "Configuration" element
             */
            void setConfigurationArray(int i, com.exacttarget.wsdl.partnerapi.APIObject configuration);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Configuration" element
             */
            com.exacttarget.wsdl.partnerapi.APIObject insertNewConfiguration(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Configuration" element
             */
            com.exacttarget.wsdl.partnerapi.APIObject addNewConfiguration();
            
            /**
             * Removes the ith "Configuration" element
             */
            void removeConfiguration(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations newInstance() {
                  return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg.Configurations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg newInstance() {
              return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument.ConfigureRequestMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ConfigureRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
