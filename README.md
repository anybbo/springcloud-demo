
## springcloud-demo

- anybbo-eureka-server  服务注册/发现

- anybbo-eureka-client  服务提供者

- anybbo-ribbon         服务消费者
    > rest + ribbon 
    > 加入断路器 Hystrix
    
- anybbo-feign          服务消费者
    > feign 加入断路器 Hystrix
    
- anybbo-zuul           路由网关
    > 指定注册中心, 对消费者启用路由/过滤功能
    
- anybbo-config-server  配置中心
    > 拉取git仓库中的配置
    
- anybbo-config-client  配置获取客户端
    > 从配置中心拉取配置并缓存
    
- spring-cloud-bus      消息总线
    > 用于广播配置文件的更改或者服务之间的通讯，也可以用于监控

- anybbo-service-hi
    > 服务链路追踪  (未成功)
    
- anybbo-service-miya
    > 服务链路追踪  (未成功)