package com.yixihan.gulimall.coupon.controller;

import com.yixihan.common.utils.PageUtils;
import com.yixihan.common.utils.R;
import com.yixihan.gulimall.coupon.entity.CouponEntity;
import com.yixihan.gulimall.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 优惠券信息
 *
 * @author yixihan
 * @email yixihan20010617@gmail.com
 * @date 2022-03-05 21:49:26
 */
@RestController
@RefreshScope
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value ("${coupon.user.name}")
    private String name;

    @Value ("${coupon.user.age}")
    private Integer age;

    @Value ("${coupon.user.email}")
    private String email;

    @Value ("${coupon.user.phone}")
    private String phone;



    @GetMapping("/test")
    public R test () {
        return R.ok ().put ("name", name).put ("age", age).put ("email", email).put ("phone", phone);
    }

    @GetMapping("/member/list")
    public R memberCoupons () {
        CouponEntity couponEntity = new CouponEntity ();
        couponEntity.setCouponName ("满100减10");

        return R.ok ().put ("coupon", Arrays.asList (couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
