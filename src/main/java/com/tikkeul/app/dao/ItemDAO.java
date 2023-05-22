package com.tikkeul.app.dao;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ItemDAO {
    private final ItemMapper itemMapper;

//    김보령 작업공간
//    열매샵 제품 목록 가져오기 : list.html
    public List<ItemDTO> findAll(){
        return itemMapper.selectAll();
    }

//    열매샵 제품 상세 보기 : itemdetails.html
    public Optional<ItemDTO> findById(Long id){
        return itemMapper.select(id);
    }

}
