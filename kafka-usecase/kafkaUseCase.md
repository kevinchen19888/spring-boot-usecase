## spring boot 使用 kafka demo

### 使用步骤:

1. 引入 spring-kafka 依赖(如果引入后中找不到 kafka-clients依赖,需要单独引入 kafka-clients 并在spring-kafka 中排除kafka-clients 依赖);

2. 获取已有的kafka server连接配置;
   > 当使用本地server 时,需要先进行启动
3. 本地服务中进行完成 kafka 相关配置项;
4. 使用 KafkaTemplate 发送消息,然后使用基于 @KafkaListener 初始化的 listener 监听消息并做相关处理;
