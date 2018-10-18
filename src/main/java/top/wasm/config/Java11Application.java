package top.wasm.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Java11Application /*implements EmbeddedServletContainerCustomizer*/{

    public static void main(String[] args) {
        SpringApplication.run(Java11Application.class, args);
    }


   /* //拦截所有请求
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                SecurityConstraint constraint = new SecurityConstraint();
                constraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                constraint.addCollection(collection);
                context.addConstraint(constraint);
            }
        };
        tomcat.addAdditionalTomcatConnectors(httpConnector());
        return tomcat;
    }

    //配置http转https
    @Bean
    public Connector httpConnector() {
        Connector connector = new Connector(TomcatEmbeddedServletContainerFactory.DEFAULT_PROTOCOL);
        connector.setScheme("http");
        //Connector监听的http的端口号
        connector.setPort(80);
        connector.setSecure(false);
        //监听到http的端口号后转向到的https的端口号
        connector.setRedirectPort(443);
        return connector;
    }

    //这里设置默认端口为443，即https的，如果这里不设置，会https和http争夺80端口
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(443);
    }*/
}
