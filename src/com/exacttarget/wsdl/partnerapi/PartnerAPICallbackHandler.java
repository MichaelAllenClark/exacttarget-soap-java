
/**
 * PartnerAPICallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.exacttarget.wsdl.partnerapi;

    /**
     *  PartnerAPICallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class PartnerAPICallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public PartnerAPICallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public PartnerAPICallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for extract method
            * override this method for handling normal response from extract operation
            */
           public void receiveResultextract(
                    com.exacttarget.wsdl.partnerapi.ExtractResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from extract operation
           */
            public void receiveErrorextract(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for execute method
            * override this method for handling normal response from execute operation
            */
           public void receiveResultexecute(
                    com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from execute operation
           */
            public void receiveErrorexecute(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for perform method
            * override this method for handling normal response from perform operation
            */
           public void receiveResultperform(
                    com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from perform operation
           */
            public void receiveErrorperform(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for query method
            * override this method for handling normal response from query operation
            */
           public void receiveResultquery(
                    com.exacttarget.wsdl.partnerapi.QueryResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from query operation
           */
            public void receiveErrorquery(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for retrieve method
            * override this method for handling normal response from retrieve operation
            */
           public void receiveResultretrieve(
                    com.exacttarget.wsdl.partnerapi.RetrieveResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from retrieve operation
           */
            public void receiveErrorretrieve(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for describe method
            * override this method for handling normal response from describe operation
            */
           public void receiveResultdescribe(
                    com.exacttarget.wsdl.partnerapi.DefinitionResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from describe operation
           */
            public void receiveErrordescribe(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for delete method
            * override this method for handling normal response from delete operation
            */
           public void receiveResultdelete(
                    com.exacttarget.wsdl.partnerapi.DeleteResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from delete operation
           */
            public void receiveErrordelete(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for configure method
            * override this method for handling normal response from configure operation
            */
           public void receiveResultconfigure(
                    com.exacttarget.wsdl.partnerapi.ConfigureResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from configure operation
           */
            public void receiveErrorconfigure(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for schedule method
            * override this method for handling normal response from schedule operation
            */
           public void receiveResultschedule(
                    com.exacttarget.wsdl.partnerapi.ScheduleResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from schedule operation
           */
            public void receiveErrorschedule(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for create method
            * override this method for handling normal response from create operation
            */
           public void receiveResultcreate(
                    com.exacttarget.wsdl.partnerapi.CreateResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from create operation
           */
            public void receiveErrorcreate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSystemStatus method
            * override this method for handling normal response from getSystemStatus operation
            */
           public void receiveResultgetSystemStatus(
                    com.exacttarget.wsdl.partnerapi.SystemStatusResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSystemStatus operation
           */
            public void receiveErrorgetSystemStatus(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for update method
            * override this method for handling normal response from update operation
            */
           public void receiveResultupdate(
                    com.exacttarget.wsdl.partnerapi.UpdateResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from update operation
           */
            public void receiveErrorupdate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for versionInfo method
            * override this method for handling normal response from versionInfo operation
            */
           public void receiveResultversionInfo(
                    com.exacttarget.wsdl.partnerapi.VersionInfoResponseMsgDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from versionInfo operation
           */
            public void receiveErrorversionInfo(java.lang.Exception e) {
            }
                


    }
    