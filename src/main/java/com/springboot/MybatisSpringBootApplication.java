package com.springboot;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.springboot.util.MyMapper;

//启动事务，等同于<tx:annotation-driven>，然后在每个service加@Transactional
@EnableTransactionManagement 
@SpringBootApplication
//扫描mapper接口，父级MyMapper不能和普通mapper在同一个包下
@MapperScan(basePackages = "com.springboot.mapper", markerInterface = MyMapper.class)
/**
 * 实现接口TransactionManagementConfigurer，多事务管理器中在实现方法中指定默认事务管理器
 * 假如在项目中有多个PlatformTransactionManager实现类而有没有实现该接口，在@Transactional注解
 * 中又没有指定value，则会抛出异常，不过在真正开发中除非是需要指定默认的事务管理器，并不是实现
 * 该接口，因为需要我们记住一定要在@Transactional添加value属性
 */
public class MybatisSpringBootApplication/* implements TransactionManagementConfigurer*/ {
	
	/*
	 * 查看当前使用的是哪个事务管理类，这个Springboot已经帮我们做好了，但是不透明，
	 * 假如我们项目比较大的时候我们可以选择具体使用哪个事务管理器，还要注意一点，在
	 * Spring框架中优先加载@Bean，然后框架不在实例化其他的PlatformTransactionManager
	 * 实现类
	 */
	/*@Bean
	public Object testBean(PlatformTransactionManager ptm){
		//org.springframework.jdbc.datasource.DataSourceTransactionManager
		System.out.println(ptm.getClass().getName());  
		return new Object();
	}*/ 
	
	/*@Resource(name="manager1")//指定使用manager1作为默认事务管理器
	private PlatformTransactionManager defaultManager;*/
	
	//创建事务管理器1
	/*@Bean(name="manager1")
	public PlatformTransactionManager manager1(DataSource d){
		return new DataSourceTransactionManager(d);
	}*/
	
	//创建事务管理器2
	/*@Bean(name="manager2")
	public PlatformTransactionManager manager2(EntityManagerFactory emf){
		return new JpaTransactionManager(emf);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(MybatisSpringBootApplication.class, args);
	}

	//实现TransactionManagementConfigurer方法，表示多个事务管理器中使用哪个作为默认的
	/*@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return defaultManager;
	}*/
}
