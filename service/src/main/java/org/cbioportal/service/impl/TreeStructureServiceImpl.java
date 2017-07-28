package org.cbioportal.service.impl;

import org.cbioportal.model.TreeStructure;
import org.cbioportal.persistence.TreeStructureRepository;
import org.cbioportal.service.TreeStructureService;
import org.cbioportal.service.PatientService;
import org.cbioportal.service.exception.PatientNotFoundException;
import org.cbioportal.service.exception.StudyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeStructureServiceImpl implements TreeStructureService {

    @Autowired
    private TreeStructureRepository treeStructureRepository;
    @Autowired
    private PatientService patientService;

    @Override
    @PreAuthorize("hasPermission(#studyId, 'CancerStudy', 'read')")
    public List<TreeStructure> getTreeStructureInPatientInStudy(String studyId, String patientId,
                                                                    String projection, Integer pageSize,
                                                                    Integer pageNumber) throws PatientNotFoundException, 
        StudyNotFoundException {
        
        patientService.getPatientInStudy(studyId, patientId);

        return treeStructureRepository.getTreeStructureInPatientInStudy(studyId, patientId, projection, pageSize,
            pageNumber);
    }

    @Override
    @PreAuthorize("hasPermission(#studyIds, 'List<CancerStudyId>', 'read')")
    public List<TreeStructure> fetchTreeStructure(List<String> studyIds, List<String> patientIds, 
                                                       String projection) {
        
        return treeStructureRepository.fetchTreeStructure(studyIds, patientIds, projection);
    }

    
}