package com.weshop.service;

import com.weshop.common.ServerResponse;
import com.weshop.pojo.Category;

import java.util.List;

/**
 * Created by Rufy
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
