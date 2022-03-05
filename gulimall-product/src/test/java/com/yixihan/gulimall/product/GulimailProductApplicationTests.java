package com.yixihan.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yixihan.gulimall.product.entity.BrandEntity;
import com.yixihan.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {

    }

    @Test
    void insert () {
        BrandEntity entity = new BrandEntity ();
        entity.setName ("老北京布鞋");
        brandService.save (entity);
        System.out.println ("保存成功");
    }

    @Test
    void update () {
        BrandEntity entity = new BrandEntity ();
        entity.setBrandId (1L);
        entity.setDescript ("中老年人最好的布鞋");
        brandService.updateById (entity);
    }

    @Test
    void select () {
        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<> ();
        wrapper.eq ("brand_id", 1L);

        List<BrandEntity> list = brandService.list (wrapper);
        list.forEach (System.out::println);
    }

}
