package com.training.ioc;

/**
 * 
 * 
 * <bean id="emp1" class="com.pack.subpack.ClassName">
 * 	<property name="db" ref="mysql/>
 * </bean>
 * <bean id="mysql" class="com.pack.subpack.Mysql"></bean>
 *
 */
public class Ioc {

	public static void main(String[] args) {
//		@AutoWire(ref="postgress") 
		Employee employee=null;  
		Employee employee1 = new Employee(new MySQLDatabase(), new Oracle()); 
		employee.add("Sachin");
	}
		
}
// DI Principle - rely on abstraction rather on concrete implementation 
interface Database  {
	public void persist(String data); 
	
}
class Employee {
	Database db = null;
	Database db2 = null; 
	
	public Employee(MySQLDatabase db) {
		this.db =  db; 
	}
	
	public Employee(Database db1, Database db2) {
		this.db =  db1;
		this.db2 = db1; 
	}

	public void add(String data) {
		db.persist(data);
	}
	
	
}


class MySQLDatabase  implements Database{

	@Override
	public void persist(String data) {
		System.out.println("MySQL is Persisting " + data);
	}

}
//@Bean(id="postgress")
class PostgressDB  implements Database{
	@Override
	public void persist(String data) {
		System.out.println("Postgress is Persisting " + data);
	}

}

class Oracle  implements Database{
	@Override
	public void persist(String data) {
		System.out.println("Oracle is Persisting " + data);
	}

}