package org.cbioportal.persistence.mybatis;

import org.cbioportal.model.TreeStructure;
import org.cbioportal.model.meta.BaseMeta;

import java.util.List;

public interface TreeStructureMapper {
    
    List<TreeStructure> getTreeStructure(List<String> studyIds, List<String> patientIds, String projection, 
                                              Integer limit, Integer offset);

    
}