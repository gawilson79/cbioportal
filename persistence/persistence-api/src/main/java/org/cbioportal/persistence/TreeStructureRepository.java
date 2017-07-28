package org.cbioportal.persistence;

import org.cbioportal.model.TreeStructure;

import java.util.List;

public interface TreeStructureRepository {

    List<TreeStructure> getTreeStructureInPatientInStudy(String studyId, String patientId, String projection,
                                                             Integer pageSize, Integer pageNumber);

    List<TreeStructure> fetchTreeStructure(List<String> studyIds, List<String> patientIds, String projection);
}