/*
 * XML Type:  ComplexFilterPart
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ComplexFilterPart
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ComplexFilterPart(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ComplexFilterPart extends com.exacttarget.wsdl.partnerapi.FilterPart
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComplexFilterPart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("complexfilterpart534dtype");
    
    /**
     * Gets the "LeftOperand" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart getLeftOperand();
    
    /**
     * Sets the "LeftOperand" element
     */
    void setLeftOperand(com.exacttarget.wsdl.partnerapi.FilterPart leftOperand);
    
    /**
     * Appends and returns a new empty "LeftOperand" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart addNewLeftOperand();
    
    /**
     * Gets the "LogicalOperator" element
     */
    com.exacttarget.wsdl.partnerapi.LogicalOperators.Enum getLogicalOperator();
    
    /**
     * Gets (as xml) the "LogicalOperator" element
     */
    com.exacttarget.wsdl.partnerapi.LogicalOperators xgetLogicalOperator();
    
    /**
     * Sets the "LogicalOperator" element
     */
    void setLogicalOperator(com.exacttarget.wsdl.partnerapi.LogicalOperators.Enum logicalOperator);
    
    /**
     * Sets (as xml) the "LogicalOperator" element
     */
    void xsetLogicalOperator(com.exacttarget.wsdl.partnerapi.LogicalOperators logicalOperator);
    
    /**
     * Gets the "RightOperand" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart getRightOperand();
    
    /**
     * True if has "RightOperand" element
     */
    boolean isSetRightOperand();
    
    /**
     * Sets the "RightOperand" element
     */
    void setRightOperand(com.exacttarget.wsdl.partnerapi.FilterPart rightOperand);
    
    /**
     * Appends and returns a new empty "RightOperand" element
     */
    com.exacttarget.wsdl.partnerapi.FilterPart addNewRightOperand();
    
    /**
     * Unsets the "RightOperand" element
     */
    void unsetRightOperand();
    
    /**
     * Gets the "AdditionalOperands" element
     */
    com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands getAdditionalOperands();
    
    /**
     * True if has "AdditionalOperands" element
     */
    boolean isSetAdditionalOperands();
    
    /**
     * Sets the "AdditionalOperands" element
     */
    void setAdditionalOperands(com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands additionalOperands);
    
    /**
     * Appends and returns a new empty "AdditionalOperands" element
     */
    com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands addNewAdditionalOperands();
    
    /**
     * Unsets the "AdditionalOperands" element
     */
    void unsetAdditionalOperands();
    
    /**
     * An XML AdditionalOperands(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public interface AdditionalOperands extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdditionalOperands.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("additionaloperands8a60elemtype");
        
        /**
         * Gets array of all "Operand" elements
         */
        com.exacttarget.wsdl.partnerapi.FilterPart[] getOperandArray();
        
        /**
         * Gets ith "Operand" element
         */
        com.exacttarget.wsdl.partnerapi.FilterPart getOperandArray(int i);
        
        /**
         * Returns number of "Operand" element
         */
        int sizeOfOperandArray();
        
        /**
         * Sets array of all "Operand" element
         */
        void setOperandArray(com.exacttarget.wsdl.partnerapi.FilterPart[] operandArray);
        
        /**
         * Sets ith "Operand" element
         */
        void setOperandArray(int i, com.exacttarget.wsdl.partnerapi.FilterPart operand);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Operand" element
         */
        com.exacttarget.wsdl.partnerapi.FilterPart insertNewOperand(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Operand" element
         */
        com.exacttarget.wsdl.partnerapi.FilterPart addNewOperand();
        
        /**
         * Removes the ith "Operand" element
         */
        void removeOperand(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands newInstance() {
              return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.ComplexFilterPart parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ComplexFilterPart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
