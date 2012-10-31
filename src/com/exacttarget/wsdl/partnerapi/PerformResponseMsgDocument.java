/*
 * An XML document type.
 * Localname: PerformResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * A document containing one PerformResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public interface PerformResponseMsgDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PerformResponseMsgDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("performresponsemsgf7c7doctype");
    
    /**
     * Gets the "PerformResponseMsg" element
     */
    com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg getPerformResponseMsg();
    
    /**
     * Sets the "PerformResponseMsg" element
     */
    void setPerformResponseMsg(com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg performResponseMsg);
    
    /**
     * Appends and returns a new empty "PerformResponseMsg" element
     */
    com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg addNewPerformResponseMsg();
    
    /**
     * An XML PerformResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface PerformResponseMsg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PerformResponseMsg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("performresponsemsge562elemtype");
        
        /**
         * Gets the "Results" element
         */
        com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results getResults();
        
        /**
         * True if has "Results" element
         */
        boolean isSetResults();
        
        /**
         * Sets the "Results" element
         */
        void setResults(com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results results);
        
        /**
         * Appends and returns a new empty "Results" element
         */
        com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results addNewResults();
        
        /**
         * Unsets the "Results" element
         */
        void unsetResults();
        
        /**
         * Gets the "OverallStatus" element
         */
        java.lang.String getOverallStatus();
        
        /**
         * Gets (as xml) the "OverallStatus" element
         */
        org.apache.xmlbeans.XmlString xgetOverallStatus();
        
        /**
         * Sets the "OverallStatus" element
         */
        void setOverallStatus(java.lang.String overallStatus);
        
        /**
         * Sets (as xml) the "OverallStatus" element
         */
        void xsetOverallStatus(org.apache.xmlbeans.XmlString overallStatus);
        
        /**
         * Gets the "OverallStatusMessage" element
         */
        java.lang.String getOverallStatusMessage();
        
        /**
         * Gets (as xml) the "OverallStatusMessage" element
         */
        org.apache.xmlbeans.XmlString xgetOverallStatusMessage();
        
        /**
         * Sets the "OverallStatusMessage" element
         */
        void setOverallStatusMessage(java.lang.String overallStatusMessage);
        
        /**
         * Sets (as xml) the "OverallStatusMessage" element
         */
        void xsetOverallStatusMessage(org.apache.xmlbeans.XmlString overallStatusMessage);
        
        /**
         * Gets the "RequestID" element
         */
        java.lang.String getRequestID();
        
        /**
         * Gets (as xml) the "RequestID" element
         */
        org.apache.xmlbeans.XmlString xgetRequestID();
        
        /**
         * True if has "RequestID" element
         */
        boolean isSetRequestID();
        
        /**
         * Sets the "RequestID" element
         */
        void setRequestID(java.lang.String requestID);
        
        /**
         * Sets (as xml) the "RequestID" element
         */
        void xsetRequestID(org.apache.xmlbeans.XmlString requestID);
        
        /**
         * Unsets the "RequestID" element
         */
        void unsetRequestID();
        
        /**
         * An XML Results(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public interface Results extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Results.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("resultsd160elemtype");
            
            /**
             * Gets array of all "Result" elements
             */
            com.exacttarget.wsdl.partnerapi.PerformResult[] getResultArray();
            
            /**
             * Gets ith "Result" element
             */
            com.exacttarget.wsdl.partnerapi.PerformResult getResultArray(int i);
            
            /**
             * Returns number of "Result" element
             */
            int sizeOfResultArray();
            
            /**
             * Sets array of all "Result" element
             */
            void setResultArray(com.exacttarget.wsdl.partnerapi.PerformResult[] resultArray);
            
            /**
             * Sets ith "Result" element
             */
            void setResultArray(int i, com.exacttarget.wsdl.partnerapi.PerformResult result);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Result" element
             */
            com.exacttarget.wsdl.partnerapi.PerformResult insertNewResult(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Result" element
             */
            com.exacttarget.wsdl.partnerapi.PerformResult addNewResult();
            
            /**
             * Removes the ith "Result" element
             */
            void removeResult(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results newInstance() {
                  return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg newInstance() {
              return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument newInstance() {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
