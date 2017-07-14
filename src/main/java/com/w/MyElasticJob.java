package com.w;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;

/**
 * Created by root on 7/13/17.
 */
public class MyElasticJob implements SimpleJob {
    public void execute(ShardingContext shardingContext) {
        switch (shardingContext.getShardingItem()) {
            case 0:
                System.out.println("case 0");
                break;
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            // case n: ...
        }
    }
}
