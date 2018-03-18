package com.anybbo.springcloud;

import org.springframework.stereotype.Component;

/**
 * @author huopengbo
 * @date 2018/03/17
 * @copyright © 2018 anybbo
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi  {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
