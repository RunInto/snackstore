package com.store.snacks.utils;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGenerater {

    public static void main(String[] args) {
        //全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true) //是否开启AR模式
        .setAuthor("i")
        .setOutputDir("")   //生成路径
        .setFileOverride(true) //文件覆盖
        .setIdType(IdType.AUTO)     //主键策略
        .setServiceImplName("%sService") //设置生成的service接口名字的首字母是否为I
        .setBaseResultMap(true) //xml映射文档是否生成resultMap
        .setBaseColumnList(true); //xml映射文件是否生成sql片段

        //数据源配置
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3306/mp")
                .setUsername("root")
                .setPassword("root");
        //策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true) //全局大写命名
        .setNaming(NamingStrategy.underline_to_camel) //数据库表映射到实体的命名策略
        .setInclude("表名"); //生成的表

        //包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("") //生成的父包
        .setMapper("mapper") //mapper接口
        .setService("service") //service
        .setController("controller")
        .setEntity("entity")
        .setXml("mapper");

        //整合配置
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);

        //执行
        ag.execute();
    }
}