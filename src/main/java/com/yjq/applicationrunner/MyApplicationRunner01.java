package com.yjq.applicationrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Component
@Order(98)
public class MyApplicationRunner01 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        获取所有参数
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("sourceArgs"+Arrays.toString(sourceArgs));
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("nonOptionArgs"+ nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        System.out.println("======================================");
        for (String optionName : optionNames) {
            System.out.println(optionName+":"+ args.getOptionValues(optionName));
        }
        System.out.println("=========MyApplicationRunner01============");
    }
}
