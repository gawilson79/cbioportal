package org.cbioportal.persistence.mybatis;

import org.cbioportal.model.TreeStructure;
import org.cbioportal.persistence.TreeStructureRepository;
import org.cbioportal.persistence.mybatis.util.OffsetCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TreeStructureMyBatisRepository implements TreeStructureRepository {
    
    @Autowired
    private TreeStructureMapper treeStructureMapper;
    @Autowired
    private OffsetCalculator offsetCalculator;


    @Override
    public List<TreeStructure> getTreeStructureInPatientInStudy(String studyId, String patientId,
                                                                    String projection, Integer pageSize,
                                                                    Integer pageNumber) {

        return treeStructureMapper.getTreeStructure(Arrays.asList(studyId), Arrays.asList(patientId), 
            projection, pageSize, offsetCalculator.calculate(pageSize, pageNumber));
    }

    
    @Override
    public List<TreeStructure> fetchTreeStructure(List<String> studyIds, List<String> patientIds, 
                                                       String projection) {
        
        return treeStructureMapper.getTreeStructure(studyIds, patientIds, projection, 0, 0);
    }
}
