/*
 * XML Type:  SimpleOperators
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SimpleOperators
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML SimpleOperators(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is an atomic type that is a restriction of com.exacttarget.wsdl.partnerapi.SimpleOperators.
 */
public interface SimpleOperators extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimpleOperators.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3078E7ECE9B08DEFC7AE7471BD7A2FDF").resolveHandle("simpleoperatorsc0ebtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EQUALS = Enum.forString("equals");
    static final Enum NOT_EQUALS = Enum.forString("notEquals");
    static final Enum GREATER_THAN = Enum.forString("greaterThan");
    static final Enum LESS_THAN = Enum.forString("lessThan");
    static final Enum IS_NULL = Enum.forString("isNull");
    static final Enum IS_NOT_NULL = Enum.forString("isNotNull");
    static final Enum GREATER_THAN_OR_EQUAL = Enum.forString("greaterThanOrEqual");
    static final Enum LESS_THAN_OR_EQUAL = Enum.forString("lessThanOrEqual");
    static final Enum BETWEEN = Enum.forString("between");
    static final Enum IN = Enum.forString("IN");
    static final Enum LIKE = Enum.forString("like");
    static final Enum EXISTS_IN_STRING = Enum.forString("existsInString");
    static final Enum EXISTS_IN_STRING_AS_A_WORD = Enum.forString("existsInStringAsAWord");
    static final Enum NOT_EXISTS_IN_STRING = Enum.forString("notExistsInString");
    static final Enum BEGINS_WITH = Enum.forString("beginsWith");
    static final Enum ENDS_WITH = Enum.forString("endsWith");
    static final Enum CONTAINS = Enum.forString("contains");
    static final Enum NOT_CONTAINS = Enum.forString("notContains");
    static final Enum IS_ANNIVERSARY = Enum.forString("isAnniversary");
    static final Enum IS_NOT_ANNIVERSARY = Enum.forString("isNotAnniversary");
    static final Enum GREATER_THAN_ANNIVERSARY = Enum.forString("greaterThanAnniversary");
    static final Enum LESS_THAN_ANNIVERSARY = Enum.forString("lessThanAnniversary");
    
    static final int INT_EQUALS = Enum.INT_EQUALS;
    static final int INT_NOT_EQUALS = Enum.INT_NOT_EQUALS;
    static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
    static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
    static final int INT_IS_NULL = Enum.INT_IS_NULL;
    static final int INT_IS_NOT_NULL = Enum.INT_IS_NOT_NULL;
    static final int INT_GREATER_THAN_OR_EQUAL = Enum.INT_GREATER_THAN_OR_EQUAL;
    static final int INT_LESS_THAN_OR_EQUAL = Enum.INT_LESS_THAN_OR_EQUAL;
    static final int INT_BETWEEN = Enum.INT_BETWEEN;
    static final int INT_IN = Enum.INT_IN;
    static final int INT_LIKE = Enum.INT_LIKE;
    static final int INT_EXISTS_IN_STRING = Enum.INT_EXISTS_IN_STRING;
    static final int INT_EXISTS_IN_STRING_AS_A_WORD = Enum.INT_EXISTS_IN_STRING_AS_A_WORD;
    static final int INT_NOT_EXISTS_IN_STRING = Enum.INT_NOT_EXISTS_IN_STRING;
    static final int INT_BEGINS_WITH = Enum.INT_BEGINS_WITH;
    static final int INT_ENDS_WITH = Enum.INT_ENDS_WITH;
    static final int INT_CONTAINS = Enum.INT_CONTAINS;
    static final int INT_NOT_CONTAINS = Enum.INT_NOT_CONTAINS;
    static final int INT_IS_ANNIVERSARY = Enum.INT_IS_ANNIVERSARY;
    static final int INT_IS_NOT_ANNIVERSARY = Enum.INT_IS_NOT_ANNIVERSARY;
    static final int INT_GREATER_THAN_ANNIVERSARY = Enum.INT_GREATER_THAN_ANNIVERSARY;
    static final int INT_LESS_THAN_ANNIVERSARY = Enum.INT_LESS_THAN_ANNIVERSARY;
    
    /**
     * Enumeration value class for com.exacttarget.wsdl.partnerapi.SimpleOperators.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EQUALS
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_EQUALS = 1;
        static final int INT_NOT_EQUALS = 2;
        static final int INT_GREATER_THAN = 3;
        static final int INT_LESS_THAN = 4;
        static final int INT_IS_NULL = 5;
        static final int INT_IS_NOT_NULL = 6;
        static final int INT_GREATER_THAN_OR_EQUAL = 7;
        static final int INT_LESS_THAN_OR_EQUAL = 8;
        static final int INT_BETWEEN = 9;
        static final int INT_IN = 10;
        static final int INT_LIKE = 11;
        static final int INT_EXISTS_IN_STRING = 12;
        static final int INT_EXISTS_IN_STRING_AS_A_WORD = 13;
        static final int INT_NOT_EXISTS_IN_STRING = 14;
        static final int INT_BEGINS_WITH = 15;
        static final int INT_ENDS_WITH = 16;
        static final int INT_CONTAINS = 17;
        static final int INT_NOT_CONTAINS = 18;
        static final int INT_IS_ANNIVERSARY = 19;
        static final int INT_IS_NOT_ANNIVERSARY = 20;
        static final int INT_GREATER_THAN_ANNIVERSARY = 21;
        static final int INT_LESS_THAN_ANNIVERSARY = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("equals", INT_EQUALS),
                new Enum("notEquals", INT_NOT_EQUALS),
                new Enum("greaterThan", INT_GREATER_THAN),
                new Enum("lessThan", INT_LESS_THAN),
                new Enum("isNull", INT_IS_NULL),
                new Enum("isNotNull", INT_IS_NOT_NULL),
                new Enum("greaterThanOrEqual", INT_GREATER_THAN_OR_EQUAL),
                new Enum("lessThanOrEqual", INT_LESS_THAN_OR_EQUAL),
                new Enum("between", INT_BETWEEN),
                new Enum("IN", INT_IN),
                new Enum("like", INT_LIKE),
                new Enum("existsInString", INT_EXISTS_IN_STRING),
                new Enum("existsInStringAsAWord", INT_EXISTS_IN_STRING_AS_A_WORD),
                new Enum("notExistsInString", INT_NOT_EXISTS_IN_STRING),
                new Enum("beginsWith", INT_BEGINS_WITH),
                new Enum("endsWith", INT_ENDS_WITH),
                new Enum("contains", INT_CONTAINS),
                new Enum("notContains", INT_NOT_CONTAINS),
                new Enum("isAnniversary", INT_IS_ANNIVERSARY),
                new Enum("isNotAnniversary", INT_IS_NOT_ANNIVERSARY),
                new Enum("greaterThanAnniversary", INT_GREATER_THAN_ANNIVERSARY),
                new Enum("lessThanAnniversary", INT_LESS_THAN_ANNIVERSARY),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators newValue(java.lang.Object obj) {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) type.newValue( obj ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators newInstance() {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.exacttarget.wsdl.partnerapi.SimpleOperators parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.SimpleOperators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
