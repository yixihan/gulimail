package com.yixihan.gulimall.member.feign;

import com.yixihan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : yixihan
 * @create : 2022-03-06-15:54
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/member/list")
    public R memberCoupons ();
}
