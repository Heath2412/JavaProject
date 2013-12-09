package action;

import hello.IHello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

public class TestAction {
	@Autowired
	private IHello hello;
	private String serverTime;
	
	public String getServerTime() {
		return serverTime;
	}
	
	public void setServerTime(String serverTime) {
		this.serverTime = serverTime;
	}
	
	public void setHello(IHello hello){
		this.hello = hello;
	}
	 
	
	@Action(value="/showTime", results={@Result(name="success", location="showTime.tiles", type="tiles")})
	public String showServerTime ()
	{
		serverTime = SimpleDateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis()));
		System.out.println("serverTime = " + serverTime);
		System.out.println("Hello = " + hello.sayHello());
		return "success";
	}
}
