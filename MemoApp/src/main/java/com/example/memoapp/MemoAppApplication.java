package com.example.memoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.memoapp.repository") // リポジトリの場所を明示
@EntityScan(basePackages = "com.example.memoapp.model") // エンティティのパッケージを指定
public class MemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemoAppApplication.class, args);
	}

}
