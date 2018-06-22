package config;

import javax.persistence.Entity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Entity
@Component
@ConfigurationProperties("welcome")
public class Config {
	public String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
