package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry{
	
	private String user;
	private Date moment;
	
	public LogEntry() {
	}

	public LogEntry(String user, Date moment) {
		this.user = user;
		this.moment = moment;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(user, other.user);
	}
}
