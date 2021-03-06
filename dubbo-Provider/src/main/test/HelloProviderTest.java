import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @auther 陈郑游
 * @create 2017/3/25 0025
 * @功能    Main方法运行（Spring容器）
 * @问题
 * @说明
 * @URL地址
 * @进度描述
 */
public class HelloProviderTest {

    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"hello-Provider.xml"});

        // 按任意键退出
        context.start();
  
        System.out.println("Press any key to exit!");
        //为保证服务一直开着，利用输入流的阻塞来模拟
        System.in.read();
    }  
}  