package com.hutool;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;

public class IdUtilsDemo {


    public static void main(String[] args) {
        new IdUtilsDemo().snowFlake();
    }

    /**
     * 获取随机UUID
     */
    public void uuidDemo() {
        String uuid = IdUtil.randomUUID();
        //格式：cbb021c7-cb48-44cd-b8ba-814620ee4340
        System.out.println(uuid);
    }

    /**
     * 简化的UUID，去掉了横线
     */
    public void simpleUUIDDemo() {
        String uuid = IdUtil.simpleUUID();
        //格式：a7e0edfb17ac4120a03842f938f88d34
        System.out.println(uuid);
    }

    /**
     * 雪花算法。获取唯一id。
     */
    public void getNextIdDemo() {
        long id = IdUtil.getSnowflakeNextId();
        //格式：1648328806748430336
        System.out.println(id);

        String idStr = IdUtil.getSnowflakeNextIdStr();
        //格式："1648328806752624640"
        System.out.println(idStr);
    }


    /**
     * 雪花算法。配合终端ID和数据中心ID。
     */
    public void snowFlake() {
        //workerId     终端ID
        // datacenterId 数据中心ID
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        long id = snowflake.nextId();
        //格式：1648328965712121856
        System.out.println(id);

        String idStr = snowflake.nextIdStr();
        //格式：1648328965716316160
        System.out.println(idStr);

    }


}
