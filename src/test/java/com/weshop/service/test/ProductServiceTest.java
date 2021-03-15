package com.weshop.service.test;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.weshop.common.ServerResponse;
import com.weshop.service.IProductService;
import com.weshop.test.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Rufy
 */
public class ProductServiceTest extends TestBase {

    @Autowired
    private IProductService iProductService;

    @Test
    public void testIProductService(){
        ServerResponse<PageInfo> result =  iProductService.getProductByKeywordCategory("iphone",2,1,5,"price_desc");
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> images = Lists.newArrayList();
        images.add("weshop/aa.jpg");
        images.add("weshop/bb.jpg");
        images.add("weshop/cc.jpg");
        images.add("weshop/dd.jpg");
        images.add("weshop/ee.jpg");
//        ["weshop/aa.jpg","weshop/bb.jpg","weshop/cc.jpg","weshop/dd.jpg","weshop/ee.jpg"]
    }
}
