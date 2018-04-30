package com.example;

import org.springframework.data.mongodb.core.mapping.Document;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection="tests")
//@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Test {

	String TestClassName;
	String TestMethodName;
	String ExecutionFlag;
	String Priority;
	String Datasheet;
	
	public Test(String testClassName, String testMethodName, String executionFlag, String priority, String datasheet) {
		super();
		TestClassName = testClassName;
		TestMethodName = testMethodName;
		ExecutionFlag = executionFlag;
		Priority = priority;
		Datasheet = datasheet;
	}
	public Test() {
		
	}
	public String getTestClassName() {
		return TestClassName;
	}
	public void setTestClassName(String testClassName) {
		TestClassName = testClassName;
	}
	public String getTestMethodName() {
		return TestMethodName;
	}
	public void setTestMethodName(String testMethodName) {
		TestMethodName = testMethodName;
	}
	public String getExecutionFlag() {
		return ExecutionFlag;
	}
	public void setExecutionFlag(String executionFlag) {
		ExecutionFlag = executionFlag;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getDatasheet() {
		return Datasheet;
	}
	public void setDatasheet(String datasheet) {
		Datasheet = datasheet;
	}
	
}
