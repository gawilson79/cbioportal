package org.cbioportal.service;

import org.cbioportal.model.TreeStructure;
import org.cbioportal.service.exception.PatientNotFoundException;
import org.cbioportal.service.exception.StudyNotFoundException;

import java.util.List;

public interface TreeStructureService {

    List<TreeStructure> getTreeStructureInPatientInStudy(String studyId, String patientId, String projection,
                                                             Integer pageSize, Integer pageNumber) throws PatientNotFoundException, StudyNotFoundException;

    List<TreeStructure> fetchTreeStructure(List<String> studyIds, List<String> patientIds, String projection);

}
