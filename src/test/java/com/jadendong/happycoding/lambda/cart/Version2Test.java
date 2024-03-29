package com.jadendong.happycoding.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Version2Test {

    @Test
    public void filterSkuByCategory() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中图书类商品集合
        List<Sku> result = CartService.filterSkuByCategory(
                cartSkuList, SkuCategoryEnum.BOOKS);

        System.out.println(JSON.toJSONString(
                result, true));
    }

}
