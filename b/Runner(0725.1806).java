package hello;
// https://jira.spring.io/browse/BATCH-2161
// https://stackoverflow.com/questions/27990060/calling-a-bean-annotated-method-in-spring-java-configuration
// https://my.oschina.net/coldlemon/blog/178586
// http://sexycoding.iteye.com/blog/1062372
// http://sexycoding.iteye.com/blog/1062372
// @Bean method ScopeConfiguration.stepScope
// https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/Bean.html

// https://github.com/blacklabelops/hsqldb
// @org.springframework.stereotype.Component
public class Runner implements org.springframework.boot.CommandLineRunner {
	@org.springframework.beans.factory.annotation.Autowired
    @org.springframework.beans.factory.annotation.Qualifier("inboundAmqpTemplate")
    private org.springframework.amqp.core.AmqpTemplate amqpTemplate;
	@Override
	public void run(String... arg0) throws Exception {
		for (int i = 0; i < 10; i++ ) {
    		System.out.println("inboundAmqpTemplate.convertAndSend = " + i);
    		amqpTemplate.convertAndSend("foo message: " + i);
    	}
	}
}