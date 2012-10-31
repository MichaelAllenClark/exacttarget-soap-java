/*
 * XML Type:  RetrieveRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.RetrieveRequest
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML RetrieveRequest(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface RetrieveRequest extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RetrieveRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("retrieverequestac35type");
    
    /**
     * Gets array of all "ClientIDs" elements
     */
    com.exacttarget.wsdl.partnerapi.ClientID[] getClientIDsArray();
    
    /**
     * Gets ith "ClientIDs" element
     */
    com.exacttarget.wsdl.partnerapi.ClientID getClientIDsArray(int i);
    
    /**
     * Returns number of "ClientIDs" element
     */
    int sizeOfClientIDsArray();
    
    /**
     * Sets array of all "ClientIDs" element
     */
    void setClientIDsArray(com.exacttarget.wsdl.partnerapi.ClientID[] clientIDsArray);
    
    /**
     * Sets ith "ClientIDs" element
     */
    void setClientIDsArray(int i, com.exacttarget.wsdl.partnerapi.ClientID clientIDs);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientIDs" element
     */
    com.exacttarget.wsdl.partnerapi.ClientID insertNewClientIDs(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClientIDs" element
     */
    com.exacttarget.wsdl.partnerapi.ClientID addNewClientIDs();
    
    /**
     * Removes the ith "ClientIDs" element
     */
    void removeClientIDs(int i);
    
    /**
     * Gets the "ObjectType" element
     */
    java.lang.String getObjectType();
    
    /**
     * Gets (as xml) the "ObjectType" element
     */
    org.apache.xmlbeans.XmlString xgetObjectType();
    
    /**
     * Sets the "ObjectType" element
     */
    void setObjectType(java.lang.String objectType);
    
    /**
     * Sets (as xml) the "ObjectType" element
     */
    void xsetObjectType(org.apache.xmlbeans.XmlString objectType);
    
    /**
     * Gets array of all "Properties" elements
     */
    java.lang.String[] getPropertiesArray();
    
    /**
     * Gets ith "Properties" element
     */
    java.lang.String getPropertiesArray(int i);
    
    /**
     * Gets (as xml) array of all "Properties" elements
     */
    org.apache.xmlbeans.XmlString[] xgetPropertiesArray();
    
    /**
     * Gets (as xml) ith "Properties" element
     */
    org.apache.xmlbeans.XmlString xgetPropertiesArray(int i);
    
    /**
     * Returns number of "Properties" element
     */
    int sizeOfPropertiesArray();
    
    /**
     * Sets array of all "Properties" element
     */
    void setPropertiesArray(java.lang.String[] propertiesArray);
    
    /**
     * Sets ith "Properties" element
     */
    void setPropertiesArray(int i, java.lang.String properties);
    
    /**
     * Sets (as xml) array of all "Properties" element
     */
    void xsetPropertiesArray(org.apache.xmlbeans.XmlString[] propertiesArray);
    
    /**
     * Sets (as xml) ith "Properties" element
     */
    void xsetPropertiesArray(int i, org.apache.xmlbeans.XmlString properties);
    
    /**
     * Inserts the value as the ith "Properties" element
     */
    void insertProperties(int i, java.lang.String properties);
    
    /**
     * Appends the value as the last "Properties" element
     */
    void addProperties(java.lang.String properties);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Properties" element
     */
    org.apache.xmlbeans.XmlString insertNewProperties(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Properties" element
     */
    org.apache.xmlbeans.XmlString addNewProperties();
    
    /**
     * Removes the ith "Properties" element
     */
    void removeProperties(int i);
    
    /**
     * Gets the "Filter" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart getFilter();
    
    /**
     * True if has "Filter" element
     */
    boolean isSetFilter();
    
    /**
     * Sets the "Filter" element
     */
    void setFilter(com.exacttarget.wsdl.partnerapi.FilterPart filter);
    
    /**
     * Appends and returns a new empty "Filter" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart addNewFilter();
    
    /**
     * Unsets the "Filter" element
     */
    void unsetFilter();
    
    /**
     * Gets array of all "RespondTo" elements
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse[] getRespondToArray();
    
    /**
     * Gets ith "RespondTo" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse getRespondToArray(int i);
    
    /**
     * Returns number of "RespondTo" element
     */
    int sizeOfRespondToArray();
    
    /**
     * Sets array of all "RespondTo" element
     */
    void setRespondToArray(com.exacttarget.wsdl.partnerapi.AsyncResponse[] respondToArray);
    
    /**
     * Sets ith "RespondTo" element
     */
    void setRespondToArray(int i, com.exacttarget.wsdl.partnerapi.AsyncResponse respondTo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RespondTo" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse insertNewRespondTo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RespondTo" element
     */
    com.exacttarget.wsdl.partnerapi.AsyncResponse addNewRespondTo();
    
    /**
     * Removes the ith "RespondTo" element
     */
    void removeRespondTo(int i);
    
    /**
     * Gets array of all "PartnerProperties" elements
     */
    com.exacttarget.wsdl.partnerapi.APIProperty[] getPartnerPropertiesArray();
    
    /**
     * Gets ith "PartnerProperties" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty getPartnerPropertiesArray(int i);
    
    /**
     * Returns number of "PartnerProperties" element
     */
    int sizeOfPartnerPropertiesArray();
    
    /**
     * Sets array of all "PartnerProperties" element
     */
    void setPartnerPropertiesArray(com.exacttarget.wsdl.partnerapi.APIProperty[] partnerPropertiesArray);
    
    /**
     * Sets ith "PartnerProperties" element
     */
    void setPartnerPropertiesArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty partnerProperties);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PartnerProperties" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty insertNewPartnerProperties(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PartnerProperties" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty addNewPartnerProperties();
    
    /**
     * Removes the ith "PartnerProperties" element
     */
    void removePartnerProperties(int i);
    
    /**
     * Gets the "ContinueRequest" element
     */
    java.lang.String getContinueRequest();
    
    /**
     * Gets (as xml) the "ContinueRequest" element
     */
    org.apache.xmlbeans.XmlString xgetContinueRequest();
    
    /**
     * True if has "ContinueRequest" element
     */
    boolean isSetContinueRequest();
    
    /**
     * Sets the "ContinueRequest" element
     */
    void setContinueRequest(java.lang.String continueRequest);
    
    /**
     * Sets (as xml) the "ContinueRequest" element
     */
    void xsetContinueRequest(org.apache.xmlbeans.XmlString continueRequest);
    
    /**
     * Unsets the "ContinueRequest" element
     */
    void unsetContinueRequest();
    
    /**
     * Gets the "QueryAllAccounts" element
     */
    boolean getQueryAllAccounts();
    
    /**
     * Gets (as xml) the "QueryAllAccounts" element
     */
    org.apache.xmlbeans.XmlBoolean xgetQueryAllAccounts();
    
    /**
     * True if has "QueryAllAccounts" element
     */
    boolean isSetQueryAllAccounts();
    
    /**
     * Sets the "QueryAllAccounts" element
     */
    void setQueryAllAccounts(boolean queryAllAccounts);
    
    /**
     * Sets (as xml) the "QueryAllAccounts" element
     */
    void xsetQueryAllAccounts(org.apache.xmlbeans.XmlBoolean queryAllAccounts);
    
    /**
     * Unsets the "QueryAllAccounts" element
     */
    void unsetQueryAllAccounts();
    
    /**
     * Gets the "RetrieveAllSinceLastBatch" element
     */
    boolean getRetrieveAllSinceLastBatch();
    
    /**
     * Gets (as xml) the "RetrieveAllSinceLastBatch" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRetrieveAllSinceLastBatch();
    
    /**
     * True if has "RetrieveAllSinceLastBatch" element
     */
    boolean isSetRetrieveAllSinceLastBatch();
    
    /**
     * Sets the "RetrieveAllSinceLastBatch" element
     */
    void setRetrieveAllSinceLastBatch(boolean retrieveAllSinceLastBatch);
    
    /**
     * Sets (as xml) the "RetrieveAllSinceLastBatch" element
     */
    void xsetRetrieveAllSinceLastBatch(org.apache.xmlbeans.XmlBoolean retrieveAllSinceLastBatch);
    
    /**
     * Unsets the "RetrieveAllSinceLastBatch" element
     */
    void unsetRetrieveAllSinceLastBatch();
    
    /**
     * Gets the "RepeatLastResult" element
     */
    boolean getRepeatLastResult();
    
    /**
     * Gets (as xml) the "RepeatLastResult" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRepeatLastResult();
    
    /**
     * True if has "RepeatLastResult" element
     */
    boolean isSetRepeatLastResult();
    
    /**
     * Sets the "RepeatLastResult" element
     */
    void setRepeatLastResult(boolean repeatLastResult);
    
    /**
     * Sets (as xml) the "RepeatLastResult" element
     */
    void xsetRepeatLastResult(org.apache.xmlbeans.XmlBoolean repeatLastResult);
    
    /**
     * Unsets the "RepeatLastResult" element
     */
    void unsetRepeatLastResult();
    
    /**
     * Gets the "Retrieves" element
     */
    com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves getRetrieves();
    
    /**
     * True if has "Retrieves" element
     */
    boolean isSetRetrieves();
    
    /**
     * Sets the "Retrieves" element
     */
    void setRetrieves(com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves retrieves);
    
    /**
     * Appends and returns a new empty "Retrieves" element
     */
    com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves addNewRetrieves();
    
    /**
     * Unsets the "Retrieves" element
     */
    void unsetRetrieves();
    
    /**
     * Gets the "Options" element
     */
    com.exacttarget.wsdl.partnerapi.RetrieveOptions getOptions();
    
    /**
     * True if has "Options" element
     */
    boolean isSetOptions();
    
    /**
     * Sets the "Options" element
     */
    void setOptions(com.exacttarget.wsdl.partnerapi.RetrieveOptions options);
    
    /**
     * Appends and returns a new empty "Options" element
     */
    com.exacttarget.wsdl.partnerapi.RetrieveOptions addNewOptions();
    
    /**
     * Unsets the "Options" element
     */
    void unsetOptions();
    
    /**
     * An XML Retrieves(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface Retrieves extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Retrieves.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("retrieves2792elemtype");
        
        /**
         * Gets array of all "Request" elements
         */
        com.exacttarget.wsdl.partnerapi.Request[] getRequestArray();
        
        /**
         * Gets ith "Request" element
         */
        com.exacttarget.wsdl.partnerapi.Request getRequestArray(int i);
        
        /**
         * Returns number of "Request" element
         */
        int sizeOfRequestArray();
        
        /**
         * Sets array of all "Request" element
         */
        void setRequestArray(com.exacttarget.wsdl.partnerapi.Request[] requestArray);
        
        /**
         * Sets ith "Request" element
         */
        void setRequestArray(int i, com.exacttarget.wsdl.partnerapi.Request request);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Request" element
         */
        com.exacttarget.wsdl.partnerapi.Request insertNewRequest(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Request" element
         */
        com.exacttarget.wsdl.partnerapi.Request addNewRequest();
        
        /**
         * Removes the ith "Request" element
         */
        void removeRequest(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves newInstance() {
              return (com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest newInstance() {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.RetrieveRequest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.RetrieveRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
