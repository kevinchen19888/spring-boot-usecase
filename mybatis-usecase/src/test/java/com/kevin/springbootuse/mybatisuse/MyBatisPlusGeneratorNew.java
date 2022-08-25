package com.kevin.springbootuse.mybatisuse;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class MyBatisPlusGeneratorNew {/*


    public static void main(String[] args) {
        //表名，多个英文逗号分割
        String outputDir = System.getProperty("user.dir") + File.separator + "lsy-boot/lsy-code/src/main/java";

        String moduleName = "test";
        String packagePath = "priv.lsy";
        // 代码生成器
        new AutoGenerator(new DataSourceConfig
                .Builder("jdbc:mariadb://localhost:3306/lsy?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC", "lsy", "lsy")
                .build()
        )
                .global(new GlobalConfig
                        .outputDir(outputDir)
                        .author("李思远")
                        .openDir(false)
                        .enableSwagger()
                        .dateType(DateType.ONLY_DATE)
                        .fileOverride()
                        .build()
                )
                .packageInfo(new PackageConfig.Builder()// 包配置
                        .parent(packagePath)
                        .moduleName(moduleName)
                        .controller("controller")
                        .entity("entity")
                        .service("service")
                        .serviceImpl("service.impl")
                        .mapper("persistent")
                        .xml("persistentXml")
                        .build()
                )
                .strategy(new StrategyConfig.Builder()// 策略配置
                        .enableCapitalMode()// 全局大写命名
                        .addExclude("databasechangelog", "databasechangeloglock")// 排除生成的表 sys_user
                        // .addInclude("sys_user") // 对应表 sys_user
                        // .addTablePrefix("sys_") // 表前缀
                        // .addFieldPrefix("tb_") // 字段前缀
                        .enableSkipView() //跳过视图

                        .controllerBuilder()
                        .enableRestStyle() //@RestController 注解
                        .enableHyphenStyle() //url中驼峰转连字符
                        // .superClass(IBaseController.class)
                        .formatFileName("%sController")

                        .entityBuilder()
                        .enableLombok()// lombok 模型
                        .enableChainModel() // 链式操作
                        .enableSerialVersionUID()
                        // .enableRemoveIsPrefix() 去掉字段前边的is
                        .superClass(BaseEntity.class)
                        .addSuperEntityColumns("id", "createDate", "createId", "updateDate", "updateId") // 自定义实体，公共字段
                        .naming(NamingStrategy.underline_to_camel)
                        .enableTableFieldAnnotation()

                        .serviceBuilder()
                        .formatServiceFileName("I%sService")
                        .formatServiceImplFileName("%sService")

                        .mapperBuilder()
                        .enableBaseResultMap()
                        .enableBaseColumnList()
                        .build()
                )
                .template(new TemplateConfig.Builder()
                        // .entity("templates\\entity\\entity.java.vm")
                        .controller("templates\\controller\\controller.java.vm")
                        .service(
                                "templates\\service\\service.java.vm",
                                "templates\\service\\impl\\serviceImpl.java.vm"
                        )
                        // .mapper("templates\\persistent\\mapper.java.vm")
                        // .mapperXml("templates\\persistent\\xml\\mapper.xml.vm")
                        .build()
                )
                .execute();
    }

*/}
