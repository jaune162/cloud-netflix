/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */

package com.wawscm.netflix.sevice;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class ApplicationTest {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Test
	public void home() {
		InstanceInfo instanceInfo = this.discoveryClient.getNextServerFromEureka("STORES", false);
		System.out.println(instanceInfo.getHomePageUrl());
	}

}