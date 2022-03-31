package chap15.lecture.p03map;

import java.util.*;


public class App02 {
	public static void main(String[] args) {
		Map<Computer, Integer> map = new HashMap<>();
		map.put(new Computer("samsung", "galaxy") ,1);
		map.put(new Computer("lg", "gram"), 5);
		int size = map.size();
		System.out.println(size);
		
		map.put(new Computer("samsung", "galaxy"), 10);
		System.out.println(map.size());
		
	}
}


class Computer{
	private String company;
	private String model;
	
	Computer(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	
	// 실제로는 참조값이 다르지만 내용물이 같도록 해서 Map에서 덮어쓰기가 가능해짐.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
	
	
}