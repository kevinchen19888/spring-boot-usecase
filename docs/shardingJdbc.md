## Spring Boot 整合 Sharding-jdbc

基于Sharding-jdbc 进行分库分表示例

### 使用步骤:

* 基于sql脚本创建2个数据库:sharding_m0,sharding_m1;然后在两个数据库分别创建2个表:test_user_0,test_user_1

* 创建 maven 工程,并添加相关依赖;

* 配置数据源及分库分表策略;

* 编写相关 Controller/Service/Entity/Mapper 代码;

> 注意配置 mapper 扫描位置

* 调用 Get 请求的 addUsers 方法,添加数据,同时在db中确认分库分表的结果; 
