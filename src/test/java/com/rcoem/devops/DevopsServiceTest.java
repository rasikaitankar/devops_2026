package com.rcoem.devops;

import com.rcoem.devops.interfaces.DevopsController;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ActiveProfiles("test")
@ContextConfiguration(classes = DevopsController.class)
public class DevopsServiceTest {

}
