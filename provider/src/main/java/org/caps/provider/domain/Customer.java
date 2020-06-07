package org.caps.provider.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
//index ==》索引 ==》Mysql中的一个库，库里面可以建立很多表，存储不同类型的数据，而表在ES中就是type。
//type ==》类型 ==》相当于Mysql中的一张表，存储json类型的数据
//document  ==》文档 ==》一个文档相当于Mysql一行的数据
//field ==》列 ==》相当于mysql中的列，也就是一个属性
@Document(indexName = "customer", type = "customer", shards = 1, replicas = 0, refreshInterval = "-1")
public class Customer {

	//Id注解加上后，在Elasticsearch里相应于该列就是主键了，在查询时就可以直接用主键查询
	@Id
	private String id;

	private String userName;

	private String address;

	private int age;

	public Customer() {
	}

	public Customer(String userName, String address, int age) {
		this.userName = userName;
		this.address = address;
		this.age = age;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id='" + id + '\'' +
				", userName='" + userName + '\'' +
				", address='" + address + '\'' +
				", age=" + age +
				'}';
	}
}
