/*
 * XML Type:  APIFault
 * Namespace: urn:fault.partner.exacttarget.com
 * Java type: com.exacttarget.partner.fault.APIFault
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.partner.fault;


/**
 * An XML APIFault(@urn:fault.partner.exacttarget.com).
 *
 * This is a complex type.
 */
public interface APIFault extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(APIFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("apifaultffd9type");
    
    /**
     * Gets the "Code" element
     */
    int getCode();
    
    /**
     * Gets (as xml) the "Code" element
     */
    org.apache.xmlbeans.XmlInt xgetCode();
    
    /**
     * Sets the "Code" element
     */
    void setCode(int code);
    
    /**
     * Sets (as xml) the "Code" element
     */
    void xsetCode(org.apache.xmlbeans.XmlInt code);
    
    /**
     * Gets the "Message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "Message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * Sets the "Message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "Message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * Gets the "LogID" element
     */
    long getLogID();
    
    /**
     * Gets (as xml) the "LogID" element
     */
    org.apache.xmlbeans.XmlLong xgetLogID();
    
    /**
     * True if has "LogID" element
     */
    boolean isSetLogID();
    
    /**
     * Sets the "LogID" element
     */
    void setLogID(long logID);
    
    /**
     * Sets (as xml) the "LogID" element
     */
    void xsetLogID(org.apache.xmlbeans.XmlLong logID);
    
    /**
     * Unsets the "LogID" element
     */
    void unsetLogID();
    
    /**
     * Gets the "Params" element
     */
    com.exacttarget.partner.fault.APIFault.Params getParams();
    
    /**
     * True if has "Params" element
     */
    boolean isSetParams();
    
    /**
     * Sets the "Params" element
     */
    void setParams(com.exacttarget.partner.fault.APIFault.Params params);
    
    /**
     * Appends and returns a new empty "Params" element
     */
    com.exacttarget.partner.fault.APIFault.Params addNewParams();
    
    /**
     * Unsets the "Params" element
     */
    void unsetParams();
    
    /**
     * An XML Params(@urn:fault.partner.exacttarget.com).
     *
     * This is a complex type.
     */
    public interface Params extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Params.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("paramse6d7elemtype");
        
        /**
         * Gets array of all "Param" elements
         */
        java.lang.String[] getParamArray();
        
        /**
         * Gets ith "Param" element
         */
        java.lang.String getParamArray(int i);
        
        /**
         * Gets (as xml) array of all "Param" elements
         */
        org.apache.xmlbeans.XmlString[] xgetParamArray();
        
        /**
         * Gets (as xml) ith "Param" element
         */
        org.apache.xmlbeans.XmlString xgetParamArray(int i);
        
        /**
         * Returns number of "Param" element
         */
        int sizeOfParamArray();
        
        /**
         * Sets array of all "Param" element
         */
        void setParamArray(java.lang.String[] paramArray);
        
        /**
         * Sets ith "Param" element
         */
        void setParamArray(int i, java.lang.String param);
        
        /**
         * Sets (as xml) array of all "Param" element
         */
        void xsetParamArray(org.apache.xmlbeans.XmlString[] paramArray);
        
        /**
         * Sets (as xml) ith "Param" element
         */
        void xsetParamArray(int i, org.apache.xmlbeans.XmlString param);
        
        /**
         * Inserts the value as the ith "Param" element
         */
        void insertParam(int i, java.lang.String param);
        
        /**
         * Appends the value as the last "Param" element
         */
        void addParam(java.lang.String param);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Param" element
         */
        org.apache.xmlbeans.XmlString insertNewParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Param" element
         */
        org.apache.xmlbeans.XmlString addNewParam();
        
        /**
         * Removes the ith "Param" element
         */
        void removeParam(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.partner.fault.APIFault.Params newInstance() {
              return (com.exacttarget.partner.fault.APIFault.Params) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.partner.fault.APIFault.Params newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.partner.fault.APIFault.Params) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.partner.fault.APIFault newInstance() {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.partner.fault.APIFault parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.partner.fault.APIFault parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.partner.fault.APIFault parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.partner.fault.APIFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.partner.fault.APIFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.partner.fault.APIFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
