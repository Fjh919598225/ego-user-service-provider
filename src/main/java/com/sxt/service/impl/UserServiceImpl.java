package com.sxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.sxt.domain.UserAddress;
import com.sxt.service.UserService;

//@org.springframework.stereotype.Service //<bean id="userService"class="com.sxt.service.impl.UserServiceImpl"></bean>
@Service  //<bean id="userService"class="com.sxt.service.impl.UserServiceImpl"></bean> 加 <dubbo:service interface="com.sxt.service.UserService" ref="userService"></dubbo:service>
public class UserServiceImpl implements UserService {

	public static List<UserAddress> address = new ArrayList<>();

	static {
		address.add(new UserAddress(1, "湖北省武汉市东湖高新区金融港B22栋11楼", "whsxt"));
		address.add(new UserAddress(2, "北京市海淀区西三旗街道建材城西路中腾建华商务大厦东侧二层尚学堂", "bjsxt"));
	}

	@Override
	public List<UserAddress> queryAllAddress(String userId) {
		System.out.println("20880");
		return address;
	}

}
