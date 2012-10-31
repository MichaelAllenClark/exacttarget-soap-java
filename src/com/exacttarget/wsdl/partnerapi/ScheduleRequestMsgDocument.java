/*
 * An XML document type.
 * Localname: ScheduleRequestMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * A document containing one ScheduleRequestMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public interface ScheduleRequestMsgDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleRequestMsgDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("schedulerequestmsgd57ddoctype");
    
    /**
     * Gets the "ScheduleRequestMsg" element
     */
    com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg getScheduleRequestMsg();
    
    /**
     * Sets the "ScheduleRequestMsg" element
     */
    void setScheduleRequestMsg(com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg scheduleRequestMsg);
    
    /**
     * Appends and returns a new empty "ScheduleRequestMsg" element
     */
    com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg addNewScheduleRequestMsg();
    
    /**
     * An XML ScheduleRequestMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface ScheduleRequestMsg extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleRequestMsg.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("schedulerequestmsgb322elemtype");
        
        /**
         * Gets the "Options" element
         */
        com.exacttarget.wsdl.partnerapi.ScheduleOptions getOptions();
        
        /**
         * True if has "Options" element
         */
        boolean isSetOptions();
        
        /**
         * Sets the "Options" element
         */
        void setOptions(com.exacttarget.wsdl.partnerapi.ScheduleOptions options);
        
        /**
         * Appends and returns a new empty "Options" element
         */
        com.exacttarget.wsdl.partnerapi.ScheduleOptions addNewOptions();
        
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
         * Gets the "Schedule" element
         */
        com.exacttarget.wsdl.partnerapi.ScheduleDefinition getSchedule();
        
        /**
         * True if has "Schedule" element
         */
        boolean isSetSchedule();
        
        /**
         * Sets the "Schedule" element
         */
        void setSchedule(com.exacttarget.wsdl.partnerapi.ScheduleDefinition schedule);
        
        /**
         * Appends and returns a new empty "Schedule" element
         */
        com.exacttarget.wsdl.partnerapi.ScheduleDefinition addNewSchedule();
        
        /**
         * Unsets the "Schedule" element
         */
        void unsetSchedule();
        
        /**
         * Gets the "Interactions" element
         */
        com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions getInteractions();
        
        /**
         * True if has "Interactions" element
         */
        boolean isSetInteractions();
        
        /**
         * Sets the "Interactions" element
         */
        void setInteractions(com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions interactions);
        
        /**
         * Appends and returns a new empty "Interactions" element
         */
        com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions addNewInteractions();
        
        /**
         * Unsets the "Interactions" element
         */
        void unsetInteractions();
        
        /**
         * An XML Interactions(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public interface Interactions extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Interactions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("interactionsb365elemtype");
            
            /**
             * Gets array of all "Interaction" elements
             */
            com.exacttarget.wsdl.partnerapi.APIObject[] getInteractionArray();
            
            /**
             * Gets ith "Interaction" element
             */
            com.exacttarget.wsdl.partnerapi.APIObject getInteractionArray(int i);
            
            /**
             * Returns number of "Interaction" element
             */
            int sizeOfInteractionArray();
            
            /**
             * Sets array of all "Interaction" element
             */
            void setInteractionArray(com.exacttarget.wsdl.partnerapi.APIObject[] interactionArray);
            
            /**
             * Sets ith "Interaction" element
             */
            void setInteractionArray(int i, com.exacttarget.wsdl.partnerapi.APIObject interaction);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Interaction" element
             */
            com.exacttarget.wsdl.partnerapi.APIObject insertNewInteraction(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Interaction" element
             */
            com.exacttarget.wsdl.partnerapi.APIObject addNewInteraction();
            
            /**
             * Removes the ith "Interaction" element
             */
            void removeInteraction(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions newInstance() {
                  return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg.Interactions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg newInstance() {
              return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument.ScheduleRequestMsg) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ScheduleRequestMsgDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
