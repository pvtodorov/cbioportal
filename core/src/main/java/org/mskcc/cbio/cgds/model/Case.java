
package org.mskcc.cbio.cgds.model;

/**
 *
 * @author jgao
 */
public class Case {
    private final String caseId;
    private final int cancerStudyId;
    private final String patientId;

    public Case(String caseId, String patientId, int cancerStudyId) {
        if (caseId==null) {
            throw new java.lang.IllegalArgumentException("caseId cannot be null");
        }
        this.caseId = caseId;
        this.patientId = patientId!=null ? patientId : caseId;
        this.cancerStudyId = cancerStudyId;
    }

    public int getCancerStudyId() {
        return cancerStudyId;
    }

    public String getCaseId() {
        return caseId;
    }

    public String getPatientId() {
        return patientId;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Case)) {
            return false;
        }
        
        Case anotherCase = (Case)obj;
        if (!caseId.equals(anotherCase.caseId)) {
            return false;
        }
        
        if (this.cancerStudyId != anotherCase.getCancerStudyId()) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (this.caseId != null ? this.caseId.hashCode() : 0);
        hash = 41 * hash + this.cancerStudyId;
        return hash;
    }
}
