package com.yixihan.gulimall.ware.service.impl;

import com.yixihan.gulimall.ware.dao.PurchaseDetailDao;
import com.yixihan.gulimall.ware.entity.PurchaseDetailEntity;
import com.yixihan.gulimall.ware.service.PurchaseDetailService;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yixihan.common.utils.PageUtils;
import com.yixihan.common.utils.Query;


@Service("purchaseDetailService")
public class PurchaseDetailServiceImpl extends ServiceImpl<PurchaseDetailDao, PurchaseDetailEntity> implements PurchaseDetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseDetailEntity> page = this.page(
                new Query<PurchaseDetailEntity>().getPage(params),
                new QueryWrapper<PurchaseDetailEntity>()
        );

        return new PageUtils(page);
    }

}