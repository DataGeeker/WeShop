package com.weshop.service;

import com.github.pagehelper.PageInfo;
import com.weshop.common.ServerResponse;
import com.weshop.pojo.Product;
import com.weshop.vo.ProductDetailVo;

/**
 * Created by Rufy
 */
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId,Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);



}
