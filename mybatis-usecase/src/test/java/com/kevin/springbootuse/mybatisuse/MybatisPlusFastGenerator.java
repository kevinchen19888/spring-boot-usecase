package com.kevin.springbootuse.mybatisuse;

import java.sql.SQLException;

public class MybatisPlusFastGenerator {

    /**
     * 执行初始化数据库脚本
     */
    public static void before() throws SQLException {
        // Connection conn = DATA_SOURCE_CONFIG.build().getConn();
        // InputStream inputStream = MybatisPlusFastGenerator.class.getResourceAsStream("/sql/init.sql");
        // ScriptRunner scriptRunner = new ScriptRunner(conn);
        // scriptRunner.setAutoCommit(true);
        // scriptRunner.runScript(new InputStreamReader(inputStream));
        // conn.close();
    }

    /**
     * 数据源配置
     */
    // private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig.Builder("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;CASE_INSENSITIVE_IDENTIFIERS=TRUE;MODE=MYSQL", "sa", "");

    /**
     * 执行 run
     */
/*    public static void main(String[] args) throws SQLException {
        before();
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                // 全局配置
                .globalConfig((scanner, builder) -> builder.author(scanner.apply("请输入作者名称？")).fileOverride())
                // 包配置
                .packageConfig((scanner, builder) -> builder.parent(scanner.apply("请输入包名？")))
                // 策略配置
                .strategyConfig(builder -> builder.addInclude("t_simple"))
                *//*
                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker
                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
                 *//*
                .execute();
    }*/
}
