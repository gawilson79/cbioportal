package org.cbioportal.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class TreeStructure implements Serializable {

    private Integer internalId;
    private Integer cancerStudyId;
    private String cancerStudyIdentifier;
    private Integer patientId;
    private String patientStableId;
    private String ancestorClone;
    private String descendentClone;

    public Integer getInternalId() {
        return internalId;
    }

    public void setInternalId(Integer internalId) {
        this.internalId = internalId;
    }

    public Integer getCancerStudyId() {
        return cancerStudyId;
    }

    public void setCancerStudyId(Integer cancerStudyId) {
        this.cancerStudyId = cancerStudyId;
    }

    public String getCancerStudyIdentifier() {
        return cancerStudyIdentifier;
    }

    public void setCancerStudyIdentifier(String cancerStudyIdentifier) {
        this.cancerStudyIdentifier = cancerStudyIdentifier;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientStableId() {
        return patientStableId;
    }

    public void setPatientStableId(String patientStableId) {
        this.patientStableId = patientStableId;
    }

    public String getAncestorClone() {
        return ancestorClone;
    }

    public void setAncestorClone(String ancestorClone) {
        this.ancestorClone = ancestorClone;
    }

    public String getDescendentClone() {
        return descendentClone;
    }

    public void setDescendentClone(String descendentClone) {
        this.descendentClone = descendentClone;
    }
}