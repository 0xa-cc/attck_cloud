package cn.attck.util;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;

public class TestJob {

	@Resource
	private JdbcTemplate jdbcTemplate;

	public void execute() {

	}
}