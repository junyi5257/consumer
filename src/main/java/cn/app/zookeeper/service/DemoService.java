package cn.app.zookeeper.service;

/**公共接口-和provider一直,
 * 默认应该有公共的jar包提供;
 * Created by goujy on 2017/3/29.
 */
public interface DemoService {
    /**
     * 测试方法
     *
     * @param name 参数name
     * @return 返回字符串
     */
    String sayHello(String name);
}
