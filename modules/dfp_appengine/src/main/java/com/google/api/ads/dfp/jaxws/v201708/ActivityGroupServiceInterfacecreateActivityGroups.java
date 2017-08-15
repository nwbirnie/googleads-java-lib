// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201708;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link ActivityGroup} objects.
 *             
 *             @param activityGroups the activity groups to be created.
 *             @return the created activity groups with their IDs filled in.
 *           
 * 
 * <p>Java class for createActivityGroups element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createActivityGroups">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="activityGroups" type="{https://www.google.com/apis/ads/publisher/v201708}ActivityGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "activityGroups"
})
@XmlRootElement(name = "createActivityGroups")
public class ActivityGroupServiceInterfacecreateActivityGroups {

    protected List<ActivityGroup> activityGroups;

    /**
     * Gets the value of the activityGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityGroup }
     * 
     * 
     */
    public List<ActivityGroup> getActivityGroups() {
        if (activityGroups == null) {
            activityGroups = new ArrayList<ActivityGroup>();
        }
        return this.activityGroups;
    }

}