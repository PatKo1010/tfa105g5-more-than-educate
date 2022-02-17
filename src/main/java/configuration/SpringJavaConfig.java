package configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

// @Configuration = <context:annotation-config></context:annotation-config>
// @ComponentScan(basePackages = {"model"}) = <context:component-scan base-package="model"></context:component-scan>
// @EnableTransactionManagement = <tx:annotation-driven />
@Configuration
@ComponentScan(basePackages = {"web.*.*.impl"})
@EnableTransactionManagement
public class SpringJavaConfig {
	/*
	<bean id="dataSource" class="com.zaxxer.hikari.HikariDataSource">
		<constructor-arg>
			<bean class="com.zaxxer.hikari.HikariConfig">
				<property name="driverClassName" value="com.mysql.cj.jdbc.Driver"></property>
				<property name="jdbcUrl" value="jdbc:mysql://localhost:3306/java?serverTimezone=Asia/Taipei"></property>
				<property name="username" value="root"></property>
				<property name="password" value="123456"></property>
				<property name="dataSourceProperties">
					<props>
						<prop key="cachePrepStmts">true</prop>
						<prop key="prepStmtCacheSize">250</prop>
						<prop key="prepStmtCacheSqlLimit">2048</prop>
					</props>
				</property>
			</bean>
		</constructor-arg>	
	</bean>
	*/
	@Bean
	public DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("com.mysql.cj.jdbc.Driver");
		config.setJdbcUrl("jdbc:mysql://localhost:3306/more_than_educate?serverTimezone=Asia/Taipei");
		config.setUsername("root");
		config.setPassword("p19951010");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

		return new HikariDataSource(config);
	}
	
	/*
	 <bean id="sessionFactory" destroy-method="destroy"
			class="org.springframework.orm.hibernate5.LocalSessionFactoryBean">
		<property name="dataSource" ref="dataSource"></property>
		<property name="annotatedClasses">
			<array>
				<value>model.CustomerBean</value>
				<value>model.ProductBean</value>
			</array>
		</property>
		<property name="hibernateProperties">
			<props>
				<prop key="hibernate.dialect">org.hibernate.dialect.MySQLDialect</prop>
				<prop key="hibernate.show_sql">true</prop>
				<prop key="hibernate.hbm2ddl.auto">validate</prop>
			</props>
		</property>
	</bean>
	 */
//	Java config uses LocalSessionFactoryBuilder, not the xml LocalSessionFactoryBean
	@Bean
	public SessionFactory sessionFactory() {
		
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource());
		
		builder.scanPackages("web.*.entity");
		
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "validate");
		
		builder.addProperties(props);
		
		return builder.buildSessionFactory();
	}
	
	/*
	<bean id="transactionManager"
			class="org.springframework.orm.hibernate5.HibernateTransactionManager">
		<constructor-arg ref="sessionFactory"></constructor-arg>
	</bean>
	 */
	@Bean
	public HibernateTransactionManager transactionManager() {
		return new HibernateTransactionManager(sessionFactory());
	}
}
