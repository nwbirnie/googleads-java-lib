// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201601.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to manage ad groups. An {@linkplain AdGroup ad group}
 *       organizes a set of ads and criteria together, and also provides the
 *       {@linkplain AdGroup#bids default bid} for its criteria. One or more ad groups
 *       belong to a campaign.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdGroupServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdGroupServiceInterface {


    /**
     * 
     *         Returns a list of all the ad groups specified by the selector
     *         from the target customer's account.
     *         
     *         @param serviceSelector The selector specifying the {@link AdGroup}s to return.
     *         @return List of adgroups identified by the selector.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfacegetResponse")
    public AdGroupPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds, updates, or removes ad groups.
     *         <p class="note"><b>Note:</b> {@link AdGroupOperation} does not support the
     *         {@code REMOVE} operator. To remove an ad group, set its
     *         {@link AdGroup#status status} to {@code REMOVED}.</p>
     *         
     *         @param operations List of unique operations. The same ad group cannot be
     *         specified in more than one operation.
     *         @return The updated adgroups.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfacemutateResponse")
    public AdGroupReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        List<AdGroupOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Adds labels to the {@linkplain AdGroup ad group} or removes {@linkplain Label label}s from the
     *         {@linkplain AdGroup ad group}.
     *         <p>{@code ADD} -- Apply an existing label to an existing {@linkplain AdGroup ad group}.
     *         The {@code adGroupId} must reference an existing {@linkplain AdGroup ad group}. The
     *         {@code labelId} must reference an existing {@linkplain Label label}.
     *         <p>{@code REMOVE} -- Removes the link between the specified {@linkplain AdGroup ad group}
     *         and a {@linkplain Label label}.</p>
     *         
     *         @param operations the operations to apply.
     *         @return a list of {@linkplain AdGroupLabel}s where each entry in the list is the result of
     *         applying the operation in the input list with the same index. For an
     *         add operation, the returned AdGroupLabel contains the AdGroupId and the LabelId.
     *         In the case of a remove operation, the returned AdGroupLabel will only have AdGroupId.
     *         @throws ApiException when there are one or more errors with the request.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupLabelReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "mutateLabel", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfacemutateLabel")
    @ResponseWrapper(localName = "mutateLabelResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfacemutateLabelResponse")
    public AdGroupLabelReturnValue mutateLabel(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        List<AdGroupLabelOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns the list of ad groups that match the query.
     *         
     *         @param query The SQL-like AWQL query string
     *         @return A list of adgroups
     *         @throws ApiException
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.AdGroupServiceInterfacequeryResponse")
    public AdGroupPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        String query)
        throws ApiException_Exception
    ;

}