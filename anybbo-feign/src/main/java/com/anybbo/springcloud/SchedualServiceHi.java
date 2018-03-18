package com.anybbo.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author huopengbo
 * @date 2018/03/17
 * @copyright © 2018 anybbo
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
//@Service
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
