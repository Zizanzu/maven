package data;

import java.time.LocalDateTime;

public class Period {
	private LocalDateTime start_time;
	private LocalDateTime end_time;
	
	public Period(LocalDateTime start,LocalDateTime stop) {
		this.start_time = start;
		this.end_time = stop;
	}

	public LocalDateTime getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalDateTime start_time) {
		this.start_time = start_time;
	}

	public LocalDateTime getEnd_time() {
		return end_time;
	}

	public void setEnd_time(LocalDateTime end_time) {
		this.end_time = end_time;
	}

	@Override
	public String toString() {
		return "Period [start_time=" + start_time + ", end_time=" + end_time + "]";
	}
	
}
