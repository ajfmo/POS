package com.nubeclick.pos.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nubeclick.pos.dto.Role;
import com.nubeclick.pos.repository.RoleRepository;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@DataJpaTest
public class RoleTests {

	@Autowired
	private RoleRepository roleRepo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void saveRole() {
		roleRepo.save(new Role("Dios", 99));
		Assert.assertNotNull(roleRepo.findByRoleDescription("Dios"));
	}

}
