package com.weshop.service;

import com.github.pagehelper.PageInfo;
import com.weshop.common.ServerResponse;
import com.weshop.pojo.Shipping;

/**
 * Created by Rufy
 */
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
