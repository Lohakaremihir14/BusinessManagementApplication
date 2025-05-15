package com.business.config;

import com.business.entities.Admin;
import com.business.repositories.IAdminRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer 
{

    @Bean
    CommandLineRunner initAdmin(IAdminRepository adminRepo)
    {
        return args -> {
            if (adminRepo.count() == 0) {
                Admin admin = new Admin();
                admin.setAEmail("admin@123");
                admin.setAPassword("112233"); 
                admin.setAName("Admin");
                adminRepo.save(admin);
                System.out.println("✅ Default admin created: admin@123 / 112233");
            }
        };
    }
}
