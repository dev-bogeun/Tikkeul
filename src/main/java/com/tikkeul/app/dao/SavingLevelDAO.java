package com.tikkeul.app.dao;

import com.tikkeul.app.domain.vo.SavingLevelVO;
import com.tikkeul.app.mapper.SavingLevelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class SavingLevelDAO {
    private final SavingLevelMapper savingLevelMapper;


    public void saveSavingLevel(SavingLevelVO savingLevelVO){
        savingLevelMapper.insertSavingLevel(savingLevelVO);
    }

    public List<SavingLevelVO> FindSavingLevelAll(){
        return savingLevelMapper.admminSelectSavingLevelAll();
    }
}
